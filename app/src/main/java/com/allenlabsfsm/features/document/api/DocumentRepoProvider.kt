package com.allenlabsfsm.features.document.api

import com.allenlabsfsm.features.dymanicSection.api.DynamicApi
import com.allenlabsfsm.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}