package com.andreotti.motion.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class PageViewModel : ViewModel() {

    private val _index = MutableLiveData<Int>()
    val text: LiveData<List<String>> = Transformations.map(_index) {
        val loop = if (it == 1)
            (1..20)
        else (1..3)

        loop.map { position -> "item $position" }
    }

    fun setIndex(index: Int) {
        _index.value = index
    }
}