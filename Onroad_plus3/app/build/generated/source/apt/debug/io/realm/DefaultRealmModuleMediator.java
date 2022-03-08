package io.realm;


import android.util.JsonReader;
import io.realm.ImportFlag;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(14);
        modelClasses.add(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class);
        modelClasses.add(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class);
        modelClasses.add(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class);
        modelClasses.add(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.utils.clases.Groups.class);
        modelClasses.add(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class);
        modelClasses.add(com.pnla.onroadplus.z_version2.MenuFragments.Units.data.Group.class);
        modelClasses.add(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.Unit.class);
        modelClasses.add(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitFinal.class);
        modelClasses.add(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitGroup.class);
        modelClasses.add(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class);
        modelClasses.add(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class);
        modelClasses.add(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class);
        modelClasses.add(com.pnla.onroadplus.z_version2.User.class);
        modelClasses.add(com.pnla.onroadplus.z_version2.UserData.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(14);
        infoMap.put(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class, io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class, io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class, io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.utils.clases.Groups.class, io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_utils_clases_GroupsRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class, io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pnla.onroadplus.z_version2.MenuFragments.Units.data.Group.class, io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_data_GroupRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.Unit.class, io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitFinal.class, io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitFinalRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitGroup.class, io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitGroupRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class, io.realm.com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class, io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class, io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pnla.onroadplus.z_version2.User.class, io.realm.com_pnla_onroadplus_z_version2_UserRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.pnla.onroadplus.z_version2.UserData.class, io.realm.com_pnla_onroadplus_z_version2_UserDataRealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class)) {
            return io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class)) {
            return io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class)) {
            return io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.utils.clases.Groups.class)) {
            return io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_utils_clases_GroupsRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class)) {
            return io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.data.Group.class)) {
            return io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_data_GroupRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.Unit.class)) {
            return io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitFinal.class)) {
            return io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitFinalRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitGroup.class)) {
            return io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitGroupRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class)) {
            return io.realm.com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class)) {
            return io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class)) {
            return io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.User.class)) {
            return io.realm.com_pnla_onroadplus_z_version2_UserRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.UserData.class)) {
            return io.realm.com_pnla_onroadplus_z_version2_UserDataRealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getSimpleClassNameImpl(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class)) {
            return "GroupV2";
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class)) {
            return "VehicleV2";
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class)) {
            return "Vehicles";
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.utils.clases.Groups.class)) {
            return "Groups";
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class)) {
            return "VehicleTracking";
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.data.Group.class)) {
            return "Group";
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.Unit.class)) {
            return "Unit";
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitFinal.class)) {
            return "UnitFinal";
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitGroup.class)) {
            return "UnitGroup";
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class)) {
            return "GroupTracking";
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class)) {
            return "UserDataRealmSave";
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class)) {
            return "UserNotificationRealmSave";
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.User.class)) {
            return "User";
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.UserData.class)) {
            return "UserData";
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class)) {
                return clazz.cast(new io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy());
            }
            if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class)) {
                return clazz.cast(new io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy());
            }
            if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class)) {
                return clazz.cast(new io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy());
            }
            if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.utils.clases.Groups.class)) {
                return clazz.cast(new io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_utils_clases_GroupsRealmProxy());
            }
            if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class)) {
                return clazz.cast(new io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy());
            }
            if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.data.Group.class)) {
                return clazz.cast(new io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_data_GroupRealmProxy());
            }
            if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.Unit.class)) {
                return clazz.cast(new io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitRealmProxy());
            }
            if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitFinal.class)) {
                return clazz.cast(new io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitFinalRealmProxy());
            }
            if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitGroup.class)) {
                return clazz.cast(new io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitGroupRealmProxy());
            }
            if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class)) {
                return clazz.cast(new io.realm.com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy());
            }
            if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class)) {
                return clazz.cast(new io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxy());
            }
            if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class)) {
                return clazz.cast(new io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxy());
            }
            if (clazz.equals(com.pnla.onroadplus.z_version2.User.class)) {
                return clazz.cast(new io.realm.com_pnla_onroadplus_z_version2_UserRealmProxy());
            }
            if (clazz.equals(com.pnla.onroadplus.z_version2.UserData.class)) {
                return clazz.cast(new io.realm.com_pnla_onroadplus_z_version2_UserDataRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class)) {
            com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy.GroupV2ColumnInfo columnInfo = (com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy.GroupV2ColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class);
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy.copyOrUpdate(realm, columnInfo, (com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2) obj, update, cache, flags));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class)) {
            com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.VehicleV2ColumnInfo columnInfo = (com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.VehicleV2ColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class);
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.copyOrUpdate(realm, columnInfo, (com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2) obj, update, cache, flags));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class)) {
            com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy.VehiclesColumnInfo columnInfo = (com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy.VehiclesColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class);
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy.copyOrUpdate(realm, columnInfo, (com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles) obj, update, cache, flags));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.utils.clases.Groups.class)) {
            com_pnla_onroadplus_z_version2_MenuFragments_Notifications_utils_clases_GroupsRealmProxy.GroupsColumnInfo columnInfo = (com_pnla_onroadplus_z_version2_MenuFragments_Notifications_utils_clases_GroupsRealmProxy.GroupsColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.utils.clases.Groups.class);
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_utils_clases_GroupsRealmProxy.copyOrUpdate(realm, columnInfo, (com.pnla.onroadplus.z_version2.MenuFragments.Notifications.utils.clases.Groups) obj, update, cache, flags));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class)) {
            com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.VehicleTrackingColumnInfo columnInfo = (com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.VehicleTrackingColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class);
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.copyOrUpdate(realm, columnInfo, (com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking) obj, update, cache, flags));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.data.Group.class)) {
            com_pnla_onroadplus_z_version2_MenuFragments_Units_data_GroupRealmProxy.GroupColumnInfo columnInfo = (com_pnla_onroadplus_z_version2_MenuFragments_Units_data_GroupRealmProxy.GroupColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.Units.data.Group.class);
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_data_GroupRealmProxy.copyOrUpdate(realm, columnInfo, (com.pnla.onroadplus.z_version2.MenuFragments.Units.data.Group) obj, update, cache, flags));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.Unit.class)) {
            com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitRealmProxy.UnitColumnInfo columnInfo = (com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitRealmProxy.UnitColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.Unit.class);
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitRealmProxy.copyOrUpdate(realm, columnInfo, (com.pnla.onroadplus.z_version2.MenuFragments.Units.model.Unit) obj, update, cache, flags));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitFinal.class)) {
            com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitFinalRealmProxy.UnitFinalColumnInfo columnInfo = (com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitFinalRealmProxy.UnitFinalColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitFinal.class);
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitFinalRealmProxy.copyOrUpdate(realm, columnInfo, (com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitFinal) obj, update, cache, flags));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitGroup.class)) {
            com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitGroupRealmProxy.UnitGroupColumnInfo columnInfo = (com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitGroupRealmProxy.UnitGroupColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitGroup.class);
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitGroupRealmProxy.copyOrUpdate(realm, columnInfo, (com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitGroup) obj, update, cache, flags));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class)) {
            com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy.GroupTrackingColumnInfo columnInfo = (com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy.GroupTrackingColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class);
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy.copyOrUpdate(realm, columnInfo, (com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking) obj, update, cache, flags));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class)) {
            com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxy.UserDataRealmSaveColumnInfo columnInfo = (com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxy.UserDataRealmSaveColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class);
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxy.copyOrUpdate(realm, columnInfo, (com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave) obj, update, cache, flags));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class)) {
            com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxy.UserNotificationRealmSaveColumnInfo columnInfo = (com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxy.UserNotificationRealmSaveColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class);
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxy.copyOrUpdate(realm, columnInfo, (com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave) obj, update, cache, flags));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.User.class)) {
            com_pnla_onroadplus_z_version2_UserRealmProxy.UserColumnInfo columnInfo = (com_pnla_onroadplus_z_version2_UserRealmProxy.UserColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.User.class);
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_UserRealmProxy.copyOrUpdate(realm, columnInfo, (com.pnla.onroadplus.z_version2.User) obj, update, cache, flags));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.UserData.class)) {
            com_pnla_onroadplus_z_version2_UserDataRealmProxy.UserDataColumnInfo columnInfo = (com_pnla_onroadplus_z_version2_UserDataRealmProxy.UserDataColumnInfo) realm.getSchema().getColumnInfo(com.pnla.onroadplus.z_version2.UserData.class);
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_UserDataRealmProxy.copyOrUpdate(realm, columnInfo, (com.pnla.onroadplus.z_version2.UserData) obj, update, cache, flags));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class)) {
            io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2) object, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class)) {
            io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2) object, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class)) {
            io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles) object, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.utils.clases.Groups.class)) {
            io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_utils_clases_GroupsRealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Notifications.utils.clases.Groups) object, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class)) {
            io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking) object, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.data.Group.class)) {
            io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_data_GroupRealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Units.data.Group) object, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.Unit.class)) {
            io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitRealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Units.model.Unit) object, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitFinal.class)) {
            io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitFinalRealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitFinal) object, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitGroup.class)) {
            io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitGroupRealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitGroup) object, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class)) {
            io.realm.com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking) object, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class)) {
            io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave) object, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class)) {
            io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave) object, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.User.class)) {
            io.realm.com_pnla_onroadplus_z_version2_UserRealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.User) object, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.UserData.class)) {
            io.realm.com_pnla_onroadplus_z_version2_UserDataRealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.UserData) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class)) {
                io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class)) {
                io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class)) {
                io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.utils.clases.Groups.class)) {
                io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_utils_clases_GroupsRealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Notifications.utils.clases.Groups) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class)) {
                io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.data.Group.class)) {
                io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_data_GroupRealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Units.data.Group) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.Unit.class)) {
                io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitRealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Units.model.Unit) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitFinal.class)) {
                io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitFinalRealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitFinal) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitGroup.class)) {
                io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitGroupRealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitGroup) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class)) {
                io.realm.com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class)) {
                io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class)) {
                io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.User.class)) {
                io.realm.com_pnla_onroadplus_z_version2_UserRealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.User) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.UserData.class)) {
                io.realm.com_pnla_onroadplus_z_version2_UserDataRealmProxy.insert(realm, (com.pnla.onroadplus.z_version2.UserData) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.utils.clases.Groups.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_utils_clases_GroupsRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.data.Group.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_data_GroupRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.Unit.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitFinal.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitFinalRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitGroup.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitGroupRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.User.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_UserRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.UserData.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_UserDataRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class)) {
            io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2) obj, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class)) {
            io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2) obj, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class)) {
            io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles) obj, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.utils.clases.Groups.class)) {
            io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_utils_clases_GroupsRealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Notifications.utils.clases.Groups) obj, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class)) {
            io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking) obj, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.data.Group.class)) {
            io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_data_GroupRealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Units.data.Group) obj, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.Unit.class)) {
            io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitRealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Units.model.Unit) obj, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitFinal.class)) {
            io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitFinalRealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitFinal) obj, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitGroup.class)) {
            io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitGroupRealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitGroup) obj, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class)) {
            io.realm.com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking) obj, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class)) {
            io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave) obj, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class)) {
            io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave) obj, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.User.class)) {
            io.realm.com_pnla_onroadplus_z_version2_UserRealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.User) obj, cache);
        } else if (clazz.equals(com.pnla.onroadplus.z_version2.UserData.class)) {
            io.realm.com_pnla_onroadplus_z_version2_UserDataRealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.UserData) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class)) {
                io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class)) {
                io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class)) {
                io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.utils.clases.Groups.class)) {
                io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_utils_clases_GroupsRealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Notifications.utils.clases.Groups) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class)) {
                io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.data.Group.class)) {
                io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_data_GroupRealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Units.data.Group) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.Unit.class)) {
                io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitRealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Units.model.Unit) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitFinal.class)) {
                io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitFinalRealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitFinal) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitGroup.class)) {
                io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitGroupRealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitGroup) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class)) {
                io.realm.com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class)) {
                io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class)) {
                io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.User.class)) {
                io.realm.com_pnla_onroadplus_z_version2_UserRealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.User) object, cache);
            } else if (clazz.equals(com.pnla.onroadplus.z_version2.UserData.class)) {
                io.realm.com_pnla_onroadplus_z_version2_UserDataRealmProxy.insertOrUpdate(realm, (com.pnla.onroadplus.z_version2.UserData) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.utils.clases.Groups.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_utils_clases_GroupsRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.data.Group.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_data_GroupRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.Unit.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitFinal.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitFinalRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitGroup.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitGroupRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.User.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_UserRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.pnla.onroadplus.z_version2.UserData.class)) {
                    io.realm.com_pnla_onroadplus_z_version2_UserDataRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.utils.clases.Groups.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_utils_clases_GroupsRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.data.Group.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_data_GroupRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.Unit.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitFinal.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitFinalRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitGroup.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitGroupRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.User.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_UserRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.UserData.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_UserDataRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.utils.clases.Groups.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_utils_clases_GroupsRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.data.Group.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_data_GroupRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.Unit.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitFinal.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitFinalRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitGroup.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitGroupRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.User.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_UserRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.UserData.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_UserDataRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_groupsv2_GroupV2RealmProxy.createDetachedCopy((com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.groupsv2.GroupV2) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_fragments_vehiclesV2_models_vehiclesv2_VehicleV2RealmProxy.createDetachedCopy((com.pnla.onroadplus.z_version2.fragments.vehiclesV2.models.vehiclesv2.VehicleV2) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_models_VehiclesRealmProxy.createDetachedCopy((com.pnla.onroadplus.z_version2.MenuFragments.Notifications.models.Vehicles) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Notifications.utils.clases.Groups.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Notifications_utils_clases_GroupsRealmProxy.createDetachedCopy((com.pnla.onroadplus.z_version2.MenuFragments.Notifications.utils.clases.Groups) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Tracking_model_VehicleTrackingRealmProxy.createDetachedCopy((com.pnla.onroadplus.z_version2.MenuFragments.Tracking.model.VehicleTracking) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.data.Group.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_data_GroupRealmProxy.createDetachedCopy((com.pnla.onroadplus.z_version2.MenuFragments.Units.data.Group) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.Unit.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitRealmProxy.createDetachedCopy((com.pnla.onroadplus.z_version2.MenuFragments.Units.model.Unit) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitFinal.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitFinalRealmProxy.createDetachedCopy((com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitFinal) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitGroup.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_Units_model_UnitGroupRealmProxy.createDetachedCopy((com.pnla.onroadplus.z_version2.MenuFragments.Units.model.UnitGroup) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_MenuFragments_UnitTracking_model_GroupTrackingRealmProxy.createDetachedCopy((com.pnla.onroadplus.z_version2.MenuFragments.UnitTracking.model.GroupTracking) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserDataRealmSaveRealmProxy.createDetachedCopy((com.pnla.onroadplus.z_version2.realmOnRoad.UserDataRealmSave) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_realmOnRoad_UserNotificationRealmSaveRealmProxy.createDetachedCopy((com.pnla.onroadplus.z_version2.realmOnRoad.UserNotificationRealmSave) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.User.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_UserRealmProxy.createDetachedCopy((com.pnla.onroadplus.z_version2.User) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.pnla.onroadplus.z_version2.UserData.class)) {
            return clazz.cast(io.realm.com_pnla_onroadplus_z_version2_UserDataRealmProxy.createDetachedCopy((com.pnla.onroadplus.z_version2.UserData) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

}
