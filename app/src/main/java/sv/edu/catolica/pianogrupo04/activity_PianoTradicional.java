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

        toast= Toast.makeText(getApplicationContext(), R.string.DO,Toast.LENGTH_SHORT);
        toast.show();
    }
    public void Re(View v){
        if (sonido != null)
            sonido.stop();

         sonido = MediaPlayer.create(getApplicationContext(), R.raw.re);
            sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(), R.string.RE,Toast.LENGTH_SHORT);
        toast.show();
    }
    public void Mi(View v){
        if (sonido != null)
            sonido.stop();

         sonido = MediaPlayer.create(getApplicationContext(), R.raw.mi);

            sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(), R.string.MI,Toast.LENGTH_SHORT);
        toast.show();
    }
    public void Fa(View v){
        if (sonido != null)
            sonido.stop();

         sonido = MediaPlayer.create(getApplicationContext(), R.raw.fa);

            sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(), R.string.FA,Toast.LENGTH_SHORT);
        toast.show();
    }
    public void So(View v){
        if (sonido != null)
            sonido.stop();

         sonido = MediaPlayer.create(getApplicationContext(), R.raw.so);

            sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(), R.string.SOL,Toast.LENGTH_SHORT);
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

        toast= Toast.makeText(getApplicationContext(), R.string.LA,Toast.LENGTH_SHORT);
        toast.show();
    }
    public void Si(View v){
        if (sonido != null)
            sonido.stop();

         sonido = MediaPlayer.create(getApplicationContext(), R.raw.si);

            sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(), R.string.SI,Toast.LENGTH_SHORT);
        toast.show();
    }
    //SegundaEtapa
    public void Do1(View v){
        if (sonido != null)
            sonido.stop();

        sonido = MediaPlayer.create(getApplicationContext(), R.raw.do1);
        sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(), R.string.DO_,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void Re2(View v){
        if (sonido != null)
            sonido.stop();

        sonido = MediaPlayer.create(getApplicationContext(), R.raw.re2);
        sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(), R.string.RE_,Toast.LENGTH_SHORT);
        toast.show();
    }
    public void Mi3(View v){
        if (sonido != null)
            sonido.stop();

        sonido = MediaPlayer.create(getApplicationContext(), R.raw.mi3);

        sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(), R.string.FA_,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void So4(View v){
        if (sonido != null)
            sonido.stop();

        sonido = MediaPlayer.create(getApplicationContext(), R.raw.sol4);

        sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(), R.string.SOL_,Toast.LENGTH_SHORT);
        toast.show();
    }
    public void La5(View v)
    {
        if (sonido != null)
            sonido.stop();

        sonido = MediaPlayer.create(getApplicationContext(), R.raw.la5);

        sonido.start();
        if (toast != null)
            toast.cancel();

        toast= Toast.makeText(getApplicationContext(), R.string.LA_,Toast.LENGTH_SHORT);
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
            case R.id.piano:
                Selectivo();
                break;
            case R.id.acercaDe:
                Intent objIntentAcerca = new Intent(getApplicationContext(), activity_AcercaDeNosotros.class);
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
                                break;
                            case 1:
                                Intent objIntentInfantil = new Intent(getApplicationContext(), activity_Piano_Infantil_Selva.class);
                                startActivity(objIntentInfantil);
                                break;
                            case 2:
                                Intent objIntentInstru = new Intent(getApplicationContext(), activity_Piano_Instrumental.class);
                                startActivity(objIntentInstru);
                                break;
                            default:
                        }
                    }
                });
                ventanita.create();
        ventanita.show();
    }
}