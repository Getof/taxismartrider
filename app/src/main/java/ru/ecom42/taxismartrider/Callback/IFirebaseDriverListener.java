package ru.ecom42.taxismartrider.Callback;

import ru.ecom42.taxismartrider.Model.DriverGeoModel;

public interface IFirebaseDriverListener {
    void onDriverInfoLoadSuccess(DriverGeoModel driverGeoModel);
}
