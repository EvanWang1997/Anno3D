package com.example.anno3d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AnnotateFirst extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.annotate_blank);
    }

    public void rotateOnce(View view) {
        setContentView(R.layout.annotate_rotate_once);
    }

    public void rotateTwice(View view) {
        setContentView(R.layout.annotate_rotate_twice);
    }

    public void rotateBack(View view) {
        setContentView(R.layout.annotate_blank);
    }

    public void annotateOnce(View view) {
        setContentView(R.layout.annotate_single);
    }

    public void annotateRotate(View view) {
        setContentView(R.layout.annotate_single_rotated);
    }

    public void exportAnnofile(View view) {
        setContentView(R.layout.transfer_anno_file);
    }
    public void exportPresentation(View view) {
        setContentView(R.layout.exported_pdf_file);
    }


}
