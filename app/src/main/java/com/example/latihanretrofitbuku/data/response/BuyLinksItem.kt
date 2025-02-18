package com.example.latihanretrofitbuku.data.response

import com.google.gson.annotations.SerializedName

data class BuyLinksItem(

	@field:SerializedName("store")
	val store: String,

	@field:SerializedName("url")
	val url: String
)