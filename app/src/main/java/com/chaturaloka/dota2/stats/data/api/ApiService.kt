package com.chaturaloka.dota2.stats.data.api

import com.chaturaloka.dota2.stats.data.model.Hero
import io.reactivex.Single

interface ApiService {

    fun getHeroes(): Single<List<Hero>>
}