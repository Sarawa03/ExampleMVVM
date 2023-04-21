package com.sara.examplemvvm.data.model
import com.google.gson.annotations.SerializedName

data class QuoteModel(//tiene q ser el mismo nombre que se da desde back
    @SerializedName("quote") val quote: String,
    @SerializedName("author") val author: String
)