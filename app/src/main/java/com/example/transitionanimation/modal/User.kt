package com.example.transitionanimation.modal

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class User(
    var name: String,
    var lastName: String
) : Parcelable