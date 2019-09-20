package com.example.oppompfive.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.toast

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())

        initListener()
        initData()
    }

    open protected fun initData() {

    }

    open protected fun initListener() {

    }

    abstract fun getLayoutId(): Int


    fun myToast(msg : String) {
        runOnUiThread{
            toast(msg)
        }
    }
}