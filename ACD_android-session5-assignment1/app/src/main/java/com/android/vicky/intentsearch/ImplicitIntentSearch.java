package com.android.vicky.intentsearch;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ImplicitIntentSearch extends AppCompatActivity {
    Button btnSearch;
    EditText txtQuery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent_search);

        btnSearch = (Button)findViewById(R.id.search);
        txtQuery = (EditText)findViewById(R.id.query);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String query = txtQuery.getText().toString();
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, query); // query contains search string
                startActivity(intent);
            }
        });
    }
}
