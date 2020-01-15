package com.wojciszke.ryanair.data.model.app

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SearchFormData(
        val origin: String,
        val destination: String,
        val dateOut: String,
        val adults: Int,
        val teens: Int,
        val children: Int
) : Parcelable