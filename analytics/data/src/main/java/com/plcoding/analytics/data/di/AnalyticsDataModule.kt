package com.plcoding.analytics.data.di

import com.plcoding.analytics.data.RoomAnalyticsRepository
import com.plcoding.analytics.domain.AnalyticsRepository
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val analyticsModule = module {
    singleOf(::RoomAnalyticsRepository).bind<AnalyticsRepository>()
}