package com.example.homework3

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Date (
    val ImageView:Int,
    val itemTite:String,
    val diteil:String,
    val nickname:String,
    val price:Int,
    val Address:String,
    val Chat:Int,
    val Heart:Int
) : Parcelable
