package com.android.activity_lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();
    private EditText myEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myEditText=(EditText)findViewById(R.id.myedit_text);
        Log.i(TAG,"1 OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"2 OnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"5 OnStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"3 OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"4 OnPause");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("saveVal",myEditText.getText().toString());
        Log.i(TAG,"onSave");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        myEditText.setText(savedInstanceState.getString("saveVal"));
        Log.i(TAG,"onRestore");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"6 OnDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"7 OnRestart");
    }


}
