package sv.edu.catolica.pianogrupo04;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    private static final int TIEMPO=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getSupportActionBar().hide();
        Handler controlador= new Handler();
        controlador.postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
                Intent pianoTradicional = new Intent(Splash.this,activity_PianoTradicional.class);
                startActivity(pianoTradicional);
            }
        },TIEMPO);
    }
}