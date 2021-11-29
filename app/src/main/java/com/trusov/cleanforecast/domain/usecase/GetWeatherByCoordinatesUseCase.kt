package com.trusov.cleanforecast.domain.usecase

import com.trusov.cleanforecast.domain.repository.WeatherRepository

class GetWeatherByCoordinatesUseCase(private val repository: WeatherRepository) {
    operator fun invoke(
        latitude: Double,
        longitude: Double
    ) = repository.getWeatherByCoordinates(
        latitude,
        longitude
    )
}