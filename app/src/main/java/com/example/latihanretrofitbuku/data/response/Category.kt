package com.example.latihanretrofitbuku.data.response

import com.google.gson.annotations.SerializedName

data class Category(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("url")
	val url: String
)