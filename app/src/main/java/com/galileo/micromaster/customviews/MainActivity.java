package com.galileo.micromaster.customviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.galileo.micromaster.customviews.views.MyButton;

public class MainActivity extends AppCompatActivity {

    MyButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (MyButton) findViewById(R.id.myButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Testing a Custom Button",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
