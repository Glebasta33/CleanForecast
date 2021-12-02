package com.trusov.cleanforecast.data.network.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


data class CoordinatesDto(
    @SerializedName("lon")
    @Expose
    private var lon: Double = 0.0,

    @SerializedName("lat")
    @Expose
    private var lat: Double = 0.0
)