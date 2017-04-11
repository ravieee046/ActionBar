package com.ravi.phoebus.www.actionbar;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        intent = new Intent(MainActivity.this, ChildActivity.class);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_activity_bar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_search:
                Toast.makeText(this,"Settings Selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_play:
                Toast.makeText(this,"Play Selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_save:
                startActivity(intent);
                return true;
            default:
                Toast.makeText(this,"This menu item is not handled",Toast.LENGTH_SHORT).show();
                return super.onOptionsItemSelected(item);
        }
    }
}
