package com.allenlabsfsm.features.photoReg.present

import com.allenlabsfsm.app.domain.ProspectEntity
import com.allenlabsfsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}