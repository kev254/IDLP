package com.example.idlp.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.idlp.R;
import com.example.idlp.authentication.Login;
import com.example.idlp.authentication.SignUp;

public class StudentInformationRegistration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_infomation_registration);
        Button next=(Button) findViewById(R.id.studentNext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StudentInformationRegistration.this,
                        CareGiverInformationRegistration.class));
            }
        });
        Spinner grade=(Spinner) findViewById(R.id.student_gradeSpinner);
        Spinner typeOfDisability=(Spinner) findViewById(R.id.student_disabilitySpinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,
                R.array.Grade,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        grade.setAdapter(adapter);
        ArrayAdapter<CharSequence> adapter2=ArrayAdapter.createFromResource(this,
                R.array.DescriptionOfDisability,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        typeOfDisability.setAdapter(adapter2);
    }
}