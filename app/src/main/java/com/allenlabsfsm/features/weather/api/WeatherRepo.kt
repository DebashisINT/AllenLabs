package com.allenlabsfsm.features.weather.api

import com.allenlabsfsm.base.BaseResponse
import com.allenlabsfsm.features.task.api.TaskApi
import com.allenlabsfsm.features.task.model.AddTaskInputModel
import com.allenlabsfsm.features.weather.model.ForeCastAPIResponse
import com.allenlabsfsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}