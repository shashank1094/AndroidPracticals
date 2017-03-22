package es.esy.shashanksingh.question3;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by shashank on 22-Mar-17.
 */

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i=getIntent();

        ((TextView) findViewById(R.id.place_to_set_text)).setText(i.getExtras().getString("sendingtext",""));
    }

}
