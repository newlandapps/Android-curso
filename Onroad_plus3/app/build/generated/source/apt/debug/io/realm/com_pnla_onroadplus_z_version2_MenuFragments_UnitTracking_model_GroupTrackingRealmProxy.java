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
public class com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy extends com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking
    implements RealmObjectProxy, com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface {

    static final class GroupTrackingColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long cve_vehicle_groupIndex;
        long userGroupIndex;
        long vehicle_groupIndex;
        long desc_vehicle_groupIndex;
        long selectedIndex;
        long positionItemIndex;
        long vehiclesIndex;

        GroupTrackingColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("GroupTracking");
            this.cve_vehicle_groupIndex = addColumnDetails("cve_vehicle_group", "cve_vehicle_group", objectSchemaInfo);
            this.userGroupIndex = addColumnDetails("userGroup", "userGroup", objectSchemaInfo);
            this.vehicle_groupIndex = addColumnDetails("vehicle_group", "vehicle_group", objectSchemaInfo);
            this.desc_vehicle_groupIndex = addColumnDetails("desc_vehicle_group", "desc_vehicle_group", objectSchemaInfo);
            this.selectedIndex = addColumnDetails("selected", "selected", objectSchemaInfo);
            this.positionItemIndex = addColumnDetails("positionItem", "positionItem", objectSchemaInfo);
            this.vehiclesIndex = addColumnDetails("vehicles", "vehicles", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        GroupTrackingColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new GroupTrackingColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final GroupTrackingColumnInfo src = (GroupTrackingColumnInfo) rawSrc;
            final GroupTrackingColumnInfo dst = (GroupTrackingColumnInfo) rawDst;
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

    private GroupTrackingColumnInfo columnInfo;
    private ProxyState<com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking> proxyState;
    private RealmList<com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking> vehiclesRealmList;

    com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (GroupTrackingColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking>(this);
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
    public RealmList<com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking> realmGet$vehicles() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (vehiclesRealmList != null) {
            return vehiclesRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.vehiclesIndex);
            vehiclesRealmList = new RealmList<com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking>(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class, osList, proxyState.getRealm$realm());
            return vehiclesRealmList;
        }
    }

    @Override
    public void realmSet$vehicles(RealmList<com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking> value) {
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
                final RealmList<com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking> original = value;
                value = new RealmList<com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking>();
                for (com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking item : original) {
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
                com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking linkedObject = value.get(i);
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
                com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("GroupTracking", 7, 0);
        builder.addPersistedProperty("cve_vehicle_group", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("userGroup", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("vehicle_group", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("desc_vehicle_group", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("selected", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("positionItem", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("vehicles", RealmFieldType.LIST, "VehicleTracking");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static GroupTrackingColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new GroupTrackingColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "GroupTracking";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "GroupTracking";
    }

    @SuppressWarnings("cast")
    public static com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking obj = null;
        if (update) {
            Table table = realm.getTable(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class);
            GroupTrackingColumnInfo columnInfo = (GroupTrackingColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class);
            long pkColumnIndex = columnInfo.cve_vehicle_groupIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("cve_vehicle_group")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("cve_vehicle_group"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy();
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
                    obj = (io.realm.com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy) realm.createObjectInternal(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy) realm.createObjectInternal(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class, json.getInt("cve_vehicle_group"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'cve_vehicle_group'.");
            }
        }

        final com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface objProxy = (com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) obj;
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
                    com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking item = com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$vehicles().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking obj = new com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking();
        final com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface objProxy = (com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) obj;
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
                    objProxy.realmSet$vehicles(new RealmList<com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking item = com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.createUsingJsonStream(realm, reader);
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

    private static com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating uexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class), false, Collections.<String>emptyList());
        io.realm.com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy obj = new io.realm.com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking copyOrUpdate(Realm realm, GroupTrackingColumnInfo columnInfo, com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking) cachedRealmObject;
        }

        com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class);
            long pkColumnIndex = columnInfo.cve_vehicle_groupIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$cve_vehicle_group());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking copy(Realm realm, GroupTrackingColumnInfo columnInfo, com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking) cachedRealmObject;
        }

        com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface realmObjectSource = (com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) newObject;

        Table table = realm.getTable(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class);
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
        io.realm.com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        RealmList<com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking> vehiclesList = realmObjectSource.realmGet$vehicles();
        if (vehiclesList != null) {
            RealmList<com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking> vehiclesRealmList = realmObjectCopy.realmGet$vehicles();
            vehiclesRealmList.clear();
            for (int i = 0; i < vehiclesList.size(); i++) {
                com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking vehiclesItem = vehiclesList.get(i);
                com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking cachevehicles = (com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking) cache.get(vehiclesItem);
                if (cachevehicles != null) {
                    vehiclesRealmList.add(cachevehicles);
                } else {
                    vehiclesRealmList.add(com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.copyOrUpdate(realm, (com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.VehicleTrackingColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class), vehiclesItem, update, cache, flags));
                }
            }
        }

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class);
        long tableNativePtr = table.getNativePtr();
        GroupTrackingColumnInfo columnInfo = (GroupTrackingColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class);
        long pkColumnIndex = columnInfo.cve_vehicle_groupIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$cve_vehicle_group();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$cve_vehicle_group());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$cve_vehicle_group());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$userGroup = ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$userGroup();
        if (realmGet$userGroup != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userGroupIndex, rowIndex, realmGet$userGroup, false);
        }
        String realmGet$vehicle_group = ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$vehicle_group();
        if (realmGet$vehicle_group != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicle_groupIndex, rowIndex, realmGet$vehicle_group, false);
        }
        String realmGet$desc_vehicle_group = ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$desc_vehicle_group();
        if (realmGet$desc_vehicle_group != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.desc_vehicle_groupIndex, rowIndex, realmGet$desc_vehicle_group, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.selectedIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$selected(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.positionItemIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$positionItem(), false);

        RealmList<com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking> vehiclesList = ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$vehicles();
        if (vehiclesList != null) {
            OsList vehiclesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.vehiclesIndex);
            for (com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking vehiclesItem : vehiclesList) {
                Long cacheItemIndexvehicles = cache.get(vehiclesItem);
                if (cacheItemIndexvehicles == null) {
                    cacheItemIndexvehicles = com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.insert(realm, vehiclesItem, cache);
                }
                vehiclesOsList.addRow(cacheItemIndexvehicles);
            }
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class);
        long tableNativePtr = table.getNativePtr();
        GroupTrackingColumnInfo columnInfo = (GroupTrackingColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class);
        long pkColumnIndex = columnInfo.cve_vehicle_groupIndex;
        com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking object = null;
        while (objects.hasNext()) {
            object = (com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$cve_vehicle_group();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$cve_vehicle_group());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$cve_vehicle_group());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$userGroup = ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$userGroup();
            if (realmGet$userGroup != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userGroupIndex, rowIndex, realmGet$userGroup, false);
            }
            String realmGet$vehicle_group = ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$vehicle_group();
            if (realmGet$vehicle_group != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicle_groupIndex, rowIndex, realmGet$vehicle_group, false);
            }
            String realmGet$desc_vehicle_group = ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$desc_vehicle_group();
            if (realmGet$desc_vehicle_group != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.desc_vehicle_groupIndex, rowIndex, realmGet$desc_vehicle_group, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.selectedIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$selected(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.positionItemIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$positionItem(), false);

            RealmList<com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking> vehiclesList = ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$vehicles();
            if (vehiclesList != null) {
                OsList vehiclesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.vehiclesIndex);
                for (com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking vehiclesItem : vehiclesList) {
                    Long cacheItemIndexvehicles = cache.get(vehiclesItem);
                    if (cacheItemIndexvehicles == null) {
                        cacheItemIndexvehicles = com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.insert(realm, vehiclesItem, cache);
                    }
                    vehiclesOsList.addRow(cacheItemIndexvehicles);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class);
        long tableNativePtr = table.getNativePtr();
        GroupTrackingColumnInfo columnInfo = (GroupTrackingColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class);
        long pkColumnIndex = columnInfo.cve_vehicle_groupIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$cve_vehicle_group();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$cve_vehicle_group());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$cve_vehicle_group());
        }
        cache.put(object, rowIndex);
        String realmGet$userGroup = ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$userGroup();
        if (realmGet$userGroup != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userGroupIndex, rowIndex, realmGet$userGroup, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userGroupIndex, rowIndex, false);
        }
        String realmGet$vehicle_group = ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$vehicle_group();
        if (realmGet$vehicle_group != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicle_groupIndex, rowIndex, realmGet$vehicle_group, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.vehicle_groupIndex, rowIndex, false);
        }
        String realmGet$desc_vehicle_group = ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$desc_vehicle_group();
        if (realmGet$desc_vehicle_group != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.desc_vehicle_groupIndex, rowIndex, realmGet$desc_vehicle_group, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.desc_vehicle_groupIndex, rowIndex, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.selectedIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$selected(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.positionItemIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$positionItem(), false);

        OsList vehiclesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.vehiclesIndex);
        RealmList<com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking> vehiclesList = ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$vehicles();
        if (vehiclesList != null && vehiclesList.size() == vehiclesOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = vehiclesList.size();
            for (int i = 0; i < objects; i++) {
                com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking vehiclesItem = vehiclesList.get(i);
                Long cacheItemIndexvehicles = cache.get(vehiclesItem);
                if (cacheItemIndexvehicles == null) {
                    cacheItemIndexvehicles = com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.insertOrUpdate(realm, vehiclesItem, cache);
                }
                vehiclesOsList.setRow(i, cacheItemIndexvehicles);
            }
        } else {
            vehiclesOsList.removeAll();
            if (vehiclesList != null) {
                for (com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking vehiclesItem : vehiclesList) {
                    Long cacheItemIndexvehicles = cache.get(vehiclesItem);
                    if (cacheItemIndexvehicles == null) {
                        cacheItemIndexvehicles = com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.insertOrUpdate(realm, vehiclesItem, cache);
                    }
                    vehiclesOsList.addRow(cacheItemIndexvehicles);
                }
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class);
        long tableNativePtr = table.getNativePtr();
        GroupTrackingColumnInfo columnInfo = (GroupTrackingColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class);
        long pkColumnIndex = columnInfo.cve_vehicle_groupIndex;
        com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking object = null;
        while (objects.hasNext()) {
            object = (com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$cve_vehicle_group();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$cve_vehicle_group());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$cve_vehicle_group());
            }
            cache.put(object, rowIndex);
            String realmGet$userGroup = ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$userGroup();
            if (realmGet$userGroup != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userGroupIndex, rowIndex, realmGet$userGroup, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userGroupIndex, rowIndex, false);
            }
            String realmGet$vehicle_group = ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$vehicle_group();
            if (realmGet$vehicle_group != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicle_groupIndex, rowIndex, realmGet$vehicle_group, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.vehicle_groupIndex, rowIndex, false);
            }
            String realmGet$desc_vehicle_group = ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$desc_vehicle_group();
            if (realmGet$desc_vehicle_group != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.desc_vehicle_groupIndex, rowIndex, realmGet$desc_vehicle_group, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.desc_vehicle_groupIndex, rowIndex, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.selectedIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$selected(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.positionItemIndex, rowIndex, ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$positionItem(), false);

            OsList vehiclesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.vehiclesIndex);
            RealmList<com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking> vehiclesList = ((com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) object).realmGet$vehicles();
            if (vehiclesList != null && vehiclesList.size() == vehiclesOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = vehiclesList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking vehiclesItem = vehiclesList.get(i);
                    Long cacheItemIndexvehicles = cache.get(vehiclesItem);
                    if (cacheItemIndexvehicles == null) {
                        cacheItemIndexvehicles = com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.insertOrUpdate(realm, vehiclesItem, cache);
                    }
                    vehiclesOsList.setRow(i, cacheItemIndexvehicles);
                }
            } else {
                vehiclesOsList.removeAll();
                if (vehiclesList != null) {
                    for (com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking vehiclesItem : vehiclesList) {
                        Long cacheItemIndexvehicles = cache.get(vehiclesItem);
                        if (cacheItemIndexvehicles == null) {
                            cacheItemIndexvehicles = com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.insertOrUpdate(realm, vehiclesItem, cache);
                        }
                        vehiclesOsList.addRow(cacheItemIndexvehicles);
                    }
                }
            }

        }
    }

    public static com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking createDetachedCopy(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking) cachedObject.object;
            }
            unmanagedObject = (com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface unmanagedCopy = (com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) unmanagedObject;
        com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface realmSource = (com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) realmObject;
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
            RealmList<com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking> managedvehiclesList = realmSource.realmGet$vehicles();
            RealmList<com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking> unmanagedvehiclesList = new RealmList<com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking>();
            unmanagedCopy.realmSet$vehicles(unmanagedvehiclesList);
            int nextDepth = currentDepth + 1;
            int size = managedvehiclesList.size();
            for (int i = 0; i < size; i++) {
                com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking item = com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.createDetachedCopy(managedvehiclesList.get(i), nextDepth, maxDepth, cache);
                unmanagedvehiclesList.add(item);
            }
        }

        return unmanagedObject;
    }

    static com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking update(Realm realm, GroupTrackingColumnInfo columnInfo, com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking realmObject, com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface realmObjectTarget = (com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) realmObject;
        com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface realmObjectSource = (com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxyInterface) newObject;
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addInteger(columnInfo.cve_vehicle_groupIndex, realmObjectSource.realmGet$cve_vehicle_group());
        builder.addString(columnInfo.userGroupIndex, realmObjectSource.realmGet$userGroup());
        builder.addString(columnInfo.vehicle_groupIndex, realmObjectSource.realmGet$vehicle_group());
        builder.addString(columnInfo.desc_vehicle_groupIndex, realmObjectSource.realmGet$desc_vehicle_group());
        builder.addBoolean(columnInfo.selectedIndex, realmObjectSource.realmGet$selected());
        builder.addInteger(columnInfo.positionItemIndex, realmObjectSource.realmGet$positionItem());

        RealmList<com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking> vehiclesList = realmObjectSource.realmGet$vehicles();
        if (vehiclesList != null) {
            RealmList<com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking> vehiclesManagedCopy = new RealmList<com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking>();
            for (int i = 0; i < vehiclesList.size(); i++) {
                com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking vehiclesItem = vehiclesList.get(i);
                com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking cachevehicles = (com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking) cache.get(vehiclesItem);
                if (cachevehicles != null) {
                    vehiclesManagedCopy.add(cachevehicles);
                } else {
                    vehiclesManagedCopy.add(com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.copyOrUpdate(realm, (com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.VehicleTrackingColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class), vehiclesItem, true, cache, flags));
                }
            }
            builder.addObjectList(columnInfo.vehiclesIndex, vehiclesManagedCopy);
        } else {
            builder.addObjectList(columnInfo.vehiclesIndex, new RealmList<com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking>());
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
        StringBuilder stringBuilder = new StringBuilder("GroupTracking = proxy[");
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
        stringBuilder.append("RealmList<VehicleTracking>[").append(realmGet$vehicles().size()).append("]");
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
        com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy aGroupTracking = (com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aGroupTracking.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aGroupTracking.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aGroupTracking.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
