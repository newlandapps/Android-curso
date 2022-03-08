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
public class com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy extends com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2
    implements RealmObjectProxy, com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface {

    static final class VehicleV2ColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long cve_vehicleIndex;
        long userVehicleIndex;
        long vehicle_nameIndex;
        long vehicle_imageIndex;
        long latitudeIndex;
        long longitudeIndex;
        long selectedIndex;
        long positionItemIndex;

        VehicleV2ColumnInfo(OsSchemaInfo schemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("VehicleV2");
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

        VehicleV2ColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new VehicleV2ColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final VehicleV2ColumnInfo src = (VehicleV2ColumnInfo) rawSrc;
            final VehicleV2ColumnInfo dst = (VehicleV2ColumnInfo) rawDst;
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

    private VehicleV2ColumnInfo columnInfo;
    private ProxyState<com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2> proxyState;

    com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (VehicleV2ColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2>(this);
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("VehicleV2", 8, 0);
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

    public static VehicleV2ColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new VehicleV2ColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "VehicleV2";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "VehicleV2";
    }

    @SuppressWarnings("cast")
    public static com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 obj = null;
        if (update) {
            Table table = realm.getTable(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class);
            VehicleV2ColumnInfo columnInfo = (VehicleV2ColumnInfo) realm.getSchema().getColumnInfo(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class);
            long pkColumnIndex = columnInfo.cve_vehicleIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("cve_vehicle")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("cve_vehicle"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("cve_vehicle")) {
                if (json.isNull("cve_vehicle")) {
                    obj = (io.realm.com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy) realm.createObjectInternal(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy) realm.createObjectInternal(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class, json.getInt("cve_vehicle"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'cve_vehicle'.");
            }
        }

        final com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface objProxy = (com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) obj;
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
    public static com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 obj = new com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2();
        final com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface objProxy = (com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) obj;
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

    private static com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating uexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class), false, Collections.<String>emptyList());
        io.realm.com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy obj = new io.realm.com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 copyOrUpdate(Realm realm, VehicleV2ColumnInfo columnInfo, com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2) cachedRealmObject;
        }

        com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class);
            long pkColumnIndex = columnInfo.cve_vehicleIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$cve_vehicle());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 copy(Realm realm, VehicleV2ColumnInfo columnInfo, com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2) cachedRealmObject;
        }

        com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface realmObjectSource = (com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) newObject;

        Table table = realm.getTable(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class);
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
        io.realm.com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class);
        long tableNativePtr = table.getNativePtr();
        VehicleV2ColumnInfo columnInfo = (VehicleV2ColumnInfo) realm.getSchema().getColumnInfo(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class);
        long pkColumnIndex = columnInfo.cve_vehicleIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$cve_vehicle();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$cve_vehicle());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$cve_vehicle());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$userVehicle = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$userVehicle();
        if (realmGet$userVehicle != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userVehicleIndex, rowIndex, realmGet$userVehicle, false);
        }
        String realmGet$vehicle_name = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$vehicle_name();
        if (realmGet$vehicle_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicle_nameIndex, rowIndex, realmGet$vehicle_name, false);
        }
        String realmGet$vehicle_image = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$vehicle_image();
        if (realmGet$vehicle_image != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicle_imageIndex, rowIndex, realmGet$vehicle_image, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.latitudeIndex, rowIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$latitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.longitudeIndex, rowIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$longitude(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.selectedIndex, rowIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$selected(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.positionItemIndex, rowIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$positionItem(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class);
        long tableNativePtr = table.getNativePtr();
        VehicleV2ColumnInfo columnInfo = (VehicleV2ColumnInfo) realm.getSchema().getColumnInfo(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class);
        long pkColumnIndex = columnInfo.cve_vehicleIndex;
        com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 object = null;
        while (objects.hasNext()) {
            object = (com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$cve_vehicle();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$cve_vehicle());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$cve_vehicle());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$userVehicle = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$userVehicle();
            if (realmGet$userVehicle != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userVehicleIndex, rowIndex, realmGet$userVehicle, false);
            }
            String realmGet$vehicle_name = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$vehicle_name();
            if (realmGet$vehicle_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicle_nameIndex, rowIndex, realmGet$vehicle_name, false);
            }
            String realmGet$vehicle_image = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$vehicle_image();
            if (realmGet$vehicle_image != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicle_imageIndex, rowIndex, realmGet$vehicle_image, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.latitudeIndex, rowIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$latitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.longitudeIndex, rowIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$longitude(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.selectedIndex, rowIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$selected(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.positionItemIndex, rowIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$positionItem(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class);
        long tableNativePtr = table.getNativePtr();
        VehicleV2ColumnInfo columnInfo = (VehicleV2ColumnInfo) realm.getSchema().getColumnInfo(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class);
        long pkColumnIndex = columnInfo.cve_vehicleIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$cve_vehicle();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$cve_vehicle());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$cve_vehicle());
        }
        cache.put(object, rowIndex);
        String realmGet$userVehicle = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$userVehicle();
        if (realmGet$userVehicle != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userVehicleIndex, rowIndex, realmGet$userVehicle, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userVehicleIndex, rowIndex, false);
        }
        String realmGet$vehicle_name = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$vehicle_name();
        if (realmGet$vehicle_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicle_nameIndex, rowIndex, realmGet$vehicle_name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.vehicle_nameIndex, rowIndex, false);
        }
        String realmGet$vehicle_image = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$vehicle_image();
        if (realmGet$vehicle_image != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicle_imageIndex, rowIndex, realmGet$vehicle_image, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.vehicle_imageIndex, rowIndex, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.latitudeIndex, rowIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$latitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.longitudeIndex, rowIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$longitude(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.selectedIndex, rowIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$selected(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.positionItemIndex, rowIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$positionItem(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class);
        long tableNativePtr = table.getNativePtr();
        VehicleV2ColumnInfo columnInfo = (VehicleV2ColumnInfo) realm.getSchema().getColumnInfo(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class);
        long pkColumnIndex = columnInfo.cve_vehicleIndex;
        com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 object = null;
        while (objects.hasNext()) {
            object = (com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$cve_vehicle();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$cve_vehicle());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$cve_vehicle());
            }
            cache.put(object, rowIndex);
            String realmGet$userVehicle = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$userVehicle();
            if (realmGet$userVehicle != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userVehicleIndex, rowIndex, realmGet$userVehicle, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userVehicleIndex, rowIndex, false);
            }
            String realmGet$vehicle_name = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$vehicle_name();
            if (realmGet$vehicle_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicle_nameIndex, rowIndex, realmGet$vehicle_name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.vehicle_nameIndex, rowIndex, false);
            }
            String realmGet$vehicle_image = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$vehicle_image();
            if (realmGet$vehicle_image != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicle_imageIndex, rowIndex, realmGet$vehicle_image, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.vehicle_imageIndex, rowIndex, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.latitudeIndex, rowIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$latitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.longitudeIndex, rowIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$longitude(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.selectedIndex, rowIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$selected(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.positionItemIndex, rowIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) object).realmGet$positionItem(), false);
        }
    }

    public static com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 createDetachedCopy(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2) cachedObject.object;
            }
            unmanagedObject = (com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface unmanagedCopy = (com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) unmanagedObject;
        com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface realmSource = (com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) realmObject;
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

    static com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 update(Realm realm, VehicleV2ColumnInfo columnInfo, com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 realmObject, com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface realmObjectTarget = (com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) realmObject;
        com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface realmObjectSource = (com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxyInterface) newObject;
        Table table = realm.getTable(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class);
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
        StringBuilder stringBuilder = new StringBuilder("VehicleV2 = proxy[");
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
        com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy aVehicleV2 = (com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aVehicleV2.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aVehicleV2.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aVehicleV2.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
