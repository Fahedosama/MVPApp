package com.example.mvpapp.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mvpapp.R;

public class MainActivity extends AppCompatActivity implements MainMvpView {

    Button button;
    TextView textView;
    EditText editText;

    private MainPresenter mainPresenter;
    int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);

        mainPresenter = new MainPresenter(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!editText.getText().toString().isEmpty()){
                    x = Integer.parseInt(editText.getText().toString());
                    mainPresenter.onButtonClick(x);
                }

            }
        });


    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSign(String sign) {
        textView.setText(sign);
    }

    @Override
    public void showAlert(String sign) {
        Toast.makeText(this, sign, Toast.LENGTH_SHORT).show();
        textView.setText(sign);
    }

    @Override
    public void showInfo(String sign) {

    }

    public void sayHelloToFahed(){
        System.out.println("Hello Fahed...");
    }
}
