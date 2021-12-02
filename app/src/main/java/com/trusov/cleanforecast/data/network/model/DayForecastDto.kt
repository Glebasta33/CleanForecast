package com.trusov.cleanforecast.data.network.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


data class DayForecastDto(
    @SerializedName("coord")
    @Expose
    private val coordinates: CoordinatesDto? = null,

    @SerializedName("weather")
    @Expose
    private val description: List<DescriptionDto>? = null,

    @SerializedName("base")
    @Expose
    private val base: String? = null,

    @SerializedName("main")
    @Expose
    private val mainInfo: MainInfoDto? = null,

    @SerializedName("visibility")
    @Expose
    private val visibility: Int = 0,

    @SerializedName("wind")
    @Expose
    private val wind: WindDto? = null,

    @SerializedName("rain")
    @Expose
    private val rain: RainDto? = null,

    @SerializedName("clouds")
    @Expose
    private val clouds: CloudsDto? = null,

    @SerializedName("dt")
    @Expose
    private val dt: Int = 0,

    @SerializedName("sys")
    @Expose
    private val systemInfo: SystemInfoDto? = null,

    @SerializedName("timezone")
    @Expose
    private val timezone: Int = 0,

    @SerializedName("id")
    @Expose
    private val id: Int = 0,

    @SerializedName("name")
    @Expose
    private val name: String? = null,

    @SerializedName("cod")
    @Expose
    private val cod: Int = 0
)