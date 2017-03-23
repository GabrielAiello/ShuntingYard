package com.example.darksword.shuntingyard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.darksword.shuntingyard.R.id.editText;
import static com.example.darksword.shuntingyard.R.id.textView;
import static com.example.darksword.shuntingyard.R.id.userInput;

public class MainActivity extends AppCompatActivity
{
    private EditText userInput;
    private TextView TV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.userInput = (EditText)this.findViewById(R.id.userInput);
        this.TV = (TextView)this.findViewById(R.id.TV);

    }
    public void function()
    {
        String s = userInput.getText().toString();

    }
}
