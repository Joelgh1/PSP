package com.joelgh.psp_2022.ut02.ex01.data.remote

import com.joelgh.psp_2022.ut02.ex01.data.remote.models.UserApiModel
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitApiClient {

    private val urlEndPoint = "https://jsonplaceholder.typicode.com/"
    private var apiEndPoints: ApiEndPoints

    init{
        apiEndPoints = buildApiEndPoints()
    }

    private fun buildClient() = Retrofit.Builder()
            .baseUrl(urlEndPoint)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    private fun buildApiEndPoints() = buildClient().create(ApiEndPoints::class.java)

    fun getUsers(): List<UserApiModel>{
        val callUsers = apiEndPoints.getUsers() //Llamada
        val response = callUsers.execute()      //Ejecucion de la llamada

        return if(response.isSuccessful){
            val users = response.body()
            users ?: emptyList()
        }else{
            emptyList()
        }
    }

    fun getUser(userId: Int): UserApiModel?{
        val response = apiEndPoints.getUser(userId).execute()

        return if(response.isSuccessful){
            response.body()
        }else{
            null
        }
    }
}