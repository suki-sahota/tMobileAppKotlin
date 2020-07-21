package com.example.tmobileappkotlin.presenter

import com.example.tmobileappkotlin.model.CardParent
import com.example.tmobileappkotlin.model.DataModel
import com.example.tmobileappkotlin.view.IMainActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class Presenter {

//    private val TAG = Presenter::class.java.simpleName // "Presenter"

    var view: IMainActivity? = null
    lateinit var restApi: RestApi

    fun onBind(view: IMainActivity) {
        this.view = view
    }

    fun initNetwork() {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://private-8ce77c-tmobiletest.apiary-mock.com")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        restApi = retrofit.create(RestApi::class.java)
    }

    fun makeCall() {
        restApi.getMeInfo().enqueue( // .enqueue for Asynchronous
            object : Callback<DataModel> { // Object expression to create an object of an anonymous class
                override fun onFailure( // No communication with server; failed response
                    call: Call<DataModel>,
                    t: Throwable) {
                    view?.dismissProgress()
                    view?.showToast("Failed to communicate with server.")
                }

                override fun onResponse( // Will receive response code from server
                    call: Call<DataModel>,
                    response: Response<DataModel>
                ) {
                    if (response.isSuccessful) { // response code is 200-299
                        if (response.body()?.page?.cards?.size == 0) {
                            view?.dismissProgress()
                            view?.showToast("Sorry, there was an unexpected error.")
                        } else {
                            response.body().let {
                                view?.displayData((it?.page?.cards) as MutableList<CardParent>)
                            }
                        }
                    }
                }

            }
        )
    }
}