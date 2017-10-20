package siems.devin.assignment1;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class ViewInfoActivity extends AppCompatActivity {
    ListView listview;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_info);

        listview = (ListView) findViewById(R.id.list_view);
        ArrayList list = EnterInfoActivity.list;

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        listview.setAdapter(adapter);

//        TextView photoNameTextView = (TextView)findViewById(R.id.photoName);
//        TextView photographerTextView = (TextView)findViewById(R.id.photographer);
//        TextView photoYearTextView = (TextView)findViewById(R.id.photoYear);
//
//        photoNameTextView.setText(getString(R.string.photo_name));
//        photographerTextView.setText(getString(R.string.photographer_name));
//        photoYearTextView.setText(getString(R.string.photo_year_taken));
//
//        photoNameTextView.append("                  " + EnterInfoActivity.photoName);
//        photographerTextView.append("    " + EnterInfoActivity.photographer);
//        photoYearTextView.append("                    " + EnterInfoActivity.photoYear);
    }

}
