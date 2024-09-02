package com.adiv.newsapp.domain

import kotlinx.coroutines.flow.Flow

interface LocalUserManager {

    suspend fun SaveAppEntry()

    fun ReadAppEntry(): Flow<Boolean>
}