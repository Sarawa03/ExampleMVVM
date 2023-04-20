package com.sara.examplemvvm.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.sara.examplemvvm.data.model.QuoteModel
import com.sara.examplemvvm.data.model.QuoteProvider
import com.sara.examplemvvm.domain.GetQuotesUseCase
import com.sara.examplemvvm.domain.GetRandomQuoteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuoteViewModel @Inject constructor(
    private val getQuotesUseCase: GetQuotesUseCase,
    private val getRandomQuoteUseCase: GetRandomQuoteUseCase

) : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()
    val isLoading = MutableLiveData<Boolean>()



    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getQuotesUseCase()

            if(!result.isNullOrEmpty()){
                quoteModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }
    }

    fun randomQuote() {
        isLoading.postValue(true)
        val quote = getRandomQuoteUseCase()
        if(quote!=null){
            quoteModel.postValue(quote)
        }
        isLoading.postValue(false)
    }
}