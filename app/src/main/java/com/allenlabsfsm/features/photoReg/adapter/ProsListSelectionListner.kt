package com.allenlabsfsm.features.photoReg.adapter

import com.allenlabsfsm.features.photoReg.model.ProsCustom
import com.allenlabsfsm.features.photoReg.model.UserListResponseModel

interface ProsListSelectionListner {
    fun getInfo(obj: ProsCustom)
}