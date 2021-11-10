package com.example.baseactivitybottomnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public abstract class BaseActivity extends AppCompatActivity {


    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        bottomNavigationView = findViewById(R.id.bottomNavigation);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            selectBottomNavigationBarItem(item.getItemId());
            switch (item.getItemId()) {
                case R.id.menu_home:
                    Intent homeIntent = new Intent(BaseActivity.this, MainActivity.class);
                    startActivity(homeIntent);
                    finish();
                    break;
                case R.id.menu_notification:
                    Intent notificationIntent = new Intent(BaseActivity.this, NotificationActivity.class);
                    startActivity(notificationIntent);
                    finish();
                    break;
                case R.id.menu_setting:
                    Intent settingIntent = new Intent(BaseActivity.this, SettingActivity.class);
                    startActivity(settingIntent);
                    finish();
                    break;

            }
            return true;
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        updateNavigationBarState();
    }

    private void updateNavigationBarState() {
        int actionId = getBottomNavigationMenuItemId();
        selectBottomNavigationBarItem(actionId);
    }

    void selectBottomNavigationBarItem(int itemId) {
        MenuItem item = bottomNavigationView.getMenu().findItem(itemId);
        item.setChecked(true);
    }

    @Override
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    abstract int getLayoutId();

    abstract int getBottomNavigationMenuItemId();
}