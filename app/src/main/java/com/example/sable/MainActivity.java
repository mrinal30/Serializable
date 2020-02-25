package com.example.sable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1= findViewById(R.id.text);
        e2= findViewById(R.id.text1);
        e3= findViewById(R.id.text2);
        e4= findViewById(R.id.text3);

        Button button=findViewById(R.id.submitt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(MainActivity.this,StudentActivity.class);

               String name =e1.getText().toString();
               String age =e2.getText().toString();
               String cls =e3.getText().toString();
               String roll =e4.getText().toString();



               Student student= new Student(name,age,cls,roll);

                intent.putExtra("object",student);
                startActivity(intent);




            }
        });



    }
}
