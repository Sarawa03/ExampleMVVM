package com.sara.examplemvvm.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import com.sara.examplemvvm.data.model.QuoteModel
import com.sara.examplemvvm.data.model.QuoteProvider
import com.sara.examplemvvm.domain.GetQuotesUseCase

class QuoteViewModel: ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()

    var getQuotesUseCase = GetQuotesUseCase()
    fun onCreate() {
        TODO("Not yet implemented")
    }
    fun randomQuote(){
        //val currentQuote: QuoteModel = QuoteProvider.random()
        //quoteModel.postValue(currentQuote)
    }


}