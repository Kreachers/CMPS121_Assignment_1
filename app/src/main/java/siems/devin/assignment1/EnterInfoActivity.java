package siems.devin.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

import static siems.devin.assignment1.R.id.spinner;

public class EnterInfoActivity extends AppCompatActivity {

    public static String photoName;
    public static String photographer;
    public static String photoYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_info);

        final EditText photoNameText = (EditText)findViewById(R.id.editTextName);
        final EditText photographerText = (EditText)findViewById(R.id.editTextPhotographer);
        //final EditText photoYearText = (EditText)findViewById(R.id.editTextYear);

        final Spinner yearSpin = (Spinner)findViewById(R.id.spinnerYear);
        yearSpin.setOnItemSelectedListener(yearSpin);
        ArrayList<Integer> spinnerEntries = new ArrayList<>();
        for(int i = 0; i == 40; i++){
            spinnerEntries.add(2017-i);
        }

        // Creating adapter for spinner
        ArrayAdapter<Integer> dataAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, spinnerEntries);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

        Button done = (Button)findViewById(R.id.done_Button);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                photoName = photoNameText.getText().toString();
                photographer = photographerText.getText().toString();
                //photoYear = photoYearText.getText().toString();
                //photoYear = yearSpin.getItemAtPosition();
                finish();
            }
        });
    }

    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }
}
