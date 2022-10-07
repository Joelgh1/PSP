package com.joelgh.psp_2022.ut02.ex02.domain

import java.util.Date

data class Alert(val alert_id: String, val title: String, val summary: String, val type: Int, val date: Date) {
}