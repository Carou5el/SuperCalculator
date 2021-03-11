package example.supercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

    /**
     * Realize interface View.OnClickListener.
     * @param view - View object.
     */
    @Override
    public void onClick(View view) {
        switch (view.getId())   {
            case R.id.button0:
                //todo: make a method for this button.
                break;
            case R.id.button1:
                //todo: make a method for this button.
                break;
            case R.id.button2:
                //todo: make a method for this button.
                break;
            case R.id.button3:
                //todo: make a method for this button.
                break;
            case R.id.button4:
                //todo: make a method for this button.
                break;
            case R.id.button5:
                //todo: make a method for this button.
                break;
            case R.id.button6:
                //todo: make a method for this button.
                break;
            case R.id.button7:
                //todo: make a method for this button.
                break;
            case R.id.button8:
                //todo: make a method for this button.
                break;
            case R.id.button9:
                //todo: make a method for this button.
                break;
            case R.id.buttonDot:
                //todo: make a method for this button.
                break;
            case R.id.buttonDivision:
                //todo: make a method for this button.
                break;
            case R.id.buttonMultiply:
                //todo: make a method for this button.
                break;
            case R.id.buttonPlus:
                //todo: make a method for this button.
                break;
            case R.id.buttonMinus:
                //todo: make a method for this button.
                break;
            case R.id.buttonEqual:
                //todo: make a method for this button.
                break;

        }

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