package com.techkshetra.tpc1.h2ocustomer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgotActivity extends AppCompatActivity {
    private Button verifybtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);
        verifybtn=findViewById(R.id.vrfybtn);

        verifybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vrfyintent=new Intent(ForgotActivity.this,ResetPasswordActivity.class);
                startActivity(vrfyintent);
            }
        });
    }
}
