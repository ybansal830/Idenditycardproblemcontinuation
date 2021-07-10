package com.myfirst.idcardproblem;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class IdentityCardViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvTitle;
    private ImageView mIvImage;
    private TextView mTvAge;
    private TextView mTvProfession;
    private CardView mCvId;
    private ItemClickListener itemClickListener;

    public IdentityCardViewHolder(@NonNull View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        initViews();
        this.itemClickListener = itemClickListener;
    }

    private void initViews() {
        mTvTitle = itemView.findViewById(R.id.tvTitle);
        mIvImage = itemView.findViewById(R.id.ivImage);
        mTvAge = itemView.findViewById(R.id.tvAgeInput);
        mTvProfession = itemView.findViewById(R.id.tvProfessionInput);
        mCvId = itemView.findViewById(R.id.cvId);
    }

    public void setData(IdentityCardModel identityCardModel){
        mTvTitle.setText(identityCardModel.getTitle());
        mIvImage.setImageResource(identityCardModel.getImageId());
        mTvAge.setText(identityCardModel.getAge()+"");
        mTvProfession.setText(identityCardModel.getProfession());
        mCvId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onClick(identityCardModel.getTitle(),identityCardModel.getAge());
            }
        });
    }
}
