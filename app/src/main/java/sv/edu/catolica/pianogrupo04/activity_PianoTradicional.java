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

public class activity_PianoTradicional extends AppCompatActivity {
    MediaPlayer sonido;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__piano_tradicional);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
    public void Do(View v){
        if (sonido != null)
            sonido.stop();

       sonido = MediaPlayer.create(getApplicationContext(),R.raw.dop);

           sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(),"¡DO!",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void Re(View v){
        if (sonido != null)
            sonido.stop();

         sonido = MediaPlayer.create(getApplicationContext(), R.raw.re);
            sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(),"¡RE!",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void Mi(View v){
        if (sonido != null)
            sonido.stop();

         sonido = MediaPlayer.create(getApplicationContext(), R.raw.mi);

            sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(),"¡MI!",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void Fa(View v){
        if (sonido != null)
            sonido.stop();

         sonido = MediaPlayer.create(getApplicationContext(), R.raw.fa);

            sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(),"¡FA!",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void So(View v){
        if (sonido != null)
            sonido.stop();

         sonido = MediaPlayer.create(getApplicationContext(), R.raw.so);

            sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(),"¡SO!",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void La(View v)
    {
        if (sonido != null)
            sonido.stop();

      sonido = MediaPlayer.create(getApplicationContext(), R.raw.la);

            sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(),"¡LA!",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void Si(View v){
        if (sonido != null)
            sonido.stop();

         sonido = MediaPlayer.create(getApplicationContext(), R.raw.si);

            sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(),"¡SI!",Toast.LENGTH_SHORT);
        toast.show();
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
                Intent objIntentInfantil = new Intent(getApplicationContext(), activity_Piano_Infantil_Selva.class);
                startActivity(objIntentInfantil);
            case R.id.piano_Instrumento:
                Intent objIntentInstru = new Intent(getApplicationContext(), activity_Piano_Instrumental.class);
                startActivity(objIntentInstru);
            case R.id.acercaDe:
                Intent objIntentAcerca = new Intent(getApplicationContext(), activity_AcercaDeNosotros.class);
                startActivity(objIntentAcerca);
            case R.id.salir:
                finish();
            default:
        }
        return super.onOptionsItemSelected(item);
    }
}