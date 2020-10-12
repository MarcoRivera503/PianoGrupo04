package sv.edu.catolica.pianogrupo04;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;

public class activity_AcercaDeNosotros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__acerca_de_nosotros);
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
    public void Selectivo(){

        final String[] tipos = {"Piano tradicional", "Piano infantil de la selva", "Piano de instrumentos musicales"};

        AlertDialog.Builder ventanita = new AlertDialog.Builder(this);
        ventanita.setTitle("Cambiar tipo de piano:");
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