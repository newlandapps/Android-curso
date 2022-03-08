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
public class com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxy extends com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave
    implements RealmObjectProxy, com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxyInterface {

    static final class UserNotificationRealmSaveColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long userIndex;
        long activeNotificationsIndex;

        UserNotificationRealmSaveColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("UserNotificationRealmSave");
            this.userIndex = addColumnDetails("user", "user", objectSchemaInfo);
            this.activeNotificationsIndex = addColumnDetails("activeNotifications", "activeNotifications", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        UserNotificationRealmSaveColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new UserNotificationRealmSaveColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final UserNotificationRealmSaveColumnInfo src = (UserNotificationRealmSaveColumnInfo) rawSrc;
            final UserNotificationRealmSaveColumnInfo dst = (UserNotificationRealmSaveColumnInfo) rawDst;
            dst.userIndex = src.userIndex;
            dst.activeNotificationsIndex = src.activeNotificationsIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private UserNotificationRealmSaveColumnInfo columnInfo;
    private ProxyState<com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave> proxyState;

    com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (UserNotificationRealmSaveColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$user() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userIndex);
    }

    @Override
    public void realmSet$user(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.userIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.userIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$activeNotifications() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.activeNotificationsIndex);
    }

    @Override
    public void realmSet$activeNotifications(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.activeNotificationsIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.activeNotificationsIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("UserNotificationRealmSave", 2, 0);
        builder.addPersistedProperty("user", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("activeNotifications", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UserNotificationRealmSaveColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new UserNotificationRealmSaveColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "UserNotificationRealmSave";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "UserNotificationRealmSave";
    }

    @SuppressWarnings("cast")
    public static com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave obj = realm.createObjectInternal(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class, true, excludeFields);

        final com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxyInterface objProxy = (com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxyInterface) obj;
        if (json.has("user")) {
            if (json.isNull("user")) {
                objProxy.realmSet$user(null);
            } else {
                objProxy.realmSet$user((String) json.getString("user"));
            }
        }
        if (json.has("activeNotifications")) {
            if (json.isNull("activeNotifications")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'activeNotifications' to null.");
            } else {
                objProxy.realmSet$activeNotifications((boolean) json.getBoolean("activeNotifications"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave obj = new com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave();
        final com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxyInterface objProxy = (com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("user")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$user((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$user(null);
                }
            } else if (name.equals("activeNotifications")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$activeNotifications((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'activeNotifications' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating uexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class), false, Collections.<String>emptyList());
        io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxy obj = new io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave copyOrUpdate(Realm realm, UserNotificationRealmSaveColumnInfo columnInfo, com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave copy(Realm realm, UserNotificationRealmSaveColumnInfo columnInfo, com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave) cachedRealmObject;
        }

        com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxyInterface realmObjectSource = (com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxyInterface) newObject;

        Table table = realm.getTable(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.userIndex, realmObjectSource.realmGet$user());
        builder.addBoolean(columnInfo.activeNotificationsIndex, realmObjectSource.realmGet$activeNotifications());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class);
        long tableNativePtr = table.getNativePtr();
        UserNotificationRealmSaveColumnInfo columnInfo = (UserNotificationRealmSaveColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$user = ((com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxyInterface) object).realmGet$user();
        if (realmGet$user != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userIndex, rowIndex, realmGet$user, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.activeNotificationsIndex, rowIndex, ((com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxyInterface) object).realmGet$activeNotifications(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class);
        long tableNativePtr = table.getNativePtr();
        UserNotificationRealmSaveColumnInfo columnInfo = (UserNotificationRealmSaveColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class);
        com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave object = null;
        while (objects.hasNext()) {
            object = (com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$user = ((com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxyInterface) object).realmGet$user();
            if (realmGet$user != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userIndex, rowIndex, realmGet$user, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.activeNotificationsIndex, rowIndex, ((com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxyInterface) object).realmGet$activeNotifications(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class);
        long tableNativePtr = table.getNativePtr();
        UserNotificationRealmSaveColumnInfo columnInfo = (UserNotificationRealmSaveColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$user = ((com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxyInterface) object).realmGet$user();
        if (realmGet$user != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userIndex, rowIndex, realmGet$user, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userIndex, rowIndex, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.activeNotificationsIndex, rowIndex, ((com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxyInterface) object).realmGet$activeNotifications(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class);
        long tableNativePtr = table.getNativePtr();
        UserNotificationRealmSaveColumnInfo columnInfo = (UserNotificationRealmSaveColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class);
        com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave object = null;
        while (objects.hasNext()) {
            object = (com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$user = ((com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxyInterface) object).realmGet$user();
            if (realmGet$user != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userIndex, rowIndex, realmGet$user, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userIndex, rowIndex, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.activeNotificationsIndex, rowIndex, ((com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxyInterface) object).realmGet$activeNotifications(), false);
        }
    }

    public static com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave createDetachedCopy(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave) cachedObject.object;
            }
            unmanagedObject = (com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxyInterface unmanagedCopy = (com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxyInterface) unmanagedObject;
        com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxyInterface realmSource = (com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$user(realmSource.realmGet$user());
        unmanagedCopy.realmSet$activeNotifications(realmSource.realmGet$activeNotifications());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("UserNotificationRealmSave = proxy[");
        stringBuilder.append("{user:");
        stringBuilder.append(realmGet$user() != null ? realmGet$user() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{activeNotifications:");
        stringBuilder.append(realmGet$activeNotifications());
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
        com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxy aUserNotificationRealmSave = (com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aUserNotificationRealmSave.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aUserNotificationRealmSave.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aUserNotificationRealmSave.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
