package com.example.databindingpractice

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val userObj = User("Hassan")

    private val userLiveDataMutable = MutableLiveData<User>(userObj)

    val userLiveData: LiveData<User>
        get() = userLiveDataMutable

    fun updateUserData() {
        val userObj1 = User("kamal")

        userLiveDataMutable.value = userObj1

    }

}