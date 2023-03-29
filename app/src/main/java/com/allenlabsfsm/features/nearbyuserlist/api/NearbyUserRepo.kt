package com.allenlabsfsm.features.nearbyuserlist.api

import com.allenlabsfsm.app.Pref
import com.allenlabsfsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.allenlabsfsm.features.newcollection.model.NewCollectionListResponseModel
import com.allenlabsfsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}