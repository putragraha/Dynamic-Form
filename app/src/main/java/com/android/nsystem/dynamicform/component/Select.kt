package com.android.nsystem.dynamicform.component

import android.app.Activity
import com.android.nsystem.dynamicform.entity.Option
import org.jetbrains.anko.AnkoContext

/*
* By Putra Nugraha
*/

data class Select(
    val key : String,
    val label : String,
    val options : List<Option>?
) : Component {

    override fun build(ui: AnkoContext<Activity>) {
        println("Select")
    }

}