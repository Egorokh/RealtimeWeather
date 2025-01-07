package com.example.realtimeweather.api

data class Location (
    val region: String,
    val country: String,
    val lat: String,
    val lon: String,
    val tz_id: String,
    val localtime_epoch: String,
    val localtime: String,
)
