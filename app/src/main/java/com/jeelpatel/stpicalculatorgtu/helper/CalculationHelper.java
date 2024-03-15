package com.jeelpatel.stpicalculatorgtu.helper;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AutoCompleteTextView;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.jeelpatel.stpicalculatorgtu.R;

public class CalculationHelper {
    Context context;
    String gradeCMT3350701, gradeJAVA3350703, gradeDWPD3350702, gradeELECTIVE1, gradeELECTIVE2, gradeELECTIVE3, gradeAJP3360701;

    public void gradeSelector(AutoCompleteTextView autoCompleteTextView, Context context, View view) {
        this.context = context;

        autoCompleteTextView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (autoCompleteTextView == view.findViewById(R.id.CMT3350701)) {
                    gradeCMT3350701 = charSequence.toString();
                } else if (autoCompleteTextView == view.findViewById(R.id.DWPD3350702)) {
                    gradeDWPD3350702 = charSequence.toString();
                } else if (autoCompleteTextView == view.findViewById(R.id.JAVA3350703)) {
                    gradeJAVA3350703 = charSequence.toString();
                } else if (autoCompleteTextView == view.findViewById(R.id.ELECTIVE1)) {
                    gradeELECTIVE1 = charSequence.toString();
                } else if (autoCompleteTextView == view.findViewById(R.id.ELECTIVE2)) {
                    gradeELECTIVE2 = charSequence.toString();
                } else if (autoCompleteTextView == view.findViewById(R.id.ELECTIVE3)) {
                    gradeELECTIVE3 = charSequence.toString();
                } else if (autoCompleteTextView == view.findViewById(R.id.AJP3360701)) {
                    gradeAJP3360701 = charSequence.toString();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
    }

    public void sem_5_STPI() {

        int CMT, DWPD, JAVA, ELECTIVE1, AJP, ELECTIVE2, ELECTIVE3;
        // SEM 5
        switch (gradeJAVA3350703) {
            case "AA":
                JAVA = 70;
                break;
            case "AB":
                JAVA = 63;
                break;
            case "BB":
                JAVA = 56;
                break;
            case "BC":
                JAVA = 49;
                break;
            case "CC":
                JAVA = 42;
                break;
            case "CD":
                JAVA = 35;
                break;
            case "DD":
                JAVA = 28;
                break;
            case "FF":
                JAVA = 0;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + gradeJAVA3350703);
        }
        switch (gradeDWPD3350702) {
            case "AA":
                DWPD = 70;
                break;
            case "AB":
                DWPD = 63;
                break;
            case "BB":
                DWPD = 56;
                break;
            case "BC":
                DWPD = 49;
                break;
            case "CC":
                DWPD = 42;
                break;
            case "CD":
                DWPD = 35;
                break;
            case "DD":
                DWPD = 28;
                break;
            case "FF":
                DWPD = 0;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + gradeDWPD3350702);
        }
        switch (gradeELECTIVE1) {
            case "AA":
                ELECTIVE1 = 70;
                break;
            case "AB":
                ELECTIVE1 = 63;
                break;
            case "BB":
                ELECTIVE1 = 56;
                break;
            case "BC":
                ELECTIVE1 = 49;
                break;
            case "CC":
                ELECTIVE1 = 42;
                break;
            case "CD":
                ELECTIVE1 = 35;
                break;
            case "DD":
                ELECTIVE1 = 28;
                break;
            case "FF":
                ELECTIVE1 = 0;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + gradeELECTIVE1);
        }
        switch (gradeCMT3350701) {
            case "AA":
                CMT = 50;
                break;
            case "AB":
                CMT = 45;
                break;
            case "BB":
                CMT = 40;
                break;
            case "BC":
                CMT = 35;
                break;
            case "CC":
                CMT = 30;
                break;
            case "CD":
                CMT = 25;
                break;
            case "DD":
                CMT = 20;
                break;
            case "FF":
                CMT = 0;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + gradeCMT3350701);
        }
        // SEM 6
        switch (gradeAJP3360701) {
            case "AA":
                AJP = 70;
                break;
            case "AB":
                AJP = 63;
                break;
            case "BB":
                AJP = 56;
                break;
            case "BC":
                AJP = 49;
                break;
            case "CC":
                AJP = 42;
                break;
            case "CD":
                AJP = 35;
                break;
            case "DD":
                AJP = 28;
                break;
            case "FF":
                AJP = 0;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + gradeAJP3360701);
        }
        switch (gradeELECTIVE2) {
            case "AA":
                ELECTIVE2 = 70;
                break;
            case "AB":
                ELECTIVE2 = 63;
                break;
            case "BB":
                ELECTIVE2 = 56;
                break;
            case "BC":
                ELECTIVE2 = 49;
                break;
            case "CC":
                ELECTIVE2 = 42;
                break;
            case "CD":
                ELECTIVE2 = 35;
                break;
            case "DD":
                ELECTIVE2 = 28;
                break;
            case "FF":
                ELECTIVE2 = 0;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + gradeELECTIVE2);
        }
        switch (gradeELECTIVE3) {
            case "AA":
                ELECTIVE3 = 70;
                break;
            case "AB":
                ELECTIVE3 = 63;
                break;
            case "BB":
                ELECTIVE3 = 56;
                break;
            case "BC":
                ELECTIVE3 = 49;
                break;
            case "CC":
                ELECTIVE3 = 42;
                break;
            case "CD":
                ELECTIVE3 = 35;
                break;
            case "DD":
                ELECTIVE3 = 28;
                break;
            case "FF":
                ELECTIVE3 = 0;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + gradeELECTIVE3);
        }

        float totalGradePoint = ELECTIVE1 + CMT + DWPD + JAVA;
        float STPISEM5 = totalGradePoint / 26;
//        Toast.makeText(context, "" + STPISEM5, Toast.LENGTH_SHORT).show();

        float totalGradePoint2 = ELECTIVE2 + ELECTIVE3 + AJP;
        float STPISEM6 = totalGradePoint2 / 21;
//        Toast.makeText(context, "" + STPISEM6, Toast.LENGTH_SHORT).show();

        String displayAns = String.valueOf(STPISEM5 + STPISEM6);

        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(context);
        materialAlertDialogBuilder
                .setTitle("RESULT")
                .setMessage("SEM 5 STPI = " + STPISEM5 + "\nSEM 6 STPI = " + STPISEM6 + "\n\nTOTAL STPI = " + displayAns).show();

    }
}