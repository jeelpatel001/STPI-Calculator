package com.jeelpatel.stpicalculatorgtu.branches;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;
import com.jeelpatel.stpicalculatorgtu.R;
import com.jeelpatel.stpicalculatorgtu.helper.CalculationHelper;
import com.jeelpatel.stpicalculatorgtu.helper.RewardedHelper;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView CMT3350701, DWPD3350702, JAVA3350703, ELECTIVE1, AJP3360701, ELECTIVE2, ELECTIVE3;
    Button clear, calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RewardedHelper rewardedHelper = new RewardedHelper();
        rewardedHelper.loadRewardedAd(MainActivity.this);


        clear = findViewById(R.id.CLEAR);
        calculate = findViewById(R.id.CALCULATE);
        CMT3350701 = findViewById(R.id.CMT3350701);
        DWPD3350702 = findViewById(R.id.DWPD3350702);
        JAVA3350703 = findViewById(R.id.JAVA3350703);
        ELECTIVE1 = findViewById(R.id.ELECTIVE1);
        AJP3360701 = findViewById(R.id.AJP3360701);
        ELECTIVE2 = findViewById(R.id.ELECTIVE2);
        ELECTIVE3 = findViewById(R.id.ELECTIVE3);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, R.layout.list_item, getResources().getStringArray(R.array.GRADE));

        // SEM 5
        CMT3350701.setAdapter(adapter);
        DWPD3350702.setAdapter(adapter);
        JAVA3350703.setAdapter(adapter);
        ELECTIVE1.setAdapter(adapter);

        // SEM 6
        AJP3360701.setAdapter(adapter);
        ELECTIVE2.setAdapter(adapter);
        ELECTIVE3.setAdapter(adapter);

        CalculationHelper calculationHelper = new CalculationHelper();
        calculationHelper.gradeSelector(CMT3350701, MainActivity.this, CMT3350701);
        calculationHelper.gradeSelector(DWPD3350702, MainActivity.this, DWPD3350702);
        calculationHelper.gradeSelector(JAVA3350703, MainActivity.this, JAVA3350703);
        calculationHelper.gradeSelector(ELECTIVE1, MainActivity.this, ELECTIVE1);
        calculationHelper.gradeSelector(AJP3360701, MainActivity.this, AJP3360701);
        calculationHelper.gradeSelector(ELECTIVE2, MainActivity.this, ELECTIVE2);
        calculationHelper.gradeSelector(ELECTIVE3, MainActivity.this, ELECTIVE3);

        TextInputLayout layoutCMT3350701 = findViewById(R.id.layoutCMT3350701);
        TextInputLayout layoutDWPD3350702 = findViewById(R.id.layoutDWPD3350702);
        TextInputLayout layoutJAVA3350703 = findViewById(R.id.layoutJAVA3350703);
        TextInputLayout layoutELECTIVE1 = findViewById(R.id.layoutELECTIVE1);

        TextInputLayout layoutAJP3360701 = findViewById(R.id.layoutAJP3360701);
        TextInputLayout layoutELECTIVE2 = findViewById(R.id.layoutELECTIVE2);
        TextInputLayout layoutELECTIVE3 = findViewById(R.id.layoutELECTIVE3);

        rewardedHelper.showRewardedAd();

        calculate.setOnClickListener(v -> {

            String sCMT3350701 = CMT3350701.getText().toString();
            String sDWPD3350702 = DWPD3350702.getText().toString();
            String sJAVA3350703 = JAVA3350703.getText().toString();
            String sELECTIVE1 = ELECTIVE1.getText().toString();
            String sAJP3360701 = AJP3360701.getText().toString();
            String sELECTIVE2 = ELECTIVE2.getText().toString();
            String sELECTIVE3 = ELECTIVE3.getText().toString();

            if (sCMT3350701.isEmpty()) {
                layoutCMT3350701.setError("Select Grade");

            } else if (sDWPD3350702.isEmpty()) {
                layoutDWPD3350702.setError("Select Grade");
                layoutCMT3350701.setError("");

            } else if (sJAVA3350703.isEmpty()) {
                layoutJAVA3350703.setError("Select Grade");
                layoutDWPD3350702.setError("");

            } else if (sELECTIVE1.isEmpty()) {
                layoutELECTIVE1.setError("Select Grade");
                layoutJAVA3350703.setError("");

            } else if (sAJP3360701.isEmpty()) {
                layoutAJP3360701.setError("Select Grade");
                layoutELECTIVE1.setError("");

            } else if (sELECTIVE2.isEmpty()) {
                layoutELECTIVE2.setError("Select Grade");
                layoutAJP3360701.setError("");

            } else if (sELECTIVE3.isEmpty()) {
                layoutELECTIVE3.setError("Select Grade");
                layoutELECTIVE2.setError("");
            } else {
                layoutELECTIVE3.setError("");
                calculationHelper.sem_5_STPI();
            }

        });

        clear.setOnClickListener(v -> {

            rewardedHelper.loadRewardedAd(MainActivity.this);
            rewardedHelper.showRewardedAd();

            CMT3350701.setText("");
            DWPD3350702.setText("");
            JAVA3350703.setText("");
            ELECTIVE1.setText("");
            AJP3360701.setText("");
            ELECTIVE2.setText("");
            ELECTIVE3.setText("");

            layoutAJP3360701.setError("");
            layoutCMT3350701.setError("");
            layoutDWPD3350702.setError("");
            layoutJAVA3350703.setError("");
            layoutELECTIVE1.setError("");
            layoutELECTIVE2.setError("");
            layoutELECTIVE3.setError("");
        });

    }

}