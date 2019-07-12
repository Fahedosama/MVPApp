package com.example.mvpapp;


import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.example.mvpapp.data.model.Names;

public class DetailsDialog extends Dialog implements
        android.view.View.OnClickListener {

    public Activity c;
    public Dialog d;
    public TextView title,meaning;
    Names name;

    public DetailsDialog(Activity a, Names name) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
        this.name=name;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.details_dialog);
        title = (TextView) findViewById(R.id.textView2);
        meaning = (TextView) findViewById(R.id.textView3);

        title.setText(name.getName_ar());
        meaning.setText(name.getName_meaning());
       // yes.setOnClickListener(this);
       // no.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        dismiss();
    }
}