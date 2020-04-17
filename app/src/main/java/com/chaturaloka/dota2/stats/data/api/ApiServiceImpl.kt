package com.chaturaloka.dota2.stats.data.api

import com.chaturaloka.dota2.stats.data.model.Hero
import com.itkacher.okhttpprofiler.OkHttpProfilerInterceptor
import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Single
import okhttp3.OkHttpClient


class ApiServiceImpl : ApiService {

    private var okHttpClient = OkHttpClient().newBuilder()
        .addInterceptor(OkHttpProfilerInterceptor())
        .build()

    override fun getHeroes(): Single<List<Hero>> {
        return Rx2AndroidNetworking.get("https://api.opendota.com/api/heroes")
            .setOkHttpClient(okHttpClient)
            .build()
            .getObjectListSingle(Hero::class.java)
    }

}