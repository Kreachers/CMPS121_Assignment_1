package siems.devin.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_info);

        TextView photoNameTextView = (TextView)findViewById(R.id.photoName);
        TextView photographerTextView = (TextView)findViewById(R.id.photographer);
        TextView photoYearTextView = (TextView)findViewById(R.id.photoYear);

        photoNameTextView.setText(getString(R.string.photo_name));
        photographerTextView.setText(getString(R.string.photographer_name));
        photoYearTextView.setText(getString(R.string.photo_year_taken));

        photoNameTextView.append("     " + EnterInfoActivity.photoName);
        photographerTextView.append(EnterInfoActivity.photographer);
        photoYearTextView.append("     " + EnterInfoActivity.photoYear);
    }
}
