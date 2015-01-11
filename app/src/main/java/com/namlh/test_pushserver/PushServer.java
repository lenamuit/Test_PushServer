package com.namlh.test_pushserver;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.Part;

/**
 * Created by namlh on 11/01/2015.
 */
public interface PushServer {

    @FormUrlEncoded
    @POST("/devices.json")
    void postDevice(@Field("device_token") String deviceToken,
                    @Field("os")String os,
                    Callback<Void> callback);
}
