package io.fitt.simplecalculator;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.infoButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent myIntent = new Intent(MainActivity.this,info.class);
                startActivity(myIntent);
            }
        });
    }

    public void onClick(View v) {
        EditText et1 = (EditText)findViewById(R.id.num1);
        EditText et2 = (EditText)findViewById(R.id.num2);
        String x1 = et1.getText().toString();
        String x2 = et2.getText().toString();
        Double double1 = Double.parseDouble(x1);
        Double double2 = Double.parseDouble(x2);
        TextView end_number = (TextView) findViewById(R.id.answer);
        double doubletemp = 0;

        if(v.getId()==R.id.plus) {
            doubletemp = double1 + double2;
        }

        if(v.getId()==R.id.minus) {
            doubletemp = double1 - double2;
        }

        if(v.getId()==R.id.multiply) {
            doubletemp = double1 * double2;
        }

        if(v.getId()==R.id.divide) {
            doubletemp = double1 / double2;
        }

        end_number.setText("" + doubletemp);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
