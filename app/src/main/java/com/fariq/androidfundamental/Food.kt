package com.fariq.androidfundamental

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Food (
    var name : String? = "",
    var kkal : Int? = 0,
    var price : Double? = 0.0,
    var image : Int? = 0,
    var desc : String = "",
    var favorite : Boolean = false
    ) : Parcelable