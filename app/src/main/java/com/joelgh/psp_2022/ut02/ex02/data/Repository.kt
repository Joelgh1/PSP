package com.joelgh.psp_2022.ut02.ex02.data

import com.joelgh.psp_2022.ut02.ex02.data.local.LocalSource
import com.joelgh.psp_2022.ut02.ex02.data.remote.RetrofitApiClient
import com.joelgh.psp_2022.ut02.ex02.domain.Alert

class Repository (val localSource: LocalSource, val remoteSource: RetrofitApiClient){

    fun getAlerts(): List<Alert>{
        var alertsList = localSource.getAlerts()

        return if(alertsList == null){
            //remoteSource.getAlerts()
            emptyList()
        }else{
            emptyList()
        }
    }

    fun getAlert(alertId: String): Alert?{
        var alert = localSource.getAlert(alertId)

        return if(alert == null){
            //remoteSource.getAlert(alertId)
            null
        }else{
            null
        }
    }
}