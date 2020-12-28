package com.armando.pos_armando.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class News (
    val title: String ="" ,
    val thumb: String ="",
    val type: String ="",
    val updated_on: String ="",
    val endpoint: String ="",
    val chapter: String = ""
) : Parcelable