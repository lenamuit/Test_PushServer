package com.namlh.test_pushserver;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by namlh on 11/01/2015.
 */
public interface PushServer {

    @FormUrlEncoded
    @POST("/devices.json")
    void postDevice(@Field("device_token") String deviceToken,
                    @Field("os")String os,
                    @Field("uuid") String uuid,
                    @Field("app_id") String appId,
                    Callback<DeviceInfo> callback);
}
