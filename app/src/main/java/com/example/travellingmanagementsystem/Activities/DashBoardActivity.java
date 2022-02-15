package com.example.travellingmanagementsystem.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.travellingmanagementsystem.R;

public class DashBoardActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout addMemberLinearLayout, addCostLinearLayout, dueLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        this.setTitle("Dashboard");


        addMemberLinearLayout = findViewById(R.id.addMemberLayoutId);
        addCostLinearLayout = findViewById(R.id.addCostLayoutId);
        dueLinearLayout = findViewById(R.id.dueLayoutId);


        addMemberLinearLayout.setOnClickListener(this);
        addCostLinearLayout.setOnClickListener(this);
        dueLinearLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.addMemberLayoutId){
            Intent intent = new Intent(getApplicationContext(), MemberDetailsActivity.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.addCostLayoutId){
            Intent intent = new Intent(getApplicationContext(), CostDetailsActivity.class);
            startActivity(intent);
        }

    }
}