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
public class com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy extends com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2
    implements RealmObjectProxy, com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface {

    static final class GroupV2ColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long cve_vehicle_groupIndex;
        long userGroupIndex;
        long vehicle_groupIndex;
        long desc_vehicle_groupIndex;
        long selectedIndex;
        long positionItemIndex;
        long vehiclesIndex;

        GroupV2ColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("GroupV2");
            this.cve_vehicle_groupIndex = addColumnDetails("cve_vehicle_group", "cve_vehicle_group", objectSchemaInfo);
            this.userGroupIndex = addColumnDetails("userGroup", "userGroup", objectSchemaInfo);
            this.vehicle_groupIndex = addColumnDetails("vehicle_group", "vehicle_group", objectSchemaInfo);
            this.desc_vehicle_groupIndex = addColumnDetails("desc_vehicle_group", "desc_vehicle_group", objectSchemaInfo);
            this.selectedIndex = addColumnDetails("selected", "selected", objectSchemaInfo);
            this.positionItemIndex = addColumnDetails("positionItem", "positionItem", objectSchemaInfo);
            this.vehiclesIndex = addColumnDetails("vehicles", "vehicles", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        GroupV2ColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new GroupV2ColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final GroupV2ColumnInfo src = (GroupV2ColumnInfo) rawSrc;
            final GroupV2ColumnInfo dst = (GroupV2ColumnInfo) rawDst;
            dst.cve_vehicle_groupIndex = src.cve_vehicle_groupIndex;
            dst.userGroupIndex = src.userGroupIndex;
            dst.vehicle_groupIndex = src.vehicle_groupIndex;
            dst.desc_vehicle_groupIndex = src.desc_vehicle_groupIndex;
            dst.selectedIndex = src.selectedIndex;
            dst.positionItemIndex = src.positionItemIndex;
            dst.vehiclesIndex = src.vehiclesIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private GroupV2ColumnInfo columnInfo;
    private ProxyState<com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2> proxyState;
    private RealmList<com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2> vehiclesRealmList;

    com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (GroupV2ColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$cve_vehicle_group() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.cve_vehicle_groupIndex);
    }

    @Override
    public void realmSet$cve_vehicle_group(int value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'cve_vehicle_group' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$userGroup() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userGroupIndex);
    }

    @Override
    public void realmSet$userGroup(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userGroupIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.userGroupIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userGroupIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.userGroupIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$vehicle_group() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.vehicle_groupIndex);
    }

    @Override
    public void realmSet$vehicle_group(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.vehicle_groupIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.vehicle_groupIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.vehicle_groupIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.vehicle_groupIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$desc_vehicle_group() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.desc_vehicle_groupIndex);
    }

    @Override
    public void realmSet$desc_vehicle_group(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.desc_vehicle_groupIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.desc_vehicle_groupIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.desc_vehicle_groupIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.desc_vehicle_groupIndex, value);
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
    public RealmList<com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2> realmGet$vehicles() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (vehiclesRealmList != null) {
            return vehiclesRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.vehiclesIndex);
            vehiclesRealmList = new RealmList<com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2>(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class, osList, proxyState.getRealm$realm());
            return vehiclesRealmList;
        }
    }

    @Override
    public void realmSet$vehicles(RealmList<com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("vehicles")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2> original = value;
                value = new RealmList<com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2>();
                for (com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.vehiclesIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.setRow(i, ((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        } else {
            osList.removeAll();
            if (value == null) {
                return;
            }
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("GroupV2", 7, 0);
        builder.addPersistedProperty("cve_vehicle_group", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("userGroup", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("vehicle_group", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("desc_vehicle_group", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("selected", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("positionItem", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("vehicles", RealmFieldType.LIST, "VehicleV2");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static GroupV2ColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new GroupV2ColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "GroupV2";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "GroupV2";
    }

    @SuppressWarnings("cast")
    public static com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2 createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2 obj = null;
        if (update) {
            Table table = realm.getTable(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class);
            GroupV2ColumnInfo columnInfo = (GroupV2ColumnInfo) realm.getSchema().getColumnInfo(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class);
            long pkColumnIndex = columnInfo.cve_vehicle_groupIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("cve_vehicle_group")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("cve_vehicle_group"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("vehicles")) {
                excludeFields.add("vehicles");
            }
            if (json.has("cve_vehicle_group")) {
                if (json.isNull("cve_vehicle_group")) {
                    obj = (io.realm.com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy) realm.createObjectInternal(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy) realm.createObjectInternal(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class, json.getInt("cve_vehicle_group"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'cve_vehicle_group'.");
            }
        }

        final com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface objProxy = (com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) obj;
        if (json.has("userGroup")) {
            if (json.isNull("userGroup")) {
                objProxy.realmSet$userGroup(null);
            } else {
                objProxy.realmSet$userGroup((String) json.getString("userGroup"));
            }
        }
        if (json.has("vehicle_group")) {
            if (json.isNull("vehicle_group")) {
                objProxy.realmSet$vehicle_group(null);
            } else {
                objProxy.realmSet$vehicle_group((String) json.getString("vehicle_group"));
            }
        }
        if (json.has("desc_vehicle_group")) {
            if (json.isNull("desc_vehicle_group")) {
                objProxy.realmSet$desc_vehicle_group(null);
            } else {
                objProxy.realmSet$desc_vehicle_group((String) json.getString("desc_vehicle_group"));
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
        if (json.has("vehicles")) {
            if (json.isNull("vehicles")) {
                objProxy.realmSet$vehicles(null);
            } else {
                objProxy.realmGet$vehicles().clear();
                JSONArray array = json.getJSONArray("vehicles");
                for (int i = 0; i < array.length(); i++) {
                    com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 item = com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$vehicles().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2 createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2 obj = new com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2();
        final com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface objProxy = (com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("cve_vehicle_group")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$cve_vehicle_group((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'cve_vehicle_group' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("userGroup")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userGroup((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userGroup(null);
                }
            } else if (name.equals("vehicle_group")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$vehicle_group((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$vehicle_group(null);
                }
            } else if (name.equals("desc_vehicle_group")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$desc_vehicle_group((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$desc_vehicle_group(null);
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
            } else if (name.equals("vehicles")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$vehicles(null);
                } else {
                    objProxy.realmSet$vehicles(new RealmList<com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 item = com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$vehicles().add(item);
                    }
                    reader.endArray();
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'cve_vehicle_group'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating uexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class), false, Collections.<String>emptyList());
        io.realm.com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy obj = new io.realm.com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2 copyOrUpdate(Realm realm, GroupV2ColumnInfo columnInfo, com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2 object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2) cachedRealmObject;
        }

        com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2 realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class);
            long pkColumnIndex = columnInfo.cve_vehicle_groupIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$cve_vehicle_group());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2 copy(Realm realm, GroupV2ColumnInfo columnInfo, com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2 newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2) cachedRealmObject;
        }

        com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface realmObjectSource = (com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) newObject;

        Table table = realm.getTable(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.cve_vehicle_groupIndex, realmObjectSource.realmGet$cve_vehicle_group());
        builder.addString(columnInfo.userGroupIndex, realmObjectSource.realmGet$userGroup());
        builder.addString(columnInfo.vehicle_groupIndex, realmObjectSource.realmGet$vehicle_group());
        builder.addString(columnInfo.desc_vehicle_groupIndex, realmObjectSource.realmGet$desc_vehicle_group());
        builder.addBoolean(columnInfo.selectedIndex, realmObjectSource.realmGet$selected());
        builder.addInteger(columnInfo.positionItemIndex, realmObjectSource.realmGet$positionItem());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        RealmList<com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2> vehiclesList = realmObjectSource.realmGet$vehicles();
        if (vehiclesList != null) {
            RealmList<com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2> vehiclesRealmList = realmObjectCopy.realmGet$vehicles();
            vehiclesRealmList.clear();
            for (int i = 0; i < vehiclesList.size(); i++) {
                com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 vehiclesItem = vehiclesList.get(i);
                com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 cachevehicles = (com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2) cache.get(vehiclesItem);
                if (cachevehicles != null) {
                    vehiclesRealmList.add(cachevehicles);
                } else {
                    vehiclesRealmList.add(com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.copyOrUpdate(realm, (com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.VehicleV2ColumnInfo) realm.getSchema().getColumnInfo(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class), vehiclesItem, update, cache, flags));
                }
            }
        }

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2 object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class);
        long tableNativePtr = table.getNativePtr();
        GroupV2ColumnInfo columnInfo = (GroupV2ColumnInfo) realm.getSchema().getColumnInfo(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class);
        long pkColumnIndex = columnInfo.cve_vehicle_groupIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$cve_vehicle_group();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$cve_vehicle_group());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$cve_vehicle_group());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$userGroup = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$userGroup();
        if (realmGet$userGroup != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userGroupIndex, rowIndex, realmGet$userGroup, false);
        }
        String realmGet$vehicle_group = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$vehicle_group();
        if (realmGet$vehicle_group != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicle_groupIndex, rowIndex, realmGet$vehicle_group, false);
        }
        String realmGet$desc_vehicle_group = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$desc_vehicle_group();
        if (realmGet$desc_vehicle_group != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.desc_vehicle_groupIndex, rowIndex, realmGet$desc_vehicle_group, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.selectedIndex, rowIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$selected(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.positionItemIndex, rowIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$positionItem(), false);

        RealmList<com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2> vehiclesList = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$vehicles();
        if (vehiclesList != null) {
            OsList vehiclesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.vehiclesIndex);
            for (com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 vehiclesItem : vehiclesList) {
                Long cacheItemIndexvehicles = cache.get(vehiclesItem);
                if (cacheItemIndexvehicles == null) {
                    cacheItemIndexvehicles = com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.insert(realm, vehiclesItem, cache);
                }
                vehiclesOsList.addRow(cacheItemIndexvehicles);
            }
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class);
        long tableNativePtr = table.getNativePtr();
        GroupV2ColumnInfo columnInfo = (GroupV2ColumnInfo) realm.getSchema().getColumnInfo(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class);
        long pkColumnIndex = columnInfo.cve_vehicle_groupIndex;
        com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2 object = null;
        while (objects.hasNext()) {
            object = (com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$cve_vehicle_group();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$cve_vehicle_group());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$cve_vehicle_group());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$userGroup = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$userGroup();
            if (realmGet$userGroup != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userGroupIndex, rowIndex, realmGet$userGroup, false);
            }
            String realmGet$vehicle_group = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$vehicle_group();
            if (realmGet$vehicle_group != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicle_groupIndex, rowIndex, realmGet$vehicle_group, false);
            }
            String realmGet$desc_vehicle_group = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$desc_vehicle_group();
            if (realmGet$desc_vehicle_group != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.desc_vehicle_groupIndex, rowIndex, realmGet$desc_vehicle_group, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.selectedIndex, rowIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$selected(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.positionItemIndex, rowIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$positionItem(), false);

            RealmList<com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2> vehiclesList = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$vehicles();
            if (vehiclesList != null) {
                OsList vehiclesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.vehiclesIndex);
                for (com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 vehiclesItem : vehiclesList) {
                    Long cacheItemIndexvehicles = cache.get(vehiclesItem);
                    if (cacheItemIndexvehicles == null) {
                        cacheItemIndexvehicles = com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.insert(realm, vehiclesItem, cache);
                    }
                    vehiclesOsList.addRow(cacheItemIndexvehicles);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2 object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class);
        long tableNativePtr = table.getNativePtr();
        GroupV2ColumnInfo columnInfo = (GroupV2ColumnInfo) realm.getSchema().getColumnInfo(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class);
        long pkColumnIndex = columnInfo.cve_vehicle_groupIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$cve_vehicle_group();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$cve_vehicle_group());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$cve_vehicle_group());
        }
        cache.put(object, rowIndex);
        String realmGet$userGroup = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$userGroup();
        if (realmGet$userGroup != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userGroupIndex, rowIndex, realmGet$userGroup, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userGroupIndex, rowIndex, false);
        }
        String realmGet$vehicle_group = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$vehicle_group();
        if (realmGet$vehicle_group != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicle_groupIndex, rowIndex, realmGet$vehicle_group, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.vehicle_groupIndex, rowIndex, false);
        }
        String realmGet$desc_vehicle_group = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$desc_vehicle_group();
        if (realmGet$desc_vehicle_group != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.desc_vehicle_groupIndex, rowIndex, realmGet$desc_vehicle_group, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.desc_vehicle_groupIndex, rowIndex, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.selectedIndex, rowIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$selected(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.positionItemIndex, rowIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$positionItem(), false);

        OsList vehiclesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.vehiclesIndex);
        RealmList<com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2> vehiclesList = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$vehicles();
        if (vehiclesList != null && vehiclesList.size() == vehiclesOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = vehiclesList.size();
            for (int i = 0; i < objects; i++) {
                com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 vehiclesItem = vehiclesList.get(i);
                Long cacheItemIndexvehicles = cache.get(vehiclesItem);
                if (cacheItemIndexvehicles == null) {
                    cacheItemIndexvehicles = com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.insertOrUpdate(realm, vehiclesItem, cache);
                }
                vehiclesOsList.setRow(i, cacheItemIndexvehicles);
            }
        } else {
            vehiclesOsList.removeAll();
            if (vehiclesList != null) {
                for (com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 vehiclesItem : vehiclesList) {
                    Long cacheItemIndexvehicles = cache.get(vehiclesItem);
                    if (cacheItemIndexvehicles == null) {
                        cacheItemIndexvehicles = com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.insertOrUpdate(realm, vehiclesItem, cache);
                    }
                    vehiclesOsList.addRow(cacheItemIndexvehicles);
                }
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class);
        long tableNativePtr = table.getNativePtr();
        GroupV2ColumnInfo columnInfo = (GroupV2ColumnInfo) realm.getSchema().getColumnInfo(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class);
        long pkColumnIndex = columnInfo.cve_vehicle_groupIndex;
        com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2 object = null;
        while (objects.hasNext()) {
            object = (com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$cve_vehicle_group();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$cve_vehicle_group());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$cve_vehicle_group());
            }
            cache.put(object, rowIndex);
            String realmGet$userGroup = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$userGroup();
            if (realmGet$userGroup != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userGroupIndex, rowIndex, realmGet$userGroup, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userGroupIndex, rowIndex, false);
            }
            String realmGet$vehicle_group = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$vehicle_group();
            if (realmGet$vehicle_group != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicle_groupIndex, rowIndex, realmGet$vehicle_group, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.vehicle_groupIndex, rowIndex, false);
            }
            String realmGet$desc_vehicle_group = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$desc_vehicle_group();
            if (realmGet$desc_vehicle_group != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.desc_vehicle_groupIndex, rowIndex, realmGet$desc_vehicle_group, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.desc_vehicle_groupIndex, rowIndex, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.selectedIndex, rowIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$selected(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.positionItemIndex, rowIndex, ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$positionItem(), false);

            OsList vehiclesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.vehiclesIndex);
            RealmList<com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2> vehiclesList = ((com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) object).realmGet$vehicles();
            if (vehiclesList != null && vehiclesList.size() == vehiclesOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = vehiclesList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 vehiclesItem = vehiclesList.get(i);
                    Long cacheItemIndexvehicles = cache.get(vehiclesItem);
                    if (cacheItemIndexvehicles == null) {
                        cacheItemIndexvehicles = com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.insertOrUpdate(realm, vehiclesItem, cache);
                    }
                    vehiclesOsList.setRow(i, cacheItemIndexvehicles);
                }
            } else {
                vehiclesOsList.removeAll();
                if (vehiclesList != null) {
                    for (com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 vehiclesItem : vehiclesList) {
                        Long cacheItemIndexvehicles = cache.get(vehiclesItem);
                        if (cacheItemIndexvehicles == null) {
                            cacheItemIndexvehicles = com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.insertOrUpdate(realm, vehiclesItem, cache);
                        }
                        vehiclesOsList.addRow(cacheItemIndexvehicles);
                    }
                }
            }

        }
    }

    public static com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2 createDetachedCopy(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2 realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2 unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2) cachedObject.object;
            }
            unmanagedObject = (com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface unmanagedCopy = (com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) unmanagedObject;
        com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface realmSource = (com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$cve_vehicle_group(realmSource.realmGet$cve_vehicle_group());
        unmanagedCopy.realmSet$userGroup(realmSource.realmGet$userGroup());
        unmanagedCopy.realmSet$vehicle_group(realmSource.realmGet$vehicle_group());
        unmanagedCopy.realmSet$desc_vehicle_group(realmSource.realmGet$desc_vehicle_group());
        unmanagedCopy.realmSet$selected(realmSource.realmGet$selected());
        unmanagedCopy.realmSet$positionItem(realmSource.realmGet$positionItem());

        // Deep copy of vehicles
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$vehicles(null);
        } else {
            RealmList<com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2> managedvehiclesList = realmSource.realmGet$vehicles();
            RealmList<com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2> unmanagedvehiclesList = new RealmList<com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2>();
            unmanagedCopy.realmSet$vehicles(unmanagedvehiclesList);
            int nextDepth = currentDepth + 1;
            int size = managedvehiclesList.size();
            for (int i = 0; i < size; i++) {
                com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 item = com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.createDetachedCopy(managedvehiclesList.get(i), nextDepth, maxDepth, cache);
                unmanagedvehiclesList.add(item);
            }
        }

        return unmanagedObject;
    }

    static com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2 update(Realm realm, GroupV2ColumnInfo columnInfo, com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2 realmObject, com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2 newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface realmObjectTarget = (com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) realmObject;
        com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface realmObjectSource = (com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxyInterface) newObject;
        Table table = realm.getTable(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addInteger(columnInfo.cve_vehicle_groupIndex, realmObjectSource.realmGet$cve_vehicle_group());
        builder.addString(columnInfo.userGroupIndex, realmObjectSource.realmGet$userGroup());
        builder.addString(columnInfo.vehicle_groupIndex, realmObjectSource.realmGet$vehicle_group());
        builder.addString(columnInfo.desc_vehicle_groupIndex, realmObjectSource.realmGet$desc_vehicle_group());
        builder.addBoolean(columnInfo.selectedIndex, realmObjectSource.realmGet$selected());
        builder.addInteger(columnInfo.positionItemIndex, realmObjectSource.realmGet$positionItem());

        RealmList<com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2> vehiclesList = realmObjectSource.realmGet$vehicles();
        if (vehiclesList != null) {
            RealmList<com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2> vehiclesManagedCopy = new RealmList<com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2>();
            for (int i = 0; i < vehiclesList.size(); i++) {
                com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 vehiclesItem = vehiclesList.get(i);
                com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2 cachevehicles = (com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2) cache.get(vehiclesItem);
                if (cachevehicles != null) {
                    vehiclesManagedCopy.add(cachevehicles);
                } else {
                    vehiclesManagedCopy.add(com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.copyOrUpdate(realm, (com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.VehicleV2ColumnInfo) realm.getSchema().getColumnInfo(com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class), vehiclesItem, true, cache, flags));
                }
            }
            builder.addObjectList(columnInfo.vehiclesIndex, vehiclesManagedCopy);
        } else {
            builder.addObjectList(columnInfo.vehiclesIndex, new RealmList<com.newlandapps.onroad.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2>());
        }

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("GroupV2 = proxy[");
        stringBuilder.append("{cve_vehicle_group:");
        stringBuilder.append(realmGet$cve_vehicle_group());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{userGroup:");
        stringBuilder.append(realmGet$userGroup() != null ? realmGet$userGroup() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{vehicle_group:");
        stringBuilder.append(realmGet$vehicle_group() != null ? realmGet$vehicle_group() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{desc_vehicle_group:");
        stringBuilder.append(realmGet$desc_vehicle_group() != null ? realmGet$desc_vehicle_group() : "null");
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
        stringBuilder.append("{vehicles:");
        stringBuilder.append("RealmList<VehicleV2>[").append(realmGet$vehicles().size()).append("]");
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
        com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy aGroupV2 = (com_newlandapps_onroad_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aGroupV2.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aGroupV2.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aGroupV2.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
