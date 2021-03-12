package example.supercalculator.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        // Find textBox.
        TextView resultField = findViewById(R.id.resultField);

        button0.setOnClickListener(view -> {
            // todo: add a handler for NUMBER button click
        });

        button1.setOnClickListener(view -> {
            // todo: add a handler for NUMBER button click
        });

        button2.setOnClickListener(view -> {
            // todo: add a handler for NUMBER button click
        });

        button3.setOnClickListener(view -> {
            // todo: add a handler for NUMBER button click
        });

        button4.setOnClickListener(view -> {
            // todo: add a handler for NUMBER button click
        });

        button5.setOnClickListener(view -> {
            // todo: add a handler for NUMBER button click
        });

        button6.setOnClickListener(view -> {
            // todo: add a handler for NUMBER button click
        });

        button7.setOnClickListener(view -> {
            // todo: add a handler for NUMBER button click
        });

        button8.setOnClickListener(view -> {
            // todo: add a handler for NUMBER button click
        });

        button9.setOnClickListener(view -> {
            // todo: add a handler for NUMBER button click
        });

        buttonDot.setOnClickListener(view -> {
            // todo: add a handler for DOT button click
        });

        buttonDivision.setOnClickListener(view -> {
            // todo: add a handler for OPERATOR button click
        });

        buttonMultiply.setOnClickListener(view -> {
            // todo: add a handler for OPERATOR button click
        });

        buttonPlus.setOnClickListener(view -> {
            // todo: add a handler for OPERATOR button click
        });

        buttonMinus.setOnClickListener(view -> {
            // todo: add a handler for OPERATOR button click
        });

        buttonEqual.setOnClickListener(view -> {
            // todo: add a handler for RESULT button click
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