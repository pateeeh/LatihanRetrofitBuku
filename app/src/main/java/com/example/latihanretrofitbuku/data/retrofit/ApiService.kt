package com.example.latihanretrofitbuku.data.retrofit

import com.example.latihanretrofitbuku.data.response.ListBukuResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("getDataBook.php")
    fun getAllBuku(): Call<ListBukuResponse>

}