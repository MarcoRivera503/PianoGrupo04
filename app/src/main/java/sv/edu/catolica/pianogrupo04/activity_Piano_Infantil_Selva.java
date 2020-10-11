package sv.edu.catolica.pianogrupo04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class activity_Piano_Infantil_Selva extends AppCompatActivity {
MediaPlayer sonido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__piano__infantil__selva);
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
            Intent objIntentTradicional = new Intent(activity_Piano_Infantil_Selva.this, activity_PianoTradicional.class);
            startActivity(objIntentTradicional);
                break;
            case R.id.piano_Infantil:
                break;
            case R.id.piano_Instrumento:
                Intent objIntentInstru = new Intent(activity_Piano_Infantil_Selva.this, activity_Piano_Instrumental.class);
                startActivity(objIntentInstru);
                break;
            case R.id.acercaDe:
                Intent objIntentAcerca = new Intent(activity_Piano_Infantil_Selva.this, activity_AcercaDeNosotros.class);
                startActivity(objIntentAcerca);
                break;
            case R.id.salir:
                finish();
            default:
        }
        return super.onOptionsItemSelected(item);
       // this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
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
}