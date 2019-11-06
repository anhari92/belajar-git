package com.anhariasrilgmail.elerningasril;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class IpaActivity extends AppCompatActivity {
    AlertDialog.Builder builder;
    RadioGroup radioGroup1;
    RadioGroup radioGroup2;
    RadioGroup radioGroup3;
    RadioGroup radioGroup4;
    RadioGroup radioGroup5;
    RadioGroup radioGroup6;
    RadioGroup radioGroup7;
    RadioGroup radioGroup8;
    RadioGroup radioGroup9;
    RadioGroup radioGroup10;
    int chekedRadioButton1 = 0;
    int chekedRadioButton2 = 0;
    int chekedRadioButton3 = 0;
    int chekedRadioButton4 = 0;
    int chekedRadioButton5 = 0;
    int chekedRadioButton6 = 0;
    int chekedRadioButton7 = 0;
    int chekedRadioButton8 = 0;
    int chekedRadioButton9 = 0;
    int chekedRadioButton10 = 0;
    Button btnNilai;
    Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipa);
        mContext = this;
        radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
        radioGroup3 = (RadioGroup) findViewById(R.id.radioGroup3);
        radioGroup4 = (RadioGroup) findViewById(R.id.radioGroup4);
        radioGroup5 = (RadioGroup) findViewById(R.id.radioGroup5);
        radioGroup6 = (RadioGroup) findViewById(R.id.radioGroup6);
        radioGroup7 = (RadioGroup) findViewById(R.id.radioGroup7);
        radioGroup8 = (RadioGroup) findViewById(R.id.radioGroup8);
        radioGroup9 = (RadioGroup) findViewById(R.id.radioGroup9);
        radioGroup10 = (RadioGroup) findViewById(R.id.radioGroup10);
        btnNilai = (Button) findViewById(R.id.btn_nilai);
        radioGroup1.setOnCheckedChangeListener(onCheckedChangeListener1);
        radioGroup2.setOnCheckedChangeListener(onCheckedChangeListener2);
        radioGroup3.setOnCheckedChangeListener(onCheckedChangeListener3);
        radioGroup4.setOnCheckedChangeListener(onCheckedChangeListener4);
        radioGroup5.setOnCheckedChangeListener(onCheckedChangeListener5);
        radioGroup6.setOnCheckedChangeListener(onCheckedChangeListener6);
        radioGroup7.setOnCheckedChangeListener(onCheckedChangeListener7);
        radioGroup8.setOnCheckedChangeListener(onCheckedChangeListener8);
        radioGroup9.setOnCheckedChangeListener(onCheckedChangeListener9);
        radioGroup10.setOnCheckedChangeListener(onCheckedChangeListener10);
        btnNilai.setOnClickListener(onClickListenerNilai);
    }
    private RadioGroup.OnCheckedChangeListener onCheckedChangeListener1= new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int checkedID) {
            switch (checkedID){
                case R.id.rb_pil_a:
                    chekedRadioButton1 = 1;
                    break;
                case R.id.rb_pil_b:
                    chekedRadioButton1 = 2;
                    break;
                case R.id.rb_pil_c:
                    chekedRadioButton1 = 3;
                    break;
                case R.id.rb_pil_d:
                    chekedRadioButton1 = 4;
                    break;
            }
        }
    };
    private RadioGroup.OnCheckedChangeListener onCheckedChangeListener2= new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int checkedID) {
            switch (checkedID){
                case R.id.rb_pil_a2:
                    chekedRadioButton2 = 1;
                    break;
                case R.id.rb_pil_b2:
                    chekedRadioButton2 = 2;
                    break;
                case R.id.rb_pil_c2:
                    chekedRadioButton2 = 3;
                    break;
                case R.id.rb_pil_d2:
                    chekedRadioButton2 = 4;
                    break;
            }
        }
    };
    private RadioGroup.OnCheckedChangeListener onCheckedChangeListener3= new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int checkedID) {
            switch (checkedID){
                case R.id.rb_pil_a3:
                    chekedRadioButton3 = 1;
                    break;
                case R.id.rb_pil_b3:
                    chekedRadioButton3 = 2;
                    break;
                case R.id.rb_pil_c3:
                    chekedRadioButton3 = 3;
                    break;
                case R.id.rb_pil_d3:
                    chekedRadioButton3 = 4;
                    break;
            }
        }
    };
    private RadioGroup.OnCheckedChangeListener onCheckedChangeListener4= new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int checkedID) {
            switch (checkedID){
                case R.id.rb_pil_a4:
                    chekedRadioButton4 = 1;
                    break;
                case R.id.rb_pil_b4:
                    chekedRadioButton4 = 2;
                    break;
                case R.id.rb_pil_c4:
                    chekedRadioButton4 = 3;
                    break;
                case R.id.rb_pil_d4:
                    chekedRadioButton4 = 4;
                    break;
            }
        }
    };
    private RadioGroup.OnCheckedChangeListener onCheckedChangeListener5= new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int checkedID) {
            switch (checkedID){
                case R.id.rb_pil_a5:
                    chekedRadioButton5 = 1;
                    break;
                case R.id.rb_pil_b5:
                    chekedRadioButton5 = 2;
                    break;
                case R.id.rb_pil_c5:
                    chekedRadioButton5 = 3;
                    break;
                case R.id.rb_pil_d5:
                    chekedRadioButton5 = 4;
                    break;
            }
        }
    };
    private RadioGroup.OnCheckedChangeListener onCheckedChangeListener6= new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int checkedID) {
            switch (checkedID){
                case R.id.rb_pil_a6:
                    chekedRadioButton6 = 1;
                    break;
                case R.id.rb_pil_b6:
                    chekedRadioButton6 = 2;
                    break;
                case R.id.rb_pil_c6:
                    chekedRadioButton6 = 3;
                    break;
                case R.id.rb_pil_d6:
                    chekedRadioButton6 = 4;
                    break;
            }
        }
    };
    private RadioGroup.OnCheckedChangeListener onCheckedChangeListener7= new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int checkedID) {
            switch (checkedID){
                case R.id.rb_pil_a7:
                    chekedRadioButton7 = 1;
                    break;
                case R.id.rb_pil_b7:
                    chekedRadioButton7 = 2;
                    break;
                case R.id.rb_pil_c7:
                    chekedRadioButton7 = 3;
                    break;
                case R.id.rb_pil_d7:
                    chekedRadioButton7 = 4;
                    break;
            }
        }
    };
    private RadioGroup.OnCheckedChangeListener onCheckedChangeListener8= new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int checkedID) {
            switch (checkedID){
                case R.id.rb_pil_a8:
                    chekedRadioButton8 = 1;
                    break;
                case R.id.rb_pil_b8:
                    chekedRadioButton8 = 2;
                    break;
                case R.id.rb_pil_c8:
                    chekedRadioButton8 = 3;
                    break;
                case R.id.rb_pil_d8:
                    chekedRadioButton8 = 4;
                    break;
            }
        }
    };
    private RadioGroup.OnCheckedChangeListener onCheckedChangeListener9= new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int checkedID) {
            switch (checkedID){
                case R.id.rb_pil_a9:
                    chekedRadioButton9 = 1;
                    break;
                case R.id.rb_pil_b9:
                    chekedRadioButton9 = 2;
                    break;
                case R.id.rb_pil_c9:
                    chekedRadioButton9 = 3;
                    break;
                case R.id.rb_pil_d9:
                    chekedRadioButton9 = 4;
                    break;
            }
        }
    };
    private RadioGroup.OnCheckedChangeListener onCheckedChangeListener10= new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int checkedID) {
            switch (checkedID){
                case R.id.rb_pil_a10:
                    chekedRadioButton10 = 1;
                    break;
                case R.id.rb_pil_b10:
                    chekedRadioButton10 = 2;
                    break;
                case R.id.rb_pil_c10:
                    chekedRadioButton10 = 3;
                    break;
                case R.id.rb_pil_d10:
                    chekedRadioButton10 = 4;
                    break;
            }
        }
    };
    private Integer getOption1(){
        if(chekedRadioButton1 == 0){
            return 0;
        }else if(chekedRadioButton1 == 1){
            return 10;
        }else if(chekedRadioButton1 == 2){
            return -1;
        }else if(chekedRadioButton1 == 3){
            return -1;
        }else if(chekedRadioButton1 == 4){
            return -1;
        }else{
            return  -1;
        }
    }
    private Integer getOption2(){
        if(chekedRadioButton2 == 0){
            return 0;
        }else if(chekedRadioButton2 == 1){
            return -1;
        }else if(chekedRadioButton2 == 2){
            return -1;
        }else if(chekedRadioButton2 == 3){
            return 10;
        }else if(chekedRadioButton2 == 4){
            return -1;
        }else{
            return  -1;
        }
    }
    private Integer getOption3(){
        if(chekedRadioButton1 == 0){
            return 0;
        }else if(chekedRadioButton3 == 1){
            return -1;
        }else if(chekedRadioButton3 == 2){
            return -1;
        }else if(chekedRadioButton3 == 3){
            return -1;
        }else if(chekedRadioButton3 == 4){
            return 10;
        }else{
            return  -1;
        }
    }
    private Integer getOption4(){
        if(chekedRadioButton4 == 0){
            return 0;
        }else if(chekedRadioButton4 == 1){
            return 10;
        }else if(chekedRadioButton4 == 2){
            return -1;
        }else if(chekedRadioButton4 == 3){
            return -1;
        }else if(chekedRadioButton4 == 4){
            return -1;
        }else{
            return  -1;
        }
    }
    private Integer getOption5(){
        if(chekedRadioButton5 == 0){
            return 0;
        }else if(chekedRadioButton5 == 1){
            return -1;
        }else if(chekedRadioButton5 == 2){
            return 10;
        }else if(chekedRadioButton5 == 3){
            return -1;
        }else if(chekedRadioButton5 == 4){
            return -1;
        }else{
            return  -1;
        }
    }
    private Integer getOption6(){
        if(chekedRadioButton6 == 0){
            return 0;
        }else if(chekedRadioButton6 == 1){
            return -1;
        }else if(chekedRadioButton6 == 2){
            return -1;
        }else if(chekedRadioButton6 == 3){
            return -1;
        }else if(chekedRadioButton6 == 4){
            return 10;
        }else{
            return  -1;
        }
    }
    private Integer getOption7(){
        if(chekedRadioButton7 == 0){
            return 0;
        }else if(chekedRadioButton7 == 1){
            return 10;
        }else if(chekedRadioButton7 == 2){
            return -1;
        }else if(chekedRadioButton7 == 3){
            return -1;
        }else if(chekedRadioButton7 == 4){
            return -1;
        }else{
            return  -1;
        }
    }
    private Integer getOption8(){
        if(chekedRadioButton8 == 0){
            return 0;
        }else if(chekedRadioButton8 == 1){
            return -1;
        }else if(chekedRadioButton8 == 2){
            return 10;
        }else if(chekedRadioButton8 == 3){
            return -1;
        }else if(chekedRadioButton8 == 4){
            return -1;
        }else{
            return  -1;
        }
    }
    private Integer getOption9(){
        if(chekedRadioButton9 == 0){
            return 0;
        }else if(chekedRadioButton9 == 1){
            return -1;
        }else if(chekedRadioButton9 == 2){
            return -1;
        }else if(chekedRadioButton9 == 3){
            return -1;
        }else if(chekedRadioButton9 == 4){
            return 10;
        }else{
            return  -1;
        }
    }
    private Integer getOption10(){
        if(chekedRadioButton10 == 0){
            return 0;
        }else if(chekedRadioButton10 == 1){
            return -1;
        }else if(chekedRadioButton10 == 2){
            return -1;
        }else if(chekedRadioButton10 == 3){
            return -1;
        }else if(chekedRadioButton10 == 4){
            return 10;
        }else{
            return  -1;
        }
    }
    private  View.OnClickListener onClickListenerNilai = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String  grade ="";
            String bodoh = "";
            int total = getOption1()+getOption2()+getOption3()+getOption4()+getOption5()+getOption6()+getOption7()+getOption8()+getOption9()+getOption10();
            if(total <= 100 && total >=80){
                grade = "A";
                bodoh = "Anjiiing!!! Bangsat Juga lw bang";
            }else if (total <80 && total >=70){
                grade = "B";
                bodoh = "Njiinggg!!! So' Pinter lw";
            }else if (total <70 && total >=60){
                grade = "C";
                bodoh = "Masih dibawah w lw njiing!!!";
            }else if (total <60 && total >=50){
                grade = "D";
                bodoh = "Goblok!!! Sekolah lagi Dahhh";
            }else{
                grade = "E";
                bodoh = "Tollloool!! Kaga Sekolah lw Yak!!!";
            }
            builder = new AlertDialog.Builder(mContext);
            builder.setCancelable(false);
            builder.setTitle("Hasil Ujian lw Bangsat!!!");
            builder.setMessage("Nilai yang lau dapet nih : "+total+"\n"+"Grade Yang lw dapet : "+grade+"\n"+bodoh);
            builder.setPositiveButton("Gantian Kampret!!", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    radioGroup1.clearCheck();
                    radioGroup2.clearCheck();
                    radioGroup3.clearCheck();
                    radioGroup4.clearCheck();
                    radioGroup5.clearCheck();
                    radioGroup6.clearCheck();
                    radioGroup7.clearCheck();
                    radioGroup8.clearCheck();
                    radioGroup9.clearCheck();
                    radioGroup10.clearCheck();
                }
            });
            builder.create().show();
        }
    };
}
