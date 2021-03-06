package com.project.csci3130.dalrs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

/**
 * The type Required course.
 */
public class RequiredCourse extends AppCompatActivity {
    private Button CS;
    private Button AppliedCS;
    private Button Mathematics;

    /**
     * The My view.
     */
    View MyView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_required_course);

        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        CS = findViewById(R.id.CS);
        AppliedCS = findViewById(R.id.AppliedCS);
        Mathematics = findViewById(R.id.Math);

        CS.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RequiredCourse.this,CSPDFViewer.class));
            }
        });

        AppliedCS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RequiredCourse.this,AppliedCSPDF.class));
            }
        });

        Mathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RequiredCourse.this,MathematicsPDF.class));
            }
        });

    }
}
