package com.trusov.cleanforecast.domain.usecase

import com.trusov.cleanforecast.domain.repository.WeatherRepository

class GetListOfWeatherByCoordinatesUseCase(private val repository: WeatherRepository) {
    operator fun invoke(
        latitude: Double,
        longitude: Double
    ) = repository.getListOfWeatherByCoordinates(
        latitude,
        longitude
    )
}