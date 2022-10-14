package com.joelgh.psp_2022.ut02.ex03.data.remote

import com.joelgh.psp_2022.ut02.ex03.data.local.UserLocalSource

class UserRepository(val userLocalSource: UserLocalSource, val userRemoteSource: UserRemoteSource) {

    fun getUsers() = userRemoteSource.getUsers()

    fun getUser(userId: Int) = userRemoteSource.getUser(userId)
}