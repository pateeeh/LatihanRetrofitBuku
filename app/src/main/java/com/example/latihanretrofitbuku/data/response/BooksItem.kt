package com.example.latihanretrofitbuku.data.response

import com.google.gson.annotations.SerializedName

data class BooksItem(

	@field:SerializedName("summary")
	val summary: String,

	@field:SerializedName("author")
	val author: Author,

	@field:SerializedName("publisher")
	val publisher: String,

	@field:SerializedName("details")
	val details: Details,

	@field:SerializedName("_id")
	val id: String,

	@field:SerializedName("cover_image")
	val coverImage: String,

	@field:SerializedName("title")
	val title: String,

	@field:SerializedName("category")
	val category: Category,

	@field:SerializedName("buy_links")
	val buyLinks: List<BuyLinksItem>,

	@field:SerializedName("tags")
	val tags: List<TagsItem>
)