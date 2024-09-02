package com.adiv.newsapp.domain.usecases

import com.adiv.newsapp.domain.LocalUserManager

class SaveAppEntry(
    private val localUserManager: LocalUserManager
){
    suspend operator fun invoke(){
        localUserManager.SaveAppEntry()
    }

}