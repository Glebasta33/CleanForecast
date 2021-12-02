package com.trusov.cleanforecast.data.network.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


data class DescriptionDto(
    @SerializedName("id")
    @Expose
    private val id: Int = 0,

    @SerializedName("main")
    @Expose
    private val main: String? = null,

    @SerializedName("description")
    @Expose
    private val description: String? = null,

    @SerializedName("icon")
    @Expose
    private val icon: String? = null
)