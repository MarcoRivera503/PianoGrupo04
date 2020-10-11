package sv.edu.catolica.pianogrupo04;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.piano_Tradicional:
                break;
            case R.id.piano_Infantil:
                Intent objIntentInfantil = new Intent(activity_PianoTradicional.this, activity_Piano_Infantil_Selva.class);
                startActivity(objIntentInfantil);
                break;
            case R.id.piano_Instrumento:
                Intent objIntentInstru = new Intent(activity_PianoTradicional.this, activity_Piano_Instrumental.class);
                startActivity(objIntentInstru);
                break;
            case R.id.acercaDe:
                Intent objIntentAcerca = new Intent(activity_PianoTradicional.this, activity_AcercaDeNosotros.class);
                startActivity(objIntentAcerca);
                break;
            case R.id.salir:
                Salir();
                break;
            default:
        }
        return super.onOptionsItemSelected(item);
    }

    public void Salir(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("¿Desea salir de PianoGrupo04?").setPositiveButton("Sí", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        }).setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == event.KEYCODE_BACK){
            Salir();
        }
        return super.onKeyDown(keyCode, event);
    }
}