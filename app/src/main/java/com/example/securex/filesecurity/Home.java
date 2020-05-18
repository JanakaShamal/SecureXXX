package com.example.securex.filesecurity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.securex.R;

public class Home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        final Button img=(Button)findViewById(R.id.img);
        final Button video=(Button)findViewById(R.id.video);
        final Button audio=(Button)findViewById(R.id.audio);
        final Button folder=(Button)findViewById(R.id.folder);
        final Button txt=(Button)findViewById(R.id.txt);
        final Button any=(Button)findViewById(R.id.any);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(Home.this,ImageEncrypt.class);
                startActivity(n);

            }
        });
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(Home.this,VideoEncrypt.class);
                startActivity(n);

            }
        });
        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(Home.this,AudioEncrypt.class);
                startActivity(n);

            }
        });
        folder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(Home.this,FolderEncrypt.class);
                startActivity(n);

            }
        });
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(Home.this,TextEncyrpt.class);
                startActivity(n);

            }
        });
        any.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(Home.this,FormatEncryption.class);
                startActivity(n);

            }
        });
    }

}
