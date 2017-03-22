package es.esy.shashanksingh.activitylifecycle;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by shashank on 28-Jan-17.
 */

public class Fragment1 extends Fragment {

    @Override
    public void onAttach(Context context) {
        Log.d("onAttach Fragment","From onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d("OnCreate Fragment","From onCreate");
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("onCreateView Fragment","From onCreateView");
        return inflater.inflate(R.layout.fragment_layout,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.d("onActivityCreated Frag","From onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d("onStart Fragment","From onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d("onResume Fragment","From onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d("onPause Fragment","From onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d("onStop Fragment","From onStop");
        super.onStop();
    }


    @Override
    public void onDestroyView() {
        Log.d("onDestroyView Fragment","From onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("onDestroy Fragment","From onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d("onDetach Fragment","From onDetach");
        super.onDetach();
    }
}
