package com.joelgh.psp_2022.ut02.ex01.data.remote

import com.joelgh.psp_2022.ut02.ex01.data.remote.models.UserApiModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiEndPoints {

    @GET("users")
    fun getUsers(): Call<List<UserApiModel>>

    @GET("users/{id}")
    fun getUser(@Path("id") userid: Int): Call<UserApiModel>
}