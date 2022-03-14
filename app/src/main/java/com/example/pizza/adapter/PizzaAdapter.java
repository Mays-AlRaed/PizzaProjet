package com.example.pizza.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.pizza.R;
import com.example.pizza.classes.Produit;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {
    private List<Produit> produits;
    private LayoutInflater inflater;

    public PizzaAdapter(Activity activity, List<Produit> produits) {
        this.produits = produits;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int position) {
        return produits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return produits.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = inflater.inflate(R.layout.item, null);
        }

        TextView idp = convertView.findViewById(R.id.pid);
        TextView nom = convertView.findViewById(R.id.nom);
        TextView ingred = convertView.findViewById(R.id.ingred);
        TextView dure = convertView.findViewById(R.id.duration);
        ImageView photo = convertView.findViewById(R.id.photo);

        idp.setText(produits.get(position).getId()+"");
        nom.setText(produits.get(position).getNom()+"");
        ingred.setText(produits.get(position).getNbrIngredient()+"");
        dure.setText(produits.get(position).getDuree()+" min");
        photo.setImageResource(produits.get(position).getPhoto());

        return convertView;
    }
}


