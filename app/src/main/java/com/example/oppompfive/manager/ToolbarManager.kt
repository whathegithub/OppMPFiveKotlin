package com.example.oppompfive.manager

import android.content.Intent
import android.graphics.Color
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import com.example.oppompfive.R
import com.example.oppompfive.ui.activity.SettingActivity
import java.nio.file.Files.find

interface ToolbarManager {

    val toolbar : Toolbar


    fun initMainToolbar(toolbar : Toolbar){
        toolbar.setTitle("主页")
        toolbar.setTitleTextColor(Color.WHITE)
        toolbar.inflateMenu(R.menu.menu_main)

        //第一种写法
//        toolbar.setOnMenuItemClickListener(object :Toolbar.OnMenuItemClickListener{
//            override fun onMenuItemClick(item: MenuItem?): Boolean {
//                when(item?.itemId){
//                    R.id.menu_setting -> toolbar.context.startActivity(Intent(toolbar.context,SettingActivity::class.java))
//                }
//                return true
//            }
//        })

        //第二种写法
//        toolbar.setOnMenuItemClickListener{a->
//            when(a?.itemId){
//                R.id.menu_setting -> toolbar.context.startActivity(Intent(toolbar.context,SettingActivity::class.java))
//            }
//            true
//        }

        //第三种写法
        toolbar.setOnMenuItemClickListener{
            when(it?.itemId){
               R.id.menu_setting -> toolbar.context.startActivity(Intent(toolbar.context,SettingActivity::class.java))
            }
            true
        }
    }




    fun initSettingToolbar(toolbar: Toolbar) {
        toolbar.setTitle("设置")
        toolbar.setTitleTextColor(Color.WHITE)

    }

}