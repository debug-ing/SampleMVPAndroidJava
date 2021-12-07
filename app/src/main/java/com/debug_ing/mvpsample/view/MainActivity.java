package com.debug_ing.mvpsample.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.debug_ing.mvpsample.R;
import com.debug_ing.mvpsample.contract.MainContract;
import com.debug_ing.mvpsample.databinding.ActivityMainBinding;
import com.debug_ing.mvpsample.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainContract.View, View.OnClickListener {
    /*
            * with out viewBinding
            TextView text;
            *
            Button set;
    */
    MainContract.Presenter presenter;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        presenter = new MainPresenter(this);
    }

    @Override
    public void init() {

        /*
        * with out viewBinding
        text = findViewById(R.id.text);
        set = findViewById(R.id.set);
        set.setOnClickListener(this);
         */
        binding.set.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        presenter.change();
    }

    @Override
    public void changeTextView() {
        /*
        * with out viewBinding
        text.setText("OK");
         */
        binding.text.setText("OK");
    }
}