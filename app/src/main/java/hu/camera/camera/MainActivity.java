package hu.camera.camera;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("activity", "starting service");
        MainActivity.this.startService(new Intent(MainActivity.this,DemoCamService.class));
        Log.i("activity", "finish");
        finish();
    }
}
