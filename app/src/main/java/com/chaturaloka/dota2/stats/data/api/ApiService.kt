package com.chaturaloka.dota2.stats.data.api

import com.chaturaloka.dota2.stats.data.model.Hero
import io.reactivex.Single
import okhttp3.Call
import retrofit2.http.GET

interface ApiService {

    @GET("/heroes")
    fun getHeroList(): Call

    fun getHeroes(): Single<List<Hero>>
}