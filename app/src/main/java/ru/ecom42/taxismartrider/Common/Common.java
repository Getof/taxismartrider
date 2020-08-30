package ru.ecom42.taxismartrider.Common;

import ru.ecom42.taxismartrider.Model.RiderModel;

public class Common {
    public static final String RIDER_INFO_REFENCE = "Riders";
    public static RiderModel currentRider;

    public static String buildWelcomeMessage() {
        if (Common.currentRider != null)
        {
            return Common.currentRider.getFirstName() +
                    " " +
                    Common.currentRider.getLastName();
        } else return "";
    }
}
