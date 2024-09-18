package com.example.prj18092024.ui.theme.view;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class MainGui_ViewModel {
    private val _contador = MutableLiveData<Int>(0)
        var contador = _contador

    fun updateContador() {
            _contador.value = _contador.value?.plus(1)


    }
}
