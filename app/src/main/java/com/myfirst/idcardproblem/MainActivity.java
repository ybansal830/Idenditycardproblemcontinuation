package com.myfirst.idcardproblem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener{

    private RecyclerView mRecyclerView;
    private ArrayList<IdentityCardModel> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recyclerView);
        setData();
        IdentityCardAdapter identityCardAdapter = new IdentityCardAdapter(arrayList,this);
        GridLayoutManager linearLayoutManager = new GridLayoutManager(this,2);
        mRecyclerView.setAdapter(identityCardAdapter);
        mRecyclerView.setLayoutManager(linearLayoutManager);
    }

    private void setData() {
        arrayList = new ArrayList<>();
        for(int i=0;i<10;i++) {
            arrayList.add(new IdentityCardModel("Microsoft", R.drawable.billgates,
                    64, "Business"));
            arrayList.add(new IdentityCardModel("Amazon", R.drawable.jeffbezos,
                    56, "Business"));
            arrayList.add(new IdentityCardModel("Masai School", R.drawable.prateeksukla,
                    31, "Business"));
        }
    }

    @Override
    public void onClick(String title, int age) {
        new AlertDialog.Builder(this)
                .setTitle("Details")
                .setMessage("Company Name : " + title + "\n" + "Age : " + age)
                .show();
    }
}