package com.arkan.recipecatalogue.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Recipes(
    val name: String,
    val category: String,
    val description: String,
    val ingredients: String,
    val instructions: String,
    val photo: String,
    val price: String,
    val calories: String,
    val carbo: String,
    val protein: String
) : Parcelable
