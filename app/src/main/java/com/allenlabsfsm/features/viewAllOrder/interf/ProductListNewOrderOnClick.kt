package com.allenlabsfsm.features.viewAllOrder.interf

import com.allenlabsfsm.app.domain.NewOrderGenderEntity
import com.allenlabsfsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}