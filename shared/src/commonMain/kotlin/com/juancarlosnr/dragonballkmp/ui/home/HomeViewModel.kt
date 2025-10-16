package com.juancarlosnr.dragonballkmp.ui.home

import com.juancarlosnr.dragonballkmp.domain.Repository
import com.juancarlosnr.dragonballkmp.domain.model.CharacterModel
import com.rickclephas.kmp.nativecoroutines.NativeCoroutinesState
import com.rickclephas.kmp.observableviewmodel.MutableStateFlow
import com.rickclephas.kmp.observableviewmodel.ViewModel
import com.rickclephas.kmp.observableviewmodel.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.withContext
import org.koin.core.logger.Logger


class HomeViewModel(
    val repository: Repository
): ViewModel() {

    private val _example = MutableStateFlow<String>(viewModelScope,"Pepe")
    @NativeCoroutinesState
    val example: StateFlow<String> = _example

    private val _characters = MutableStateFlow<List<CharacterModel>>(viewModelScope,emptyList())
    @NativeCoroutinesState
    val characters: StateFlow<List<CharacterModel>> = _characters

    init {
        viewModelScope.launch {
            co.touchlab.kermit.Logger.d("respuesta 1")
            val response = withContext(Dispatchers.IO){
                repository.getCharacters()
            }
            co.touchlab.kermit.Logger.d("respuesta"+response)
            _characters.value = response
        }

    }

}