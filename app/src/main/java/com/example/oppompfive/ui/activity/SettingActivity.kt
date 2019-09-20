package com.example.oppompfive.ui.activity

import androidx.appcompat.widget.Toolbar
import com.example.oppompfive.R
import com.example.oppompfive.base.BaseActivity
import com.example.oppompfive.manager.ToolbarManager
import org.jetbrains.anko.find

class SettingActivity : BaseActivity(),ToolbarManager {
    override val toolbar: Toolbar by lazy { find<Toolbar>(R.id.toolbar) }

    override fun getLayoutId(): Int {
        return R.layout.activity_setting
    }


    override fun initData() {
        super.initData()

        initSettingToolbar(toolbar)
    }

}