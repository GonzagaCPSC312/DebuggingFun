package com.sprint.gina.debuggingfun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 3 types of errors
        // 1. compiler/syntax
        // 2. runtime
//        int x = 5 / 0;
        // 3. logic
        // use diagnostic calls (print()/log messages)
        // use the debugger!!!
        int[] myInts = {1, 2, 3, 4, 5};
        int accumulator = 0;
        for (int i = 0; i < myInts.length - 1; i++) {
            accumulator += myInts[i];
        }
        Log.d("MainActivityTag", "onCreate: " + accumulator);
    }
}