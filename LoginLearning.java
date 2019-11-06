package com.anhariasrilgmail.elerningasril;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginLearning extends AppCompatActivity {
Button buttonMatpel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_learning);
        buttonMatpel = (Button) findViewById(R.id.btn_matpel);
        buttonMatpel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent matpel = new Intent(LoginLearning.this,MenuMatpel.class);
                startActivity(matpel);
            }
        });
    }
}
