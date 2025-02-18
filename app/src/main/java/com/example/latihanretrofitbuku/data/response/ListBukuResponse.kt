package com.example.latihanretrofitbuku.data.response

import com.google.gson.annotations.SerializedName

data class ListBukuResponse(

	@field:SerializedName("books")
	val books: List<BooksItem>
)