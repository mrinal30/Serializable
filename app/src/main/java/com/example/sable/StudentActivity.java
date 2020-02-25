package com.example.sable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class StudentActivity extends AppCompatActivity {
    TextView t1,t2,t3,t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        t1=findViewById(R.id.text1);
        t2=findViewById(R.id.text2);
        t3=findViewById(R.id.text3);
        t4=findViewById(R.id.text4);


        Intent intent= getIntent();


        Bundle bundle=getIntent().getExtras();

        if (bundle==null){

            return;
        }

        Student student= (Student) bundle.getSerializable("object");

        t1.setText(student.getName());
        t2.setText(student.getAge());
        t3.setText(student.getC());
        t4.setText(student.getR());




    }
}
