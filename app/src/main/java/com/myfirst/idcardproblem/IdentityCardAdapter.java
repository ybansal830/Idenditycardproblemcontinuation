package com.myfirst.idcardproblem;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class IdentityCardAdapter extends RecyclerView.Adapter<IdentityCardViewHolder> {

    private ArrayList<IdentityCardModel> arrayList;
    private ItemClickListener itemClickListener;

    public IdentityCardAdapter(ArrayList<IdentityCardModel> arrayList, ItemClickListener itemClickListener){
        this.arrayList = arrayList;
        this.itemClickListener = itemClickListener;
    }
    @NonNull
    @Override
    public IdentityCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_identitycard,parent,false);
        return new IdentityCardViewHolder(view,itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull IdentityCardViewHolder holder, int position) {
        holder.setData(arrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
