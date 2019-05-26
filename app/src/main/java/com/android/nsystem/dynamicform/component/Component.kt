package com.android.nsystem.dynamicform.component

import android.app.Activity
import org.jetbrains.anko.AnkoContext

/*
* By Putra Nugraha
*/

interface Component {
    fun build(ui: AnkoContext<Activity>)
}