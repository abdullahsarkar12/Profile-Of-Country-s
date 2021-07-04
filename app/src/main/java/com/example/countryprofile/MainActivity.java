package com.example.countryprofile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1,button2,button3;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.bangladeshid);
        button2 = findViewById(R.id.pakistanid);
        button3 = findViewById(R.id.indiaid);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.bangladeshid){

            intent = new Intent(MainActivity.this,SecondActivity.class);
            intent.putExtra("name","Bangladesh");
            startActivity(intent);

        }

        if(view.getId()==R.id.pakistanid){

            intent = new Intent(MainActivity.this,SecondActivity.class);
            intent.putExtra("name","Pakistan");
            startActivity(intent);

        }

        if(view.getId()==R.id.indiaid){

            intent = new Intent(MainActivity.this,SecondActivity.class);
            intent.putExtra("name","india");
            startActivity(intent);

        }

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialogue;
        alertDialogue = new AlertDialog.Builder(this);
        alertDialogue.setIcon(R.drawable.abd);
        alertDialogue.setTitle(R.string.Title);
        alertDialogue.setMessage(R.string.message);
        alertDialogue.setCancelable(false);
        alertDialogue.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });

        alertDialogue.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
               dialogInterface.cancel();
            }
        });

        AlertDialog alertDialog=alertDialogue.create();
        alertDialog.show();

    }
}
