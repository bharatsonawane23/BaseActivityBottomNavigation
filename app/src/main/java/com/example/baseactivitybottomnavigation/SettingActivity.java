package com.example.baseactivitybottomnavigation;

import android.os.Bundle;

public class SettingActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    int getLayoutId() {
        return R.layout.activity_setting;
    }

    @Override
    int getBottomNavigationMenuItemId() {
        return R.id.menu_setting;
    }
}