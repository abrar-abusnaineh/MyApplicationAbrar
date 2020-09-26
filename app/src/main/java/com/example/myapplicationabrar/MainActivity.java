package com.example.myapplicationabrar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        private EditText userName;
        private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                userName=findViewById(R.id.username);
                password=findViewById(R.id.editTextTextPassword);
    }
    public void btnSubmitOnClick (View view){
        String name=userName.getText().toString();
        Context context = getApplicationContext();
        CharSequence text = name;
        int duration = Toast.LENGTH_SHORT;
String writtenPassword=password.getText().toString();
//        CharSequence text = writtenPassword;
//if(writtenPassword.equalsIgnoreCase("abrar000")){
//    text = "success";
//}
//        Toast toast = Toast.makeText(context, text, duration);
        String msg="user Name:"+name+",Password:"+writtenPassword;
        Toast .makeText(this,msg,Toast.LENGTH_SHORT).show();
//        toast.show();
    }

}