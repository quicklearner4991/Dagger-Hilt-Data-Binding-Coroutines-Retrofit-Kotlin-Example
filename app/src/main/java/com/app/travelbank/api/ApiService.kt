package com.app.travelbank.api

import com.app.travelbank.model.response.GetExpenseResponseModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("178cbbee-c634-4a51-afb8-dcd75c190d29")
    suspend fun getCountries(): Response<GetExpenseResponseModel>
}