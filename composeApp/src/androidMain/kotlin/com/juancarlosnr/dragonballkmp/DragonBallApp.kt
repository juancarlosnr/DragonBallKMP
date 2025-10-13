package com.juancarlosnr.dragonballkmp

import android.app.Application
import com.juancarlosnr.dragonballkmp.di.initKoin
import com.juancarlosnr.dragonballkmp.di.uiModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class DragonBallApp: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin(
            extraModules = listOf(
                uiModule
            ),
            config = {
                androidLogger()
                androidContext(this@DragonBallApp)
            }
        )
    }

}