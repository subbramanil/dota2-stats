package com.chaturaloka.dota2.stats.data.api

import com.chaturaloka.dota2.stats.data.model.Hero
import com.itkacher.okhttpprofiler.OkHttpProfilerInterceptor
import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Single
import okhttp3.Call
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class ApiServiceImpl : ApiService {

    private var okHttpClient = OkHttpClient().newBuilder()
        .addInterceptor(OkHttpProfilerInterceptor())
        .addInterceptor(HttpLoggingInterceptor())
        .build()

    private var retrofit = Retrofit.Builder()
        .baseUrl("https://api.opendota.com/api")
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build();

    private val dota2APIService = retrofit.create(ApiService::class.java)
/*

    override fun getHeroList(): Call {
        val call = dota2APIService.getHeroList()
        return  call.execute().body
    }
*/

    override fun getHeroes(): Single<List<Hero>> {
        return Rx2AndroidNetworking.get("https://api.opendota.com/api/heroes")
            .setOkHttpClient(okHttpClient)
            .build()
            .getObjectListSingle(Hero::class.java)
    }

}