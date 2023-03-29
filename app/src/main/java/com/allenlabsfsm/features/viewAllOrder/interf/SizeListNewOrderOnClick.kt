package com.allenlabsfsm.features.viewAllOrder.interf

import com.allenlabsfsm.app.domain.NewOrderProductEntity
import com.allenlabsfsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}