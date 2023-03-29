package com.allenlabsfsm.features.location.shopRevisitStatus

import com.allenlabsfsm.features.location.shopdurationapi.ShopDurationApi
import com.allenlabsfsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}