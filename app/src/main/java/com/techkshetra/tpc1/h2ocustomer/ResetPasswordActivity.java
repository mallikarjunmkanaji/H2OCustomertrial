package com.techkshetra.tpc1.h2ocustomer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResetPasswordActivity extends AppCompatActivity {
    private Button resetbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        resetbutton=findViewById(R.id.rstbtn);
        resetbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resetintent=new Intent(ResetPasswordActivity.this,LoginActivity.class);
                startActivity(resetintent);
            }
        });
    }
}
