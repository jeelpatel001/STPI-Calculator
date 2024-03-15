package com.jeelpatel.stpicalculatorgtu.branches;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.jeelpatel.stpicalculatorgtu.R;
import com.jeelpatel.stpicalculatorgtu.databinding.ActivityMachanicalEngineeringBinding;
import com.jeelpatel.stpicalculatorgtu.helper.ArrayCalculator;
import com.jeelpatel.stpicalculatorgtu.helper.GTUGrade;
import com.jeelpatel.stpicalculatorgtu.helper.TotalOfGC;

public class MachanicalEngineering extends AppCompatActivity {
    ActivityMachanicalEngineeringBinding binding;
    ArrayCalculator arrayCalculator;
    GTUGrade gtuGrade;
    TotalOfGC totalOfGC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMachanicalEngineeringBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        gtuGrade = new GTUGrade();
        arrayCalculator = new ArrayCalculator();
        totalOfGC = new TotalOfGC();


        ArrayAdapter<String> adapter = new ArrayAdapter<>(MachanicalEngineering.this, R.layout.list_item, getResources().getStringArray(R.array.GRADE));
        binding.ELECTIVE1.setAdapter(adapter);
        binding.ELECTIVE2.setAdapter(adapter);
        binding.ELECTIVE3.setAdapter(adapter);
        binding.THE23351901.setAdapter(adapter);
        binding.DOM3351902.setAdapter(adapter);
        binding.ME33351903.setAdapter(adapter);
        binding.IE3351904.setAdapter(adapter);
        binding.ECC3351905.setAdapter(adapter);

        binding.CAM3361901.setAdapter(adapter);
        binding.TE3361902.setAdapter(adapter);
        binding.IM3361903.setAdapter(adapter);


        binding.CLEAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.ELECTIVE1.setText("");
                binding.ELECTIVE2.setText("");
                binding.ELECTIVE3.setText("");
                binding.THE23351901.setText("");
                binding.DOM3351902.setText("");
                binding.ME33351903.setText("");
                binding.IE3351904.setText("");
                binding.ECC3351905.setText("");

                binding.CAM3361901.setText("");
                binding.TE3361902.setText("");
                binding.IM3361903.setText("");

                MachanicalEngineering.this.recreate();

            }
        });

        binding.CALCULATE.setOnClickListener(v -> {
            if (binding.ELECTIVE1.getText().toString().isEmpty() ||
                    binding.ELECTIVE2.getText().toString().isEmpty() ||
                    binding.THE23351901.getText().toString().isEmpty() ||
                    binding.DOM3351902.getText().toString().isEmpty() ||
                    binding.ME33351903.getText().toString().isEmpty() ||
                    binding.IE3351904.getText().toString().isEmpty() ||
                    binding.ECC3351905.getText().toString().isEmpty() ||
                    binding.CAM3361901.getText().toString().isEmpty() ||
                    binding.TE3361902.getText().toString().isEmpty() ||
                    binding.IM3361903.getText().toString().isEmpty() ||
                    binding.ELECTIVE3.getText().toString().isEmpty()) {

                Toast.makeText(MachanicalEngineering.this, "SELECT ALL SUBJECT GRADE", Toast.LENGTH_SHORT).show();

            } else {


                // SEM 5
                gtuGrade.setGrade(binding.ELECTIVE1.getText().toString());
                totalOfGC.setSubject("MEELECTIVE1");
                arrayCalculator.addItem(gtuGrade.gradePointSelector() * totalOfGC.subjectSelector());

                gtuGrade.setGrade(binding.THE23351901.getText().toString());
                totalOfGC.setSubject("THE23351901");
                arrayCalculator.addItem(gtuGrade.gradePointSelector() * totalOfGC.subjectSelector());

                gtuGrade.setGrade(binding.DOM3351902.getText().toString());
                totalOfGC.setSubject("DOM3351902");
                arrayCalculator.addItem(gtuGrade.gradePointSelector() * totalOfGC.subjectSelector());

                gtuGrade.setGrade(binding.ME33351903.getText().toString());
                totalOfGC.setSubject("ME33351903");
                arrayCalculator.addItem(gtuGrade.gradePointSelector() * totalOfGC.subjectSelector());

                gtuGrade.setGrade(binding.IE3351904.getText().toString());
                totalOfGC.setSubject("IE3351904");
                arrayCalculator.addItem(gtuGrade.gradePointSelector() * totalOfGC.subjectSelector());

                gtuGrade.setGrade(binding.ECC3351905.getText().toString());
                totalOfGC.setSubject("ECC3351905");
                arrayCalculator.addItem(gtuGrade.gradePointSelector() * totalOfGC.subjectSelector());

                // SEM 6
                gtuGrade.setGrade(binding.ELECTIVE2.getText().toString());
                totalOfGC.setSubject("MEELECTIVE2");
                arrayCalculator.addItem(gtuGrade.gradePointSelector() * totalOfGC.subjectSelector());

                gtuGrade.setGrade(binding.ELECTIVE3.getText().toString());
                totalOfGC.setSubject("MEELECTIVE3");
                arrayCalculator.addItem(gtuGrade.gradePointSelector() * totalOfGC.subjectSelector());

                gtuGrade.setGrade(binding.CAM3361901.getText().toString());
                totalOfGC.setSubject("CAM3361901");
                arrayCalculator.addItem(gtuGrade.gradePointSelector() * totalOfGC.subjectSelector());

                gtuGrade.setGrade(binding.TE3361902.getText().toString());
                totalOfGC.setSubject("TE3361902");
                arrayCalculator.addItem(gtuGrade.gradePointSelector() * totalOfGC.subjectSelector());

                gtuGrade.setGrade(binding.IM3361903.getText().toString());
                totalOfGC.setSubject("IM3361903");
                arrayCalculator.addItem(gtuGrade.gradePointSelector() * totalOfGC.subjectSelector());

                float stpi = arrayCalculator.getSum() / 52;

                new MaterialAlertDialogBuilder(MachanicalEngineering.this)
                        .setTitle("RESULT")
                        .setMessage("STPI\nSEM 5 + SEM 6 = " + stpi)
                        .setCancelable(false)
                        .setPositiveButton("OK", (dialog, which) -> MachanicalEngineering.this.recreate())
                        .create()
                        .show();

            }
        });

    }
}