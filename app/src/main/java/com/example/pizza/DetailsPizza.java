package com.example.pizza;

import static com.example.pizza.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizza.classes.Produit;
import com.example.pizza.service.ProduitService;
import com.example.pizza.R;

import java.io.Serializable;

public class DetailsPizza extends AppCompatActivity {

    private ProduitService ps;
    private ImageView image;
    private TextView desc;
    private TextView prepa;
    private TextView nom;
    private TextView detailsIngred;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_details_pizza);

        Intent intent = getIntent();
        image = findViewById(id.photopizza);
        nom = findViewById(id.pnom);
        desc = findViewById(id.desc);
        prepa = findViewById(id.prepa);
        detailsIngred = findViewById(id.ing);

        Serializable s = getIntent().getSerializableExtra("produit");
        if (s != null)
        {
            Produit p = (Produit) s;
            image.setImageResource(p.getPhoto());
            nom.setText(p.getNom());
            desc.setText(p.getDescription());
            prepa.setText(p.getPreparation());
            detailsIngred.setText(p.getDetailsIngred());
        }

    }}

