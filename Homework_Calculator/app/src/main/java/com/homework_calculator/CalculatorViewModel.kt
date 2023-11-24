package com.homework_calculator

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {

    private val _inPutLiveDate = MutableLiveData<Int>()
    val _inputlivedate: LiveData<Int> = _inPutLiveDate

    fun setInPut(value: Int) {
        _inPutLiveDate.value = value
    }

}