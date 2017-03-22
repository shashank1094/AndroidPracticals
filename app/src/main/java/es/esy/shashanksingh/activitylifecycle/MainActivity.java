package es.esy.shashanksingh.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("OnCreate MainActivity","From onCreate");
        //Toast.makeText(this,"OnCreate",Toast.LENGTH_SHORT).show();
        Button b=(Button) findViewById(R.id.yoButton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,AnotherActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        Log.d("OnStart MainActivity","From onStart");
        //Toast.makeText(this,"OnStart",Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("OnResume MainActivity","From onResume");
        //Toast.makeText(this,"OnResume",Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("OnPause MainActivity","From onPause");
        //Toast.makeText(this,"OnPause",Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("OnStop MainActivity","From onStop");
        //Toast.makeText(this,"OnStop",Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.d("OnRestart MainActivity","From onRestart");
        //Toast.makeText(this,"OnRestart",Toast.LENGTH_SHORT).show();
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d("OnDestroy MainActivity","From onDestroy");
        //Toast.makeText(this,"OnDestroy",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

}
