package com.example.weatherapi.ui;


import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;


import com.example.weatherapi.MainActivity;
import com.example.weatherapi.R;
import com.example.weatherapi.ui.settings.SettingsFragment;
import com.example.weatherapi.ui.today.TodayFragment;
import com.example.weatherapi.ui.weekly.WeeklyFragment;

import javax.inject.Inject;

public class NavigationController {
    private final int containerId;
    private final FragmentManager fragmentManager;

    @Inject
    public NavigationController(MainActivity mainActivity) {
        this.containerId = R.id.nav_host_fragment;
        this.fragmentManager = mainActivity.getSupportFragmentManager();
    }

    public void navigateToHome() {
        String tag = "home";
        TodayFragment homeFragment = TodayFragment.create();
        fragmentManager.beginTransaction()
                .replace(containerId, homeFragment, tag)
                .addToBackStack(null)
                .commitAllowingStateLoss();
    }

    public void navigateToWeekly() {
        String tag = "weekly";
        WeeklyFragment weeklyFragment = WeeklyFragment.create();
        fragmentManager.beginTransaction()
                .replace(containerId, weeklyFragment, tag)
                .addToBackStack(null)
                .commitAllowingStateLoss();
    }

    public void navigateToSettings() {
        String tag = "settings";
        DialogFragment settingsFragment = SettingsFragment.create();
        settingsFragment.show(fragmentManager, tag);
    }
}
