package com.example.match_up_illaoi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MatchUp extends AppCompatActivity {

    public static final String EXTRA_TEXT="com.example.match_up_illaoi.TEXT";
    public static final String EXTRA_IMAGE="com.example.match_up_illaoi.IMAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Basculement vers la page statistique du matchup
    public void bascule (View view) {
        Intent intent = new Intent(this,Statistique.class);

        String ref = view.getResources().getResourceEntryName(view.getId());
        System.out.println(ref);

        //Je trouve cette méthode assez fastidieuse mais je n'ai pas encore touvé comment faire autrement
        switch(ref) {
            case "imageButton2":
                //Récupération du nom du champion version 1
                TextView textView7 = (TextView) findViewById(R.id.textView7);
                String NomDuChapion1 = textView7.getText().toString();
                //Envoie des données
                intent.putExtra(EXTRA_TEXT, NomDuChapion1);
                intent.putExtra(EXTRA_IMAGE, R.drawable.shen);
                break;
            case "imageButton3":
                //Récupération du nom du champion version 1
                TextView textView9 = (TextView) findViewById(R.id.textView9);
                String NomDuChapion2 = textView9.getText().toString();
                //Envoie des données
                intent.putExtra(EXTRA_TEXT, NomDuChapion2);
                intent.putExtra(EXTRA_IMAGE, R.drawable.kayle);
                break;
            case "imageButton4":
                //Récupération du nom du champion version 1
                TextView textView11 = (TextView) findViewById(R.id.textView11);
                String NomDuChapion3 = textView11.getText().toString();
                //Envoie des données
                intent.putExtra(EXTRA_TEXT, NomDuChapion3);
                intent.putExtra(EXTRA_IMAGE, R.drawable.jax);
                break;
            case "imageButton5":
                //Récupération du nom du champion version 1
                TextView textView13 = (TextView) findViewById(R.id.textView13);
                String NomDuChapion4 = textView13.getText().toString();
                //Envoie des données
                intent.putExtra(EXTRA_TEXT, NomDuChapion4);
                intent.putExtra(EXTRA_IMAGE, R.drawable.camille);
                break;
            case "imageButton6":
                //Récupération du nom du champion version 1
                TextView textView15 = (TextView) findViewById(R.id.textView15);
                String NomDuChapion5 = textView15.getText().toString();
                //Envoie des données
                intent.putExtra(EXTRA_TEXT, NomDuChapion5);
                intent.putExtra(EXTRA_IMAGE, R.drawable.riven);
                break;
            case "imageButton7":
                //Récupération du nom du champion version 1
                TextView textView17 = (TextView) findViewById(R.id.textView17);
                String NomDuChapion6 = textView17.getText().toString();
                //Envoie des données
                intent.putExtra(EXTRA_TEXT, NomDuChapion6);
                intent.putExtra(EXTRA_IMAGE, R.drawable.sion);
                break;
            case "imageButton8":
                //Récupération du nom du champion version 1
                TextView textView19 = (TextView) findViewById(R.id.textView19);
                String NomDuChapion7 = textView19.getText().toString();
                //Envoie des données
                intent.putExtra(EXTRA_TEXT, NomDuChapion7);
                intent.putExtra(EXTRA_IMAGE, R.drawable.garen);
                break;
            case "imageButton9":
                //Récupération du nom du champion version 1
                TextView textView21 = (TextView) findViewById(R.id.textView21);
                String NomDuChapion8 = textView21.getText().toString();
                //Envoie des données
                intent.putExtra(EXTRA_TEXT, NomDuChapion8);
                intent.putExtra(EXTRA_IMAGE, R.drawable.trynda);
                break;
            case "imageButton10":
                //Récupération du nom du champion version 1
                TextView textView23 = (TextView) findViewById(R.id.textView23);
                String NomDuChapion9 = textView23.getText().toString();
                //Envoie des données
                intent.putExtra(EXTRA_TEXT, NomDuChapion9);
                intent.putExtra(EXTRA_IMAGE, R.drawable.akshan1);
                break;
            case "imageButton11":
                //Récupération du nom du champion version 1
                TextView textView25 = (TextView) findViewById(R.id.textView25);
                String NomDuChapion10 = textView25.getText().toString();
                //Envoie des données
                intent.putExtra(EXTRA_TEXT, NomDuChapion10);
                intent.putExtra(EXTRA_IMAGE, R.drawable.yorick);
                break;
            case "imageButton12":
                //Récupération du nom du champion version 1
                TextView textView27 = (TextView) findViewById(R.id.textView27);
                String NomDuChapion11 = textView27.getText().toString();
                //Envoie des données
                intent.putExtra(EXTRA_TEXT, NomDuChapion11);
                intent.putExtra(EXTRA_IMAGE, R.drawable.teemo);
                break;
            case "imageButton13":
                //Récupération du nom du champion version 1
                TextView textView29 = (TextView) findViewById(R.id.textView29);
                String NomDuChapion12 = textView29.getText().toString();
                //Envoie des données
                intent.putExtra(EXTRA_TEXT, NomDuChapion12);
                intent.putExtra(EXTRA_IMAGE, R.drawable.aatrox);
                break;
            case "imageButton14":
                //Récupération du nom du champion version 1
                TextView textView31 = (TextView) findViewById(R.id.textView31);
                String NomDuChapion13 = textView31.getText().toString();
                //Envoie des données
                intent.putExtra(EXTRA_TEXT, NomDuChapion13);
                intent.putExtra(EXTRA_IMAGE, R.drawable.kled);
                break;
            case "imageButton15":
                //Récupération du nom du champion version 1
                TextView textView33 = (TextView) findViewById(R.id.textView33);
                String NomDuChapion14 = textView33.getText().toString();
                //Envoie des données
                intent.putExtra(EXTRA_TEXT, NomDuChapion14);
                intent.putExtra(EXTRA_IMAGE, R.drawable.gangplank);
                break;
        }
        startActivity(intent);
    }
}