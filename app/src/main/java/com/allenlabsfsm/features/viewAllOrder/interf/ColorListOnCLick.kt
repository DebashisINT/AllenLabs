package com.allenlabsfsm.features.viewAllOrder.interf

import com.allenlabsfsm.app.domain.NewOrderGenderEntity
import com.allenlabsfsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}