package com.allenlabsfsm.features.stockAddCurrentStock.api

import com.allenlabsfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.allenlabsfsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}