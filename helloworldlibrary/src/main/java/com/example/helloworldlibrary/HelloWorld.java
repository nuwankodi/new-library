package com.example.helloworldlibrary;

import android.content.Context;
import android.widget.Toast;

public class HelloWorld {

    String c;
    public void printHelloWorld(Context context,String message){

        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();

    }
}
