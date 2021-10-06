package com.app.travelbank.main.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.travelbank.model.getexpenses.GetExpenseResponseModelItem
import com.app.travelbank.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: Repository) : ViewModel() {
    private val countryLiveData = MutableLiveData<ArrayList<GetExpenseResponseModelItem>?>()

    fun getCountry() = countryLiveData

    init {
        loadCountries()
    }

    private fun loadCountries() {
        viewModelScope.launch {
            val expenses = repository.getCountries()
            when (expenses.isSuccessful) {
                true -> {
                    if (expenses.body() != null && expenses.body()!!.size > 0) {
                        countryLiveData.postValue(expenses.body())
                    } else {
                        countryLiveData.postValue(ArrayList())
                    }
                }
                else -> {
                    Timber.e(expenses.message())
                }
            }
        }
    }
}