package com.example.weatherapi.di;


import com.example.weatherapi.ui.settings.SettingsFragment;
import com.example.weatherapi.ui.today.TodayFragment;
import com.example.weatherapi.ui.weekly.WeeklyFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract TodayFragment contributeTodayFragment();

    @ContributesAndroidInjector
    abstract WeeklyFragment contributeWeeklyFragment();

    @ContributesAndroidInjector
    abstract SettingsFragment contributeSettingsFragment();
}
