package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtA,edtB,edtC,edtD;
    Button btnTong;

    RadioButton selectedRadioButton;
    CheckBox cbA,cbB;

    TextView textView4;
    RadioGroup rd;



    //cbA.OnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        //@Override
        //public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

      //  }
    //});


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        edtC = findViewById(R.id.edtC);
        cbA = (CheckBox) findViewById(R.id.cbA);
        cbB = (CheckBox) findViewById(R.id.cbB);
        textView4 = findViewById(R.id.textView4);

        rd  = (RadioGroup) findViewById(R.id.rd);
        //int idChecked = group.getCheckedRadioButtonId();
        //switch (idChecked)
        //{
           //case R.id.seletedRadioButton: break;

        //}



        btnTong = findViewById(R.id.btnTong);


        btnTong.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {

                String checkBoxChoices = " ";

                if (cbA.isChecked()) {
                    checkBoxChoices += cbA.getText().toString()+ "  ";
                }
                else{
                    checkBoxChoices += "  ";
                }

                if (cbB.isChecked()) {
                    checkBoxChoices += cbB.getText().toString() + "  ";
                }
                else{
                    checkBoxChoices += "  ";
                }

                selectedRadioButton  = (RadioButton)findViewById(rd.getCheckedRadioButtonId());
                String d = String.valueOf(selectedRadioButton.getText());
                String a = String.valueOf(edtA.getText());
                String b = String.valueOf(edtB.getText());
                String c = String.valueOf(edtC.getText());
                String s = "Tôi tên:" + a + "                                                               " +
                        "" +
                        "                                                           " +
                        "      " + "MSSV:" +b
                        + "                                                               " +
                        "" +
                        "                  " + "Tuổi:" + c +
                        "                  " +
                        "               " +
                        "                  " +
                        "                                        " +
                        "Giới tính:" +d+" "+
                        "               " +
                        "                 "  +
                        "                     "  +
                        "                             "  +
                        "Sở thích:" + checkBoxChoices;
                textView4.setText(s);

            }
        });



    }
}