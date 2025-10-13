package com.juancarlosnr.dragonballkmp.di

import com.juancarlosnr.dragonballkmp.ui.home.HomeViewModel
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val uiModule = module {
    factoryOf(::HomeViewModel)
}