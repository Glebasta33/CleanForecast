package com.trusov.cleanforecast.data.network.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


data class SystemInfoDto(
    @SerializedName("type")
    @Expose
    private val type: Int = 0,

    @SerializedName("id")
    @Expose
    private val id: Int = 0,

    @SerializedName("country")
    @Expose
    private val country: String? = null,

    @SerializedName("sunrise")
    @Expose
    private val sunrise: Int = 0,

    @SerializedName("sunset")
    @Expose
    private val sunset: Int = 0
)