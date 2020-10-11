package sv.edu.catolica.pianogrupo04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class activity_Piano_Instrumental extends AppCompatActivity {
    MediaPlayer sonido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__piano__instrumental);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        switch (item.getItemId()){
            case R.id.piano_Tradicional:
                Intent objIntentTradicional = new Intent(activity_Piano_Instrumental.this, activity_PianoTradicional.class);
                startActivity(objIntentTradicional);
                break;
            case R.id.piano_Infantil:
                Intent objIntentInfantil = new Intent(activity_Piano_Instrumental.this, activity_Piano_Infantil_Selva.class);
                startActivity(objIntentInfantil);
                break;
            case R.id.piano_Instrumento:
                break;
            case R.id.acercaDe:
                Intent objIntentAcerca = new Intent(activity_Piano_Instrumental.this, activity_AcercaDeNosotros.class);
                startActivity(objIntentAcerca);
                break;
            case R.id.salir:
                finish();
            default:
        }
       // this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        return super.onOptionsItemSelected(item);

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