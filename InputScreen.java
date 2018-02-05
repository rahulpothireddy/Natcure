package com.example.natcure.natcure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class InputScreen extends AppCompatActivity {
    AutoCompleteTextView actv1,actv2,actv3;
    Button submit;
String bodyPart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_screen);
        submit=(Button)findViewById(R.id.button_symptoms);
        Bundle b=this.getIntent().getExtras();
        bodyPart=getIntent().getStringExtra("bodypart");
        String[] symSuggest=b.getStringArray("parts");
        actv1=(AutoCompleteTextView)findViewById(R.id.symptom1);
        actv2=(AutoCompleteTextView)findViewById(R.id.symptom2);
        actv3=(AutoCompleteTextView)findViewById(R.id.symptom3);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.select_dialog_item,symSuggest);
        actv1.setThreshold(2);
        actv1.setAdapter(adapter);
        actv2.setThreshold(2);
        actv2.setAdapter(adapter);
        actv3.setThreshold(2);
        actv3.setAdapter(adapter);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] result={bodyPart,actv1.getText().toString(),
                        actv2.getText().toString(),actv3.getText().toString()};
                Intent intent=new Intent(InputScreen.this,RemedyScreen.class);
                Bundle bundle=new Bundle();
                bundle.putStringArray("result",result);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
