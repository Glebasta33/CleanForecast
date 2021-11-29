package com.trusov.cleanforecast.domain.usecase

import com.trusov.cleanforecast.domain.repository.WeatherRepository

class GetListOfWeatherByNameOfCity(private val repository: WeatherRepository) {
    operator fun invoke(nameOfCity: String) = repository.getListOfWeatherByNameOfCity(nameOfCity)
}