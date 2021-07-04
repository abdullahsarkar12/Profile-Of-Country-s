package com.example.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private ImageView image;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        image = findViewById(R.id.imageid);
        text = findViewById(R.id.textViewId);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            String countryName= bundle.getString("name");
            showDetails(countryName);
        }
    }

    void showDetails(String countryName){
        if(countryName.equals("Bangladesh")){
            image.setImageResource(R.drawable.bdparlament);
            text.setText(R.string.Bangladesh);
        }
        if(countryName.equals("india")){
            image.setImageResource(R.drawable.indparlament);
            text.setText(R.string.india);
        }
        if(countryName.equals("Pakistan")){
            image.setImageResource(R.drawable.pakistanpar);
            text.setText(R.string.Pakistan);
        }
    }
}
