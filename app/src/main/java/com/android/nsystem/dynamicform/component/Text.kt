package com.android.nsystem.dynamicform.component

import android.app.Activity
import com.android.nsystem.dynamicform.entity.Validation
import org.jetbrains.anko.AnkoContext

/*
* By Putra Nugraha
*/

data class Text(
    val key : String,
    val label : String,
    val validation : Validation
) : Component {

    override fun build(ui: AnkoContext<Activity>) {
        println("Text")
    }

}