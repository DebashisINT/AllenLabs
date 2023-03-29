package com.allenlabsfsm.features.viewAllOrder.interf

import com.allenlabsfsm.app.domain.NewOrderColorEntity
import com.allenlabsfsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}