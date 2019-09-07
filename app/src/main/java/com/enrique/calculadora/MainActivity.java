package com.enrique.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bsh.Interpreter;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private TextView consola;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btnPor;
    private Button btnMas;
    private Button btnMenos;
    private Button btnIgual;
    private Button btnPunto;
    private Button btnCl;

    ArrayList<String> expr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnMas = (Button) findViewById(R.id.btnMas);
        btnMenos = (Button) findViewById(R.id.btnMenos);
        btnIgual = (Button) findViewById(R.id.btnIgual);
        btnPor = (Button) findViewById(R.id.btnPor);
        btnPunto = (Button) findViewById(R.id.btnPunto);
        btnCl = (Button) findViewById(R.id.btnCl);
        consola = (TextView) findViewById(R.id.consola);
        expr = new ArrayList<String>();

    }
    public void boton1(View view){
        expr.add(btn1.getText().toString());
        String valor="";
        for(int i=0; i<expr.size(); i++){
            valor += expr.get(i);
            consola.setText(valor);
        }
    }
    public void boton2(View view){
        expr.add(btn2.getText().toString());
        String valor="";
        for(int i=0; i<expr.size(); i++){
            valor += expr.get(i);
            consola.setText(valor);
        }
    }
    public void boton3(View view){
        expr.add(btn3.getText().toString());
        String valor="";
        for(int i=0; i<expr.size(); i++){
            valor += expr.get(i);
            consola.setText(valor);
        }
    }
    public void boton4(View view){
        expr.add(btn4.getText().toString());
        String valor="";
        for(int i=0; i<expr.size(); i++){
            valor += expr.get(i);
            consola.setText(valor);
        }
    }
    public void boton5(View view){
        expr.add(btn5.getText().toString());
        String valor="";
        for(int i=0; i<expr.size(); i++){
            valor += expr.get(i);
            consola.setText(valor);
        }
    }
    public void boton6(View view){
        expr.add(btn6.getText().toString());
        String valor="";
        for(int i=0; i<expr.size(); i++){
            valor += expr.get(i);
            consola.setText(valor);
        }
    }
    public void boton7(View view){
        expr.add(btn7.getText().toString());
        String valor="";
        for(int i=0; i<expr.size(); i++){
            valor += expr.get(i);
            consola.setText(valor);
        }
    }
    public void boton8(View view){
        expr.add(btn8.getText().toString());
        String valor="";
        for(int i=0; i<expr.size(); i++){
            valor += expr.get(i);
            consola.setText(valor);
        }
    }
    public void boton9(View view){
        expr.add(btn9.getText().toString());
        String valor="";
        for(int i=0; i<expr.size(); i++){
            valor += expr.get(i);
            consola.setText(valor);
        }
    }
    public void boton0(View view){
        expr.add(btn0.getText().toString());
        String valor="";
        for(int i=0; i<expr.size(); i++){
            valor += expr.get(i);
            consola.setText(valor);
        }
    }
    public void botonMas(View view){
        expr.add(btnMas.getText().toString());
        String valor="";
        for(int i=0; i<expr.size(); i++){
            valor += expr.get(i);
            consola.setText(valor);
        }
    }
    public void botonMenos(View view){
        expr.add(btnMenos.getText().toString());
        String valor="";
        for(int i=0; i<expr.size(); i++){
            valor += expr.get(i);
            consola.setText(valor);
        }
    }
    public void botonPor(View view){
        expr.add(btnPor.getText().toString());
        String valor="";
        for(int i=0; i<expr.size(); i++){
            valor += expr.get(i);
            consola.setText(valor);
        }
    }
    public void botonPunto(View view) {
        expr.add(btnPunto.getText().toString());
        String valor = "";
        for (int i = 0; i < expr.size(); i++) {
            valor += expr.get(i);
            consola.setText(valor);


        }

            }

    public void botonCl(View view){
        consola.setText("");
        expr.clear();

    }

    public void botonIgual (View view){
            Interpreter intptr = new Interpreter();
            String valorTotal = "";
            for (int i = 0; i < expr.size(); i++)
                valorTotal += expr.get(i);
            try {
                intptr.eval("result =" + valorTotal);
                String resultado = intptr.get("result").toString();
                expr.clear();
                expr.add(resultado);
                consola.setText(resultado);
            } catch (Exception e) {
                System.out.println(e);

            }
        }


    }
