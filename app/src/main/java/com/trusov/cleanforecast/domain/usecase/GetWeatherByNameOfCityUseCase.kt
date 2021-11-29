package com.trusov.cleanforecast.domain.usecase

import com.trusov.cleanforecast.domain.repository.WeatherRepository

class GetWeatherByNameOfCityUseCase(private val repository: WeatherRepository) {
    operator fun invoke(nameOfCity: String) = repository.getWeatherByNameOfCity(nameOfCity)
}