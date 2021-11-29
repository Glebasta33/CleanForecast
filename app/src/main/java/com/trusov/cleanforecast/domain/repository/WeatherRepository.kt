package com.trusov.cleanforecast.domain.repository

import androidx.lifecycle.LiveData
import com.trusov.cleanforecast.domain.model.WeatherEntity

interface WeatherRepository {
    fun getWeatherByNameOfCity(nameOfCity: String): LiveData<WeatherEntity>
    fun getWeatherByCoordinates(latitude: Double, longitude: Double): LiveData<WeatherEntity>
    fun getListOfWeatherByNameOfCity(nameOfCity: String): LiveData<List<WeatherEntity>>
    fun getListOfWeatherByCoordinates(latitude: Double, longitude: Double): LiveData<List<WeatherEntity>>
}