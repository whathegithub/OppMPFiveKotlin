package com.example.oppompfive.manager

import com.example.oppompfive.R
import com.example.oppompfive.base.BaseFragment
import com.example.oppompfive.ui.fragment.HomeFragment
import com.example.oppompfive.ui.fragment.MVFragment
import com.example.oppompfive.ui.fragment.VBangFragment
import com.example.oppompfive.ui.fragment.YuedanFragment

/**
 * 单例
 */
//class FragmentUtil private constructor(){
//
//
//
//    //伴生对象
//    companion object{
//        val fragmentUtil by lazy { FragmentUtil }
//    }
//
//}



object FragmentUtil {

    val homeFragment : HomeFragment by lazy { HomeFragment() }
    val mvFragment : MVFragment by lazy { MVFragment() }
    val vbangFragment : VBangFragment by lazy { VBangFragment() }
    val yuedanFragment : YuedanFragment by lazy { YuedanFragment() }

    fun getFragment(tabId:Int):BaseFragment?{
        when(tabId) {
            R.id.tab_home -> return homeFragment
            R.id.tab_mv -> return mvFragment
            R.id.tab_vbang -> return vbangFragment
            R.id.tab_mine -> return yuedanFragment
        }
        return null
    }
}