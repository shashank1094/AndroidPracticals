package es.esy.shashanksingh.activitylifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by shashank on 27-Jan-17.
 */

public class AnotherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Toast.makeText(this,"OnCreate1",Toast.LENGTH_SHORT).show();
        Log.d("OnCreate OtherActivity","From onCreate");
    }

    @Override
    protected void onStart() {
        Log.d("OnStart OtherActivity","From onStart");
        //Toast.makeText(this,"OnStart1",Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("OnResume OtherActivity","From onResume");
        //Toast.makeText(this,"OnResume1",Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("OnPause OtherActivity","From onPause");
        //Toast.makeText(this,"OnPause1",Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("OnStop OtherActivity","From onStop");
        //Toast.makeText(this,"OnStop1",Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.d("OnRestart OtherActivity","From onRestart");
        //Toast.makeText(this,"OnRestart1",Toast.LENGTH_SHORT).show();
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d("OnDestroy OtherActivity","From onDestroy");
        //Toast.makeText(this,"OnDestroy1",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}
