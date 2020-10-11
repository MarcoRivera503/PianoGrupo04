package sv.edu.catolica.pianogrupo04;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class activity_Piano_Infantil_Selva extends AppCompatActivity {
MediaPlayer sonido;
Toast toast;
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
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.piano_Tradicional:
            Intent objIntentTradicional = new Intent(getApplicationContext(), activity_PianoTradicional.class);
            startActivity(objIntentTradicional);
                break;
            case R.id.piano_Infantil:
                break;
            case R.id.piano_Instrumento:
                Intent objIntentInstru = new Intent(getApplicationContext(), activity_Piano_Instrumental.class);
                startActivity(objIntentInstru);
                break;
            case R.id.acercaDe:
                Intent objIntentAcerca = new Intent(getApplicationContext(), activity_AcercaDeNosotros.class);
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
        if (sonido != null)
            sonido.stop();

        sonido = MediaPlayer.create(getApplicationContext(),R.raw.buho);

            sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(),"¡BUHO!",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void burro(View v){
        if (sonido != null)
            sonido.stop();
        sonido = MediaPlayer.create(getApplicationContext(),R.raw.burro);

            sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(),"¡BURRO!",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void caballo(View v){
        if (sonido != null)
            sonido.stop();
        sonido = MediaPlayer.create(getApplicationContext(),R.raw.caballo);

            sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(),"¡CABALLO!",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void gallo(View v){
        if (sonido != null)
            sonido.stop();

        sonido = MediaPlayer.create(getApplicationContext(),R.raw.gallo);
            sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(),"¡GALLO!",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void oveja(View v){
        if (sonido != null)
            sonido.stop();

        sonido = MediaPlayer.create(getApplicationContext(),R.raw.oveja);
            sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(),"¡OVEJA!",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void perro(View v){
        if (sonido != null)
            sonido.stop();

        sonido = MediaPlayer.create(getApplicationContext(),R.raw.perro);
        sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(),"¡PERRO!",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void vaca(View v){
        if (sonido != null)
            sonido.stop();

        sonido = MediaPlayer.create(getApplicationContext(),R.raw.vaca);
        sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(),"¡VACA!",Toast.LENGTH_SHORT);
        toast.show();
    }
}