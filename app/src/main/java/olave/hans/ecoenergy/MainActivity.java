package olave.hans.ecoenergy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText nombre = findViewById(R.id.Nombre);
        EditText direccion = findViewById(R.id.Domicilio);
        EditText telefono = findViewById(R.id.Telefono);
        EditText email = findViewById(R.id.CorreoElectronico);

        RadioGroup radioGroupHomeType = findViewById(R.id.RadioGrupo);
        RadioButton house = findViewById(R.id.BotonCasa);
        RadioButton apartment = findViewById(R.id.BotonApto);
        RadioButton farm = findViewById(R.id.BotonGranja);

        CheckBox paneles = findViewById(R.id.Paneles);
        CheckBox aerogeneradores = findViewById(R.id.Aerogeneradores);
        CheckBox energiarenovable = findViewById(R.id.SistemaEnergia);
        Button enviar = findViewById(R.id.Enviar);


        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Name: " + nombre.getText().toString()+"\n"+
                                 "Address: " + direccion.getText().toString()+"\n"+
                                 "Phone: " + telefono.getText().toString()+"\n"+
                                 "Email: " + email.getText().toString();

                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

                if (house.isChecked()){
                    Toast.makeText(MainActivity.this, "Elegiste Casa !", Toast.LENGTH_SHORT).show();
                    house.setChecked(false);
                }

                if (apartment.isChecked()){
                    Toast.makeText(MainActivity.this, "Elegiste Apartamento !", Toast.LENGTH_SHORT).show();
                    apartment.setChecked(false);
                }

                if (farm.isChecked()){
                    Toast.makeText(MainActivity.this, "Elegiste Granja !", Toast.LENGTH_SHORT).show();
                    farm.setChecked(false);
                }

                if (paneles.isChecked()){
                    Toast.makeText(MainActivity.this, "Elegiste Paneles Solares !", Toast.LENGTH_SHORT).show();
                    paneles.setChecked(false);
                }

                if (aerogeneradores.isChecked()){
                    Toast.makeText(MainActivity.this, "Elegiste Aerogeneradores !", Toast.LENGTH_SHORT).show();
                    aerogeneradores.setChecked(false);
                }

                if (energiarenovable.isChecked()){
                    Toast.makeText(MainActivity.this, "Elegiste Otros Sistemas de Energia Renovable !", Toast.LENGTH_SHORT).show();
                    energiarenovable.setChecked(false);
                }


            }


        });


    }
}