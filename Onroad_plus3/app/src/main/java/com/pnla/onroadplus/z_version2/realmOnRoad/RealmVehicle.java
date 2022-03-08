package com.pnla.onroadplus.z_version2.realmOnRoad;

import android.content.Context;
import android.content.SharedPreferences;

import com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2;
import com.pnla.onroadplus.z_version2.generalUtils.GeneralConstantsV2;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class RealmVehicle {

    public static void saveVehicles(List<VehicleV2> vehicles, Context context) {
        SharedPreferences preferences = context.getSharedPreferences(GeneralConstantsV2.CREDENTIALS_PREFERENCES, Context.MODE_PRIVATE);
        String user = preferences.getString(GeneralConstantsV2.USER_PREFERENCES, null);
        /** Primero obtenemos la lista de vehiculos almacenados en la db,
         *  si es null entonces guardamos toda la lista que llega como parametro,
         *  en caso contrario eliminamos todos los vehiculos asociados al usuario
         *  y despues guardamos toda la lista
         *
         * */

        Realm realm = Realm.getDefaultInstance();
        RealmResults<VehicleV2> realmVehicles = realm.where(VehicleV2.class).equalTo("userVehicle", user).findAll();
        if (realmVehicles != null && realmVehicles.size() > 0) {
            /** primero eliminamos y posterior guardamos los vehiculos que llegan como parametro */
            realm.beginTransaction();
            realmVehicles.deleteAllFromRealm();
            realm.commitTransaction();
            //realm.close();
            /**Ahora guardamos los vehiculos que llegan como parámetro*/
            realm = Realm.getDefaultInstance();
            for (int position = 0; position < vehicles.size(); position++) {
                if (vehicles.get(position).isSelected()) {
                    realm.beginTransaction();
                    VehicleV2 newVehicle = realm.createObject(VehicleV2.class, vehicles.get(position).getCveVehicle());
                    newVehicle.setUserVehicle(vehicles.get(position).getUserVehicle());
                    newVehicle.setVehicleName(vehicles.get(position).getVehicleName());
                    newVehicle.setVehicleImage(vehicles.get(position).getVehicleImage());
                    newVehicle.setLatitude(vehicles.get(position).getLatitude());
                    newVehicle.setLongitude(vehicles.get(position).getLongitude());
                    newVehicle.setSelected(vehicles.get(position).isSelected());
                    newVehicle.setPositionItem(vehicles.get(position).getPositionItem());
                    realm.commitTransaction();
                }
            }
            //realm.close();
        } else {
            /**Aqui tenemos que guardar toda la lista que lego como parametro*/
            Realm realm1 = Realm.getDefaultInstance();
            /** Guardamos a cada uno de los vehiculos de la lista solo si el atributo "select" es true  */
            for (int position = 0; position < vehicles.size(); position++) {
                if (vehicles.get(position).isSelected()) {
                    realm1.beginTransaction();
                    VehicleV2 newVehicle = realm1.createObject(VehicleV2.class, vehicles.get(position).getCveVehicle());
                    newVehicle.setUserVehicle(vehicles.get(position).getUserVehicle());
                    newVehicle.setVehicleName(vehicles.get(position).getVehicleName());
                    newVehicle.setVehicleImage(vehicles.get(position).getVehicleImage());
                    newVehicle.setLatitude(vehicles.get(position).getLatitude());
                    newVehicle.setLongitude(vehicles.get(position).getLongitude());
                    newVehicle.setSelected(vehicles.get(position).isSelected());
                    newVehicle.setPositionItem(vehicles.get(position).getPositionItem());
                    realm1.commitTransaction();
                }
            }
            //realm1.close();
        }
    }

    public static List<VehicleV2> getAllVehiclesByUserName(String userName) {
        Realm realm = Realm.getDefaultInstance();
        RealmResults<VehicleV2> vehicles = realm.where(VehicleV2.class).equalTo("userVehicle", userName).findAll();
        List<VehicleV2> myVehicles = realm.copyFromRealm(vehicles);
        return myVehicles;
    }

}