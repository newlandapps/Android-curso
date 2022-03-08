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
public class com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxy extends com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit
    implements RealmObjectProxy, com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface {

    static final class UnitColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long idIndex;
        long vehicleStatusIndex;
        long cveVehicleIndex;
        long vehicleSwitchIndex;
        long vehicleNameIndex;
        long vehicleImageIndex;
        long sendTimeIndex;
        long descBrandIndex;
        long descModelIndex;
        long vehicleYearIndex;
        long vehicleVinIndex;
        long vehiclePlateIndex;
        long georeferenceIndex;
        long timeTravelIndex;
        long timeElapsedIndex;
        long latitudeIndex;
        long longitudeIndex;
        long mileageIndex;
        long kmTravelIndex;
        long currentSpeedIndex;
        long maxSpeedIndex;

        UnitColumnInfo(OsSchemaInfo schemaInfo) {
            super(21);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Unit");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.vehicleStatusIndex = addColumnDetails("vehicleStatus", "vehicleStatus", objectSchemaInfo);
            this.cveVehicleIndex = addColumnDetails("cveVehicle", "cveVehicle", objectSchemaInfo);
            this.vehicleSwitchIndex = addColumnDetails("vehicleSwitch", "vehicleSwitch", objectSchemaInfo);
            this.vehicleNameIndex = addColumnDetails("vehicleName", "vehicleName", objectSchemaInfo);
            this.vehicleImageIndex = addColumnDetails("vehicleImage", "vehicleImage", objectSchemaInfo);
            this.sendTimeIndex = addColumnDetails("sendTime", "sendTime", objectSchemaInfo);
            this.descBrandIndex = addColumnDetails("descBrand", "descBrand", objectSchemaInfo);
            this.descModelIndex = addColumnDetails("descModel", "descModel", objectSchemaInfo);
            this.vehicleYearIndex = addColumnDetails("vehicleYear", "vehicleYear", objectSchemaInfo);
            this.vehicleVinIndex = addColumnDetails("vehicleVin", "vehicleVin", objectSchemaInfo);
            this.vehiclePlateIndex = addColumnDetails("vehiclePlate", "vehiclePlate", objectSchemaInfo);
            this.georeferenceIndex = addColumnDetails("georeference", "georeference", objectSchemaInfo);
            this.timeTravelIndex = addColumnDetails("timeTravel", "timeTravel", objectSchemaInfo);
            this.timeElapsedIndex = addColumnDetails("timeElapsed", "timeElapsed", objectSchemaInfo);
            this.latitudeIndex = addColumnDetails("latitude", "latitude", objectSchemaInfo);
            this.longitudeIndex = addColumnDetails("longitude", "longitude", objectSchemaInfo);
            this.mileageIndex = addColumnDetails("mileage", "mileage", objectSchemaInfo);
            this.kmTravelIndex = addColumnDetails("kmTravel", "kmTravel", objectSchemaInfo);
            this.currentSpeedIndex = addColumnDetails("currentSpeed", "currentSpeed", objectSchemaInfo);
            this.maxSpeedIndex = addColumnDetails("maxSpeed", "maxSpeed", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        UnitColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new UnitColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final UnitColumnInfo src = (UnitColumnInfo) rawSrc;
            final UnitColumnInfo dst = (UnitColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.vehicleStatusIndex = src.vehicleStatusIndex;
            dst.cveVehicleIndex = src.cveVehicleIndex;
            dst.vehicleSwitchIndex = src.vehicleSwitchIndex;
            dst.vehicleNameIndex = src.vehicleNameIndex;
            dst.vehicleImageIndex = src.vehicleImageIndex;
            dst.sendTimeIndex = src.sendTimeIndex;
            dst.descBrandIndex = src.descBrandIndex;
            dst.descModelIndex = src.descModelIndex;
            dst.vehicleYearIndex = src.vehicleYearIndex;
            dst.vehicleVinIndex = src.vehicleVinIndex;
            dst.vehiclePlateIndex = src.vehiclePlateIndex;
            dst.georeferenceIndex = src.georeferenceIndex;
            dst.timeTravelIndex = src.timeTravelIndex;
            dst.timeElapsedIndex = src.timeElapsedIndex;
            dst.latitudeIndex = src.latitudeIndex;
            dst.longitudeIndex = src.longitudeIndex;
            dst.mileageIndex = src.mileageIndex;
            dst.kmTravelIndex = src.kmTravelIndex;
            dst.currentSpeedIndex = src.currentSpeedIndex;
            dst.maxSpeedIndex = src.maxSpeedIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private UnitColumnInfo columnInfo;
    private ProxyState<com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit> proxyState;

    com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (UnitColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit>(this);
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
    public boolean realmGet$vehicleStatus() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.vehicleStatusIndex);
    }

    @Override
    public void realmSet$vehicleStatus(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.vehicleStatusIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.vehicleStatusIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$cveVehicle() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.cveVehicleIndex);
    }

    @Override
    public void realmSet$cveVehicle(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.cveVehicleIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.cveVehicleIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$vehicleSwitch() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.vehicleSwitchIndex);
    }

    @Override
    public void realmSet$vehicleSwitch(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.vehicleSwitchIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.vehicleSwitchIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$vehicleName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.vehicleNameIndex);
    }

    @Override
    public void realmSet$vehicleName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.vehicleNameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.vehicleNameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.vehicleNameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.vehicleNameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$vehicleImage() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.vehicleImageIndex);
    }

    @Override
    public void realmSet$vehicleImage(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.vehicleImageIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.vehicleImageIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.vehicleImageIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.vehicleImageIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$sendTime() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.sendTimeIndex);
    }

    @Override
    public void realmSet$sendTime(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.sendTimeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.sendTimeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.sendTimeIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.sendTimeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$descBrand() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.descBrandIndex);
    }

    @Override
    public void realmSet$descBrand(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.descBrandIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.descBrandIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.descBrandIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.descBrandIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$descModel() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.descModelIndex);
    }

    @Override
    public void realmSet$descModel(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.descModelIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.descModelIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.descModelIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.descModelIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$vehicleYear() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.vehicleYearIndex);
    }

    @Override
    public void realmSet$vehicleYear(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.vehicleYearIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.vehicleYearIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.vehicleYearIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.vehicleYearIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$vehicleVin() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.vehicleVinIndex);
    }

    @Override
    public void realmSet$vehicleVin(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.vehicleVinIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.vehicleVinIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.vehicleVinIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.vehicleVinIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$vehiclePlate() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.vehiclePlateIndex);
    }

    @Override
    public void realmSet$vehiclePlate(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.vehiclePlateIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.vehiclePlateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.vehiclePlateIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.vehiclePlateIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$georeference() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.georeferenceIndex);
    }

    @Override
    public void realmSet$georeference(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.georeferenceIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.georeferenceIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.georeferenceIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.georeferenceIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$timeTravel() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.timeTravelIndex);
    }

    @Override
    public void realmSet$timeTravel(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.timeTravelIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.timeTravelIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.timeTravelIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.timeTravelIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$timeElapsed() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.timeElapsedIndex);
    }

    @Override
    public void realmSet$timeElapsed(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.timeElapsedIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.timeElapsedIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.timeElapsedIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.timeElapsedIndex, value);
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
    public double realmGet$mileage() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.mileageIndex);
    }

    @Override
    public void realmSet$mileage(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.mileageIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.mileageIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$kmTravel() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.kmTravelIndex);
    }

    @Override
    public void realmSet$kmTravel(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.kmTravelIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.kmTravelIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$currentSpeed() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.currentSpeedIndex);
    }

    @Override
    public void realmSet$currentSpeed(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.currentSpeedIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.currentSpeedIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$maxSpeed() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.maxSpeedIndex);
    }

    @Override
    public void realmSet$maxSpeed(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.maxSpeedIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.maxSpeedIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Unit", 21, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("vehicleStatus", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("cveVehicle", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("vehicleSwitch", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("vehicleName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("vehicleImage", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("sendTime", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("descBrand", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("descModel", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("vehicleYear", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("vehicleVin", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("vehiclePlate", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("georeference", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("timeTravel", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("timeElapsed", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("latitude", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("longitude", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("mileage", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("kmTravel", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("currentSpeed", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("maxSpeed", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UnitColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new UnitColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Unit";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Unit";
    }

    @SuppressWarnings("cast")
    public static com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit obj = null;
        if (update) {
            Table table = realm.getTable(com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit.class);
            UnitColumnInfo columnInfo = (UnitColumnInfo) realm.getSchema().getColumnInfo(com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxy) realm.createObjectInternal(com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxy) realm.createObjectInternal(com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface objProxy = (com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) obj;
        if (json.has("vehicleStatus")) {
            if (json.isNull("vehicleStatus")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'vehicleStatus' to null.");
            } else {
                objProxy.realmSet$vehicleStatus((boolean) json.getBoolean("vehicleStatus"));
            }
        }
        if (json.has("cveVehicle")) {
            if (json.isNull("cveVehicle")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'cveVehicle' to null.");
            } else {
                objProxy.realmSet$cveVehicle((int) json.getInt("cveVehicle"));
            }
        }
        if (json.has("vehicleSwitch")) {
            if (json.isNull("vehicleSwitch")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'vehicleSwitch' to null.");
            } else {
                objProxy.realmSet$vehicleSwitch((int) json.getInt("vehicleSwitch"));
            }
        }
        if (json.has("vehicleName")) {
            if (json.isNull("vehicleName")) {
                objProxy.realmSet$vehicleName(null);
            } else {
                objProxy.realmSet$vehicleName((String) json.getString("vehicleName"));
            }
        }
        if (json.has("vehicleImage")) {
            if (json.isNull("vehicleImage")) {
                objProxy.realmSet$vehicleImage(null);
            } else {
                objProxy.realmSet$vehicleImage((String) json.getString("vehicleImage"));
            }
        }
        if (json.has("sendTime")) {
            if (json.isNull("sendTime")) {
                objProxy.realmSet$sendTime(null);
            } else {
                objProxy.realmSet$sendTime((String) json.getString("sendTime"));
            }
        }
        if (json.has("descBrand")) {
            if (json.isNull("descBrand")) {
                objProxy.realmSet$descBrand(null);
            } else {
                objProxy.realmSet$descBrand((String) json.getString("descBrand"));
            }
        }
        if (json.has("descModel")) {
            if (json.isNull("descModel")) {
                objProxy.realmSet$descModel(null);
            } else {
                objProxy.realmSet$descModel((String) json.getString("descModel"));
            }
        }
        if (json.has("vehicleYear")) {
            if (json.isNull("vehicleYear")) {
                objProxy.realmSet$vehicleYear(null);
            } else {
                objProxy.realmSet$vehicleYear((String) json.getString("vehicleYear"));
            }
        }
        if (json.has("vehicleVin")) {
            if (json.isNull("vehicleVin")) {
                objProxy.realmSet$vehicleVin(null);
            } else {
                objProxy.realmSet$vehicleVin((String) json.getString("vehicleVin"));
            }
        }
        if (json.has("vehiclePlate")) {
            if (json.isNull("vehiclePlate")) {
                objProxy.realmSet$vehiclePlate(null);
            } else {
                objProxy.realmSet$vehiclePlate((String) json.getString("vehiclePlate"));
            }
        }
        if (json.has("georeference")) {
            if (json.isNull("georeference")) {
                objProxy.realmSet$georeference(null);
            } else {
                objProxy.realmSet$georeference((String) json.getString("georeference"));
            }
        }
        if (json.has("timeTravel")) {
            if (json.isNull("timeTravel")) {
                objProxy.realmSet$timeTravel(null);
            } else {
                objProxy.realmSet$timeTravel((String) json.getString("timeTravel"));
            }
        }
        if (json.has("timeElapsed")) {
            if (json.isNull("timeElapsed")) {
                objProxy.realmSet$timeElapsed(null);
            } else {
                objProxy.realmSet$timeElapsed((String) json.getString("timeElapsed"));
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
        if (json.has("mileage")) {
            if (json.isNull("mileage")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'mileage' to null.");
            } else {
                objProxy.realmSet$mileage((double) json.getDouble("mileage"));
            }
        }
        if (json.has("kmTravel")) {
            if (json.isNull("kmTravel")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'kmTravel' to null.");
            } else {
                objProxy.realmSet$kmTravel((double) json.getDouble("kmTravel"));
            }
        }
        if (json.has("currentSpeed")) {
            if (json.isNull("currentSpeed")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'currentSpeed' to null.");
            } else {
                objProxy.realmSet$currentSpeed((double) json.getDouble("currentSpeed"));
            }
        }
        if (json.has("maxSpeed")) {
            if (json.isNull("maxSpeed")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'maxSpeed' to null.");
            } else {
                objProxy.realmSet$maxSpeed((double) json.getDouble("maxSpeed"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit obj = new com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit();
        final com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface objProxy = (com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) obj;
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
            } else if (name.equals("vehicleStatus")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$vehicleStatus((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'vehicleStatus' to null.");
                }
            } else if (name.equals("cveVehicle")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$cveVehicle((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'cveVehicle' to null.");
                }
            } else if (name.equals("vehicleSwitch")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$vehicleSwitch((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'vehicleSwitch' to null.");
                }
            } else if (name.equals("vehicleName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$vehicleName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$vehicleName(null);
                }
            } else if (name.equals("vehicleImage")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$vehicleImage((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$vehicleImage(null);
                }
            } else if (name.equals("sendTime")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$sendTime((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$sendTime(null);
                }
            } else if (name.equals("descBrand")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$descBrand((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$descBrand(null);
                }
            } else if (name.equals("descModel")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$descModel((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$descModel(null);
                }
            } else if (name.equals("vehicleYear")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$vehicleYear((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$vehicleYear(null);
                }
            } else if (name.equals("vehicleVin")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$vehicleVin((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$vehicleVin(null);
                }
            } else if (name.equals("vehiclePlate")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$vehiclePlate((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$vehiclePlate(null);
                }
            } else if (name.equals("georeference")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$georeference((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$georeference(null);
                }
            } else if (name.equals("timeTravel")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timeTravel((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$timeTravel(null);
                }
            } else if (name.equals("timeElapsed")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timeElapsed((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$timeElapsed(null);
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
            } else if (name.equals("mileage")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$mileage((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'mileage' to null.");
                }
            } else if (name.equals("kmTravel")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kmTravel((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'kmTravel' to null.");
                }
            } else if (name.equals("currentSpeed")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$currentSpeed((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'currentSpeed' to null.");
                }
            } else if (name.equals("maxSpeed")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$maxSpeed((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'maxSpeed' to null.");
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

    private static com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating uexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit.class), false, Collections.<String>emptyList());
        io.realm.com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxy obj = new io.realm.com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit copyOrUpdate(Realm realm, UnitColumnInfo columnInfo, com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit) cachedRealmObject;
        }

        com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$id());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit copy(Realm realm, UnitColumnInfo columnInfo, com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit) cachedRealmObject;
        }

        com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface realmObjectSource = (com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) newObject;

        Table table = realm.getTable(com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addBoolean(columnInfo.vehicleStatusIndex, realmObjectSource.realmGet$vehicleStatus());
        builder.addInteger(columnInfo.cveVehicleIndex, realmObjectSource.realmGet$cveVehicle());
        builder.addInteger(columnInfo.vehicleSwitchIndex, realmObjectSource.realmGet$vehicleSwitch());
        builder.addString(columnInfo.vehicleNameIndex, realmObjectSource.realmGet$vehicleName());
        builder.addString(columnInfo.vehicleImageIndex, realmObjectSource.realmGet$vehicleImage());
        builder.addString(columnInfo.sendTimeIndex, realmObjectSource.realmGet$sendTime());
        builder.addString(columnInfo.descBrandIndex, realmObjectSource.realmGet$descBrand());
        builder.addString(columnInfo.descModelIndex, realmObjectSource.realmGet$descModel());
        builder.addString(columnInfo.vehicleYearIndex, realmObjectSource.realmGet$vehicleYear());
        builder.addString(columnInfo.vehicleVinIndex, realmObjectSource.realmGet$vehicleVin());
        builder.addString(columnInfo.vehiclePlateIndex, realmObjectSource.realmGet$vehiclePlate());
        builder.addString(columnInfo.georeferenceIndex, realmObjectSource.realmGet$georeference());
        builder.addString(columnInfo.timeTravelIndex, realmObjectSource.realmGet$timeTravel());
        builder.addString(columnInfo.timeElapsedIndex, realmObjectSource.realmGet$timeElapsed());
        builder.addDouble(columnInfo.latitudeIndex, realmObjectSource.realmGet$latitude());
        builder.addDouble(columnInfo.longitudeIndex, realmObjectSource.realmGet$longitude());
        builder.addDouble(columnInfo.mileageIndex, realmObjectSource.realmGet$mileage());
        builder.addDouble(columnInfo.kmTravelIndex, realmObjectSource.realmGet$kmTravel());
        builder.addDouble(columnInfo.currentSpeedIndex, realmObjectSource.realmGet$currentSpeed());
        builder.addDouble(columnInfo.maxSpeedIndex, realmObjectSource.realmGet$maxSpeed());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit.class);
        long tableNativePtr = table.getNativePtr();
        UnitColumnInfo columnInfo = (UnitColumnInfo) realm.getSchema().getColumnInfo(com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.vehicleStatusIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehicleStatus(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.cveVehicleIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$cveVehicle(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.vehicleSwitchIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehicleSwitch(), false);
        String realmGet$vehicleName = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehicleName();
        if (realmGet$vehicleName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicleNameIndex, rowIndex, realmGet$vehicleName, false);
        }
        String realmGet$vehicleImage = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehicleImage();
        if (realmGet$vehicleImage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicleImageIndex, rowIndex, realmGet$vehicleImage, false);
        }
        String realmGet$sendTime = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$sendTime();
        if (realmGet$sendTime != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sendTimeIndex, rowIndex, realmGet$sendTime, false);
        }
        String realmGet$descBrand = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$descBrand();
        if (realmGet$descBrand != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descBrandIndex, rowIndex, realmGet$descBrand, false);
        }
        String realmGet$descModel = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$descModel();
        if (realmGet$descModel != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descModelIndex, rowIndex, realmGet$descModel, false);
        }
        String realmGet$vehicleYear = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehicleYear();
        if (realmGet$vehicleYear != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicleYearIndex, rowIndex, realmGet$vehicleYear, false);
        }
        String realmGet$vehicleVin = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehicleVin();
        if (realmGet$vehicleVin != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicleVinIndex, rowIndex, realmGet$vehicleVin, false);
        }
        String realmGet$vehiclePlate = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehiclePlate();
        if (realmGet$vehiclePlate != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehiclePlateIndex, rowIndex, realmGet$vehiclePlate, false);
        }
        String realmGet$georeference = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$georeference();
        if (realmGet$georeference != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.georeferenceIndex, rowIndex, realmGet$georeference, false);
        }
        String realmGet$timeTravel = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$timeTravel();
        if (realmGet$timeTravel != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.timeTravelIndex, rowIndex, realmGet$timeTravel, false);
        }
        String realmGet$timeElapsed = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$timeElapsed();
        if (realmGet$timeElapsed != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.timeElapsedIndex, rowIndex, realmGet$timeElapsed, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.latitudeIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$latitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.longitudeIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$longitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.mileageIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$mileage(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.kmTravelIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$kmTravel(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.currentSpeedIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$currentSpeed(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.maxSpeedIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$maxSpeed(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit.class);
        long tableNativePtr = table.getNativePtr();
        UnitColumnInfo columnInfo = (UnitColumnInfo) realm.getSchema().getColumnInfo(com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit object = null;
        while (objects.hasNext()) {
            object = (com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.vehicleStatusIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehicleStatus(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.cveVehicleIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$cveVehicle(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.vehicleSwitchIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehicleSwitch(), false);
            String realmGet$vehicleName = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehicleName();
            if (realmGet$vehicleName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicleNameIndex, rowIndex, realmGet$vehicleName, false);
            }
            String realmGet$vehicleImage = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehicleImage();
            if (realmGet$vehicleImage != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicleImageIndex, rowIndex, realmGet$vehicleImage, false);
            }
            String realmGet$sendTime = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$sendTime();
            if (realmGet$sendTime != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sendTimeIndex, rowIndex, realmGet$sendTime, false);
            }
            String realmGet$descBrand = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$descBrand();
            if (realmGet$descBrand != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descBrandIndex, rowIndex, realmGet$descBrand, false);
            }
            String realmGet$descModel = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$descModel();
            if (realmGet$descModel != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descModelIndex, rowIndex, realmGet$descModel, false);
            }
            String realmGet$vehicleYear = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehicleYear();
            if (realmGet$vehicleYear != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicleYearIndex, rowIndex, realmGet$vehicleYear, false);
            }
            String realmGet$vehicleVin = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehicleVin();
            if (realmGet$vehicleVin != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicleVinIndex, rowIndex, realmGet$vehicleVin, false);
            }
            String realmGet$vehiclePlate = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehiclePlate();
            if (realmGet$vehiclePlate != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehiclePlateIndex, rowIndex, realmGet$vehiclePlate, false);
            }
            String realmGet$georeference = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$georeference();
            if (realmGet$georeference != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.georeferenceIndex, rowIndex, realmGet$georeference, false);
            }
            String realmGet$timeTravel = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$timeTravel();
            if (realmGet$timeTravel != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.timeTravelIndex, rowIndex, realmGet$timeTravel, false);
            }
            String realmGet$timeElapsed = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$timeElapsed();
            if (realmGet$timeElapsed != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.timeElapsedIndex, rowIndex, realmGet$timeElapsed, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.latitudeIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$latitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.longitudeIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$longitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.mileageIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$mileage(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.kmTravelIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$kmTravel(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.currentSpeedIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$currentSpeed(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.maxSpeedIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$maxSpeed(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit.class);
        long tableNativePtr = table.getNativePtr();
        UnitColumnInfo columnInfo = (UnitColumnInfo) realm.getSchema().getColumnInfo(com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.vehicleStatusIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehicleStatus(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.cveVehicleIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$cveVehicle(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.vehicleSwitchIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehicleSwitch(), false);
        String realmGet$vehicleName = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehicleName();
        if (realmGet$vehicleName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicleNameIndex, rowIndex, realmGet$vehicleName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.vehicleNameIndex, rowIndex, false);
        }
        String realmGet$vehicleImage = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehicleImage();
        if (realmGet$vehicleImage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicleImageIndex, rowIndex, realmGet$vehicleImage, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.vehicleImageIndex, rowIndex, false);
        }
        String realmGet$sendTime = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$sendTime();
        if (realmGet$sendTime != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sendTimeIndex, rowIndex, realmGet$sendTime, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.sendTimeIndex, rowIndex, false);
        }
        String realmGet$descBrand = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$descBrand();
        if (realmGet$descBrand != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descBrandIndex, rowIndex, realmGet$descBrand, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.descBrandIndex, rowIndex, false);
        }
        String realmGet$descModel = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$descModel();
        if (realmGet$descModel != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descModelIndex, rowIndex, realmGet$descModel, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.descModelIndex, rowIndex, false);
        }
        String realmGet$vehicleYear = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehicleYear();
        if (realmGet$vehicleYear != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicleYearIndex, rowIndex, realmGet$vehicleYear, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.vehicleYearIndex, rowIndex, false);
        }
        String realmGet$vehicleVin = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehicleVin();
        if (realmGet$vehicleVin != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicleVinIndex, rowIndex, realmGet$vehicleVin, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.vehicleVinIndex, rowIndex, false);
        }
        String realmGet$vehiclePlate = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehiclePlate();
        if (realmGet$vehiclePlate != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehiclePlateIndex, rowIndex, realmGet$vehiclePlate, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.vehiclePlateIndex, rowIndex, false);
        }
        String realmGet$georeference = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$georeference();
        if (realmGet$georeference != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.georeferenceIndex, rowIndex, realmGet$georeference, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.georeferenceIndex, rowIndex, false);
        }
        String realmGet$timeTravel = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$timeTravel();
        if (realmGet$timeTravel != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.timeTravelIndex, rowIndex, realmGet$timeTravel, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.timeTravelIndex, rowIndex, false);
        }
        String realmGet$timeElapsed = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$timeElapsed();
        if (realmGet$timeElapsed != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.timeElapsedIndex, rowIndex, realmGet$timeElapsed, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.timeElapsedIndex, rowIndex, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.latitudeIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$latitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.longitudeIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$longitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.mileageIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$mileage(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.kmTravelIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$kmTravel(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.currentSpeedIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$currentSpeed(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.maxSpeedIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$maxSpeed(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit.class);
        long tableNativePtr = table.getNativePtr();
        UnitColumnInfo columnInfo = (UnitColumnInfo) realm.getSchema().getColumnInfo(com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit object = null;
        while (objects.hasNext()) {
            object = (com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.vehicleStatusIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehicleStatus(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.cveVehicleIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$cveVehicle(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.vehicleSwitchIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehicleSwitch(), false);
            String realmGet$vehicleName = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehicleName();
            if (realmGet$vehicleName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicleNameIndex, rowIndex, realmGet$vehicleName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.vehicleNameIndex, rowIndex, false);
            }
            String realmGet$vehicleImage = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehicleImage();
            if (realmGet$vehicleImage != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicleImageIndex, rowIndex, realmGet$vehicleImage, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.vehicleImageIndex, rowIndex, false);
            }
            String realmGet$sendTime = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$sendTime();
            if (realmGet$sendTime != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sendTimeIndex, rowIndex, realmGet$sendTime, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.sendTimeIndex, rowIndex, false);
            }
            String realmGet$descBrand = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$descBrand();
            if (realmGet$descBrand != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descBrandIndex, rowIndex, realmGet$descBrand, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.descBrandIndex, rowIndex, false);
            }
            String realmGet$descModel = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$descModel();
            if (realmGet$descModel != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descModelIndex, rowIndex, realmGet$descModel, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.descModelIndex, rowIndex, false);
            }
            String realmGet$vehicleYear = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehicleYear();
            if (realmGet$vehicleYear != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicleYearIndex, rowIndex, realmGet$vehicleYear, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.vehicleYearIndex, rowIndex, false);
            }
            String realmGet$vehicleVin = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehicleVin();
            if (realmGet$vehicleVin != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicleVinIndex, rowIndex, realmGet$vehicleVin, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.vehicleVinIndex, rowIndex, false);
            }
            String realmGet$vehiclePlate = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$vehiclePlate();
            if (realmGet$vehiclePlate != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehiclePlateIndex, rowIndex, realmGet$vehiclePlate, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.vehiclePlateIndex, rowIndex, false);
            }
            String realmGet$georeference = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$georeference();
            if (realmGet$georeference != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.georeferenceIndex, rowIndex, realmGet$georeference, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.georeferenceIndex, rowIndex, false);
            }
            String realmGet$timeTravel = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$timeTravel();
            if (realmGet$timeTravel != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.timeTravelIndex, rowIndex, realmGet$timeTravel, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.timeTravelIndex, rowIndex, false);
            }
            String realmGet$timeElapsed = ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$timeElapsed();
            if (realmGet$timeElapsed != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.timeElapsedIndex, rowIndex, realmGet$timeElapsed, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.timeElapsedIndex, rowIndex, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.latitudeIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$latitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.longitudeIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$longitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.mileageIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$mileage(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.kmTravelIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$kmTravel(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.currentSpeedIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$currentSpeed(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.maxSpeedIndex, rowIndex, ((com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) object).realmGet$maxSpeed(), false);
        }
    }

    public static com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit createDetachedCopy(com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit) cachedObject.object;
            }
            unmanagedObject = (com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface unmanagedCopy = (com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) unmanagedObject;
        com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface realmSource = (com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$vehicleStatus(realmSource.realmGet$vehicleStatus());
        unmanagedCopy.realmSet$cveVehicle(realmSource.realmGet$cveVehicle());
        unmanagedCopy.realmSet$vehicleSwitch(realmSource.realmGet$vehicleSwitch());
        unmanagedCopy.realmSet$vehicleName(realmSource.realmGet$vehicleName());
        unmanagedCopy.realmSet$vehicleImage(realmSource.realmGet$vehicleImage());
        unmanagedCopy.realmSet$sendTime(realmSource.realmGet$sendTime());
        unmanagedCopy.realmSet$descBrand(realmSource.realmGet$descBrand());
        unmanagedCopy.realmSet$descModel(realmSource.realmGet$descModel());
        unmanagedCopy.realmSet$vehicleYear(realmSource.realmGet$vehicleYear());
        unmanagedCopy.realmSet$vehicleVin(realmSource.realmGet$vehicleVin());
        unmanagedCopy.realmSet$vehiclePlate(realmSource.realmGet$vehiclePlate());
        unmanagedCopy.realmSet$georeference(realmSource.realmGet$georeference());
        unmanagedCopy.realmSet$timeTravel(realmSource.realmGet$timeTravel());
        unmanagedCopy.realmSet$timeElapsed(realmSource.realmGet$timeElapsed());
        unmanagedCopy.realmSet$latitude(realmSource.realmGet$latitude());
        unmanagedCopy.realmSet$longitude(realmSource.realmGet$longitude());
        unmanagedCopy.realmSet$mileage(realmSource.realmGet$mileage());
        unmanagedCopy.realmSet$kmTravel(realmSource.realmGet$kmTravel());
        unmanagedCopy.realmSet$currentSpeed(realmSource.realmGet$currentSpeed());
        unmanagedCopy.realmSet$maxSpeed(realmSource.realmGet$maxSpeed());

        return unmanagedObject;
    }

    static com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit update(Realm realm, UnitColumnInfo columnInfo, com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit realmObject, com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface realmObjectTarget = (com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) realmObject;
        com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface realmObjectSource = (com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxyInterface) newObject;
        Table table = realm.getTable(com.newlandapps.onroad.z_version2.MenuFragments.Units.model.Unit.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addBoolean(columnInfo.vehicleStatusIndex, realmObjectSource.realmGet$vehicleStatus());
        builder.addInteger(columnInfo.cveVehicleIndex, realmObjectSource.realmGet$cveVehicle());
        builder.addInteger(columnInfo.vehicleSwitchIndex, realmObjectSource.realmGet$vehicleSwitch());
        builder.addString(columnInfo.vehicleNameIndex, realmObjectSource.realmGet$vehicleName());
        builder.addString(columnInfo.vehicleImageIndex, realmObjectSource.realmGet$vehicleImage());
        builder.addString(columnInfo.sendTimeIndex, realmObjectSource.realmGet$sendTime());
        builder.addString(columnInfo.descBrandIndex, realmObjectSource.realmGet$descBrand());
        builder.addString(columnInfo.descModelIndex, realmObjectSource.realmGet$descModel());
        builder.addString(columnInfo.vehicleYearIndex, realmObjectSource.realmGet$vehicleYear());
        builder.addString(columnInfo.vehicleVinIndex, realmObjectSource.realmGet$vehicleVin());
        builder.addString(columnInfo.vehiclePlateIndex, realmObjectSource.realmGet$vehiclePlate());
        builder.addString(columnInfo.georeferenceIndex, realmObjectSource.realmGet$georeference());
        builder.addString(columnInfo.timeTravelIndex, realmObjectSource.realmGet$timeTravel());
        builder.addString(columnInfo.timeElapsedIndex, realmObjectSource.realmGet$timeElapsed());
        builder.addDouble(columnInfo.latitudeIndex, realmObjectSource.realmGet$latitude());
        builder.addDouble(columnInfo.longitudeIndex, realmObjectSource.realmGet$longitude());
        builder.addDouble(columnInfo.mileageIndex, realmObjectSource.realmGet$mileage());
        builder.addDouble(columnInfo.kmTravelIndex, realmObjectSource.realmGet$kmTravel());
        builder.addDouble(columnInfo.currentSpeedIndex, realmObjectSource.realmGet$currentSpeed());
        builder.addDouble(columnInfo.maxSpeedIndex, realmObjectSource.realmGet$maxSpeed());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Unit = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{vehicleStatus:");
        stringBuilder.append(realmGet$vehicleStatus());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{cveVehicle:");
        stringBuilder.append(realmGet$cveVehicle());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{vehicleSwitch:");
        stringBuilder.append(realmGet$vehicleSwitch());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{vehicleName:");
        stringBuilder.append(realmGet$vehicleName() != null ? realmGet$vehicleName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{vehicleImage:");
        stringBuilder.append(realmGet$vehicleImage() != null ? realmGet$vehicleImage() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{sendTime:");
        stringBuilder.append(realmGet$sendTime() != null ? realmGet$sendTime() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{descBrand:");
        stringBuilder.append(realmGet$descBrand() != null ? realmGet$descBrand() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{descModel:");
        stringBuilder.append(realmGet$descModel() != null ? realmGet$descModel() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{vehicleYear:");
        stringBuilder.append(realmGet$vehicleYear() != null ? realmGet$vehicleYear() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{vehicleVin:");
        stringBuilder.append(realmGet$vehicleVin() != null ? realmGet$vehicleVin() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{vehiclePlate:");
        stringBuilder.append(realmGet$vehiclePlate() != null ? realmGet$vehiclePlate() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{georeference:");
        stringBuilder.append(realmGet$georeference() != null ? realmGet$georeference() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{timeTravel:");
        stringBuilder.append(realmGet$timeTravel() != null ? realmGet$timeTravel() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{timeElapsed:");
        stringBuilder.append(realmGet$timeElapsed() != null ? realmGet$timeElapsed() : "null");
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
        stringBuilder.append("{mileage:");
        stringBuilder.append(realmGet$mileage());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kmTravel:");
        stringBuilder.append(realmGet$kmTravel());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{currentSpeed:");
        stringBuilder.append(realmGet$currentSpeed());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{maxSpeed:");
        stringBuilder.append(realmGet$maxSpeed());
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
        com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxy aUnit = (com_newlandapps_onroad_z_version2_MenuFragments_Units_model_UnitRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aUnit.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aUnit.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aUnit.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
