package com.example.tmobileappkotlin.view

import com.example.tmobileappkotlin.model.CardY

interface IMainActivity {
    fun onBind()
    fun initView()
    fun initNetwork()
    fun showToast(message: String)
    fun showProgress()
    fun dismissProgress()
    fun displayData(dataSet: MutableList<CardY>)
    fun callNetwork()
}