package com.example.recycle_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecycleAdapter extends  RecyclerView.Adapter<RecycleAdapter.CountryViewHolder>{

    private List<String> countries;
    private List<String> details;
    private List<Integer> flags;
    private Context context;

    public RecycleAdapter(List<String> countries, List<String> details, List<Integer> flags, Context context) {
        this.countries = countries;
        this.details = details;
        this.flags = flags;
        this.context = context;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design, parent,false );
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.countryName.setText(countries.get(position));
        holder.countryDetail.setText(details.get(position));
        holder.imageView.setImageResource(flags.get(position));
        holder.cardView.setOnClickListener(view -> {
            Toast.makeText(context,countries.get(position), Toast.LENGTH_LONG).show();
        });
    }

    @Override
    public int getItemCount() {
        return countries.size() ;
    }

    public class CountryViewHolder extends RecyclerView.ViewHolder {
        private TextView countryName;
        private TextView countryDetail;
        private ImageView imageView;
        private CardView cardView;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            countryName = itemView.findViewById(R.id.textViewCountry);
            countryDetail =  itemView.findViewById(R.id.textViewCapital);
            imageView = itemView.findViewById(R.id.imageView);
            cardView = itemView.findViewById(R.id.cardView);

        }
    }
}
