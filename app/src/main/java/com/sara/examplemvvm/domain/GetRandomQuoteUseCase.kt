package com.sara.examplemvvm.domain


import com.sara.examplemvvm.data.QuoteRepository
import com.sara.examplemvvm.data.model.QuoteModel
import com.sara.examplemvvm.domain.model.Quote
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(private val repository: QuoteRepository){

    suspend operator fun invoke(): Quote?{
        //No es lo correcto
        val quotes = repository.getAllQuotesFromDatabase()
        if(!quotes.isNullOrEmpty()){
            //val randomNumber = (0..quotes.size-1).random()
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null

    }
}