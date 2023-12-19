package com.example.databindingpractice

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var userLiveData = MutableLiveData<String>("Hassan")

    fun updateUserData() {

        userLiveData.value = "kamal"

    }

}