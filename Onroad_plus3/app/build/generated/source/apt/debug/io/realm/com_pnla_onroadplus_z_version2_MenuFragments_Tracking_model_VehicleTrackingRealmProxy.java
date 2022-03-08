package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy extends com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking
    implements RealmObjectProxy, com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface {

    static final class VehicleTrackingColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long idIndex;
        long cve_vehicleIndex;
        long userVehicleIndex;
        long vehicle_nameIndex;
        long vehicle_imageIndex;
        long latitudeIndex;
        long longitudeIndex;
        long selectedIndex;
        long positionItemIndex;
        long vehicle_switchIndex;

        VehicleTrackingColumnInfo(OsSchemaInfo schemaInfo) {
            super(10);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("VehicleTracking");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.cve_vehicleIndex = addColumnDetails("cve_vehicle", "cve_vehicle", objectSchemaInfo);
            this.userVehicleIndex = addColumnDetails("userVehicle", "userVehicle", objectSchemaInfo);
            this.vehicle_nameIndex = addColumnDetails("vehicle_name", "vehicle_name", objectSchemaInfo);
            this.vehicle_imageIndex = addColumnDetails("vehicle_image", "vehicle_image", objectSchemaInfo);
            this.latitudeIndex = addColumnDetails("latitude", "latitude", objectSchemaInfo);
            this.longitudeIndex = addColumnDetails("longitude", "longitude", objectSchemaInfo);
            this.selectedIndex = addColumnDetails("selected", "selected", objectSchemaInfo);
            this.positionItemIndex = addColumnDetails("positionItem", "positionItem", objectSchemaInfo);
            this.vehicle_switchIndex = addColumnDetails("vehicle_switch", "vehicle_switch", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        VehicleTrackingColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new VehicleTrackingColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final VehicleTrackingColumnInfo src = (VehicleTrackingColumnInfo) rawSrc;
            final VehicleTrackingColumnInfo dst = (VehicleTrackingColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.cve_vehicleIndex = src.cve_vehicleIndex;
            dst.userVehicleIndex = src.userVehicleIndex;
            dst.vehicle_nameIndex = src.vehicle_nameIndex;
            dst.vehicle_imageIndex = src.vehicle_imageIndex;
            dst.latitudeIndex = src.latitudeIndex;
            dst.longitudeIndex = src.longitudeIndex;
            dst.selectedIndex = src.selectedIndex;
            dst.positionItemIndex = src.positionItemIndex;
            dst.vehicle_switchIndex = src.vehicle_switchIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private VehicleTrackingColumnInfo columnInfo;
    private ProxyState<com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking> proxyState;

    com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (VehicleTrackingColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(int value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$cve_vehicle() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.cve_vehicleIndex);
    }

    @Override
    public void realmSet$cve_vehicle(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.cve_vehicleIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.cve_vehicleIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$userVehicle() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userVehicleIndex);
    }

    @Override
    public void realmSet$userVehicle(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userVehicleIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.userVehicleIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userVehicleIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.userVehicleIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$vehicle_name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.vehicle_nameIndex);
    }

    @Override
    public void realmSet$vehicle_name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.vehicle_nameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.vehicle_nameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.vehicle_nameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.vehicle_nameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$vehicle_image() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.vehicle_imageIndex);
    }

    @Override
    public void realmSet$vehicle_image(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.vehicle_imageIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.vehicle_imageIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.vehicle_imageIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.vehicle_imageIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$latitude() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.latitudeIndex);
    }

    @Override
    public void realmSet$latitude(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.latitudeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.latitudeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$longitude() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.longitudeIndex);
    }

    @Override
    public void realmSet$longitude(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.longitudeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.longitudeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$selected() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.selectedIndex);
    }

    @Override
    public void realmSet$selected(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.selectedIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.selectedIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$positionItem() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.positionItemIndex);
    }

    @Override
    public void realmSet$positionItem(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.positionItemIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.positionItemIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$vehicle_switch() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.vehicle_switchIndex);
    }

    @Override
    public void realmSet$vehicle_switch(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.vehicle_switchIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.vehicle_switchIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("VehicleTracking", 10, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("cve_vehicle", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("userVehicle", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("vehicle_name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("vehicle_image", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("latitude", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("longitude", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("selected", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("positionItem", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("vehicle_switch", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static VehicleTrackingColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new VehicleTrackingColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "VehicleTracking";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "VehicleTracking";
    }

    @SuppressWarnings("cast")
    public static com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking obj = null;
        if (update) {
            Table table = realm.getTable(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class);
            VehicleTrackingColumnInfo columnInfo = (VehicleTrackingColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy) realm.createObjectInternal(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy) realm.createObjectInternal(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface objProxy = (com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) obj;
        if (json.has("cve_vehicle")) {
            if (json.isNull("cve_vehicle")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'cve_vehicle' to null.");
            } else {
                objProxy.realmSet$cve_vehicle((int) json.getInt("cve_vehicle"));
            }
        }
        if (json.has("userVehicle")) {
            if (json.isNull("userVehicle")) {
                objProxy.realmSet$userVehicle(null);
            } else {
                objProxy.realmSet$userVehicle((String) json.getString("userVehicle"));
            }
        }
        if (json.has("vehicle_name")) {
            if (json.isNull("vehicle_name")) {
                objProxy.realmSet$vehicle_name(null);
            } else {
                objProxy.realmSet$vehicle_name((String) json.getString("vehicle_name"));
            }
        }
        if (json.has("vehicle_image")) {
            if (json.isNull("vehicle_image")) {
                objProxy.realmSet$vehicle_image(null);
            } else {
                objProxy.realmSet$vehicle_image((String) json.getString("vehicle_image"));
            }
        }
        if (json.has("latitude")) {
            if (json.isNull("latitude")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'latitude' to null.");
            } else {
                objProxy.realmSet$latitude((double) json.getDouble("latitude"));
            }
        }
        if (json.has("longitude")) {
            if (json.isNull("longitude")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'longitude' to null.");
            } else {
                objProxy.realmSet$longitude((double) json.getDouble("longitude"));
            }
        }
        if (json.has("selected")) {
            if (json.isNull("selected")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'selected' to null.");
            } else {
                objProxy.realmSet$selected((boolean) json.getBoolean("selected"));
            }
        }
        if (json.has("positionItem")) {
            if (json.isNull("positionItem")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'positionItem' to null.");
            } else {
                objProxy.realmSet$positionItem((int) json.getInt("positionItem"));
            }
        }
        if (json.has("vehicle_switch")) {
            if (json.isNull("vehicle_switch")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'vehicle_switch' to null.");
            } else {
                objProxy.realmSet$vehicle_switch((int) json.getInt("vehicle_switch"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking obj = new com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking();
        final com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface objProxy = (com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("cve_vehicle")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$cve_vehicle((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'cve_vehicle' to null.");
                }
            } else if (name.equals("userVehicle")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userVehicle((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userVehicle(null);
                }
            } else if (name.equals("vehicle_name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$vehicle_name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$vehicle_name(null);
                }
            } else if (name.equals("vehicle_image")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$vehicle_image((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$vehicle_image(null);
                }
            } else if (name.equals("latitude")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$latitude((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'latitude' to null.");
                }
            } else if (name.equals("longitude")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$longitude((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'longitude' to null.");
                }
            } else if (name.equals("selected")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$selected((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'selected' to null.");
                }
            } else if (name.equals("positionItem")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$positionItem((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'positionItem' to null.");
                }
            } else if (name.equals("vehicle_switch")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$vehicle_switch((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'vehicle_switch' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating uexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class), false, Collections.<String>emptyList());
        io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy obj = new io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking copyOrUpdate(Realm realm, VehicleTrackingColumnInfo columnInfo, com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking) cachedRealmObject;
        }

        com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$id());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking copy(Realm realm, VehicleTrackingColumnInfo columnInfo, com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking) cachedRealmObject;
        }

        com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface realmObjectSource = (com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) newObject;

        Table table = realm.getTable(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addInteger(columnInfo.cve_vehicleIndex, realmObjectSource.realmGet$cve_vehicle());
        builder.addString(columnInfo.userVehicleIndex, realmObjectSource.realmGet$userVehicle());
        builder.addString(columnInfo.vehicle_nameIndex, realmObjectSource.realmGet$vehicle_name());
        builder.addString(columnInfo.vehicle_imageIndex, realmObjectSource.realmGet$vehicle_image());
        builder.addDouble(columnInfo.latitudeIndex, realmObjectSource.realmGet$latitude());
        builder.addDouble(columnInfo.longitudeIndex, realmObjectSource.realmGet$longitude());
        builder.addBoolean(columnInfo.selectedIndex, realmObjectSource.realmGet$selected());
        builder.addInteger(columnInfo.positionItemIndex, realmObjectSource.realmGet$positionItem());
        builder.addInteger(columnInfo.vehicle_switchIndex, realmObjectSource.realmGet$vehicle_switch());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class);
        long tableNativePtr = table.getNativePtr();
        VehicleTrackingColumnInfo columnInfo = (VehicleTrackingColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.cve_vehicleIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$cve_vehicle(), false);
        String realmGet$userVehicle = ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$userVehicle();
        if (realmGet$userVehicle != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userVehicleIndex, rowIndex, realmGet$userVehicle, false);
        }
        String realmGet$vehicle_name = ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$vehicle_name();
        if (realmGet$vehicle_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicle_nameIndex, rowIndex, realmGet$vehicle_name, false);
        }
        String realmGet$vehicle_image = ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$vehicle_image();
        if (realmGet$vehicle_image != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicle_imageIndex, rowIndex, realmGet$vehicle_image, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.latitudeIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$latitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.longitudeIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$longitude(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.selectedIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$selected(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.positionItemIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$positionItem(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.vehicle_switchIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$vehicle_switch(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class);
        long tableNativePtr = table.getNativePtr();
        VehicleTrackingColumnInfo columnInfo = (VehicleTrackingColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking object = null;
        while (objects.hasNext()) {
            object = (com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.cve_vehicleIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$cve_vehicle(), false);
            String realmGet$userVehicle = ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$userVehicle();
            if (realmGet$userVehicle != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userVehicleIndex, rowIndex, realmGet$userVehicle, false);
            }
            String realmGet$vehicle_name = ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$vehicle_name();
            if (realmGet$vehicle_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicle_nameIndex, rowIndex, realmGet$vehicle_name, false);
            }
            String realmGet$vehicle_image = ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$vehicle_image();
            if (realmGet$vehicle_image != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicle_imageIndex, rowIndex, realmGet$vehicle_image, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.latitudeIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$latitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.longitudeIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$longitude(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.selectedIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$selected(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.positionItemIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$positionItem(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.vehicle_switchIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$vehicle_switch(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class);
        long tableNativePtr = table.getNativePtr();
        VehicleTrackingColumnInfo columnInfo = (VehicleTrackingColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.cve_vehicleIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$cve_vehicle(), false);
        String realmGet$userVehicle = ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$userVehicle();
        if (realmGet$userVehicle != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userVehicleIndex, rowIndex, realmGet$userVehicle, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userVehicleIndex, rowIndex, false);
        }
        String realmGet$vehicle_name = ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$vehicle_name();
        if (realmGet$vehicle_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicle_nameIndex, rowIndex, realmGet$vehicle_name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.vehicle_nameIndex, rowIndex, false);
        }
        String realmGet$vehicle_image = ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$vehicle_image();
        if (realmGet$vehicle_image != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicle_imageIndex, rowIndex, realmGet$vehicle_image, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.vehicle_imageIndex, rowIndex, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.latitudeIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$latitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.longitudeIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$longitude(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.selectedIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$selected(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.positionItemIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$positionItem(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.vehicle_switchIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$vehicle_switch(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class);
        long tableNativePtr = table.getNativePtr();
        VehicleTrackingColumnInfo columnInfo = (VehicleTrackingColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking object = null;
        while (objects.hasNext()) {
            object = (com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.cve_vehicleIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$cve_vehicle(), false);
            String realmGet$userVehicle = ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$userVehicle();
            if (realmGet$userVehicle != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userVehicleIndex, rowIndex, realmGet$userVehicle, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userVehicleIndex, rowIndex, false);
            }
            String realmGet$vehicle_name = ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$vehicle_name();
            if (realmGet$vehicle_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicle_nameIndex, rowIndex, realmGet$vehicle_name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.vehicle_nameIndex, rowIndex, false);
            }
            String realmGet$vehicle_image = ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$vehicle_image();
            if (realmGet$vehicle_image != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicle_imageIndex, rowIndex, realmGet$vehicle_image, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.vehicle_imageIndex, rowIndex, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.latitudeIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$latitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.longitudeIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$longitude(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.selectedIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$selected(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.positionItemIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$positionItem(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.vehicle_switchIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) object).realmGet$vehicle_switch(), false);
        }
    }

    public static com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking createDetachedCopy(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking) cachedObject.object;
            }
            unmanagedObject = (com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface unmanagedCopy = (com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) unmanagedObject;
        com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface realmSource = (com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$cve_vehicle(realmSource.realmGet$cve_vehicle());
        unmanagedCopy.realmSet$userVehicle(realmSource.realmGet$userVehicle());
        unmanagedCopy.realmSet$vehicle_name(realmSource.realmGet$vehicle_name());
        unmanagedCopy.realmSet$vehicle_image(realmSource.realmGet$vehicle_image());
        unmanagedCopy.realmSet$latitude(realmSource.realmGet$latitude());
        unmanagedCopy.realmSet$longitude(realmSource.realmGet$longitude());
        unmanagedCopy.realmSet$selected(realmSource.realmGet$selected());
        unmanagedCopy.realmSet$positionItem(realmSource.realmGet$positionItem());
        unmanagedCopy.realmSet$vehicle_switch(realmSource.realmGet$vehicle_switch());

        return unmanagedObject;
    }

    static com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking update(Realm realm, VehicleTrackingColumnInfo columnInfo, com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking realmObject, com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface realmObjectTarget = (com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) realmObject;
        com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface realmObjectSource = (com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxyInterface) newObject;
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addInteger(columnInfo.cve_vehicleIndex, realmObjectSource.realmGet$cve_vehicle());
        builder.addString(columnInfo.userVehicleIndex, realmObjectSource.realmGet$userVehicle());
        builder.addString(columnInfo.vehicle_nameIndex, realmObjectSource.realmGet$vehicle_name());
        builder.addString(columnInfo.vehicle_imageIndex, realmObjectSource.realmGet$vehicle_image());
        builder.addDouble(columnInfo.latitudeIndex, realmObjectSource.realmGet$latitude());
        builder.addDouble(columnInfo.longitudeIndex, realmObjectSource.realmGet$longitude());
        builder.addBoolean(columnInfo.selectedIndex, realmObjectSource.realmGet$selected());
        builder.addInteger(columnInfo.positionItemIndex, realmObjectSource.realmGet$positionItem());
        builder.addInteger(columnInfo.vehicle_switchIndex, realmObjectSource.realmGet$vehicle_switch());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("VehicleTracking = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{cve_vehicle:");
        stringBuilder.append(realmGet$cve_vehicle());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{userVehicle:");
        stringBuilder.append(realmGet$userVehicle() != null ? realmGet$userVehicle() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{vehicle_name:");
        stringBuilder.append(realmGet$vehicle_name() != null ? realmGet$vehicle_name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{vehicle_image:");
        stringBuilder.append(realmGet$vehicle_image() != null ? realmGet$vehicle_image() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{latitude:");
        stringBuilder.append(realmGet$latitude());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{longitude:");
        stringBuilder.append(realmGet$longitude());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{selected:");
        stringBuilder.append(realmGet$selected());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{positionItem:");
        stringBuilder.append(realmGet$positionItem());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{vehicle_switch:");
        stringBuilder.append(realmGet$vehicle_switch());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy aVehicleTracking = (com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aVehicleTracking.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aVehicleTracking.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aVehicleTracking.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
