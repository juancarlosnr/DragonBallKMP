package com.juancarlosnr.dragonballkmp.di

import org.koin.core.context.startKoin
import org.koin.core.module.Module

fun initKoin() = initKoin(
    emptyList()
)
fun initKoin(extraModules:List<Module>){
    startKoin {
        modules(
            dataModule,
            *extraModules.toTypedArray()
        )
    }
}