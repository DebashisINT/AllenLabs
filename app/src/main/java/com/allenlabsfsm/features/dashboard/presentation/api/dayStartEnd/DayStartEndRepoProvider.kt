package com.allenlabsfsm.features.dashboard.presentation.api.dayStartEnd

import com.allenlabsfsm.features.stockCompetetorStock.api.AddCompStockApi
import com.allenlabsfsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}