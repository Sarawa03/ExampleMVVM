package com.sara.examplemvvm.domain

import com.sara.examplemvvm.data.QuoteRepository
import com.sara.examplemvvm.data.model.QuoteModel
import com.sara.examplemvvm.data.model.QuoteProvider

class GetRandomQuoteUseCase {

    operator fun invoke(): QuoteModel?{
        //No es lo correcto
        val quotes = QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            //val randomNumber = (0..quotes.size-1).random()
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null

    }
}