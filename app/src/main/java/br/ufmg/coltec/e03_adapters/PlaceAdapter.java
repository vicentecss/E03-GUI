package br.ufmg.coltec.e03_adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends BaseAdapter {
    private ArrayList<Place> places;
    private Context context;

    public PlaceAdapter(Context context) {
        this.context = context;
        places = new ArrayList<>();
        places.add(new Place("COLTEC", R.drawable.coltec, 5.0, 5.0, "O Colégio Técnico da Universidade Federal de Minas Gerais é uma instituição de ensino técnico pública federal brasileira, com sede em Belo Horizonte, em Minas Gerais"));
        places.add(new Place("Mineirão",R.drawable.mineirao, 6.0, 4.1,"O Estádio Governador Magalhães Pinto, mais conhecido como Mineirão, é um estádio de futebol localizado em Belo Horizonte, Minas Gerais, onde o Cruzeiro Esporte Clube realiza seus jogos."));
        places.add(new Place("Igreja da Pampulha", R.drawable.igreja,7.3, 4.7,"A igrejinha da Pampulha é um dos mais conhecidos \"cartões postais\" de Belo Horizonte."));
    }

    @Override
    public int getCount() {
        return this.places.size();
    }

    @Override
    public Object getItem(int i) {
        return this.places.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Place currentPlace = this.places.get(i);
        View newView = LayoutInflater.from(this.context).inflate(R.layout.list_item_place, viewGroup, false);
        ImageView placeImage = newView.findViewById(R.id.img_place_photo);
        TextView placeName = newView.findViewById(R.id.txt_place_name);
        TextView placeDescription = newView.findViewById(R.id.txt_place_description);
        RatingBar placeRating = newView.findViewById(R.id.rating_place);
        TextView placeDistance = newView.findViewById(R.id.txt_place_distance);

        placeImage.setImageResource(currentPlace.getPhotoId());
        placeName.setText(currentPlace.getName());
        placeDescription.setText(currentPlace.getDescription());
        placeRating.setRating(currentPlace.getRate().floatValue());
        placeDistance.setText(currentPlace.getDistance().toString() + "km");

        return newView;
    }
}
