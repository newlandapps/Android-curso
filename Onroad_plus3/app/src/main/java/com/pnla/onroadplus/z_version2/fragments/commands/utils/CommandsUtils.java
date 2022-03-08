package com.pnla.onroadplus.z_version2.fragments.commands.utils;

import com.pnla.onroadplus.z_version2.generalUtils.GeneralConstantsV2;

public class CommandsUtils {

    public static String validateTokenCve(String token, int vehicleCve) {
        String validation = GeneralConstantsV2.SUCCESS;
        if (token == null || token.length() == 0) {
            validation = "No se encontró información del usuario.";
            return validation;
        }
        if (vehicleCve < 1) {
            validation = "La clave de vehículo no es válida";
            return validation;
        }
        return validation;
    }

    public static String validateCommandToSend(String token, int cveDeviceToSend, int cveRoutineToSend, int vehicleCve) {
        String validation = GeneralConstantsV2.SUCCESS;
        if (token == null || token.length() == 0) {
            validation = "No se encontró información de usuario.";
            return validation;
        }
        if (cveDeviceToSend < 1 || cveRoutineToSend < 1) {
            validation = "La información del comando es incorrecta.";
            return validation;
        }
        if (vehicleCve < 1) {
            validation = "La clave de vehículo es incorrecta.";
            return validation;
        }
        return validation;
    }

}
