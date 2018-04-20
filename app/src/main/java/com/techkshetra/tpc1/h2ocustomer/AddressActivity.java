package com.techkshetra.tpc1.h2ocustomer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

public class AddressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        Toolbar my_toolbar= findViewById(R.id.addrtool);
        setSupportActionBar(my_toolbar);

        }

    private void setSupportActionBar(Toolbar my_toolbar) {
        getSupportActionBar().setTitle("Address");
        getSupportActionBar().setIcon(R.drawable.ic_toolbar);
    }
}
