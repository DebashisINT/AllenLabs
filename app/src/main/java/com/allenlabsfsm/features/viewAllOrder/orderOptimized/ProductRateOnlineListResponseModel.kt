package com.allenlabsfsm.features.viewAllOrder.orderOptimized

import com.allenlabsfsm.app.domain.ProductOnlineRateTempEntity
import com.allenlabsfsm.base.BaseResponse
import com.allenlabsfsm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}