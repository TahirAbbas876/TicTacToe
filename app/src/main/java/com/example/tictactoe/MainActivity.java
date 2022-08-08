package com.example.tictactoe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9;
int flag = 0;
int counter=0;
String t1,t2,t3,t4,t5,t6,t7,t8,t9;
AlertDialog.Builder alertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        registerViews();
alertDialog=new AlertDialog.Builder(this);
alertDialog.setTitle("Congrats");



        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);
        tv4.setOnClickListener(this);
        tv5.setOnClickListener(this);
        tv6.setOnClickListener(this);
        tv7.setOnClickListener(this);
        tv8.setOnClickListener(this);
        tv9.setOnClickListener(this);

    }

    private void tvgetText() {
        t1=tv1.getText().toString();
        t2=tv2.getText().toString();
        t3=tv3.getText().toString();
        t4=tv4.getText().toString();
        t5=tv5.getText().toString();
        t6=tv6.getText().toString();
        t7=tv7.getText().toString();
        t8=tv8.getText().toString();
        t9=tv9.getText().toString();
    }

    private void registerViews() {
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);
        tv5=findViewById(R.id.tv5);
        tv6=findViewById(R.id.tv6);
        tv7=findViewById(R.id.tv7);
        tv8=findViewById(R.id.tv8);
        tv9=findViewById(R.id.tv9);
    }

    @Override
    public void onClick(View view) {
        counter++;
     TextView tv = (TextView) view;
     if(tv.getText().toString().equals("A")){

         if(flag == 0){
             tv.setText("X");
             tv.setTextColor(getResources().getColor(R.color.white));
             tv.setBackgroundColor(getResources().getColor(R.color.design_default_color_error));
             flag++;
         }else {
             tv.setText("O");
             tv.setTextColor(getResources().getColor(R.color.teal_700));
             tv.setBackgroundColor(getResources().getColor(R.color.white));
             flag = 0;
         }

     }


        if(counter > 4 ){
            tvgetText();
          if(t1.equals(t2) && t2.equals(t3) && !t1.equals("A")) {
              alertDialog.setMessage("The Winner is "+ t1);
           setPositiveAndNegativeButton();


          }
           else if(t4.equals(t5) && t5.equals(t6) && !t4.equals("A")) {
              alertDialog.setMessage("The Winner is "+ t4);
              setPositiveAndNegativeButton();

            }
            else if(t7.equals(t8) && t8.equals(t9) && !t7.equals("A")) {
              alertDialog.setMessage("The Winner is "+ t7);
              setPositiveAndNegativeButton();

            }
           else if(t1.equals(t4) && t4.equals(t7) && !t1.equals("A")) {
              alertDialog.setMessage("The Winner is "+ t1);
              setPositiveAndNegativeButton();

            }
           else if(t2.equals(t5) && t5.equals(t8) && !t2.equals("A")) {
              alertDialog.setMessage("The Winner is "+ t2);
              setPositiveAndNegativeButton();

            }
           else if(t3.equals(t6) && t6.equals(t9) && !t3.equals("A")) {
              alertDialog.setMessage("The Winner is "+ t3);
              setPositiveAndNegativeButton();

            }
            else if(t1.equals(t5) && t5.equals(t9) && !t1.equals("A")) {
              alertDialog.setMessage("The Winner is "+ t1);
              setPositiveAndNegativeButton();

            }
            else if(t3.equals(t5) && t5.equals(t7) && !t3.equals("A")) {
              alertDialog.setMessage("The Winner is "+ t3);
              setPositiveAndNegativeButton();

            }
            else if(counter==9){
              alertDialog.setMessage("Match Draw Play Again");
              setPositiveAndNegativeButton();
          }
        }

       }

    private void setPositiveAndNegativeButton() {

        alertDialog.setPositiveButton("Restart", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                restartGame();
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        }).show();

    }

    private void restartGame() {
        tv1.setText("A");
        tv2.setText("A");
        tv3.setText("A");
        tv4.setText("A");
        tv5.setText("A");
        tv6.setText("A");
        tv7.setText("A");
        tv8.setText("A");
        tv9.setText("A");

        tv1.setTextColor(getResources().getColor(R.color.black));
        tv2.setTextColor(getResources().getColor(R.color.black));
        tv3.setTextColor(getResources().getColor(R.color.black));
        tv4.setTextColor(getResources().getColor(R.color.black));
        tv5.setTextColor(getResources().getColor(R.color.black));
        tv6.setTextColor(getResources().getColor(R.color.black));
        tv7.setTextColor(getResources().getColor(R.color.black));
        tv8.setTextColor(getResources().getColor(R.color.black));
        tv9.setTextColor(getResources().getColor(R.color.black));

        tv1.setBackgroundColor(getResources().getColor(R.color.teal_700));
        tv2.setBackgroundColor(getResources().getColor(R.color.teal_700));
        tv3.setBackgroundColor(getResources().getColor(R.color.teal_700));
        tv4.setBackgroundColor(getResources().getColor(R.color.teal_700));
        tv5.setBackgroundColor(getResources().getColor(R.color.teal_700));
        tv6.setBackgroundColor(getResources().getColor(R.color.teal_700));
        tv7.setBackgroundColor(getResources().getColor(R.color.teal_700));
        tv8.setBackgroundColor(getResources().getColor(R.color.teal_700));
        tv9.setBackgroundColor(getResources().getColor(R.color.teal_700));

        flag=0;
        counter=0;
    }

}
