package com.example.latihanretrofitbuku.data.response

import com.google.gson.annotations.SerializedName

data class TagsItem(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("url")
	val url: String
)