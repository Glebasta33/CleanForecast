package com.trusov.cleanforecast.data.network.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


data class MainInfoDto(
    @SerializedName("temp")
    @Expose
    private val temp: Double = 0.0,

    @SerializedName("feels_like")
    @Expose
    private val feelsLike: Double = 0.0,

    @SerializedName("temp_min")
    @Expose
    private val tempMin: Double = 0.0,

    @SerializedName("temp_max")
    @Expose
    private val tempMax: Double = 0.0,

    @SerializedName("pressure")
    @Expose
    private val pressure: Int = 0,

    @SerializedName("humidity")
    @Expose
    private val humidity: Int = 0,

    @SerializedName("sea_level")
    @Expose
    private val seaLevel: Int = 0,

    @SerializedName("grnd_level")
    @Expose
    private val grndLevel: Int = 0
)