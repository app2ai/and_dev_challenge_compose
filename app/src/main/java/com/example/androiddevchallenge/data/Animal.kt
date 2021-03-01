package com.example.androiddevchallenge.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Animal(
    val nickName: String,
    val name: String,
    val imageUrl: String,
    val contentDesc: String
) : Parcelable