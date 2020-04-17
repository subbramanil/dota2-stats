package com.chaturaloka.dota2.stats.data.model

import com.google.gson.annotations.SerializedName

data class Hero(
    @SerializedName("id")
    val id: Number = 0,
    @SerializedName("name")
    val name: String = "",
    @SerializedName("localized_name")
    val localized_name: String = "",
    @SerializedName("primary_attr")
    val primary_attr: String = "",
    @SerializedName("attack_type")
    val attack_type: String = "",
    @SerializedName("roles")
    val roles: List<String> = emptyList(),
    @SerializedName("legs")
    val legs: Number = 0
)