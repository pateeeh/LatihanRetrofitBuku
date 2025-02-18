package com.example.latihanretrofitbuku.data.response

import com.google.gson.annotations.SerializedName

data class Details(

	@field:SerializedName("size")
	val size: String,

	@field:SerializedName("no_gm")
	val noGm: String,

	@field:SerializedName("price")
	val price: String,

	@field:SerializedName("isbn")
	val isbn: String,

	@field:SerializedName("format")
	val format: String,

	@field:SerializedName("total_pages")
	val totalPages: String,

	@field:SerializedName("published_date")
	val publishedDate: String
)