package com.app.travelbank.repository

import com.app.travelbank.api.ApiService

class Repository(private val apiService: ApiService) {
    suspend fun getCountries() = apiService.getCountries()
}