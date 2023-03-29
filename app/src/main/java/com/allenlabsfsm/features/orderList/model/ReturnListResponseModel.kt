package com.allenlabsfsm.features.orderList.model

import com.allenlabsfsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}