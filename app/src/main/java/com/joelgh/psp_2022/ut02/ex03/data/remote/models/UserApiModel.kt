package com.joelgh.psp_2022.ut02.ex03.data.remote.models

data class UserApiModel(val id: Int, val name: String, val surname: String, val email: String, val address: AddressApiModel, val phone: String, val website: String, val company: CompanyApiModel)
data class AddressApiModel(val street: String, val suite: String, val city: String, val zipcode: String, val geo: GeoApiModel)
data class GeoApiModel(val lat: String, val lng: String)
data class CompanyApiModel(val name: String, val catchPhrase: String, val bs: String)
