package com.sara.examplemvvm.domain

import com.sara.examplemvvm.data.QuoteRepository
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(
    private val repository: QuoteRepository

) {


    suspend operator fun invoke() = repository.getAllQuotes()

}