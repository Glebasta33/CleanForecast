package com.trusov.cleanforecast.data.network.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


data class RainDto(

    @SerializedName("1h")
    @Expose
    private val _1h: Double = 0.0
)