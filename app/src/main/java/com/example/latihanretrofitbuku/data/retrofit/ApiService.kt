package com.example.latihanretrofitbuku.data.retrofit

import com.example.latihanretrofitbuku.data.response.ListBukuResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("api/v1/book")
    fun getAllSiswa(): Call<ListBukuResponse>

}