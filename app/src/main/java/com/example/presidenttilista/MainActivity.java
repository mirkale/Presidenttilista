package com.example.presidenttilista;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView myListOfPresidents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListOfPresidents = findViewById(R.id.my_list_view);
        myListOfPresidents.setAdapter(new ArrayAdapter<President>(
                this,
                R.layout.activity_layout_for_president,
                ));



    }

    myListOfPresidents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Log.d(TAG, "onItemClick(" + i + ")");
            Intent nextActivity = new Intent(MainActivity.this, PresidentDetailsActivity.class);
            nextActivity.putExtra(EXTRA, i);
            startActivity(nextActivity);
        }
    });
}
