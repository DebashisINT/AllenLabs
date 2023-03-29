package com.allenlabsfsm.features.login.model.productlistmodel

import com.allenlabsfsm.app.domain.ModelEntity
import com.allenlabsfsm.app.domain.ProductListEntity
import com.allenlabsfsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}