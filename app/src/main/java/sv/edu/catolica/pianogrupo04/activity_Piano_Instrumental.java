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
import android.widget.Toast;

public class activity_Piano_Instrumental extends AppCompatActivity {
    MediaPlayer sonido;
    Toast toast ;
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
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.piano:
                Selectivo();
                break;
            case R.id.acercaDe:
                Intent objIntentAcerca = new Intent(getApplicationContext(), activity_AcercaDeNosotros.class);
                startActivity(objIntentAcerca);
                break;
            case R.id.salir:
                Salir();
            default:
        }
       // this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        return super.onOptionsItemSelected(item);

    }
    public void Salir(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.salir).setPositiveButton(R.string.si, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish(); System.exit(0);
            }
        }).setNegativeButton(R.string.cancelar, new DialogInterface.OnClickListener() {
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
    public void Selectivo(){

        final String[] tipos = {getString(R.string.tradicional), getString(R.string.selva), getString(R.string.instrumentos)};

        AlertDialog.Builder ventanita = new AlertDialog.Builder(this);
        ventanita.setTitle(R.string.cambiar);
        ventanita.setItems(tipos, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int item) {
                switch (item){
                    case 0:
                        Intent objIntentTradicional = new Intent(getApplicationContext(), activity_PianoTradicional.class);
                        startActivity(objIntentTradicional);
                        break;
                    case 1:
                        Intent objIntentInfantil = new Intent(getApplicationContext(), activity_Piano_Infantil_Selva.class);
                        startActivity(objIntentInfantil);
                        break;
                    case 2:
                        break;
                    default:
                }
            }
        });
        ventanita.create();
        ventanita.show();
    }
    public void arpa(View v){
        if (sonido != null)
            sonido.stop();



        sonido = MediaPlayer.create(getApplicationContext(),R.raw.arpa);
        sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(), R.string.ARPA,Toast.LENGTH_SHORT);
        toast.show();
    }
    public void bajo(View v){
        if (sonido != null)
            sonido.stop();
        sonido = MediaPlayer.create(getApplicationContext(),R.raw.bajo);

            sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(), R.string.BAJO,Toast.LENGTH_SHORT);
        toast.show();
    }
    public void bongos(View v){
        if (sonido != null)
            sonido.stop();
        sonido = MediaPlayer.create(getApplicationContext(),R.raw.bongos);

            sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(), R.string.BONGOS,Toast.LENGTH_SHORT);
        toast.show();
    }
    public void flauta(View v){
        if (sonido != null)
            sonido.stop();
        sonido = MediaPlayer.create(getApplicationContext(),R.raw.flauta);

            sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(), R.string.FLAUTA,Toast.LENGTH_SHORT);
        toast.show();
    }
    public void piano(View v){
        if (sonido != null)
            sonido.stop();
        sonido = MediaPlayer.create(getApplicationContext(),R.raw.piano);

            sonido.start();
        if (toast != null)
            toast.cancel();
        toast= Toast.makeText(getApplicationContext(), R.string.PIANO,Toast.LENGTH_SHORT);
        toast.show();
    }
    public void tambor(View v){
        if (sonido != null)
            sonido.stop();
        sonido = MediaPlayer.create(getApplicationContext(),R.raw.tambor);

            sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(), R.string.TAMBOR,Toast.LENGTH_SHORT);
        toast.show();
    }
    public void trompeta(View v){
        if (sonido != null)
            sonido.stop();
        sonido = MediaPlayer.create(getApplicationContext(),R.raw.trompeta);

            sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(), R.string.TROMPETA,Toast.LENGTH_SHORT);
        toast.show();
    }
}