package com.example.anno3d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Scroll_File extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll__file);
    }

    public void goToProject(View view) {
        Intent intent = new Intent(this,AnnotateFirst.class);
        startActivity(intent);
    }


}