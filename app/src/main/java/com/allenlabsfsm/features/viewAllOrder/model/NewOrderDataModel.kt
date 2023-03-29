package com.allenlabsfsm.features.viewAllOrder.model

import com.allenlabsfsm.app.domain.NewOrderColorEntity
import com.allenlabsfsm.app.domain.NewOrderGenderEntity
import com.allenlabsfsm.app.domain.NewOrderProductEntity
import com.allenlabsfsm.app.domain.NewOrderSizeEntity
import com.allenlabsfsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

