package com.stack.portal.gridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonName = (Button) findViewById(R.id.button_name);
        buttonName.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView textName=(TextView) findViewById(R.id.text_name);
                        textName.setText("Hello You clicked me ");

                    }
                }

        );
        buttonName.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView textName=(TextView) findViewById(R.id.text_name);
                        textName.setText("Hey You clicked Longggg click");
                        return true;
                    }

                }
        );


    }
}
