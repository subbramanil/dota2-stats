package com.chaturaloka.dota2.stats.data.api

class ApiHelper(private val apiService: ApiService) {

    fun getHeroes() = apiService.getHeroes()

}