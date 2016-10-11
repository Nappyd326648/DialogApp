package com.eugenestewart.dialogapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public abstract class MainActivity extends
        AppCompatActivity implements EmphasisFragment.EmphasisDialogSelectionListener {

    EditText mUsertext;
    Button mAddEmphasis;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsertext = (EditText) findViewById(R.id.usertext);
        mAddEmphasis = (Button) findViewById(R.id.addemphasis);

        mAddEmphasis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EmphasisFragment dialog = EmphasisFragment.newInstance();
                dialog.show(getFragmentManager(),"Emphasis Dialog");
            }
        });
    }
}

