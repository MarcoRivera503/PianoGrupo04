package sv.edu.catolica.pianogrupo04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class activity_Piano_Instrumental extends AppCompatActivity {
    MediaPlayer sonido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__piano__instrumental);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
    public void arpa(View v){
        sonido = MediaPlayer.create(getApplicationContext(),R.raw.arpa);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            sonido.start();
        }
    }
    public void bajo(View v){
        sonido = MediaPlayer.create(getApplicationContext(),R.raw.bajo);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            sonido.start();
        }
    }
    public void bongos(View v){
        sonido = MediaPlayer.create(getApplicationContext(),R.raw.bongos);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            sonido.start();
        }
    }
    public void flauta(View v){
        sonido = MediaPlayer.create(getApplicationContext(),R.raw.flauta);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            sonido.start();
        }
    }
    public void piano(View v){
        sonido = MediaPlayer.create(getApplicationContext(),R.raw.piano);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            sonido.start();
        }
    }
    public void tambor(View v){
        sonido = MediaPlayer.create(getApplicationContext(),R.raw.tambor);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            sonido.start();
        }
    }
    public void trompeta(View v){
        sonido = MediaPlayer.create(getApplicationContext(),R.raw.trompeta);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            sonido.start();
        }
    }
}