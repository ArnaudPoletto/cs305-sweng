package com.github.poletto.bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // References to GUI elements
    private EditText mNameText;
    private Button mGoWeather;
    private Button mGoGreetings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // We get a reference to the view objects, using their previously set ID
        mNameText = findViewById(R.id.mainName);
        mGoWeather = findViewById(R.id.goWeather);
        mGoGreetings = findViewById(R.id.goGreetings);

        // We then set the behaviour of the button
        // It's quite short, so we can leave it here, but as soon as it starts
        // doing more complex stuff, it should be moved to a separate method
        mGoGreetings.setOnClickListener(clicked -> {
            String name = mNameText.getText().toString();
            sayHello(name);
        });

        mGoWeather.setOnClickListener(clicked -> {
            enterWeatherForecast();
        });
    }

    /**
     * Opens a new {@link GreetingActivity} saying hello to the specified {@code userName}
     *
     * @param userName the user to greet
     */
    protected void sayHello(String userName) {
        Intent intent = new Intent(this, GreetingActivity.class);
        intent.putExtra(GreetingActivity.EXTRA_USER_NAME, userName);
        startActivity(intent);
    }

    protected void enterWeatherForecast(){
        Intent intent = new Intent(this, WeatherActivity.class);
        startActivity((intent));
    }
}