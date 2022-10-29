package com.example.homework_2_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etPolicy = findViewById(R.id.et_policy);
        final EditText etProductCategory = findViewById(R.id.et_product_category);
        final EditText etOriginCountry = findViewById(R.id.et_origin_country);
        final EditText etBrand = findViewById(R.id.et_brand);
        final Button btnExportPoliciesAsCSV = findViewById(R.id.btn_export_as_csv);

        btnExportPoliciesAsCSV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                String text1 = String.valueOf(etPolicy.getText());
                intent.putExtra("text1", text1);
                String text2 = String.valueOf(etProductCategory.getText());
                intent.putExtra("text2", text2);
                String text3 = String.valueOf(etOriginCountry.getText());
                intent.putExtra("text3", text3);
                String tex4 = String.valueOf(etBrand.getText());
                intent.putExtra("tex4", tex4);
                startActivity(intent);
            }
        });
        //etPolicy
        etPolicy.addTextChangedListener(new TextWatcher() {


            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (etPolicy.getText().length() > 0) {
                    btnExportPoliciesAsCSV.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (etPolicy.getText().length() > 0) {
                    btnExportPoliciesAsCSV.setEnabled(true);
                }
            }
        });
        //etProductCategory
        etProductCategory.addTextChangedListener(new TextWatcher() {


            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (etProductCategory.getText().length() > 0) {
                    btnExportPoliciesAsCSV.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (etProductCategory.getText().length() > 0) {
                    btnExportPoliciesAsCSV.setEnabled(true);
                }
            }
        });
        //etOriginCountry
        etOriginCountry.addTextChangedListener(new TextWatcher() {


            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (etOriginCountry.getText().length() > 0) {
                    btnExportPoliciesAsCSV.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (etOriginCountry.getText().length() > 0) {
                    btnExportPoliciesAsCSV.setEnabled(true);
                }
            }
        });
        //etBrand
        etBrand.addTextChangedListener(new TextWatcher() {


            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (etBrand.getText().length() > 0) {
                    btnExportPoliciesAsCSV.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (etBrand.getText().length() > 0) {
                    btnExportPoliciesAsCSV.setEnabled(true);
                }
            }
        });
    }
}