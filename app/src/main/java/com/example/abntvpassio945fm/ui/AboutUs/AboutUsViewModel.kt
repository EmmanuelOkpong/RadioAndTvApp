package com.example.abntvpassio945fm.ui.AboutUs

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AboutUsViewModel : ViewModel() {

    private val _text=MutableLiveData<String>().apply {
        value="This is About Us"

    }
    val text: LiveData<String> =_text
}