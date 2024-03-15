package com.jeelpatel.stpicalculatorgtu;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.jeelpatel.stpicalculatorgtu.branches.ChemicalEngineering;
import com.jeelpatel.stpicalculatorgtu.branches.CivilEngineering;
import com.jeelpatel.stpicalculatorgtu.branches.ElectricalAndCommunication;
import com.jeelpatel.stpicalculatorgtu.branches.ElectricalEngineering;
import com.jeelpatel.stpicalculatorgtu.branches.InformationTechnology;
import com.jeelpatel.stpicalculatorgtu.branches.MachanicalEngineering;
import com.jeelpatel.stpicalculatorgtu.branches.MainActivity;
import com.jeelpatel.stpicalculatorgtu.databinding.ActivityHomeBinding;
import com.jeelpatel.stpicalculatorgtu.helper.BannerAdHelper;
import com.jeelpatel.stpicalculatorgtu.helper.CheckForUpdate;

public class Home extends AppCompatActivity {
    CheckForUpdate checkForUpdate;
    ActivityHomeBinding binding;
    BannerAdHelper bannerAdHelper;
    String AD_UNIT_ID = "ca-app-pub-6349327669214019/1285886615";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        checkForUpdate = new CheckForUpdate();
        checkForUpdate.checkForUpdate(Home.this);

        bannerAdHelper = new BannerAdHelper(Home.this, AD_UNIT_ID, binding.bannerAdCard, getWindowManager());
        bannerAdHelper.loadBanner();

        binding.computerEngineerCard.setOnClickListener(v -> startActivity(new Intent(Home.this, MainActivity.class)));
        binding.mechanicalEngineerCard.setOnClickListener(v -> startActivity(new Intent(Home.this, MachanicalEngineering.class)));
        binding.electricalEngineerCard.setOnClickListener(v -> startActivity(new Intent(Home.this, ElectricalEngineering.class)));
        binding.civilEngineerCard.setOnClickListener(v -> startActivity(new Intent(Home.this, CivilEngineering.class)));
        binding.electricalAndCominicationEngineerCard.setOnClickListener(v -> startActivity(new Intent(Home.this, ElectricalAndCommunication.class)));
        binding.informationAndTechnologyCard.setOnClickListener(v -> startActivity(new Intent(Home.this, InformationTechnology.class)));
        binding.chemicalEngineerCard.setOnClickListener(v -> startActivity(new Intent(Home.this, ChemicalEngineering.class)));
    }
}