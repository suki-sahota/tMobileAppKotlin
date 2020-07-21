package com.example.tmobileappkotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tmobileappkotlin.R
import com.example.tmobileappkotlin.model.CardParent
import com.example.tmobileappkotlin.model.CustomAdapter
import com.example.tmobileappkotlin.presenter.Presenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), IMainActivity {

//    private val TAG = MainActivity::class.java.simpleName // "MainActivity"

    val presenter: Presenter by lazy { Presenter() }
    val adapter: CustomAdapter by lazy { CustomAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showProgress()
        onBind()
        initView()
        initNetwork()
        callNetwork()
    }

    override fun onBind() {
        presenter.onBind(this) // Calls constructor in lazy block
    }

    override fun initView() {
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = adapter // Calls constructor in lazy block
    }

    override fun initNetwork() {
        presenter.initNetwork()
    }

    override fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun showProgress() {
        progress_bar.visibility = View.VISIBLE
    }

    override fun dismissProgress() {
        progress_bar.visibility = View.GONE
    }

    override fun callNetwork() {
        presenter.makeCall()
    }

    override fun displayData(dataSet: MutableList<CardParent>) {
        adapter.dataSet = dataSet
        dismissProgress()
    }
}