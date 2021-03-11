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

        if(savedInstanceState == null)  {
            logLifeCycle("First start.");
        }
        else    {
            logLifeCycle("Another start.");
        }

        Button button8 = findViewById(R.id.button8);
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

    @Override
    protected void onStart() {
        super.onStart();
        logLifeCycle("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        logLifeCycle("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        logLifeCycle("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        logLifeCycle("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logLifeCycle("onDestroy");
    }

    // For example.
    private void logLifeCycle(String log)   {
        Toast.makeText(this, log, Toast.LENGTH_SHORT).show();
        Log.d("MainActivity", log);

    }





    @Override
    public void onClick(View view) {

    }
}