package com.allenlabsfsm.features.location.shopRevisitStatus

import com.allenlabsfsm.base.BaseResponse
import com.allenlabsfsm.features.location.model.ShopDurationRequest
import com.allenlabsfsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}