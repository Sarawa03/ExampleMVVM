package com.sara.examplemvvm.domain.model

import com.sara.examplemvvm.data.database.entities.QuoteEntity
import com.sara.examplemvvm.data.model.QuoteModel

data class Quote (val quote: String, val author: String)
fun QuoteModel.toDomain() = Quote(quote, author)
fun QuoteEntity.toDomain() = Quote(quote, author)
