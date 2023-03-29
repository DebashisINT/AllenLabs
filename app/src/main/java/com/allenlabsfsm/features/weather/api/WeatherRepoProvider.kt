package com.allenlabsfsm.features.weather.api

import com.allenlabsfsm.features.task.api.TaskApi
import com.allenlabsfsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}