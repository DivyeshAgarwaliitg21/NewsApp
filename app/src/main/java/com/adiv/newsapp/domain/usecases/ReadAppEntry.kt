package com.adiv.newsapp.domain.usecases

import com.adiv.newsapp.domain.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val localUserManager: LocalUserManager
) {
     operator fun invoke(): Flow<Boolean> {
        return localUserManager.ReadAppEntry()
    }

}