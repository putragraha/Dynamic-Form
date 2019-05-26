package com.android.nsystem.dynamicform.component

import com.android.nsystem.dynamicform.entity.Question

/*
* By Putra Nugraha
*/

fun get(component : Question) : Component =
    when (component.typeField) {
        "date" -> Date(component.key, component.label, component.validation)
        "email" -> Email(component.key, component.label, component.validation)
        "password" -> Password(component.key, component.label, component.validation)
        "select" -> Select(component.key, component.label, component.options)
        "text" -> Text(component.key, component.label, component.validation)
        else -> throw Exception("Type Not Found")
    }