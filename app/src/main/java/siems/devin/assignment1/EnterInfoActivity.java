package siems.devin.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class EnterInfoActivity extends AppCompatActivity {
    public static String photoName;
    public static String photographer;
    public static String photoYear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_info);
        Button done = (Button)findViewById(R.id.done_Button);
        final EditText photoNameText = (EditText)findViewById(R.id.editTextName);
        final EditText photographerText = (EditText)findViewById(R.id.editTextPhotographer);
        final EditText photoYearText = (EditText)findViewById(R.id.editTextYear);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                photoName = photoNameText.getText().toString();
                photographer = photographerText.getText().toString();
                photoYear = photoYearText.getText().toString();
                finish();
            }
        });
    }
}
