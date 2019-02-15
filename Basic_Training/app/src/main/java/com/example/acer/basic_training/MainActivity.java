package com.example.acer.basic_training;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = (TextView) findViewById(R.id.tvResult);

        Button btnGo = (Button) findViewById(R.id.btnGo);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
<<<<<<< HEAD


=======
                
//This is comment from pearl
>>>>>>> master
                tvResult.setText(GenerateNumbers(10));
            }
        });

        Button btnOdd = (Button) findViewById(R.id.btnGoOdd);
        btnOdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(GenerateOdd());
            }
        });

        Button btnEven = findViewById(R.id.btnGoEven);
        btnEven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(GenerateEven());
            }
        });
    }

    private String GenerateNumbers(int count) {
        String strValue = "";
        for (int i = 0; i < count; i++) {
            strValue += (i + 1) + "\n";
        }
        return strValue;
    }

    private String GenerateOdd() {
        String strValue = "";
        for (int i = 0; i < 10; i++) {
            if ((i + 1) % 2 != 0)
                strValue += (i + 1) + "\n";
        }
        return strValue;
    }

    private String GenerateEven() {
        String strValue = "";
        for (int i = 0; i < 10; i++) {
            if ((i + 1) % 2 == 0)
                strValue += (i + 1) + "\n";
        }
        return strValue;
    }

}
