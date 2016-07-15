package com.mark.snackbardemo;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button snackbar = (Button) findViewById(R.id.button);
        snackbar.setOnClickListener(view ->
                Snackbar.make(view, "This is a Snackbar !", Snackbar.LENGTH_SHORT)
                        .setAction("COOL", view1 ->
                                Toast.makeText(this, "This is a Toast !", Toast.LENGTH_SHORT).show()
                        )
                        .show());
    }

}
