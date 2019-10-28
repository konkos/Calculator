package com.example.game1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    private Button plusBtn, minusBtn, multiplyBtn,divideBtn,commaBtn, equalsBtn, clearBtn,logBtn, expButton;
    private TextView op1Field, op2Field, operationField;
    private String operator = "=";
    private Double num1 = null , num2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btn0 = (Button) this.<View>findViewById(R.id.button0);
         btn1 = findViewById(R.id.button1);
         btn2 = findViewById(R.id.button2);
         btn3 = findViewById(R.id.button3);
         btn4 = findViewById(R.id.button4);
         btn5 = findViewById(R.id.button5);
         btn6 = findViewById(R.id.button6);
         btn7 = findViewById(R.id.button7);
         btn8 = findViewById(R.id.button8);
         btn9 = findViewById(R.id.button9);

         plusBtn = findViewById(R.id.plusButton);
         minusBtn = findViewById(R.id.minusButton);
         multiplyBtn = findViewById(R.id.multiplyButton);
         divideBtn = findViewById(R.id.divideButton);
         commaBtn = findViewById(R.id.Commabutton);
         clearBtn = findViewById(R.id.clearButton);
         equalsBtn = findViewById(R.id.equalsButton);
         logBtn = findViewById(R.id.logButton);
         expButton = findViewById(R.id.exponentButton);

         op1Field = findViewById(R.id.operand1);
         op2Field = findViewById(R.id.operand2);
         operationField = findViewById(R.id.operator);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operationField.getText().equals("="))
                    op1Field.append(""+0);
                else
                    op2Field.append(""+0);
            }
        });

         btn1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if(operationField.getText().equals("="))
                     op1Field.append(""+1);
                 else
                     op2Field.append(""+1);
             }
         });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operationField.getText().equals("="))
                    op1Field.append(""+2);
                else
                    op2Field.append(""+2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operationField.getText().equals("="))
                    op1Field.append(""+3);
                else
                    op2Field.append(""+3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operationField.getText().equals("="))
                    op1Field.append(""+4);
                else
                    op2Field.append(""+4);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operationField.getText().equals("="))
                    op1Field.append(""+5);
                else
                    op2Field.append(""+5);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operationField.getText().equals("="))
                    op1Field.append(""+6);
                else
                    op2Field.append(""+6);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operationField.getText().equals("="))
                    op1Field.append(""+7);
                else
                    op2Field.append(""+7);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operationField.getText().equals("="))
                    op1Field.append(""+8);
                else
                    op2Field.append(""+8);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operationField.getText().equals("="))
                    op1Field.append(""+9);
                else
                    op2Field.append(""+9);
            }
        });


         plusBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                    operationField.setText("+");
                    operator = "+";
             }
         });

         minusBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 operationField.setText("-");
                 operator = "-";
             }
         });

         multiplyBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 operationField.setText("*");
                 operator = "*";
             }
         });

        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationField.setText("/");
                operator = "/";
            }
        });

        commaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operationField.getText().equals("="))
                    op1Field.append(".");
                else
                    op2Field.append(".");
            }
        });

        equalsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double result = null;
                num1 = Double.parseDouble(op1Field.getText().toString());
                num2 = Double.parseDouble(op2Field.getText().toString());

                if(num1!=null && num2!=null){
                    if(operator.equals("+"))
                    {
                        result = num1 + num2;
                        op1Field.setText(result.toString());
                    }
                    else if(operator.equals("-"))
                    {
                        result = num1 - num2;
                        op1Field.setText(result.toString());
                    }
                    else if(operator.equals("*"))
                    {
                        result = num1 * num2;
                        op1Field.setText(result.toString());
                    }
                    else if(operator.equals("/"))
                    {
                        if(!num2.equals(0))
                            result = num1 / num2;
                        op1Field.setText(result.toString());
                        }
                    else
                        op1Field.setText("ERROR");
                }


                op2Field.setText("");
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op1Field.setText("");
                op2Field.setText("");
                operator = "=";
                operationField.setText(operator);
            }
        });

        logBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double in = Double.parseDouble(op1Field.getText().toString());
                double out = Math.log(in);
                op1Field.setText(""+out);
            }
        });

        expButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x = Double.parseDouble(op1Field.getText().toString());
                x = Math.exp(x);
                op1Field.setText(""+x);
            }
        });


    }

}
