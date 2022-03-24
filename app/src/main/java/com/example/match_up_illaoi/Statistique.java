package com.example.match_up_illaoi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Statistique extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistique);

        //Obtenir l'intention
        Intent intent = getIntent();

        //Extraction du nom du champion transmis
        String NomDuChampion = intent.getStringExtra(MatchUp.EXTRA_TEXT);

        //Extraction de l'image tansmise
        int ImageDuChampion = getIntent().getExtras().getInt(MatchUp.EXTRA_IMAGE);

        //Affecter le nom de champion dans le TextView approprié (textView38 et 37)
        TextView textView1 = findViewById(R.id.textView38);
        textView1.setText(NomDuChampion);
        TextView textView2 = findViewById(R.id.textView37);
        textView2.setText(NomDuChampion);

        //Affecter l'image du champion dans l'ImageView approprié (imageView3)
        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setImageResource(ImageDuChampion);

    }
}