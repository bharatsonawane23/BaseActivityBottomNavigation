package com.example.baseactivitybottomnavigation;

import android.os.Bundle;

public class NotificationActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    int getLayoutId() {
        return R.layout.activity_notification;
    }

    @Override
    int getBottomNavigationMenuItemId() {
        return R.id.menu_notification;
    }
}