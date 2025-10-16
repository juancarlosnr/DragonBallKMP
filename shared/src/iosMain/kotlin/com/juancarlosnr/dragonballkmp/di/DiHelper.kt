package com.juancarlosnr.dragonballkmp.di

import com.juancarlosnr.dragonballkmp.domain.Repository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class DiHelper : KoinComponent {
    val repository: Repository by inject()
}