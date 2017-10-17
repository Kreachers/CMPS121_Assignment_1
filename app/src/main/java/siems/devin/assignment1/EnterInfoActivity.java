package siems.devin.assignment1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import java.util.ArrayList;


public class EnterInfoActivity extends Activity implements OnItemSelectedListener {

    public static String photoName;
    public static String photographer;
    public static String photoYear;
    public static String listViewText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_info);

        final EditText photoNameText = findViewById(R.id.editTextName);
        final EditText photographerText = findViewById(R.id.editTextPhotographer);
        //final EditText photoYearText = findViewById(R.id.editTextYear);

        final Spinner yearSpin = findViewById(R.id.spinnerYear);
        yearSpin.setOnItemSelectedListener(this);

        ArrayList<Integer> spinnerEntries = new ArrayList<>();
        for(int i = 0; i <= 40; i++){
            spinnerEntries.add(2017-i);
        }

        // Creating adapter for spinner
        ArrayAdapter<Integer> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, spinnerEntries);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        yearSpin.setAdapter(dataAdapter);

//        photoName = photoNameText.getText().toString();
//        photographer = photographerText.getText().toString();

        Button done = findViewById(R.id.done_Button);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                photoName = photoNameText.getText().toString();
                photographer = photographerText.getText().toString();
                //photoYear = photoYearText.getText().toString();
                listViewText = photoName + " by " + photographer + " in " + photoYear;
                finish();
            }
        });
    }

    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String photoYearSpinner = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + photoYearSpinner, Toast.LENGTH_LONG).show();
        photoYear = photoYearSpinner;
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}
