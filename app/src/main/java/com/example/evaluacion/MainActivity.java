package com.example.evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //se crean los botones
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAC, btnDEL, btnMas, btnMenos, btnfleca,
            btnasterisco, btnigual, btncero, btnpunto, btnparentesis1, btnparentesis2;

    //y los edittext y textview
    EditText edtNumero;
    TextView txtRespuesta;

    //variables para guardar los datos de numero y resultado
    double num1, num2, Resultado;
    String abrirParentesis = "(", cerrarParentesis = ")";
    String StringNum1="", StringNum2="";
    String Operacion="";

    int charIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnAC = findViewById(R.id.btnAC);
        btnasterisco = findViewById(R.id.btnasterisco);
        btnDEL = findViewById(R.id.btnDEL);
        btnMas = findViewById(R.id.btnMas);
        btnMenos = findViewById(R.id.btnMenos);
        btnfleca = findViewById(R.id.btnfleca);
        btnigual = findViewById(R.id.btnigual);
        btncero = findViewById(R.id.btncero);
        txtRespuesta = findViewById(R.id.txtRespuesta);
        edtNumero = findViewById(R.id.edtNumero);


        //titulo
        setTitle("HC15-I04-001");

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //Se cumple que sea Landscape entonces llamo a mis controles
            btnparentesis1 = findViewById(R.id.btnparentesis1);
            btnparentesis2 = findViewById(R.id.btnparentesis2);
            btnpunto = findViewById(R.id.btnpunto);

            btnparentesis1.setOnClickListener(this);
            btnparentesis2.setOnClickListener(this);
            btnpunto.setOnClickListener(this);
        }


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnAC.setOnClickListener(this);
        btnasterisco.setOnClickListener(this);
        btnMas.setOnClickListener(this);
        btnMenos.setOnClickListener(this);
        btnfleca.setOnClickListener(this);
        btnigual.setOnClickListener(this);
        btncero.setOnClickListener(this);
        btnDEL.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1: {
                if (Operacion == "" || edtNumero.getText().length() == 0) {
                    edtNumero.setText(edtNumero.getText() + "1");
                    edtNumero.setSelection(edtNumero.getText().length());

                    StringNum1 = StringNum1 + "1";
                }else if (StringNum1 != ""){
                    edtNumero.setText(edtNumero.getText() + "1");
                    edtNumero.setSelection(edtNumero.getText().length());

                    StringNum2 = StringNum2 + "1";
                }
            }
            break;
            case R.id.btn2: {
                if (Operacion == "" || edtNumero.getText().length() == 0) {
                    edtNumero.setText(edtNumero.getText() + "2");
                    edtNumero.setSelection(edtNumero.getText().length());

                    StringNum1 = StringNum1 + "2";
                }else if (StringNum1 != ""){
                    edtNumero.setText(edtNumero.getText() + "2");
                    edtNumero.setSelection(edtNumero.getText().length());

                    StringNum2 = StringNum2 + "2";
                }
            }
            break;
            case R.id.btn3: {
                if (Operacion == "" || edtNumero.getText().length() == 0) {
                    edtNumero.setText(edtNumero.getText() + "3");
                    edtNumero.setSelection(edtNumero.getText().length());

                    StringNum1 = StringNum1 + "3";
                }else if (StringNum1 != ""){
                    edtNumero.setText(edtNumero.getText() + "3");
                    edtNumero.setSelection(edtNumero.getText().length());

                    StringNum2 = StringNum2 + "3";
                }

            }
            break;
            case R.id.btn4: {
                if (Operacion == "" || edtNumero.getText().length() == 0) {
                    edtNumero.setText(edtNumero.getText() + "4");
                    edtNumero.setSelection(edtNumero.getText().length());

                    StringNum1 = StringNum1 + "4";
                }else if (StringNum1 != ""){
                    edtNumero.setText(edtNumero.getText() + "4");
                    edtNumero.setSelection(edtNumero.getText().length());

                    StringNum2 = StringNum2 + "4";
                }
            }
            break;
            case R.id.btn5: {
                if (Operacion == "" || edtNumero.getText().length() == 0) {
                    edtNumero.setText(edtNumero.getText() + "5");
                    edtNumero.setSelection(edtNumero.getText().length());

                    StringNum1 = StringNum1 + "5";
                }else if (StringNum1 != ""){
                    edtNumero.setText(edtNumero.getText() + "5");
                    edtNumero.setSelection(edtNumero.getText().length());

                    StringNum2 = StringNum2 + "5";
                }

            }
            break;
            case R.id.btn6: {
                if (Operacion == "" || edtNumero.getText().length() == 0) {
                    edtNumero.setText(edtNumero.getText() + "6");
                    edtNumero.setSelection(edtNumero.getText().length());

                    StringNum1 = StringNum1 + "6";
                }else if (StringNum1 != ""){
                    edtNumero.setText(edtNumero.getText() + "6");
                    edtNumero.setSelection(edtNumero.getText().length());

                    StringNum2 = StringNum2 + "6";
                }
            }
            break;
            case R.id.btn7: {
                if (Operacion == "" || edtNumero.getText().length() == 0) {
                    edtNumero.setText(edtNumero.getText() + "7");
                    edtNumero.setSelection(edtNumero.getText().length());

                    StringNum1 = StringNum1 + "7";
                }else if (StringNum1 != ""){
                    edtNumero.setText(edtNumero.getText() + "7");
                    edtNumero.setSelection(edtNumero.getText().length());

                    StringNum2 = StringNum2 + "7";
                }
            }
            break;
            case R.id.btn8: {
                if (Operacion == "" || edtNumero.getText().length() == 0) {
                    edtNumero.setText(edtNumero.getText() + "8");
                    edtNumero.setSelection(edtNumero.getText().length());

                    StringNum1 = StringNum1 + "8";
                }else if (StringNum1 != ""){
                    edtNumero.setText(edtNumero.getText() + "8");
                    edtNumero.setSelection(edtNumero.getText().length());

                    StringNum2 = StringNum2 + "8";
                }
            }
            break;
            case R.id.btn9: {
                if (Operacion == "" || edtNumero.getText().length() == 0) {
                    edtNumero.setText(edtNumero.getText() + "9");
                    edtNumero.setSelection(edtNumero.getText().length());

                    StringNum1 = StringNum1 + "9";
                }else if (StringNum1 != ""){
                    edtNumero.setText(edtNumero.getText() + "9");
                    edtNumero.setSelection(edtNumero.getText().length());

                    StringNum2 = StringNum2 + "9";
                }
            }
            break;
            case R.id.btnAC: {
                edtNumero.setText("");

                Operacion = "";
                StringNum1 = "";
                StringNum2 = "";
                Resultado = 0;
                edtNumero.setText("");
                txtRespuesta.setText("");
                num1 = 0;
                num2 = 0;
            }
            break;
            case R.id.btnasterisco: {
                if (edtNumero.getText().length() != 0){
                    String text = edtNumero.getText().toString();
                    if (text.charAt(text.length()-1) == '/' || text.charAt(text.length()-1) == '-' || text.charAt(text.length()-1) == '*' || text.charAt(text.length()-1) == '+'){
                        text = text.substring(0, text.length()-1);
                        edtNumero.setText(text + "*");
                        edtNumero.setSelection(edtNumero.getText().length());
                    }else {
                        edtNumero.setText(text + "*");
                        edtNumero.setSelection(edtNumero.getText().length());
                    }
                }else {
                    if (Resultado == 0) {
                        StringNum1 = "0";
                        edtNumero.setText(StringNum1 + "*");
                        edtNumero.setSelection(edtNumero.getText().length());
                    } else {
                        StringNum1 = txtRespuesta.getText().toString();
                        edtNumero.setText(StringNum1 + "*");
                        edtNumero.setSelection(edtNumero.getText().length());
                    }
                }

                if (Operacion == "+"){
                    if (StringNum1 != "" && StringNum2 != "") {
                        num1 = Double.parseDouble(StringNum1);
                        num2 = Double.parseDouble(StringNum2);

                        Resultado = num1 + num2;
                        txtRespuesta.setText(Escribe(Resultado));
                        num1 = 0;
                        num2 = 0;
                        StringNum1 = txtRespuesta.getText().toString();
                        StringNum2 = "";
                    }
                }else if (Operacion == "-"){
                    if (StringNum1 != "" && StringNum2 != "") {
                        num1 = Double.parseDouble(StringNum1);
                        num2 = Double.parseDouble(StringNum2);

                        Resultado = num1 - num2;
                        txtRespuesta.setText(Escribe(Resultado));
                        num1 = 0;
                        num2 = 0;
                        StringNum1 = txtRespuesta.getText().toString();
                        StringNum2 = "";
                    }
                }else if (Operacion == "*"){
                    if (StringNum1 != "" && StringNum2 != "") {
                        num1 = Double.parseDouble(StringNum1);
                        num2 = Double.parseDouble(StringNum2);

                        Resultado = num1 * num2;
                        txtRespuesta.setText(Escribe(Resultado));
                        num1 = 0;
                        num2 = 0;
                        StringNum1 = txtRespuesta.getText().toString();
                        StringNum2 = "";
                    }
                }else if (Operacion == "/"){
                    if (StringNum1 != "" && StringNum2 != "") {
                        num1 = Double.parseDouble(StringNum1);
                        num2 = Double.parseDouble(StringNum2);

                        Resultado = num1 / num2;
                        txtRespuesta.setText(Escribe(Resultado));
                        num1 = 0;
                        num2 = 0;
                        StringNum1 = txtRespuesta.getText().toString();
                        StringNum2 = "";
                    }
                }

                Operacion = "*";

            }
            break;
            case R.id.btncero: {
                if (Operacion == "" || edtNumero.getText().length() == 0) {
                    edtNumero.setText(edtNumero.getText() + "0");
                    edtNumero.setSelection(edtNumero.getText().length());

                    StringNum1 = StringNum1 + "0";
                }else if (StringNum1 != ""){
                    edtNumero.setText(edtNumero.getText() + "0");
                    edtNumero.setSelection(edtNumero.getText().length());

                    StringNum2 = StringNum2 + "0";
                }

            }
            break;
            case R.id.btnDEL: {
                String text = edtNumero.getText().toString();
                text = text.substring(0, text.length() - 1);
                edtNumero.setText(text);
                edtNumero.setSelection(edtNumero.getText().length());

                if (!StringNum2.isEmpty()){
                    String Text2 = StringNum2;
                    StringNum2 = Text2.substring(0, Text2.length()-1);
                }else if (!StringNum1.isEmpty()){
                    String Text1 = StringNum1;
                    StringNum1 = Text1.substring(0, Text1.length()-1);
                }

            }
            break;
            case R.id.btnfleca: {
                if (edtNumero.getText().length() != 0){
                    String text = edtNumero.getText().toString();
                    if (text.charAt(text.length()-1) == '/' || text.charAt(text.length()-1) == '-' || text.charAt(text.length()-1) == '*' || text.charAt(text.length()-1) == '+'){
                        text = text.substring(0, text.length()-1);
                        edtNumero.setText(text + "/");
                        edtNumero.setSelection(edtNumero.getText().length());
                    }else {
                        edtNumero.setText(text + "/");
                        edtNumero.setSelection(edtNumero.getText().length());
                    }
                }else {
                    if (Resultado == 0) {
                        StringNum1 = "0";
                        edtNumero.setText(StringNum1 + "/");
                        edtNumero.setSelection(edtNumero.getText().length());
                    } else {
                        StringNum1 = txtRespuesta.getText().toString();
                        txtRespuesta.setText(StringNum1 + "/");
                        edtNumero.setSelection(edtNumero.getText().length());
                    }
                }

                if (Operacion == "+"){
                    if (StringNum1 != "" && StringNum2 != "") {
                        num1 = Double.parseDouble(StringNum1);
                        num2 = Double.parseDouble(StringNum2);

                        Resultado = num1 + num2;
                        txtRespuesta.setText(Escribe(Resultado));
                        num1 = 0;
                        num2 = 0;
                        StringNum1 = txtRespuesta.getText().toString();
                        StringNum2 = "";
                    }
                }else if (Operacion == "-"){
                    if (StringNum1 != "" && StringNum2 != "") {
                        num1 = Double.parseDouble(StringNum1);
                        num2 = Double.parseDouble(StringNum2);

                        Resultado = num1 - num2;
                        txtRespuesta.setText(Escribe(Resultado));
                        num1 = 0;
                        num2 = 0;
                        StringNum1 = txtRespuesta.getText().toString();
                        StringNum2 = "";
                    }
                }else if (Operacion == "*"){
                    if (StringNum1 != "" && StringNum2 != "") {
                        num1 = Double.parseDouble(StringNum1);
                        num2 = Double.parseDouble(StringNum2);

                        Resultado = num1 * num2;
                        txtRespuesta.setText(Escribe(Resultado));
                        num1 = 0;
                        num2 = 0;
                        StringNum1 = txtRespuesta.getText().toString();
                        StringNum2 = "";
                    }
                }else if (Operacion == "/"){
                    if (StringNum1 != "" && StringNum2 != "") {
                        num1 = Double.parseDouble(StringNum1);
                        num2 = Double.parseDouble(StringNum2);

                        Resultado = num1 / num2;
                        txtRespuesta.setText(Escribe(Resultado));
                        num1 = 0;
                        num2 = 0;
                        StringNum1 = txtRespuesta.getText().toString();
                        StringNum2 = "";
                    }
                }

                Operacion = "/";
            }
            break;
            case R.id.btnigual: {
                if (Operacion == "+") {
                    if (StringNum1 != "") {
                        num1 = Double.parseDouble(StringNum1);
                        if (!StringNum2.isEmpty()){
                            num2 = Double.parseDouble(StringNum2);
                        }
                        Resultado = num1 + num2;
                        txtRespuesta.setText(Escribe(Resultado));
                        num1 = 0;
                        StringNum1 = "";
                        StringNum2 = "";
                    }else {
                        num1 = Resultado;
                        if (!StringNum2.isEmpty()){
                            num2 = Double.parseDouble(StringNum2);
                        }
                        Resultado = num1 + num2;
                        txtRespuesta.setText(Escribe(Resultado));
                        num1 = 0;
                        StringNum1 = "";
                        StringNum2 = "";
                    }
                } else if (Operacion == "-") {
                    if (StringNum1 != "") {
                        num1 = Double.parseDouble(StringNum1);
                        if (!StringNum2.isEmpty()){
                            num2 = Double.parseDouble(StringNum2);
                        }
                        Resultado = num1 - num2;
                        txtRespuesta.setText(Escribe(Resultado));
                        num1 = 0;
                        StringNum1 = "";
                        StringNum2 = "";
                    }else {
                        num1 = Resultado;
                        if (!StringNum2.isEmpty()){
                            num2 = Double.parseDouble(StringNum2);
                        }
                        Resultado = num1 - num2;
                        txtRespuesta.setText(Escribe(Resultado));
                        num1 = 0;
                        StringNum1 = "";
                        StringNum2 = "";
                    }
                } else if (Operacion == "*") {
                    if (StringNum1 != "") {
                        num1 = Double.parseDouble(StringNum1);
                        if (!StringNum2.isEmpty()){
                            num2 = Double.parseDouble(StringNum2);
                        }
                        Resultado = num1 * num2;
                        txtRespuesta.setText(Escribe(Resultado));
                        num1 = 0;
                        StringNum1 = "";
                        StringNum2 = "";
                    }else {
                        num1 = Resultado;
                        if (!StringNum2.isEmpty()){
                            num2 = Double.parseDouble(StringNum2);
                        }
                        Resultado = num1 * num2;
                        txtRespuesta.setText(Escribe(Resultado));
                        num1 = 0;
                        StringNum1 = "";
                        StringNum2 = "";
                    }
                } else if (Operacion == "/") {
                    if (StringNum1 != "") {
                        num1 = Double.parseDouble(StringNum1);
                        if (!StringNum2.isEmpty()){
                            num2 = Double.parseDouble(StringNum2);
                        }
                        Resultado = num1 / num2;
                        txtRespuesta.setText(Escribe(Resultado));
                        num1 = 0;
                        StringNum1 = "";
                        StringNum2 = "";
                    }else {
                        num1 = Resultado;
                        if (!StringNum2.isEmpty()){
                            num2 = Double.parseDouble(StringNum2);
                        }
                        Resultado = num1 / num2;
                        txtRespuesta.setText(Escribe(Resultado));
                        num1 = 0;
                        StringNum1 = "";
                        StringNum2 = "";
                    }
                }
                edtNumero.setText("");

            }
            break;
            case R.id.btnMas: {
                if (edtNumero.getText().length() != 0){
                    String text = edtNumero.getText().toString();
                    if (text.charAt(text.length()-1) == '/' || text.charAt(text.length()-1) == '-' || text.charAt(text.length()-1) == '*' || text.charAt(text.length()-1) == '+'){
                        text = text.substring(0, text.length()-1);
                        edtNumero.setText(text + "+");
                        edtNumero.setSelection(edtNumero.getText().length());
                    }else {
                        edtNumero.setText(text + "+");
                        edtNumero.setSelection(edtNumero.getText().length());
                    }
                }else {
                    if (Resultado == 0) {
                        StringNum1 = "0";
                        edtNumero.setText(StringNum1 + "+");
                        edtNumero.setSelection(edtNumero.getText().length());
                    } else {
                        StringNum1 = txtRespuesta.getText().toString();
                        edtNumero.setText(StringNum1 + "+");
                        edtNumero.setSelection(edtNumero.getText().length());
                    }
                }

                if (Operacion == "+"){
                    if (StringNum1 != "" && StringNum2 != "") {
                        num1 = Double.parseDouble(StringNum1);
                        num2 = Double.parseDouble(StringNum2);

                        Resultado = num1 + num2;
                        txtRespuesta.setText(Escribe(Resultado));
                        num1 = 0;
                        num2 = 0;
                        StringNum1 = txtRespuesta.getText().toString();
                        StringNum2 = "";
                    }
                }else if (Operacion == "-"){
                    if (StringNum1 != "" && StringNum2 != "") {
                        num1 = Double.parseDouble(StringNum1);
                        num2 = Double.parseDouble(StringNum2);

                        Resultado = num1 - num2;
                        txtRespuesta.setText(Escribe(Resultado));
                        num1 = 0;
                        num2 = 0;
                        StringNum1 = txtRespuesta.getText().toString();
                        StringNum2 = "";
                    }
                }else if (Operacion == "*"){
                    if (StringNum1 != "" && StringNum2 != "") {
                        num1 = Double.parseDouble(StringNum1);
                        num2 = Double.parseDouble(StringNum2);

                        Resultado = num1 * num2;
                        txtRespuesta.setText(Escribe(Resultado));
                        num1 = 0;
                        num2 = 0;
                        StringNum1 = txtRespuesta.getText().toString();
                        StringNum2 = "";
                    }
                }else if (Operacion == "/"){
                    if (StringNum1 != "" && StringNum2 != "") {
                        num1 = Double.parseDouble(StringNum1);
                        num2 = Double.parseDouble(StringNum2);

                        Resultado = num1 / num2;
                        txtRespuesta.setText(Escribe(Resultado));
                        num1 = 0;
                        num2 = 0;
                        StringNum1 = txtRespuesta.getText().toString();
                        StringNum2 = "";
                    }
                }

                Operacion = "+";

            }


            break;

            case R.id.btnMenos: {
                if (edtNumero.getText().length() != 0){
                    String text = edtNumero.getText().toString();
                    if (text.charAt(text.length()-1) == '/' || text.charAt(text.length()-1) == '-' || text.charAt(text.length()-1) == '*' || text.charAt(text.length()-1) == '+'){
                        text = text.substring(0, text.length()-1);
                        edtNumero.setText(text + "-");
                        edtNumero.setSelection(edtNumero.getText().length());
                    }else {
                        edtNumero.setText(text + "-");
                        edtNumero.setSelection(edtNumero.getText().length());
                    }
                }else {
                    if (Resultado == 0) {
                        StringNum1 = "0";
                        edtNumero.setText(StringNum1 + "-");
                        edtNumero.setSelection(edtNumero.getText().length());
                    } else {
                        StringNum1 = txtRespuesta.getText().toString();
                        edtNumero.setText(StringNum1 + "-");
                        edtNumero.setSelection(edtNumero.getText().length());
                    }
                }

                if (Operacion == "+"){
                    if (StringNum1 != "" && StringNum2 != "") {
                        num1 = Double.parseDouble(StringNum1);
                        num2 = Double.parseDouble(StringNum2);

                        Resultado = num1 + num2;
                        txtRespuesta.setText(Escribe(Resultado));
                        num1 = 0;
                        num2 = 0;
                        StringNum1 = txtRespuesta.getText().toString();
                        StringNum2 = "";
                    }
                }else if (Operacion == "-"){
                    if (StringNum1 != "" && StringNum2 != "") {
                        num1 = Double.parseDouble(StringNum1);
                        num2 = Double.parseDouble(StringNum2);

                        Resultado = num1 - num2;
                        txtRespuesta.setText(Escribe(Resultado));
                        num1 = 0;
                        num2 = 0;
                        StringNum1 = txtRespuesta.getText().toString();
                        StringNum2 = "";
                    }
                }else if (Operacion == "*"){
                    if (StringNum1 != "" && StringNum2 != "") {
                        num1 = Double.parseDouble(StringNum1);
                        num2 = Double.parseDouble(StringNum2);

                        Resultado = num1 * num2;
                        txtRespuesta.setText(Escribe(Resultado));
                        num1 = 0;
                        num2 = 0;
                        StringNum1 = txtRespuesta.getText().toString();
                        StringNum2 = "";
                    }
                }else if (Operacion == "/"){
                    if (StringNum1 != "" && StringNum2 != "") {
                        num1 = Double.parseDouble(StringNum1);
                        num2 = Double.parseDouble(StringNum2);

                        Resultado = num1 / num2;
                        txtRespuesta.setText(Escribe(Resultado));
                        num1 = 0;
                        num2 = 0;
                        StringNum1 = txtRespuesta.getText().toString();
                        StringNum2 = "";
                    }
                }

                Operacion = "-";

            }
            break;
            case R.id.btnparentesis1:{
                edtNumero.setText(edtNumero.getText() + "(");
                edtNumero.setSelection(edtNumero.getText().length());
            }
            break;
            case R.id.btnparentesis2:{
                edtNumero.setText(edtNumero.getText() + ")");
                edtNumero.setSelection(edtNumero.getText().length());
            }
            break;
            case R.id.btnpunto:{
                if (Operacion.isEmpty()) {
                    if (edtNumero.getText().length() != 0) {
                        String text = edtNumero.getText().toString();
                        if (text.charAt(text.length() - 1) != '*' && text.charAt(text.length() - 1) != '+' && text.charAt(text.length() - 1) != '-' && text.charAt(text.length() - 1) != '/' && text.charAt(text.length() - 1) != '(' && text.charAt(text.length() - 1) != ')'&& text.charAt(text.length() - 1) != '.') {
                            if (StringNum1.contains(".") == false){
                                edtNumero.setText(edtNumero.getText() + ".");
                                edtNumero.setSelection(edtNumero.getText().length());
                                StringNum1 = StringNum1 + ".";
                            }
                        }
                    }
                }else{
                    if (edtNumero.getText().length() != 0) {
                        String text = edtNumero.getText().toString();
                        if (text.charAt(text.length() - 1) != '*' && text.charAt(text.length() - 1) != '+' && text.charAt(text.length() - 1) != '-' && text.charAt(text.length() - 1) != '/' && text.charAt(text.length() - 1) != '(' && text.charAt(text.length() - 1) != ')'&& text.charAt(text.length() - 1) != '.') {
                            if (StringNum2.contains(".") == false) {
                                edtNumero.setText(edtNumero.getText() + ".");
                                edtNumero.setSelection(edtNumero.getText().length());
                                StringNum2 = StringNum2 + ".";
                            }
                        }
                    }
                }
            }
            break;
            default: {
            }

            break;
        }
    }

    public String Escribe(double d) {
        NumberFormat nf;
        nf = new DecimalFormat("##.###");
        return nf.format(d);
    }

}
