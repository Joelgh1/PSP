package com.joelgh.psp_2022.ut02.ex02.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitApiClient {

    val urlEndPoint = "https://plagricola.sitehub.es/api/public/"
    val apiEndPoints: ApiEndPoints

    init{
        apiEndPoints = buildApiEndPoints()
    }

    fun buildApiEndPoints() = buildClient().create(ApiEndPoints::class.java)

    fun buildClient()  = Retrofit.Builder()
        .baseUrl(urlEndPoint)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

}