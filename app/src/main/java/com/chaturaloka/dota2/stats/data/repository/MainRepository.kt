package com.chaturaloka.dota2.stats.data.repository

import com.chaturaloka.dota2.stats.data.api.ApiHelper
import com.chaturaloka.dota2.stats.data.model.Hero
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getHeroes(): Single<List<Hero>> {
        return apiHelper.getHeroes()
    }

}