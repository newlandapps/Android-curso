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
public class com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy extends com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles
    implements RealmObjectProxy, com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface {

    static final class VehiclesColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long cve_vehicleIndex;
        long userVehicleIndex;
        long vehicle_nameIndex;
        long vehicle_imageIndex;
        long latitudeIndex;
        long longitudeIndex;
        long selectedIndex;
        long positionItemIndex;

        VehiclesColumnInfo(OsSchemaInfo schemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Vehicles");
            this.cve_vehicleIndex = addColumnDetails("cve_vehicle", "cve_vehicle", objectSchemaInfo);
            this.userVehicleIndex = addColumnDetails("userVehicle", "userVehicle", objectSchemaInfo);
            this.vehicle_nameIndex = addColumnDetails("vehicle_name", "vehicle_name", objectSchemaInfo);
            this.vehicle_imageIndex = addColumnDetails("vehicle_image", "vehicle_image", objectSchemaInfo);
            this.latitudeIndex = addColumnDetails("latitude", "latitude", objectSchemaInfo);
            this.longitudeIndex = addColumnDetails("longitude", "longitude", objectSchemaInfo);
            this.selectedIndex = addColumnDetails("selected", "selected", objectSchemaInfo);
            this.positionItemIndex = addColumnDetails("positionItem", "positionItem", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        VehiclesColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new VehiclesColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final VehiclesColumnInfo src = (VehiclesColumnInfo) rawSrc;
            final VehiclesColumnInfo dst = (VehiclesColumnInfo) rawDst;
            dst.cve_vehicleIndex = src.cve_vehicleIndex;
            dst.userVehicleIndex = src.userVehicleIndex;
            dst.vehicle_nameIndex = src.vehicle_nameIndex;
            dst.vehicle_imageIndex = src.vehicle_imageIndex;
            dst.latitudeIndex = src.latitudeIndex;
            dst.longitudeIndex = src.longitudeIndex;
            dst.selectedIndex = src.selectedIndex;
            dst.positionItemIndex = src.positionItemIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private VehiclesColumnInfo columnInfo;
    private ProxyState<com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles> proxyState;

    com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (VehiclesColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
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
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'cve_vehicle' cannot be changed after object was created.");
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Vehicles", 8, 0);
        builder.addPersistedProperty("cve_vehicle", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("userVehicle", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("vehicle_name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("vehicle_image", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("latitude", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("longitude", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("selected", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("positionItem", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static VehiclesColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new VehiclesColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Vehicles";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Vehicles";
    }

    @SuppressWarnings("cast")
    public static com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles obj = null;
        if (update) {
            Table table = realm.getTable(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class);
            VehiclesColumnInfo columnInfo = (VehiclesColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class);
            long pkColumnIndex = columnInfo.cve_vehicleIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("cve_vehicle")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("cve_vehicle"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("cve_vehicle")) {
                if (json.isNull("cve_vehicle")) {
                    obj = (io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy) realm.createObjectInternal(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy) realm.createObjectInternal(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class, json.getInt("cve_vehicle"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'cve_vehicle'.");
            }
        }

        final com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface objProxy = (com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) obj;
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
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles obj = new com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles();
        final com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface objProxy = (com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("cve_vehicle")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$cve_vehicle((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'cve_vehicle' to null.");
                }
                jsonHasPrimaryKey = true;
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
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'cve_vehicle'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating uexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class), false, Collections.<String>emptyList());
        io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy obj = new io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles copyOrUpdate(Realm realm, VehiclesColumnInfo columnInfo, com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles) cachedRealmObject;
        }

        com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class);
            long pkColumnIndex = columnInfo.cve_vehicleIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$cve_vehicle());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles copy(Realm realm, VehiclesColumnInfo columnInfo, com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles) cachedRealmObject;
        }

        com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface realmObjectSource = (com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) newObject;

        Table table = realm.getTable(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.cve_vehicleIndex, realmObjectSource.realmGet$cve_vehicle());
        builder.addString(columnInfo.userVehicleIndex, realmObjectSource.realmGet$userVehicle());
        builder.addString(columnInfo.vehicle_nameIndex, realmObjectSource.realmGet$vehicle_name());
        builder.addString(columnInfo.vehicle_imageIndex, realmObjectSource.realmGet$vehicle_image());
        builder.addDouble(columnInfo.latitudeIndex, realmObjectSource.realmGet$latitude());
        builder.addDouble(columnInfo.longitudeIndex, realmObjectSource.realmGet$longitude());
        builder.addBoolean(columnInfo.selectedIndex, realmObjectSource.realmGet$selected());
        builder.addInteger(columnInfo.positionItemIndex, realmObjectSource.realmGet$positionItem());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class);
        long tableNativePtr = table.getNativePtr();
        VehiclesColumnInfo columnInfo = (VehiclesColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class);
        long pkColumnIndex = columnInfo.cve_vehicleIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$cve_vehicle();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$cve_vehicle());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$cve_vehicle());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$userVehicle = ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$userVehicle();
        if (realmGet$userVehicle != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userVehicleIndex, rowIndex, realmGet$userVehicle, false);
        }
        String realmGet$vehicle_name = ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$vehicle_name();
        if (realmGet$vehicle_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicle_nameIndex, rowIndex, realmGet$vehicle_name, false);
        }
        String realmGet$vehicle_image = ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$vehicle_image();
        if (realmGet$vehicle_image != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicle_imageIndex, rowIndex, realmGet$vehicle_image, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.latitudeIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$latitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.longitudeIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$longitude(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.selectedIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$selected(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.positionItemIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$positionItem(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class);
        long tableNativePtr = table.getNativePtr();
        VehiclesColumnInfo columnInfo = (VehiclesColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class);
        long pkColumnIndex = columnInfo.cve_vehicleIndex;
        com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles object = null;
        while (objects.hasNext()) {
            object = (com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$cve_vehicle();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$cve_vehicle());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$cve_vehicle());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$userVehicle = ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$userVehicle();
            if (realmGet$userVehicle != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userVehicleIndex, rowIndex, realmGet$userVehicle, false);
            }
            String realmGet$vehicle_name = ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$vehicle_name();
            if (realmGet$vehicle_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicle_nameIndex, rowIndex, realmGet$vehicle_name, false);
            }
            String realmGet$vehicle_image = ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$vehicle_image();
            if (realmGet$vehicle_image != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicle_imageIndex, rowIndex, realmGet$vehicle_image, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.latitudeIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$latitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.longitudeIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$longitude(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.selectedIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$selected(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.positionItemIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$positionItem(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class);
        long tableNativePtr = table.getNativePtr();
        VehiclesColumnInfo columnInfo = (VehiclesColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class);
        long pkColumnIndex = columnInfo.cve_vehicleIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$cve_vehicle();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$cve_vehicle());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$cve_vehicle());
        }
        cache.put(object, rowIndex);
        String realmGet$userVehicle = ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$userVehicle();
        if (realmGet$userVehicle != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userVehicleIndex, rowIndex, realmGet$userVehicle, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userVehicleIndex, rowIndex, false);
        }
        String realmGet$vehicle_name = ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$vehicle_name();
        if (realmGet$vehicle_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicle_nameIndex, rowIndex, realmGet$vehicle_name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.vehicle_nameIndex, rowIndex, false);
        }
        String realmGet$vehicle_image = ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$vehicle_image();
        if (realmGet$vehicle_image != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicle_imageIndex, rowIndex, realmGet$vehicle_image, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.vehicle_imageIndex, rowIndex, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.latitudeIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$latitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.longitudeIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$longitude(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.selectedIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$selected(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.positionItemIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$positionItem(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class);
        long tableNativePtr = table.getNativePtr();
        VehiclesColumnInfo columnInfo = (VehiclesColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class);
        long pkColumnIndex = columnInfo.cve_vehicleIndex;
        com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles object = null;
        while (objects.hasNext()) {
            object = (com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$cve_vehicle();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$cve_vehicle());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$cve_vehicle());
            }
            cache.put(object, rowIndex);
            String realmGet$userVehicle = ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$userVehicle();
            if (realmGet$userVehicle != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userVehicleIndex, rowIndex, realmGet$userVehicle, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userVehicleIndex, rowIndex, false);
            }
            String realmGet$vehicle_name = ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$vehicle_name();
            if (realmGet$vehicle_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicle_nameIndex, rowIndex, realmGet$vehicle_name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.vehicle_nameIndex, rowIndex, false);
            }
            String realmGet$vehicle_image = ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$vehicle_image();
            if (realmGet$vehicle_image != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicle_imageIndex, rowIndex, realmGet$vehicle_image, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.vehicle_imageIndex, rowIndex, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.latitudeIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$latitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.longitudeIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$longitude(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.selectedIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$selected(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.positionItemIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) object).realmGet$positionItem(), false);
        }
    }

    public static com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles createDetachedCopy(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles) cachedObject.object;
            }
            unmanagedObject = (com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface unmanagedCopy = (com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) unmanagedObject;
        com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface realmSource = (com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$cve_vehicle(realmSource.realmGet$cve_vehicle());
        unmanagedCopy.realmSet$userVehicle(realmSource.realmGet$userVehicle());
        unmanagedCopy.realmSet$vehicle_name(realmSource.realmGet$vehicle_name());
        unmanagedCopy.realmSet$vehicle_image(realmSource.realmGet$vehicle_image());
        unmanagedCopy.realmSet$latitude(realmSource.realmGet$latitude());
        unmanagedCopy.realmSet$longitude(realmSource.realmGet$longitude());
        unmanagedCopy.realmSet$selected(realmSource.realmGet$selected());
        unmanagedCopy.realmSet$positionItem(realmSource.realmGet$positionItem());

        return unmanagedObject;
    }

    static com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles update(Realm realm, VehiclesColumnInfo columnInfo, com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles realmObject, com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface realmObjectTarget = (com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) realmObject;
        com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface realmObjectSource = (com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxyInterface) newObject;
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addInteger(columnInfo.cve_vehicleIndex, realmObjectSource.realmGet$cve_vehicle());
        builder.addString(columnInfo.userVehicleIndex, realmObjectSource.realmGet$userVehicle());
        builder.addString(columnInfo.vehicle_nameIndex, realmObjectSource.realmGet$vehicle_name());
        builder.addString(columnInfo.vehicle_imageIndex, realmObjectSource.realmGet$vehicle_image());
        builder.addDouble(columnInfo.latitudeIndex, realmObjectSource.realmGet$latitude());
        builder.addDouble(columnInfo.longitudeIndex, realmObjectSource.realmGet$longitude());
        builder.addBoolean(columnInfo.selectedIndex, realmObjectSource.realmGet$selected());
        builder.addInteger(columnInfo.positionItemIndex, realmObjectSource.realmGet$positionItem());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Vehicles = proxy[");
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
        com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy aVehicles = (com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aVehicles.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aVehicles.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aVehicles.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
