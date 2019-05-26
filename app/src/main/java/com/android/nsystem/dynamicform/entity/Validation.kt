package com.android.nsystem.dynamicform.entity

/*
* By Putra Nugraha
*/

data class Validation (
    val required : Boolean?,
    val minLength : Int?,
    val exactLength : Int?
)