package com.example.oppompfive

import androidx.appcompat.widget.Toolbar
import com.example.oppompfive.base.BaseActivity
import com.example.oppompfive.manager.FragmentUtil
import com.example.oppompfive.manager.ToolbarManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.find

class MainActivity : BaseActivity() ,ToolbarManager{
    override val toolbar: Toolbar by lazy {find<Toolbar>(R.id.toolbar)}


    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initData() {
        super.initData()

        initMainToolbar(toolbar)
    }


    override fun initListener() {
        super.initListener()


        bottomBar.setOnTabSelectListener() {

            val beginTransaction = supportFragmentManager.beginTransaction()
            beginTransaction.replace(R.id.framelayout, FragmentUtil.getFragment(it)!!,it.toString())
            beginTransaction.commit()

        }
    }





}
