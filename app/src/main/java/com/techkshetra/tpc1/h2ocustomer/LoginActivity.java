package com.techkshetra.tpc1.h2ocustomer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private Button loginbtn;
    private Button regbtn;
    private TextView frgbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginbtn= (Button) findViewById(R.id.lgbtn);
        regbtn= (Button) findViewById(R.id.regbtn);
        frgbtn= (TextView) findViewById(R.id.fgtv);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logintent= new Intent(LoginActivity.this,DashBoardActivity.class);
                startActivity(logintent);
            }
        });
        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regintent= new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(regintent);

            }
        });
        frgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fgintent = new Intent(LoginActivity.this,ForgotActivity.class);
                startActivity(fgintent);

            }
        });

    }
}
