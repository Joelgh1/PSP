package com.joelgh.psp_2022.ut02.ex02.data.local

import com.joelgh.psp_2022.ut02.ex02.domain.Alert

class LocalSource {


    //MOCK
    fun getAlerts(): List<Alert>{
        return emptyList()
    }

    //MOCK
    fun getAlert(alertId: String): Alert?{
        return null
    }
}