package ru.geekbrains.android1homeworkaplication2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String VALUE_1 = "VALUE_1";
    public static final String VALUE_2 = "VALUE_2";
    public static final String OPER = "OPER";
    public static final String RES = "RES";
    private static final String PARAMETRS_1 = "PARAMETRS_1";
    private EditText editTextResult;

    private Parametrs parametrs = null;

    private char NUMBER;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_main);

        editTextResult = findViewById(R.id.editText_result);
        Button button1 = findViewById(R.id.button_1);
        Button button2 = findViewById(R.id.button_2);
        Button button3 = findViewById(R.id.button_3);
        Button button4 = findViewById(R.id.button_4);
        Button button5 = findViewById(R.id.button_5);
        Button button6 = findViewById(R.id.button_6);
        Button button7 = findViewById(R.id.button_7);
        Button button8 = findViewById(R.id.button_8);
        Button button9 = findViewById(R.id.button_9);
        Button button0 = findViewById(R.id.button_0);
        Button buttonDot = findViewById(R.id.button_dot);
        Button buttonResult = findViewById(R.id.button_result);
        Button buttonPlus = findViewById(R.id.button_plus);
        Button buttonMinus = findViewById(R.id.button_minus);
        Button buttonMult = findViewById(R.id.button_multiplication);
        Button buttonDiv = findViewById(R.id.button_division);

        if (savedInstanceState == null) {
            parametrs =new Parametrs();
        }


        createNumber(button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonDot);


        buttonPlus.setOnClickListener(v -> {
            parametrs.setOPERATION('+');
        });
        buttonMinus.setOnClickListener(v -> {
            parametrs.setOPERATION('-');
        });
        buttonMult.setOnClickListener(v -> {
            parametrs.setOPERATION('*');
        });
        buttonDiv.setOnClickListener(v -> {
            parametrs.setOPERATION('/');
        });

        buttonResult.setOnClickListener(v -> {
            Calculator calculator = new Calculator();
            parametrs.setRESULT(calculator.calculate(parametrs.getFIRST_NUMBER(), parametrs.getSECOND_NUMBER(), parametrs.getOPERATION()));
            editTextResult.setText(String.valueOf(parametrs.getRESULT()));
            parametrs.setFIRST_NUMBER("");
            parametrs.setSECOND_NUMBER("");
            parametrs.setOPERATION('x');
        });



    }

    private void createNumber(Button button1, Button button2, Button button3, Button button4, Button button5, Button button6, Button button7, Button button8, Button button9, Button button0, Button buttonDot) {
        button1.setOnClickListener(v -> {
            NUMBER = '1';
            if (parametrs.getOPERATION() == 'x') {
                addFirstNumber();
            } else if (parametrs.getOPERATION() == '+' || parametrs.getOPERATION() == '-'|| parametrs.getOPERATION() == '*'|| parametrs.getOPERATION() == '/') {
                addSecondNumber();
            }
            updateEditTextResult();
        });

        button2.setOnClickListener(v -> {
            NUMBER = '2';
            if (parametrs.getOPERATION() == 'x') {
                addFirstNumber();
            } else if (parametrs.getOPERATION() == '+' || parametrs.getOPERATION() == '-'|| parametrs.getOPERATION() == '*'|| parametrs.getOPERATION() == '/') {
                addSecondNumber();
            }
            updateEditTextResult();
        });

        button3.setOnClickListener(v -> {
            NUMBER = '3';
            if (parametrs.getOPERATION() == 'x') {
                addFirstNumber();
            } else if (parametrs.getOPERATION() == '+' || parametrs.getOPERATION() == '-'|| parametrs.getOPERATION() == '*'|| parametrs.getOPERATION() == '/') {
                addSecondNumber();
            }
            updateEditTextResult();
        });

        button4.setOnClickListener(v -> {
            NUMBER = '4';
            if (parametrs.getOPERATION() == 'x') {
                addFirstNumber();
            } else if (parametrs.getOPERATION() == '+' || parametrs.getOPERATION() == '-'|| parametrs.getOPERATION() == '*'|| parametrs.getOPERATION() == '/') {
                addSecondNumber();
            }
            updateEditTextResult();
        });

        button5.setOnClickListener(v -> {
            NUMBER = '5';
            if (parametrs.getOPERATION() == 'x') {
                addFirstNumber();
            } else if (parametrs.getOPERATION() == '+' || parametrs.getOPERATION() == '-'|| parametrs.getOPERATION() == '*'|| parametrs.getOPERATION() == '/') {
                addSecondNumber();
            }
            updateEditTextResult();
        });

        button6.setOnClickListener(v -> {
            NUMBER = '6';
            if (parametrs.getOPERATION() == 'x') {
                addFirstNumber();
            } else if (parametrs.getOPERATION() == '+' || parametrs.getOPERATION() == '-'|| parametrs.getOPERATION() == '*'|| parametrs.getOPERATION() == '/') {
                addSecondNumber();
            }
            updateEditTextResult();
        });

        button7.setOnClickListener(v -> {
            NUMBER = '7';
            if (parametrs.getOPERATION() == 'x') {
                addFirstNumber();
            } else if (parametrs.getOPERATION() == '+' || parametrs.getOPERATION() == '-'|| parametrs.getOPERATION() == '*'|| parametrs.getOPERATION() == '/') {
                addSecondNumber();
            }
            updateEditTextResult();
        });

        button8.setOnClickListener(v -> {
            NUMBER = '8';
            if (parametrs.getOPERATION() == 'x') {
                addFirstNumber();
            } else if (parametrs.getOPERATION() == '+' || parametrs.getOPERATION() == '-'|| parametrs.getOPERATION() == '*'|| parametrs.getOPERATION() == '/') {
                addSecondNumber();
            }
            updateEditTextResult();
        });

        button9.setOnClickListener(v -> {
            NUMBER = '9';
            if (parametrs.getOPERATION() == 'x') {
                addFirstNumber();
            } else if (parametrs.getOPERATION() == '+' || parametrs.getOPERATION() == '-'|| parametrs.getOPERATION() == '*'|| parametrs.getOPERATION() == '/') {
                addSecondNumber();
            }
            updateEditTextResult();
        });

        button0.setOnClickListener(v -> {
            NUMBER = '0';
            if (parametrs.getOPERATION() == 'x') {
                addFirstNumber();
            } else if (parametrs.getOPERATION() == '+' || parametrs.getOPERATION() == '-'|| parametrs.getOPERATION() == '*'|| parametrs.getOPERATION() == '/') {
                addSecondNumber();
            }
            updateEditTextResult();
        });

        buttonDot.setOnClickListener(v -> {
            NUMBER = '.';
            if (parametrs.getOPERATION() == 'x') {
                addFirstNumber();
            } else if (parametrs.getOPERATION() == '+' || parametrs.getOPERATION() == '-'|| parametrs.getOPERATION() == '*'|| parametrs.getOPERATION() == '/') {
                addSecondNumber();
            }
            updateEditTextResult();
        });
    }



    private void addFirstNumber () {
        parametrs.setFIRST_NUMBER(parametrs.getFIRST_NUMBER() + NUMBER);
    }

    private void addSecondNumber () {
        parametrs.setSECOND_NUMBER(parametrs.getSECOND_NUMBER() + NUMBER);
    }


    private void updateEditTextResult() {
        if (parametrs.getOPERATION() == 'x') {
            editTextResult.setText(String.valueOf(parametrs.getFIRST_NUMBER()));
        } else if (parametrs.getOPERATION() == '+' || parametrs.getOPERATION() == '-'|| parametrs.getOPERATION() == '*'|| parametrs.getOPERATION() == '/') {
            editTextResult.setText(String.valueOf(parametrs.getFIRST_NUMBER()) + parametrs.getOPERATION() + String.valueOf(parametrs.getSECOND_NUMBER()));
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        parametrs = (Parametrs) savedInstanceState.getParcelable(PARAMETRS_1);

        if (parametrs == null) {
            parametrs = new Parametrs();
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {

        super.onSaveInstanceState(outState);

        outState.putParcelable(PARAMETRS_1,parametrs);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


}