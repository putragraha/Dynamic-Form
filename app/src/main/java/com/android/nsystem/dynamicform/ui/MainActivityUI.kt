package com.android.nsystem.dynamicform.ui

import android.app.Activity
import android.view.View
import com.android.nsystem.dynamicform.component.Component
import com.android.nsystem.dynamicform.component.get
import com.android.nsystem.dynamicform.entity.Question
import org.jetbrains.anko.*

/*
* By Putra Nugraha
*/

class MainActivityUI(val questions : List<Question>) : AnkoComponent<Activity> {

    override fun createView(ui: AnkoContext<Activity>): View {
        return ui.verticalLayout {
            for (question in questions) {
                val component : Component = get(question)
                component.build(ui)
            }
            textView {
                text = "Hey"
                textAlignment = View.TEXT_ALIGNMENT_CENTER
            }.lparams(width = matchParent) {
                margin = dip(12)
                topMargin = dip(30)
            }
        }
    }

}