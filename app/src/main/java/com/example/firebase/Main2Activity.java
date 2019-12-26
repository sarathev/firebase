package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main2Activity extends AppCompatActivity {

    DatabaseReference reference;
    Button b3;
    EditText e1,e2,e3,e4;
    String name,rollno,adno,clg;

    kallan c1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        c1=new kallan();


        b3=(Button)findViewById(R.id.b3);
        e1=(EditText)findViewById(R.id.ed1);
        e2=(EditText)findViewById(R.id.ed2);
        e3=(EditText)findViewById(R.id.ed3);
        e4=(EditText)findViewById(R.id.ed4);


        reference= FirebaseDatabase.getInstance().getReference().child("students");

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


        name=e1.getText().toString();
        rollno=e2.getText().toString();
        adno=e3.getText().toString();
        clg=e4.getText().toString();

        c1.setName(name);
        c1.setRollno(rollno);
        c1.setAdmno(adno);
        c1.setClg(clg);



        reference.push().setValue(c1);
        Toast.makeText(getApplicationContext(),"super",Toast.LENGTH_LONG).show();
         e1.setText("");
         e2.setText("");
         e3.setText("");
         e4.setText("");
            }
        });
    }
}
