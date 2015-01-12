package com.namlh.test_pushserver;

import com.google.gson.annotations.SerializedName;

/**
 * Created by namlh on 12/01/2015.
 */
public class DeviceInfo {
    @SerializedName("id")
    public long id;
    @SerializedName("uuid")
    public String uuid;
    @SerializedName("app_id")
    public String appId;
    @SerializedName("os")
    public String os;
    @SerializedName("device_token")
    public String deviceToken;

    @Override
    public String toString() {
        return uuid + "\n"
                + appId + "\n";
    }
}
