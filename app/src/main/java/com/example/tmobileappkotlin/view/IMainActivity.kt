package com.example.tmobileappkotlin.view

import com.example.tmobileappkotlin.model.CardParent

interface IMainActivity {
    fun onBind()
    fun initView()
    fun initNetwork()
    fun showToast(message: String)
    fun showProgress()
    fun dismissProgress()
    fun displayData(dataSet: MutableList<CardParent>)
    fun callNetwork()
}