package com.example.calculator30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    Double numero1,numero2,resultado;
    String operador;
    int veces =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btnuno =(Button) findViewById(R.id.num1);
        Button btndos =(Button) findViewById(R.id.num2);
        Button btntres =(Button) findViewById(R.id.num3);
        Button btncuatro =(Button) findViewById(R.id.num4);
        Button btncinco =(Button) findViewById(R.id.num5);
        Button btnseis =(Button) findViewById(R.id.num6);
        Button btnsiete =(Button) findViewById(R.id.num7);
        Button btnocho =(Button) findViewById(R.id.num8);
        Button btnnueve =(Button) findViewById(R.id.num9);
        Button btncero =(Button) findViewById(R.id.num0);
        Button btnborrar =(Button) findViewById(R.id.AC);
        Button btnigual =(Button) findViewById(R.id.numeigual);
        Button btnsuma =(Button) findViewById(R.id.numemas);
        Button btnmulti =(Button) findViewById(R.id.numepor);
        Button btndivi =(Button) findViewById(R.id.numentre);
        Button btnresta =(Button) findViewById(R.id.numenosr);
        Button btnpunto =(Button) findViewById(R.id.numepun);
        Button btnporciento =(Button) findViewById(R.id.numpo);

        final Button btnsigno =(Button) findViewById(R.id.numsig);
        TextView Resultado = (TextView)findViewById(R.id.IN);


        btnuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView calculator = (TextView) findViewById(R.id.IN);
                calculator.setText(calculator.getText() +"1");
            }
        });
        btndos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView calculator = (TextView) findViewById(R.id.IN);
                calculator.setText(calculator.getText() +"2");
            }
        });
        btntres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView calculator = (TextView) findViewById(R.id.IN);
                calculator.setText(calculator.getText() +"3");
            }
        });
        btncuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView calculator = (TextView) findViewById(R.id.IN);
                calculator.setText(calculator.getText() +"4");
            }
        });
        btncinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView calculator = (TextView) findViewById(R.id.IN);
                calculator.setText(calculator.getText() +"5");
            }
        });
        btnseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView calculator = (TextView) findViewById(R.id.IN);
                calculator.setText(calculator.getText() +"6");
            }
        });

        btnsiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView calculator = (TextView) findViewById(R.id.IN);
                calculator.setText(calculator.getText() +"7");
            }
        });
        btnocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView calculator = (TextView) findViewById(R.id.IN);
                calculator.setText(calculator.getText() +"8");
            }
        });
        btnnueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView calculator = (TextView) findViewById(R.id.IN);
                calculator.setText(calculator.getText() +"9");
            }
        });
        btncero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView calculator = (TextView) findViewById(R.id.IN);
                calculator.setText(calculator.getText() +"0");
            }
        });

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View miview) {
                operador="+";
                onClickOperacionCapturaNumero1(miview);
            }
        });


        btndivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View miview) {
                operador="/";
                onClickOperacionCapturaNumero1(miview);
            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View miview) {
                operador="*";
                onClickOperacionCapturaNumero1(miview);
            }
        });

        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View miview) {
                operador="-";
                onClickOperacionCapturaNumero1(miview);
            }
        });

        btnporciento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View miview) {
                operador="%";
                numero2=100.0;
                onClickOperacionCapturaNumero1(miview);
            }
        });



        btnpunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View miview) {
                TextView calculator = (TextView) findViewById(R.id.IN);
                calculator.setText(calculator.getText() +".");

            }
        });

        btnsigno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View miview) {
                TextView calculator = (TextView) findViewById(R.id.IN);



                calculator.setText(calculator.getText() );

                if (veces==1)
                {
                    calculator.setText("-" + calculator.getText() );
                    veces++;
                }

                else
                {



                    calculator = (TextView) findViewById(R.id.IN);
                    calculator.setText("");
                    calculator.setText(calculator.getText() );
                    veces=1;

                }





            }
        });



        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView calculator = (TextView) findViewById(R.id.IN);
                numero2 = Double.parseDouble(calculator.getText().toString());

                if(operador.equals("+"))
                {
                    resultado= numero1+numero2;
                }


                else if(operador.equals("-"))
                {
                    resultado= numero1-numero2;
                }
                else if(operador.equals("*"))
                {
                    resultado= numero1*numero2;
                }
                else if(operador.equals("/"))
                {
                    resultado= numero1/numero2;
                }

                else if(operador.equals("%"))
                {
                    numero2 = Double.parseDouble(calculator.getText().toString());
                    numero2=100.0;
                    resultado= numero1/numero2;
                }



                calculator.setText(resultado.toString());
            }

        });


        btnborrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View miview) {
                numero1=0.0;
                numero2=0.0;
                TextView calculator = (TextView) findViewById(R.id.IN);
                calculator.setText("");
            }
        });






    }

    public void onClickOperacionCapturaNumero1(View miView)
    {
        TextView calculator = (TextView) findViewById(R.id.IN);
        numero1 = Double.parseDouble(calculator.getText().toString());
        calculator.setText("");
    }
}
