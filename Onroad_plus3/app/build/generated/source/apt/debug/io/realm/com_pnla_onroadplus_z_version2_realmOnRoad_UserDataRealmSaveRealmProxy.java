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
public class com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxy extends com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave
    implements RealmObjectProxy, com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface {

    static final class UserDataRealmSaveColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long userNameIndex;
        long emailIndex;
        long passwordIndex;
        long isFirstTimeIndex;

        UserDataRealmSaveColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("UserDataRealmSave");
            this.userNameIndex = addColumnDetails("userName", "userName", objectSchemaInfo);
            this.emailIndex = addColumnDetails("email", "email", objectSchemaInfo);
            this.passwordIndex = addColumnDetails("password", "password", objectSchemaInfo);
            this.isFirstTimeIndex = addColumnDetails("isFirstTime", "isFirstTime", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        UserDataRealmSaveColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new UserDataRealmSaveColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final UserDataRealmSaveColumnInfo src = (UserDataRealmSaveColumnInfo) rawSrc;
            final UserDataRealmSaveColumnInfo dst = (UserDataRealmSaveColumnInfo) rawDst;
            dst.userNameIndex = src.userNameIndex;
            dst.emailIndex = src.emailIndex;
            dst.passwordIndex = src.passwordIndex;
            dst.isFirstTimeIndex = src.isFirstTimeIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private UserDataRealmSaveColumnInfo columnInfo;
    private ProxyState<com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave> proxyState;

    com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (UserDataRealmSaveColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$userName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userNameIndex);
    }

    @Override
    public void realmSet$userName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userNameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.userNameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userNameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.userNameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$email() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.emailIndex);
    }

    @Override
    public void realmSet$email(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.emailIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.emailIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.emailIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.emailIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$password() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.passwordIndex);
    }

    @Override
    public void realmSet$password(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.passwordIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.passwordIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.passwordIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.passwordIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$isFirstTime() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isFirstTimeIndex);
    }

    @Override
    public void realmSet$isFirstTime(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isFirstTimeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isFirstTimeIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("UserDataRealmSave", 4, 0);
        builder.addPersistedProperty("userName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("email", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("password", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("isFirstTime", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UserDataRealmSaveColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new UserDataRealmSaveColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "UserDataRealmSave";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "UserDataRealmSave";
    }

    @SuppressWarnings("cast")
    public static com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave obj = realm.createObjectInternal(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class, true, excludeFields);

        final com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface objProxy = (com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface) obj;
        if (json.has("userName")) {
            if (json.isNull("userName")) {
                objProxy.realmSet$userName(null);
            } else {
                objProxy.realmSet$userName((String) json.getString("userName"));
            }
        }
        if (json.has("email")) {
            if (json.isNull("email")) {
                objProxy.realmSet$email(null);
            } else {
                objProxy.realmSet$email((String) json.getString("email"));
            }
        }
        if (json.has("password")) {
            if (json.isNull("password")) {
                objProxy.realmSet$password(null);
            } else {
                objProxy.realmSet$password((String) json.getString("password"));
            }
        }
        if (json.has("isFirstTime")) {
            if (json.isNull("isFirstTime")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isFirstTime' to null.");
            } else {
                objProxy.realmSet$isFirstTime((boolean) json.getBoolean("isFirstTime"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave obj = new com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave();
        final com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface objProxy = (com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("userName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userName(null);
                }
            } else if (name.equals("email")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$email((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$email(null);
                }
            } else if (name.equals("password")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$password((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$password(null);
                }
            } else if (name.equals("isFirstTime")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isFirstTime((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isFirstTime' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating uexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class), false, Collections.<String>emptyList());
        io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxy obj = new io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave copyOrUpdate(Realm realm, UserDataRealmSaveColumnInfo columnInfo, com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave copy(Realm realm, UserDataRealmSaveColumnInfo columnInfo, com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave) cachedRealmObject;
        }

        com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface realmObjectSource = (com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface) newObject;

        Table table = realm.getTable(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.userNameIndex, realmObjectSource.realmGet$userName());
        builder.addString(columnInfo.emailIndex, realmObjectSource.realmGet$email());
        builder.addString(columnInfo.passwordIndex, realmObjectSource.realmGet$password());
        builder.addBoolean(columnInfo.isFirstTimeIndex, realmObjectSource.realmGet$isFirstTime());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class);
        long tableNativePtr = table.getNativePtr();
        UserDataRealmSaveColumnInfo columnInfo = (UserDataRealmSaveColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$userName = ((com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface) object).realmGet$userName();
        if (realmGet$userName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userNameIndex, rowIndex, realmGet$userName, false);
        }
        String realmGet$email = ((com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
        }
        String realmGet$password = ((com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface) object).realmGet$password();
        if (realmGet$password != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passwordIndex, rowIndex, realmGet$password, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isFirstTimeIndex, rowIndex, ((com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface) object).realmGet$isFirstTime(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class);
        long tableNativePtr = table.getNativePtr();
        UserDataRealmSaveColumnInfo columnInfo = (UserDataRealmSaveColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class);
        com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave object = null;
        while (objects.hasNext()) {
            object = (com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$userName = ((com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface) object).realmGet$userName();
            if (realmGet$userName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userNameIndex, rowIndex, realmGet$userName, false);
            }
            String realmGet$email = ((com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
            }
            String realmGet$password = ((com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface) object).realmGet$password();
            if (realmGet$password != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.passwordIndex, rowIndex, realmGet$password, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isFirstTimeIndex, rowIndex, ((com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface) object).realmGet$isFirstTime(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class);
        long tableNativePtr = table.getNativePtr();
        UserDataRealmSaveColumnInfo columnInfo = (UserDataRealmSaveColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$userName = ((com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface) object).realmGet$userName();
        if (realmGet$userName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userNameIndex, rowIndex, realmGet$userName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userNameIndex, rowIndex, false);
        }
        String realmGet$email = ((com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.emailIndex, rowIndex, false);
        }
        String realmGet$password = ((com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface) object).realmGet$password();
        if (realmGet$password != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passwordIndex, rowIndex, realmGet$password, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.passwordIndex, rowIndex, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isFirstTimeIndex, rowIndex, ((com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface) object).realmGet$isFirstTime(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class);
        long tableNativePtr = table.getNativePtr();
        UserDataRealmSaveColumnInfo columnInfo = (UserDataRealmSaveColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class);
        com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave object = null;
        while (objects.hasNext()) {
            object = (com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$userName = ((com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface) object).realmGet$userName();
            if (realmGet$userName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userNameIndex, rowIndex, realmGet$userName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userNameIndex, rowIndex, false);
            }
            String realmGet$email = ((com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.emailIndex, rowIndex, false);
            }
            String realmGet$password = ((com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface) object).realmGet$password();
            if (realmGet$password != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.passwordIndex, rowIndex, realmGet$password, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.passwordIndex, rowIndex, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isFirstTimeIndex, rowIndex, ((com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface) object).realmGet$isFirstTime(), false);
        }
    }

    public static com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave createDetachedCopy(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave) cachedObject.object;
            }
            unmanagedObject = (com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface unmanagedCopy = (com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface) unmanagedObject;
        com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface realmSource = (com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$userName(realmSource.realmGet$userName());
        unmanagedCopy.realmSet$email(realmSource.realmGet$email());
        unmanagedCopy.realmSet$password(realmSource.realmGet$password());
        unmanagedCopy.realmSet$isFirstTime(realmSource.realmGet$isFirstTime());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("UserDataRealmSave = proxy[");
        stringBuilder.append("{userName:");
        stringBuilder.append(realmGet$userName() != null ? realmGet$userName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{email:");
        stringBuilder.append(realmGet$email() != null ? realmGet$email() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{password:");
        stringBuilder.append(realmGet$password() != null ? realmGet$password() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{isFirstTime:");
        stringBuilder.append(realmGet$isFirstTime());
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
        com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxy aUserDataRealmSave = (com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aUserDataRealmSave.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aUserDataRealmSave.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aUserDataRealmSave.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
