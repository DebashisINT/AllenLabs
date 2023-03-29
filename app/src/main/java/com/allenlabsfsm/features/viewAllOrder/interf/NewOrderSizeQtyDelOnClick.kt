package com.allenlabsfsm.features.viewAllOrder.interf

import com.allenlabsfsm.app.domain.NewOrderGenderEntity
import com.allenlabsfsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}