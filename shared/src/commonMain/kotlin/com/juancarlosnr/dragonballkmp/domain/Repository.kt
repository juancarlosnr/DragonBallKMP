package com.juancarlosnr.dragonballkmp.domain

import com.juancarlosnr.dragonballkmp.domain.model.CharacterModel

interface Repository {
    suspend fun getCharacters():List<CharacterModel>
}