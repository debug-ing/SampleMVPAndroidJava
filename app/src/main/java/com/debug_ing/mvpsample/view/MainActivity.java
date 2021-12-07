package com.debug_ing.mvpsample.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.debug_ing.mvpsample.R;
import com.debug_ing.mvpsample.contract.MainContract;
import com.debug_ing.mvpsample.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainContract.View, View.OnClickListener {

    MainContract.Presenter presenter;
    TextView text;
    Button set;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);
    }

    @Override
    public void init() {
        text = findViewById(R.id.text);
        set = findViewById(R.id.set);
        set.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        presenter.change();
    }

    @Override
    public void changeTextView() {
        text.setText("OK");
    }
}