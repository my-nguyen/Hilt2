package com.nguyen.hilt2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: CryptoRepository): ViewModel() {
    private val _cryptoCurrency = MutableLiveData<List<CryptoCurrency>>()
    val cryptoCurrency: LiveData<List<CryptoCurrency>> = _cryptoCurrency

    init {
        _cryptoCurrency.value = repository.getCryptoCurrency()
    }
}