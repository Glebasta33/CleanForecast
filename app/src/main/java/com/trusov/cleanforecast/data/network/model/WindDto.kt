package com.trusov.cleanforecast.data.network.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


data class WindDto(
    @SerializedName("speed")
    @Expose
    private val speed: Double = 0.0,

    @SerializedName("deg")
    @Expose
    private val deg: Int = 0,

    @SerializedName("gust")
    @Expose
    private val gust: Double = 0.0
)