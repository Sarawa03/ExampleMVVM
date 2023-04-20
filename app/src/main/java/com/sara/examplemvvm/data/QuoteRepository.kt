package com.sara.examplemvvm.data

import com.sara.examplemvvm.data.model.QuoteModel
import com.sara.examplemvvm.data.model.QuoteProvider
import com.sara.examplemvvm.data.network.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val api: QuoteService,
    private  val quoteProvider: QuoteProvider
) {


    suspend fun getAllQuotes():List<QuoteModel>{
        val response: List<QuoteModel> = api.getQuotes()
        quoteProvider.quotes = response
        return response
    }

}