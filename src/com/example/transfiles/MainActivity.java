package com.example.transfiles;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;
import android.os.Build;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost host = getTabHost();
    	//Añadimos cada tab, que al ser pulsadas abren sus respectivas Activities
    	host.addTab(host.newTabSpec("tab_1").setIndicator("MENU").setContent(new Intent(this, MenuTab.class)));
    	host.addTab(host.newTabSpec("tab_2").setIndicator("CONFIGURACION").setContent(new Intent(this, SettingTab.class)));
    }

}
    