package com.example.projeto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int qnt;
    int qnt2;
    int qnt3;
    int pre;
    int pre2;
    int pre3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioButton cafep = (RadioButton) findViewById(R.id.cafe);
        final RadioButton cafel = (RadioButton) findViewById(R.id.cafecleite);
        final RadioButton capp = (RadioButton) findViewById(R.id.cappuccino);
        Button mais = (Button) findViewById(R.id.mais);
        Button menos = (Button) findViewById(R.id.menos);
        Button pedir = (Button) findViewById(R.id.pedir);

        mais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = findViewById(R.id.texto);
                TextView textView2 = findViewById(R.id.preco);
                TextView textView3 = findViewById(R.id.precou);
                if (cafep.isChecked()) {
                    textView.setText("Eu gostaria de pedir " + qnt + " cafés. O valor total será de R$" + pre + " .");
                    textView3.setText("O preço de 1 café é: R$ 2,00");
                    textView2.setText("Preço Total: " + pre + " R$");
                    qnt2 = 0;
                    qnt3 = 0;
                    pre2 = 0;
                    pre3 = 0;
                    qnt = qnt + 1;
                    pre = qnt * 2;
                    if (qnt > 1) {
                        textView.setText("Eu gostaria de pedir " + qnt + " cafés. O valor total será de R$" + pre + " .");
                        textView3.setText("O preço de 1 café é: R$ 2,00");
                        textView2.setText("Preço Total: " + pre + " R$");
                    } else {
                        textView.setText("Eu gostaria de pedir " + qnt + " café. O valor total será de R$" + pre + " .");
                        textView3.setText("O preço de 1 café é: R$ 2,00");
                        textView2.setText("Preço Total: " + pre + " R$");
                    }
                }
                if (cafel.isChecked()) {
                    textView.setText("Eu gostaria de pedir " + qnt2 + " cafés com leite. O valor total será de R$" + pre2 + " .");
                    textView3.setText("O preço de 1 café com leite é: R$ 3,00");
                    textView2.setText("Preço Total: " + pre2 + " R$");
                    qnt = 0;
                    qnt3 = 0;
                    pre = 0;
                    pre3 = 0;
                    qnt2 = qnt2 + 1;
                    pre2 = qnt2 * 3;
                    if (qnt > 1) {
                        textView.setText("Eu gostaria de pedir " + qnt2 + " cafés com leite. O valor total será de R$" + pre2 + " .");
                        textView3.setText("O preço de 1 café com leite é: R$ 2,00");
                        textView2.setText("Preço Total: " + pre2 + " R$");
                    } else {
                        textView.setText("Eu gostaria de pedir " + qnt2 + " café com leite. O valor total será de R$" + pre2 + " .");
                        textView3.setText("O preço de 1 café com leite é: R$ 3,00");
                        textView2.setText("Preço Total: " + pre2 + "R$");
                    }
                }
                if (capp.isChecked()) {
                    textView.setText("Eu gostaria de pedir " + qnt3 + " cappuccinos. O valor total será de R$" + pre3 + " .");
                    textView3.setText("O preço de 1 cappuccino é: R$ 2,00");
                    textView2.setText("Preço Total: " + pre3 + " R$");
                    qnt2 = 0;
                    qnt = 0;
                    pre2 = 0;
                    pre = 0;
                    qnt3 = qnt3 + 1;
                    pre3 = qnt3 * 4;
                    if (qnt3 > 1) {
                        textView.setText("Eu gostaria de pedir " + qnt3 + " cappuccinos. O valor total será de R$" + pre3 + " .");
                        textView3.setText("O preço de 1 cappuccino é: R$ 4,00");
                        textView2.setText("Preço Total: " + pre3 + " R$");
                    } else {
                        textView.setText("Eu gostaria de pedir " + qnt3 + " cappuccino. O valor total será de R$" + pre3 + " .");
                        textView3.setText("O preço de 1 café com leite é: R$ 4,00");
                        textView2.setText("Preço Total: " + pre3 + " R$");
                    }
                }
            }
        });

        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = findViewById(R.id.texto);
                TextView textView2 = findViewById(R.id.preco);
                TextView textView3 = findViewById(R.id.precou);
                if (cafep.isChecked()) {
                    textView.setText("Eu gostaria de pedir " + qnt + " cafés. O valor total será de R$" + pre + " .");
                    textView3.setText("O preço de 1 café é: R$ 2,00");
                    textView2.setText("Preço Total: " + pre + " R$");
                    qnt2 = 0;
                    qnt3 = 0;
                    pre2 = 0;
                    pre3 = 0;
                    if (qnt > 0) {
                        qnt = qnt - 1;
                        pre = qnt * 2;
                    }
                    if (qnt > 1) {
                        textView.setText("Eu gostaria de pedir " + qnt + " cafés.O valor total será de R$" + pre + " .");
                        textView3.setText("O preço de 1 café é: R$ 2,00");
                        textView2.setText("Preço Total: " + pre + " R$");
                    } else {
                        textView.setText("Eu gostaria de pedir " + qnt + " café. O valor total será de R$" + pre + " .");
                        textView3.setText("O preço de 1 café é: R$ 2,00");
                        textView2.setText("Preço Total: " + pre + " R$");
                    }
                }
                if (cafel.isChecked()) {
                    textView.setText("Eu gostaria de pedir " + qnt2 + " cafés com leite. E o valor total será de R$" + pre2 + " .");
                    textView3.setText("O preço de 1 café com leite é: R$ 3,00");
                    textView2.setText("Preço Total: " + pre2 + " R$");
                    qnt = 0;
                    qnt3 = 0;
                    pre = 0;
                    pre3 = 0;

                    if (qnt2 != 0) {
                        qnt2 = qnt2 - 1;
                        pre2 = qnt2 * 3;
                    }
                    if (qnt2 > 1) {
                        textView.setText("Eu gostaria de pedir " + qnt2 + " cafés com leite. E o valor total será de R$" + pre2 + " .");
                        textView3.setText("O preço de 1 café com leite é: R$ 3,00");
                        textView2.setText("Preço Total: " + pre2 + " R$");
                    } else {
                        textView.setText("Eu gostaria de pedir " + qnt2 + " café com leite. O valor total será de R$" + pre2 + " .");
                        textView3.setText("O preço de 1 café com leite é: R$ 3,00");
                        textView2.setText("Preço Total: " + pre2 + " R$");
                    }
                }
                if (capp.isChecked()) {
                    textView.setText("Eu gostaria de pedir " + qnt3 + " cappuccinos. O valor total será de R$" + pre3 + " .");
                    textView3.setText("O preço de 1 cappuccino é: R$ 4,00");
                    textView2.setText("Preço Total: " + pre3 + " R$");
                    qnt2 = 0;
                    qnt = 0;
                    pre2 = 0;
                    pre = 0;

                    if (qnt3 > 0) {
                        qnt3 = qnt3 - 1;
                        pre3 = qnt3 * 4;
                    }
                    if (qnt3 > 1) {
                        textView.setText("Eu gostaria de pedir " + qnt3 + " cappuccinos. O valor total será de R$" + pre3 + " .");
                        textView3.setText("O preço de 1 cappuccino é: R$ 4,00");
                        textView2.setText("Preço Total: " + pre3 + " R$");
                    } else {
                        textView.setText("Eu gostaria de pedir " + qnt3 + " cappuccino. O valor total será de R$" + pre3 + " .");
                        textView3.setText("O preço de 1 cappuccino é: R$ 4,00");
                        textView2.setText("Preço Total: " + pre3 + " R$");
                    }
                }
            }
        });
        pedir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (cafep.isChecked()) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Você realizou o pedido de " + qnt + " cafés pelo preço de " + pre + " R$", Toast.LENGTH_SHORT);
                    toast.show();
                    int qnt = 0;
                    int qnt2 = 0;
                    int qnt3 = 0;
                    int pre = 0;
                    int pre2 = 0;
                    int pre3 = 0;
                }

                if (cafel.isChecked()) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Você realizou o pedido de " + qnt2 + " cafés com leite pelo preço de " + pre2 + " R$", Toast.LENGTH_SHORT);
                    toast.show();
                    int qnt = 0;
                    int qnt2 = 0;
                    int qnt3 = 0;
                    int pre = 0;
                    int pre2 = 0;
                    int pre3 = 0;
                }
                if (capp.isChecked()) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Você realizou o pedido de " + qnt3 + " cappuccinos pelo preço de " + pre3 + " R$", Toast.LENGTH_SHORT);
                    toast.show();
                    int qnt = 0;
                    int qnt2 = 0;
                    int qnt3 = 0;
                    int pre = 0;
                    int pre2 = 0;
                    int pre3 = 0;
                }

            }
        });
    }
}

