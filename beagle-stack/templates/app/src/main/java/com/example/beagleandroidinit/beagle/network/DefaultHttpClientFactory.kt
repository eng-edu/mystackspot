package com.example.beagleandroidinit.beagle.network

import br.com.zup.beagle.android.annotation.BeagleComponent
import br.com.zup.beagle.android.networking.HttpClient
import br.com.zup.beagle.android.networking.HttpClientFactory

@BeagleComponent
class DefaultHttpClientFactory: HttpClientFactory {
    override fun create(): HttpClient {
        return HttpClientDefault()
    }
}
