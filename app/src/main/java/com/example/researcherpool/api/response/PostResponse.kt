package com.example.researcherpool.api.response

import com.google.gson.annotations.SerializedName

data class PostResponse(

	@field:SerializedName("msg")
	val msg: String? = null
)