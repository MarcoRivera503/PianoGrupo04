package sv.edu.catolica.pianogrupo04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class activity_PianoTradicional extends AppCompatActivity {
    MediaPlayer sonido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__piano_tradicional);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
    public void Do(View v){
       sonido = MediaPlayer.create(getApplicationContext(),R.raw.dop);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
           sonido.start();
       }
    }
    public void Re(View v){
         sonido = MediaPlayer.create(getApplicationContext(), R.raw.re);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            sonido.start();
        }
    }
    public void Mi(View v){
         sonido = MediaPlayer.create(getApplicationContext(), R.raw.mi);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            sonido.start();
        }
    }
    public void Fa(View v){
         sonido = MediaPlayer.create(getApplicationContext(), R.raw.fa);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            sonido.start();
        }
    }
    public void So(View v){
         sonido = MediaPlayer.create(getApplicationContext(), R.raw.so);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            sonido.start();
        }
    }
    public void La(View v)
    {
      sonido = MediaPlayer.create(getApplicationContext(), R.raw.la);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            sonido.start();
        }
    }
    public void Si(View v){
         sonido = MediaPlayer.create(getApplicationContext(), R.raw.si);
        if (sonido.isPlaying()){
            sonido.stop();
        }else {
            sonido.start();
        }
    }
}