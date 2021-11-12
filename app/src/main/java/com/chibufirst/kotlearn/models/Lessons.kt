package com.chibufirst.kotlearn.models

import androidx.annotation.DrawableRes
import java.io.Serializable

data class Lessons(val topic: String, var content: String = "", @DrawableRes var image: Int = 0) : Serializable
