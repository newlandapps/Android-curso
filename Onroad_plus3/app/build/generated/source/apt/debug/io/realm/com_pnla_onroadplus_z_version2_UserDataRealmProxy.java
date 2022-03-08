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
public class com_pnla_onroadplus_z_version2_UserDataRealmProxy extends com.pnla.onroadplus.z_version2.UserData
    implements RealmObjectProxy, com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface {

    static final class UserDataColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long idIndex;
        long employee_nameIndex;
        long firstLoginIndex;
        long userImageIndex;
        long tokenIndex;
        long emailIndex;
        long user_cveIndex;

        UserDataColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("UserData");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.employee_nameIndex = addColumnDetails("employee_name", "employee_name", objectSchemaInfo);
            this.firstLoginIndex = addColumnDetails("firstLogin", "firstLogin", objectSchemaInfo);
            this.userImageIndex = addColumnDetails("userImage", "userImage", objectSchemaInfo);
            this.tokenIndex = addColumnDetails("token", "token", objectSchemaInfo);
            this.emailIndex = addColumnDetails("email", "email", objectSchemaInfo);
            this.user_cveIndex = addColumnDetails("user_cve", "user_cve", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        UserDataColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new UserDataColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final UserDataColumnInfo src = (UserDataColumnInfo) rawSrc;
            final UserDataColumnInfo dst = (UserDataColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.employee_nameIndex = src.employee_nameIndex;
            dst.firstLoginIndex = src.firstLoginIndex;
            dst.userImageIndex = src.userImageIndex;
            dst.tokenIndex = src.tokenIndex;
            dst.emailIndex = src.emailIndex;
            dst.user_cveIndex = src.user_cveIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private UserDataColumnInfo columnInfo;
    private ProxyState<com.pnla.onroadplus.z_version2.UserData> proxyState;

    com_pnla_onroadplus_z_version2_UserDataRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (UserDataColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.pnla.onroadplus.z_version2.UserData>(this);
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
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.idIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.idIndex, value);
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
    public Boolean realmGet$firstLogin() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.firstLoginIndex)) {
            return null;
        }
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.firstLoginIndex);
    }

    @Override
    public void realmSet$firstLogin(Boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.firstLoginIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setBoolean(columnInfo.firstLoginIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.firstLoginIndex);
            return;
        }
        proxyState.getRow$realm().setBoolean(columnInfo.firstLoginIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$userImage() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userImageIndex);
    }

    @Override
    public void realmSet$userImage(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userImageIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.userImageIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userImageIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.userImageIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$token() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tokenIndex);
    }

    @Override
    public void realmSet$token(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tokenIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tokenIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tokenIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tokenIndex, value);
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
    public String realmGet$user_cve() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.user_cveIndex);
    }

    @Override
    public void realmSet$user_cve(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.user_cveIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.user_cveIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.user_cveIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.user_cveIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("UserData", 7, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("employee_name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("firstLogin", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("userImage", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("token", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("email", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("user_cve", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UserDataColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new UserDataColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "UserData";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "UserData";
    }

    @SuppressWarnings("cast")
    public static com.pnla.onroadplus.z_version2.UserData createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.pnla.onroadplus.z_version2.UserData obj = realm.createObjectInternal(com.pnla.onroadplus.z_version2.UserData.class, true, excludeFields);

        final com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface objProxy = (com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) obj;
        if (json.has("id")) {
            if (json.isNull("id")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
            } else {
                objProxy.realmSet$id((int) json.getInt("id"));
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
                objProxy.realmSet$firstLogin(null);
            } else {
                objProxy.realmSet$firstLogin((boolean) json.getBoolean("firstLogin"));
            }
        }
        if (json.has("userImage")) {
            if (json.isNull("userImage")) {
                objProxy.realmSet$userImage(null);
            } else {
                objProxy.realmSet$userImage((String) json.getString("userImage"));
            }
        }
        if (json.has("token")) {
            if (json.isNull("token")) {
                objProxy.realmSet$token(null);
            } else {
                objProxy.realmSet$token((String) json.getString("token"));
            }
        }
        if (json.has("email")) {
            if (json.isNull("email")) {
                objProxy.realmSet$email(null);
            } else {
                objProxy.realmSet$email((String) json.getString("email"));
            }
        }
        if (json.has("user_cve")) {
            if (json.isNull("user_cve")) {
                objProxy.realmSet$user_cve(null);
            } else {
                objProxy.realmSet$user_cve((String) json.getString("user_cve"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.pnla.onroadplus.z_version2.UserData createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.pnla.onroadplus.z_version2.UserData obj = new com.pnla.onroadplus.z_version2.UserData();
        final com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface objProxy = (com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) obj;
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
                    objProxy.realmSet$firstLogin(null);
                }
            } else if (name.equals("userImage")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userImage((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userImage(null);
                }
            } else if (name.equals("token")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$token((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$token(null);
                }
            } else if (name.equals("email")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$email((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$email(null);
                }
            } else if (name.equals("user_cve")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$user_cve((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$user_cve(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static com_pnla_onroadplus_z_version2_UserDataRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating uexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.UserData.class), false, Collections.<String>emptyList());
        io.realm.com_pnla_onroadplus_z_version2_UserDataRealmProxy obj = new io.realm.com_pnla_onroadplus_z_version2_UserDataRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.pnla.onroadplus.z_version2.UserData copyOrUpdate(Realm realm, UserDataColumnInfo columnInfo, com.pnla.onroadplus.z_version2.UserData object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.pnla.onroadplus.z_version2.UserData) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.pnla.onroadplus.z_version2.UserData copy(Realm realm, UserDataColumnInfo columnInfo, com.pnla.onroadplus.z_version2.UserData newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.pnla.onroadplus.z_version2.UserData) cachedRealmObject;
        }

        com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface realmObjectSource = (com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) newObject;

        Table table = realm.getTable(com.pnla.onroadplus.z_version2.UserData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.employee_nameIndex, realmObjectSource.realmGet$employee_name());
        builder.addBoolean(columnInfo.firstLoginIndex, realmObjectSource.realmGet$firstLogin());
        builder.addString(columnInfo.userImageIndex, realmObjectSource.realmGet$userImage());
        builder.addString(columnInfo.tokenIndex, realmObjectSource.realmGet$token());
        builder.addString(columnInfo.emailIndex, realmObjectSource.realmGet$email());
        builder.addString(columnInfo.user_cveIndex, realmObjectSource.realmGet$user_cve());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_pnla_onroadplus_z_version2_UserDataRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.pnla.onroadplus.z_version2.UserData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.UserData.class);
        long tableNativePtr = table.getNativePtr();
        UserDataColumnInfo columnInfo = (UserDataColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.UserData.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$id(), false);
        String realmGet$employee_name = ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$employee_name();
        if (realmGet$employee_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.employee_nameIndex, rowIndex, realmGet$employee_name, false);
        }
        Boolean realmGet$firstLogin = ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$firstLogin();
        if (realmGet$firstLogin != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.firstLoginIndex, rowIndex, realmGet$firstLogin, false);
        }
        String realmGet$userImage = ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$userImage();
        if (realmGet$userImage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userImageIndex, rowIndex, realmGet$userImage, false);
        }
        String realmGet$token = ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$token();
        if (realmGet$token != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tokenIndex, rowIndex, realmGet$token, false);
        }
        String realmGet$email = ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
        }
        String realmGet$user_cve = ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$user_cve();
        if (realmGet$user_cve != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.user_cveIndex, rowIndex, realmGet$user_cve, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.UserData.class);
        long tableNativePtr = table.getNativePtr();
        UserDataColumnInfo columnInfo = (UserDataColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.UserData.class);
        com.pnla.onroadplus.z_version2.UserData object = null;
        while (objects.hasNext()) {
            object = (com.pnla.onroadplus.z_version2.UserData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$id(), false);
            String realmGet$employee_name = ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$employee_name();
            if (realmGet$employee_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.employee_nameIndex, rowIndex, realmGet$employee_name, false);
            }
            Boolean realmGet$firstLogin = ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$firstLogin();
            if (realmGet$firstLogin != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.firstLoginIndex, rowIndex, realmGet$firstLogin, false);
            }
            String realmGet$userImage = ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$userImage();
            if (realmGet$userImage != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userImageIndex, rowIndex, realmGet$userImage, false);
            }
            String realmGet$token = ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$token();
            if (realmGet$token != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tokenIndex, rowIndex, realmGet$token, false);
            }
            String realmGet$email = ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
            }
            String realmGet$user_cve = ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$user_cve();
            if (realmGet$user_cve != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.user_cveIndex, rowIndex, realmGet$user_cve, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.pnla.onroadplus.z_version2.UserData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.UserData.class);
        long tableNativePtr = table.getNativePtr();
        UserDataColumnInfo columnInfo = (UserDataColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.UserData.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$id(), false);
        String realmGet$employee_name = ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$employee_name();
        if (realmGet$employee_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.employee_nameIndex, rowIndex, realmGet$employee_name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.employee_nameIndex, rowIndex, false);
        }
        Boolean realmGet$firstLogin = ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$firstLogin();
        if (realmGet$firstLogin != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.firstLoginIndex, rowIndex, realmGet$firstLogin, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.firstLoginIndex, rowIndex, false);
        }
        String realmGet$userImage = ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$userImage();
        if (realmGet$userImage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userImageIndex, rowIndex, realmGet$userImage, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userImageIndex, rowIndex, false);
        }
        String realmGet$token = ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$token();
        if (realmGet$token != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tokenIndex, rowIndex, realmGet$token, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tokenIndex, rowIndex, false);
        }
        String realmGet$email = ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.emailIndex, rowIndex, false);
        }
        String realmGet$user_cve = ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$user_cve();
        if (realmGet$user_cve != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.user_cveIndex, rowIndex, realmGet$user_cve, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.user_cveIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.pnla.onroadplus.z_version2.UserData.class);
        long tableNativePtr = table.getNativePtr();
        UserDataColumnInfo columnInfo = (UserDataColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.UserData.class);
        com.pnla.onroadplus.z_version2.UserData object = null;
        while (objects.hasNext()) {
            object = (com.pnla.onroadplus.z_version2.UserData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$id(), false);
            String realmGet$employee_name = ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$employee_name();
            if (realmGet$employee_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.employee_nameIndex, rowIndex, realmGet$employee_name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.employee_nameIndex, rowIndex, false);
            }
            Boolean realmGet$firstLogin = ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$firstLogin();
            if (realmGet$firstLogin != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.firstLoginIndex, rowIndex, realmGet$firstLogin, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.firstLoginIndex, rowIndex, false);
            }
            String realmGet$userImage = ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$userImage();
            if (realmGet$userImage != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userImageIndex, rowIndex, realmGet$userImage, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userImageIndex, rowIndex, false);
            }
            String realmGet$token = ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$token();
            if (realmGet$token != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tokenIndex, rowIndex, realmGet$token, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tokenIndex, rowIndex, false);
            }
            String realmGet$email = ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.emailIndex, rowIndex, false);
            }
            String realmGet$user_cve = ((com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) object).realmGet$user_cve();
            if (realmGet$user_cve != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.user_cveIndex, rowIndex, realmGet$user_cve, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.user_cveIndex, rowIndex, false);
            }
        }
    }

    public static com.pnla.onroadplus.z_version2.UserData createDetachedCopy(com.pnla.onroadplus.z_version2.UserData realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.pnla.onroadplus.z_version2.UserData unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.pnla.onroadplus.z_version2.UserData();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.pnla.onroadplus.z_version2.UserData) cachedObject.object;
            }
            unmanagedObject = (com.pnla.onroadplus.z_version2.UserData) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface unmanagedCopy = (com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) unmanagedObject;
        com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface realmSource = (com_pnla_onroadplus_z_version2_UserDataRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$employee_name(realmSource.realmGet$employee_name());
        unmanagedCopy.realmSet$firstLogin(realmSource.realmGet$firstLogin());
        unmanagedCopy.realmSet$userImage(realmSource.realmGet$userImage());
        unmanagedCopy.realmSet$token(realmSource.realmGet$token());
        unmanagedCopy.realmSet$email(realmSource.realmGet$email());
        unmanagedCopy.realmSet$user_cve(realmSource.realmGet$user_cve());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("UserData = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{employee_name:");
        stringBuilder.append(realmGet$employee_name() != null ? realmGet$employee_name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{firstLogin:");
        stringBuilder.append(realmGet$firstLogin() != null ? realmGet$firstLogin() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{userImage:");
        stringBuilder.append(realmGet$userImage() != null ? realmGet$userImage() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{token:");
        stringBuilder.append(realmGet$token() != null ? realmGet$token() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{email:");
        stringBuilder.append(realmGet$email() != null ? realmGet$email() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{user_cve:");
        stringBuilder.append(realmGet$user_cve() != null ? realmGet$user_cve() : "null");
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
        com_pnla_onroadplus_z_version2_UserDataRealmProxy aUserData = (com_pnla_onroadplus_z_version2_UserDataRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aUserData.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aUserData.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aUserData.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
