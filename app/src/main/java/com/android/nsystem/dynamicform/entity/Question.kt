package com.android.nsystem.dynamicform.entity

/*
* By Putra Nugraha
*/

class Question (
    val key : String,
    val label : String,
    val typeField : String,
    val validation : Validation,
    val options : List<Option>?
)