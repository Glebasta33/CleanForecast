package com.trusov.cleanforecast.data.network.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


data class CloudsDto(
    @SerializedName("all")
    @Expose
    private var all: Int = 0
)