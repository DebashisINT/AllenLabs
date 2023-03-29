package com.allenlabsfsm.features.newcollectionreport

import com.allenlabsfsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}