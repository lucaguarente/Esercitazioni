package com.example.soldati;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Soldati extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soldati);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_soldati, menu);
        return true;
    }
}
