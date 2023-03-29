package com.allenlabsfsm.features.stockAddCurrentStock.api

import com.allenlabsfsm.base.BaseResponse
import com.allenlabsfsm.features.location.model.ShopRevisitStatusRequest
import com.allenlabsfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.allenlabsfsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.allenlabsfsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.allenlabsfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}