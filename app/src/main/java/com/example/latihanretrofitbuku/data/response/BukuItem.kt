package com.example.latihanretrofitbuku.data.response

import com.google.gson.annotations.SerializedName

data class BukuItem(

	@field:SerializedName("author")
	val author: String,

	@field:SerializedName("id")
	val id: String,

	@field:SerializedName("cover_image")
	val coverImage: String,

	@field:SerializedName("title")
	val title: String
)