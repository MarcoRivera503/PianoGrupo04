package sv.edu.catolica.pianogrupo04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class activity_Piano_Infantil_Selva extends AppCompatActivity {
MediaPlayer sonido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__piano__infantil__selva);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
    public void buho(View v){
        sonido = MediaPlayer.create(getApplicationContext(),R.raw.buho);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            sonido.start();
        }
    }
    public void burro(View v){
        sonido = MediaPlayer.create(getApplicationContext(),R.raw.burro);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            sonido.start();
        }
    }
    public void caballo(View v){
        sonido = MediaPlayer.create(getApplicationContext(),R.raw.caballo);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            sonido.start();
        }
    }
    public void gallo(View v){
        sonido = MediaPlayer.create(getApplicationContext(),R.raw.gallo);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            sonido.start();
        }
    }
    public void oveja(View v){
        sonido = MediaPlayer.create(getApplicationContext(),R.raw.oveja);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            sonido.start();
        }
    }
    public void perro(View v){
        sonido = MediaPlayer.create(getApplicationContext(),R.raw.perro);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            sonido.start();
        }
    }
    public void vaca(View v){
        sonido = MediaPlayer.create(getApplicationContext(),R.raw.vaca);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            sonido.start();
        }
    }

}