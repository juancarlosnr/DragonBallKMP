package com.juancarlosnr.dragonballkmp.data

import com.juancarlosnr.dragonballkmp.data.remote.ApiService
import com.juancarlosnr.dragonballkmp.domain.Repository
import com.juancarlosnr.dragonballkmp.domain.model.CharacterModel

class RepositoryImpl(
    private val apiService: ApiService
) : Repository {
    override suspend fun getCharacters(): List<CharacterModel> {
        return apiService.getAllCharacters().items.map { characterResponse ->
            characterResponse.toDomain()
        }
    }
}