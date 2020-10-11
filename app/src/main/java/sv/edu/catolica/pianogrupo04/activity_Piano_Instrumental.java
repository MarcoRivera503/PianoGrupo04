package sv.edu.catolica.pianogrupo04;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class activity_Piano_Instrumental extends AppCompatActivity {

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
        return super.onOptionsItemSelected(item);
    }
}