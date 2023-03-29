package com.allenlabsfsm.features.lead.api

import com.allenlabsfsm.features.NewQuotation.api.GetQuotListRegRepository
import com.allenlabsfsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}