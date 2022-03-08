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
public class com_pnla_onroadplus_z_version2_UserRealmProxy extends com.pnla.onroadplus.z_version2.User
    implements RealmObjectProxy, com_pnla_onroadplus_z_version2_UserRealmProxyInterface {

    static final class UserColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long idIndex;
        long emailIndex;
        long employee_nameIndex;
        long firstLoginIndex;

        UserColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("User");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.emailIndex = addColumnDetails("email", "email", objectSchemaInfo);
            this.employee_nameIndex = addColumnDetails("employee_name", "employee_name", objectSchemaInfo);
            this.firstLoginIndex = addColumnDetails("firstLogin", "firstLogin", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        UserColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new UserColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final UserColumnInfo src = (UserColumnInfo) rawSrc;
            final UserColumnInfo dst = (UserColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.emailIndex = src.emailIndex;
            dst.employee_nameIndex = src.employee_nameIndex;
            dst.firstLoginIndex = src.firstLoginIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private UserColumnInfo columnInfo;
    private ProxyState<com.pnla.onroadplus.z_version2.User> proxyState;

    com_pnla_onroadplus_z_version2_UserRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (UserColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.pnla.onroadplus.z_version2.User>(this);
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
    public String realmGet$employee_name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.employee_nameIndex);
    }

    @Override
    public void realmSet$employee_name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.employee_nameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.employee_nameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.employee_nameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.employee_nameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$firstLogin() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.firstLoginIndex);
    }

    @Override
    public void realmSet$firstLogin(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.firstLoginIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.firstLoginIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("User", 4, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("email", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("employee_name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("firstLogin", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UserColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new UserColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "User";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "User";
    }

    @SuppressWarnings("cast")
    public static com.pnla.onroadplus.z_version2.User createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.pnla.onroadplus.z_version2.User obj = null;
        if (update) {
            Table table = realm.getTable(com.pnla.onroadplus.z_version2.User.class);
            UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.User.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.User.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_pnla_onroadplus_z_version2_UserRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_pnla_onroadplus_z_version2_UserRealmProxy) realm.createObjectInternal(com.pnla.onroadplus.z_version2.User.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_pnla_onroadplus_z_version2_UserRealmProxy) realm.createObjectInternal(com.pnla.onroadplus.z_version2.User.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_pnla_onroadplus_z_version2_UserRealmProxyInterface objProxy = (com_pnla_onroadplus_z_version2_UserRealmProxyInterface) obj;
        if (json.has("email")) {
            if (json.isNull("email")) {
                objProxy.realmSet$email(null);
            } else {
                objProxy.realmSet$email((String) json.getString("email"));
            }
        }
        if (json.has("employee_name")) {
            if (json.isNull("employee_name")) {
                objProxy.realmSet$employee_name(null);
            } else {
                objProxy.realmSet$employee_name((String) json.getString("employee_name"));
            }
        }
        if (json.has("firstLogin")) {
            if (json.isNull("firstLogin")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'firstLogin' to null.");
            } else {
                objProxy.realmSet$firstLogin((boolean) json.getBoolean("firstLogin"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.pnla.onroadplus.z_version2.User createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.pnla.onroadplus.z_version2.User obj = new com.pnla.onroadplus.z_version2.User();
        final com_pnla_onroadplus_z_version2_UserRealmProxyInterface objProxy = (com_pnla_onroadplus_z_version2_UserRealmProxyInterface) obj;
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
            } else if (name.equals("email")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$email((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$email(null);
                }
            } else if (name.equals("employee_name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$employee_name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$employee_name(null);
                }
            } else if (name.equals("firstLogin")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$firstLogin((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'firstLogin' to null.");
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

    private static com_pnla_onroadplus_z_version2_UserRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating uexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.User.class), false, Collections.<String>emptyList());
        io.realm.com_pnla_onroadplus_z_version2_UserRealmProxy obj = new io.realm.com_pnla_onroadplus_z_version2_UserRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.pnla.onroadplus.z_version2.User copyOrUpdate(Realm realm, UserColumnInfo columnInfo, com.pnla.onroadplus.z_version2.User object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.pnla.onroadplus.z_version2.User) cachedRealmObject;
        }

        com.pnla.onroadplus.z_version2.User realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.pnla.onroadplus.z_version2.User.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((com_pnla_onroadplus_z_version2_UserRealmProxyInterface) object).realmGet$id());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_pnla_onroadplus_z_version2_UserRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.pnla.onroadplus.z_version2.User copy(Realm realm, UserColumnInfo columnInfo, com.pnla.onroadplus.z_version2.User newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.pnla.onroadplus.z_version2.User) cachedRealmObject;
        }

        com_pnla_onroadplus_z_version2_UserRealmProxyInterface realmObjectSource = (com_pnla_onroadplus_z_version2_UserRealmProxyInterface) newObject;

        Table table = realm.getTable(com.pnla.onroadplus.z_version2.User.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.emailIndex, realmObjectSource.realmGet$email());
        builder.addString(columnInfo.employee_nameIndex, realmObjectSource.realmGet$employee_name());
        builder.addBoolean(columnInfo.firstLoginIndex, realmObjectSource.realmGet$firstLogin());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_pnla_onroadplus_z_version2_UserRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.pnla.onroadplus.z_version2.User object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.User.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_pnla_onroadplus_z_version2_UserRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pnla_onroadplus_z_version2_UserRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pnla_onroadplus_z_version2_UserRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$email = ((com_pnla_onroadplus_z_version2_UserRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
        }
        String realmGet$employee_name = ((com_pnla_onroadplus_z_version2_UserRealmProxyInterface) object).realmGet$employee_name();
        if (realmGet$employee_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.employee_nameIndex, rowIndex, realmGet$employee_name, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.firstLoginIndex, rowIndex, ((com_pnla_onroadplus_z_version2_UserRealmProxyInterface) object).realmGet$firstLogin(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.User.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.pnla.onroadplus.z_version2.User object = null;
        while (objects.hasNext()) {
            object = (com.pnla.onroadplus.z_version2.User) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_pnla_onroadplus_z_version2_UserRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pnla_onroadplus_z_version2_UserRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pnla_onroadplus_z_version2_UserRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$email = ((com_pnla_onroadplus_z_version2_UserRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
            }
            String realmGet$employee_name = ((com_pnla_onroadplus_z_version2_UserRealmProxyInterface) object).realmGet$employee_name();
            if (realmGet$employee_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.employee_nameIndex, rowIndex, realmGet$employee_name, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.firstLoginIndex, rowIndex, ((com_pnla_onroadplus_z_version2_UserRealmProxyInterface) object).realmGet$firstLogin(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.pnla.onroadplus.z_version2.User object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.User.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_pnla_onroadplus_z_version2_UserRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pnla_onroadplus_z_version2_UserRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pnla_onroadplus_z_version2_UserRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        String realmGet$email = ((com_pnla_onroadplus_z_version2_UserRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.emailIndex, rowIndex, false);
        }
        String realmGet$employee_name = ((com_pnla_onroadplus_z_version2_UserRealmProxyInterface) object).realmGet$employee_name();
        if (realmGet$employee_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.employee_nameIndex, rowIndex, realmGet$employee_name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.employee_nameIndex, rowIndex, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.firstLoginIndex, rowIndex, ((com_pnla_onroadplus_z_version2_UserRealmProxyInterface) object).realmGet$firstLogin(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.User.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.pnla.onroadplus.z_version2.User object = null;
        while (objects.hasNext()) {
            object = (com.pnla.onroadplus.z_version2.User) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_pnla_onroadplus_z_version2_UserRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_pnla_onroadplus_z_version2_UserRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_pnla_onroadplus_z_version2_UserRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            String realmGet$email = ((com_pnla_onroadplus_z_version2_UserRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.emailIndex, rowIndex, false);
            }
            String realmGet$employee_name = ((com_pnla_onroadplus_z_version2_UserRealmProxyInterface) object).realmGet$employee_name();
            if (realmGet$employee_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.employee_nameIndex, rowIndex, realmGet$employee_name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.employee_nameIndex, rowIndex, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.firstLoginIndex, rowIndex, ((com_pnla_onroadplus_z_version2_UserRealmProxyInterface) object).realmGet$firstLogin(), false);
        }
    }

    public static com.pnla.onroadplus.z_version2.User createDetachedCopy(com.pnla.onroadplus.z_version2.User realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.pnla.onroadplus.z_version2.User unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.pnla.onroadplus.z_version2.User();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.pnla.onroadplus.z_version2.User) cachedObject.object;
            }
            unmanagedObject = (com.pnla.onroadplus.z_version2.User) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_pnla_onroadplus_z_version2_UserRealmProxyInterface unmanagedCopy = (com_pnla_onroadplus_z_version2_UserRealmProxyInterface) unmanagedObject;
        com_pnla_onroadplus_z_version2_UserRealmProxyInterface realmSource = (com_pnla_onroadplus_z_version2_UserRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$email(realmSource.realmGet$email());
        unmanagedCopy.realmSet$employee_name(realmSource.realmGet$employee_name());
        unmanagedCopy.realmSet$firstLogin(realmSource.realmGet$firstLogin());

        return unmanagedObject;
    }

    static com.pnla.onroadplus.z_version2.User update(Realm realm, UserColumnInfo columnInfo, com.pnla.onroadplus.z_version2.User realmObject, com.pnla.onroadplus.z_version2.User newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_pnla_onroadplus_z_version2_UserRealmProxyInterface realmObjectTarget = (com_pnla_onroadplus_z_version2_UserRealmProxyInterface) realmObject;
        com_pnla_onroadplus_z_version2_UserRealmProxyInterface realmObjectSource = (com_pnla_onroadplus_z_version2_UserRealmProxyInterface) newObject;
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.User.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.emailIndex, realmObjectSource.realmGet$email());
        builder.addString(columnInfo.employee_nameIndex, realmObjectSource.realmGet$employee_name());
        builder.addBoolean(columnInfo.firstLoginIndex, realmObjectSource.realmGet$firstLogin());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("User = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{email:");
        stringBuilder.append(realmGet$email() != null ? realmGet$email() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{employee_name:");
        stringBuilder.append(realmGet$employee_name() != null ? realmGet$employee_name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{firstLogin:");
        stringBuilder.append(realmGet$firstLogin());
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
        com_pnla_onroadplus_z_version2_UserRealmProxy aUser = (com_pnla_onroadplus_z_version2_UserRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aUser.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aUser.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aUser.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
