package com.sara.examplemvvm.domain

import com.sara.examplemvvm.data.QuoteRepository
import com.sara.examplemvvm.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke() = repository.getAllQuotes()

}