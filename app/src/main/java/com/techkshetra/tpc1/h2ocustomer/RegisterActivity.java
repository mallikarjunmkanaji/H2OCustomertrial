package com.techkshetra.tpc1.h2ocustomer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {
    private Button createbtn;
    private Button logbackbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        createbtn=findViewById(R.id.createbtn);
        logbackbtn=findViewById(R.id.lgbackbtn);

        createbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent createintent=new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(createintent);
            }
        });

        logbackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logbackintent=new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(logbackintent);
            }
        });
    }
}
