package com.allenlabsfsm.features.location.api

import com.allenlabsfsm.features.location.shopdurationapi.ShopDurationApi
import com.allenlabsfsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}