package com.example.user.juststart;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.user.juststart.databinding.ActivityDataBindingBinding;
import com.example.user.juststart.model.Peserta;

public class DataBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDataBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);

        Peserta p = new Peserta("Rachman Forniandi","26","Bintaro Jaya");
        binding.setPeserta(p);
    }
}
