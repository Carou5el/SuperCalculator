package example.supercalculator.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import example.supercalculator.controller.CalculatorController;
import example.supercalculator.controller.Operations;

import example.supercalculator.R;

/*
    Варианты обработчиков onClick.
    1. Вызов из XML. Устаревший подход (?), не лучшая идея.
    2. Реализация интерфейса View.OnClickListener (реализацией метода onClick()).
        Тоже не лучший выход. Этим способом организуется единственный обработчик onClick(),
        которому передаётся параметр View, по его параметру ID можно с помощью switch() организовать
        вызов того или иного метода для каждого элемента ID. Однако, IDE предупреждает о том, что
        поле ID не является final (м.б. изменено внутренней оптимизацией Gradle что ли...).
    3. Делаем отдельные обработчики для каждого элемента, кажется это, самый оптимальный путь.
 */

public class MainActivity extends AppCompatActivity {
    // Reject to use '.' twice.
    private boolean flagDot = false;

    StringBuilder resultString = new StringBuilder();

    // todo: remove leading zero before append any other charachters
    private boolean flagZero = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create new objects.
        CalculatorController calcController = new CalculatorController();

        // Find all buttons.
        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button buttonDot = findViewById(R.id.buttonDot);
        Button buttonDivision = findViewById(R.id.buttonDivision);
        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        Button buttonPlus = findViewById(R.id.buttonPlus);
        Button buttonMinus = findViewById(R.id.buttonMinus);
        Button buttonEqual = findViewById(R.id.buttonEqual);
        Button buttonReset = findViewById(R.id.buttonReset);

        // Find textBox.
        // Set text in this textBox as "0".
        TextView resultField = findViewById(R.id.resultField);
        resultField.setText(R.string.Button0);

        // Set click listeners on all buttons.
        button0.setOnClickListener(view -> {
            resultString.append(R.string.Button0);
            resultField.setText(resultString.toString());

        });

        button1.setOnClickListener(view -> {
            resultString.append(R.string.Button1);
            resultField.setText(resultString.toString());
        });

        button2.setOnClickListener(view -> {
            resultString.append(R.string.Button2);
            resultField.setText(resultString.toString());

        });

        button3.setOnClickListener(view -> {
            resultString.append(R.string.Button3);
            resultField.setText(resultString.toString());

        });

        button4.setOnClickListener(view -> {
            resultString.append(R.string.Button4);
            resultField.setText(resultString.toString());

        });

        button5.setOnClickListener(view -> {
            resultString.append(R.string.Button5);
        });

        button6.setOnClickListener(view -> {
            resultString.append(R.string.Button6);
            resultField.setText(resultString.toString());

        });

        button7.setOnClickListener(view -> {
            resultString.append(R.string.Button7);
            resultField.setText(resultString.toString());

        });

        button8.setOnClickListener(view -> {
            resultString.append(R.string.Button8);
            resultField.setText(resultString.toString());

        });

        button9.setOnClickListener(view -> {
            resultString.append(R.string.Button9);
            resultField.setText(resultString.toString());

        });

        buttonDot.setOnClickListener(view -> {
            if(!flagDot)    {
                resultString.append(R.string.ButtonDot);
                resultField.setText(resultString.toString());
                flagDot = !flagDot;
            }
        });

        buttonDivision.setOnClickListener(view -> {
            calcController.addOperator(resultField.getText().toString(), Operations.DIV);
            resultField.setText(String.format("%d", calcController.result));
        });

        buttonMultiply.setOnClickListener(view -> {
            calcController.addOperator(resultField.getText().toString(), Operations.MULT);
            resultField.setText(String.format("%f", calcController.result));
        });

        buttonPlus.setOnClickListener(view -> {
            calcController.addOperator(resultField.getText().toString(), Operations.ADD);
            resultField.setText(String.format("%f", calcController.result));
        });

        buttonMinus.setOnClickListener(view -> {
            calcController.addOperator(resultField.getText().toString(), Operations.SUB);
            resultField.setText(String.format("%f", calcController.result));
        });

        buttonEqual.setOnClickListener(view -> {
            calcController.addOperator(resultField.getText().toString(), Operations.EQUAL);
            resultField.setText(String.format("%f", calcController.result));
        });

        buttonReset.setOnClickListener(view -> {
            calcController.resetAll();
        });



//        if(savedInstanceState == null)  {
//            logLifeCycle("First start.");
//        }
//        else    {
//            logLifeCycle("Another start.");
//        }

//        Button button8 = findViewById(R.id.button8);
//        button8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "onClick8", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        Button button9 = findViewById(R.id.button9);
//        button9.setOnClickListener(v ->
//                Toast.makeText(MainActivity.this, "onClick9", Toast.LENGTH_SHORT).show());

    }

//    /**
//     * Method for logging of application current status (onCreate, onResume, onStart,...).
//     * Also push a toast notification.
//     * @param log - string to push in toast.
//     */
//    private void logLifeCycle(String log)   {
//        Toast.makeText(this, log, Toast.LENGTH_SHORT).show();
//        Log.d("MainActivity", log);
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        logLifeCycle("onStart");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        logLifeCycle("onResume");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        logLifeCycle("onPause");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        logLifeCycle("onStop");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        logLifeCycle("onDestroy");
//    }
}