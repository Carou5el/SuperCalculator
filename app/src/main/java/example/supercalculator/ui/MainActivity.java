package example.supercalculator.ui;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

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
    private static final String NameSharedPreference = "LOGIN";
    private static final String appTheme = "APP_THEME";

    private static final int lightThemeSwitch = 0;
    private static final int darkThemeSwitch = 1;


    // Reject to use '.' twice.
    private boolean flagDot = false;
    StringBuilder resultString = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

//        if (savedInstanceState != null) {
//            themeSwitchState = savedInstanceState.getBoolean("themeSwitchState");
////            if (themeSwitchState)   {
//////                setTheme(R.style.Theme_SuperCalculator2);
////            }
//        }

        super.onCreate(savedInstanceState);
        setTheme(getAppTheme(R.style.Theme_SuperCalculator));
        setContentView(R.layout.activity_main);
        initThemeChooser();
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
            resultString.append(getString(R.string.Button0));
            resultField.setText(resultString.toString());

        });

        button1.setOnClickListener(view -> {
            resultString.append(getString(R.string.Button1));
            resultField.setText(resultString.toString());
        });

        button2.setOnClickListener(view -> {
            resultString.append(getString(R.string.Button2));
            resultField.setText(resultString.toString());

        });

        button3.setOnClickListener(view -> {
            resultString.append(getString(R.string.Button3));
            resultField.setText(resultString.toString());

        });

        button4.setOnClickListener(view -> {
            resultString.append(getString(R.string.Button4));
            resultField.setText(resultString.toString());

        });

        button5.setOnClickListener(view -> {
            resultString.append(getString(R.string.Button5));
            resultField.setText(resultString.toString());
        });

        button6.setOnClickListener(view -> {
            resultString.append(getString(R.string.Button6));
            resultField.setText(resultString.toString());

        });

        button7.setOnClickListener(view -> {
            resultString.append(getString(R.string.Button7));
            resultField.setText(resultString.toString());

        });

        button8.setOnClickListener(view -> {
            resultString.append(getString(R.string.Button8));
            resultField.setText(resultString.toString());

        });

        button9.setOnClickListener(view -> {
            resultString.append(getString(R.string.Button9));
            resultField.setText(resultString.toString());

        });

        buttonDot.setOnClickListener(view -> {
            if(!flagDot)    {
                resultString.append(getString(R.string.ButtonDot));
                resultField.setText(resultString.toString());
                // a flag to doesn't use buttonDot twice.
                flagDot = !flagDot;
            }
        });

        buttonDivision.setOnClickListener(view -> {
            // Define operand(1st or 2nd).
            calcController.addOperand(Operations.DIV, resultString);
            resultString.delete(0, resultField.length());
//            resultField.setText(String.format("%1$f", calcController.result));
        });

        buttonMultiply.setOnClickListener(view -> {
            calcController.addOperand(Operations.MULT, resultString);
            resultString.delete(0, resultField.length());

//            resultField.setText(String.format("%f", calcController.result));
        });

        buttonPlus.setOnClickListener(view -> {
            calcController.addOperand(Operations.ADD, resultString);
            resultString.delete(0, resultField.length());

//            resultField.setText(String.format("%f", calcController.result));
        });

        buttonMinus.setOnClickListener(view -> {
            calcController.addOperand(Operations.SUB, resultString);
            resultString.delete(0, resultField.length());

//            resultField.setText(String.format("%f", calcController.result));
        });

        buttonEqual.setOnClickListener(view -> {
            calcController.addOperand(Operations.EQUAL, resultString);
            resultString.delete(0, resultField.length());

            resultField.setText(String.format(Locale.getDefault(),"%f", calcController.result));

            calcController.resetAll();
            flagDot = false;
            resultString.delete(0, resultField.length());
        });

        buttonReset.setOnClickListener(view -> {
            calcController.resetAll();
            flagDot = false;
            resultString.delete(0, resultField.length());
            resultField.setText(R.string.Button0);
        });
    }

    private void initThemeChooser()   {
        initRadioButton(findViewById(R.id.themeLightTheme), lightThemeSwitch);
        initRadioButton(findViewById(R.id.themeDarkTheme), darkThemeSwitch);
    }

    private void initRadioButton(View button, final int codeStyle)  {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAppTheme(codeStyle);
                recreate();
            }
        });
    }

    private int getAppTheme(int codeStyle)   {
        return codeStyleToStyleId(getCodeStyle(codeStyle));
    }

    private int getCodeStyle(int codeStyle){
        // Работаем через специальный класс сохранения и чтения настроек
        SharedPreferences sharedPref = getSharedPreferences(NameSharedPreference, MODE_PRIVATE);
        //Прочитать тему, если настройка не найдена - взять по умолчанию
        return sharedPref.getInt(appTheme, codeStyle);
    }

    private void setAppTheme(int codeStyle) {
        SharedPreferences sharedPref = getSharedPreferences(NameSharedPreference, MODE_PRIVATE);
        // Настройки сохраняются посредством специального класса editor.
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(appTheme, codeStyle);
        editor.apply();
    }

    private int codeStyleToStyleId(int codeStyle){
        switch(codeStyle){
            case 0:
                return R.style.Theme_SuperCalculator;
            case 1:
                return R.style.Theme_SuperCalculatorDark;
            default:
                return R.style.Theme_SuperCalculator;
        }
    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

    }
}