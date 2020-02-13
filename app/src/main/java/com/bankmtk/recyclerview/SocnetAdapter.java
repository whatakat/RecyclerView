package com.bankmtk.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SocnetAdapter extends RecyclerView.Adapter<SocnetAdapter.ViewHolder> {
    private String[] data;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textView;

        public ViewHolder(TextView v){
            super(v);
            textView = v;
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (itemClickListener != null){
                        itemClickListener.onItemClick(v, getAdapterPosition());
                    }
                }
            });
        }
    }
    public interface OnItemClickListener{
        void onItemClick(View view, int position);
    }
    public SocnetAdapter(String[] data){
        this.data = data;
    }

    @NonNull
    @Override
    public SocnetAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent,false);
        ViewHolder vh = new ViewHolder((TextView)v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }
}
