package com.sara.examplemvvm.data

import com.sara.examplemvvm.data.database.dao.QuoteDao
import com.sara.examplemvvm.data.database.entities.QuoteEntity
import com.sara.examplemvvm.data.model.QuoteModel
import com.sara.examplemvvm.data.network.QuoteService
import com.sara.examplemvvm.domain.model.Quote
import com.sara.examplemvvm.domain.model.toDomain
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val api: QuoteService,
    private val quoteDao: QuoteDao
) {


    suspend fun getAllQuotesFromApi():List<Quote>{
        val response: List<QuoteModel> = api.getQuotes()
        //val response2: List<Quote> = response.map { it.toDomain() }
        return response.map { it.toDomain() }
    }

    suspend fun getAllQuotesFromDatabase():List<Quote>{
        val response = quoteDao.getAllQuotes()
        return response.map { it.toDomain() }
    }

    suspend fun insertQuotes(quotes:List<QuoteEntity>){
        quoteDao.insertAll(quotes)
    }

    suspend fun clearQuotes(){
        quoteDao.deleteAllQuotes()
    }
}