package es.esy.shashanksingh.question3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button go=(Button) findViewById(R.id.send_button);
        final EditText editText=(EditText) findViewById(R.id.text_to_send);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texty =editText.getText().toString();

                if (texty.length()==0){
                    Toast.makeText(MainActivity.this,"No text entered",Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    intent.putExtra("sendingtext", texty);
                    startActivity(intent);
                }
            }
        });
    }
}
