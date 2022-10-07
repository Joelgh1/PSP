package com.joelgh.psp_2022.ut02.ex02.data.remote

import com.joelgh.psp_2022.ut02.ex02.domain.Alert
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiEndPoints {

    @GET("alerts")
    fun getAlerts(): Call<List<Alert>>

    @GET("users/{alert_id}")
    fun getAlert(@Path("alert_id") alert_id: String): Call<Alert>

}