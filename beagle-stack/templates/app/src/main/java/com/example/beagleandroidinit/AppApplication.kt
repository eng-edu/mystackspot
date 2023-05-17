package com.example.beagleandroidinit

import android.app.Application

class AppApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        BeagleSetup().init(this)
    }
}