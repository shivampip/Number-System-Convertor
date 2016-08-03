package number.shivam.com.numbersystemconvertor;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
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








    public void decimal( View v){
        Intent i= new Intent( this, ConverterAC.class);
        i.putExtra("type","decimal");
        this.startActivity(i);
    }

    public void octal( View v){
        Intent i= new Intent( this, ConverterAC.class);
        i.putExtra("type","octal");
        this.startActivity(i);
    }

    public void binary( View v){
        Intent i= new Intent( this, ConverterAC.class);
        i.putExtra("type","binary");
        this.startActivity(i);
    }

    public void hex( View v){
        Intent i= new Intent( this, ConverterAC.class);
        i.putExtra("type","hex");
        this.startActivity(i);
    }



    public void decimalCalc( View v){
        Intent i= new Intent( this, CalculatorAC.class);
        i.putExtra("type","decimal");
        this.startActivity(i);
    }

    public void octalCalc( View v){
        Intent i= new Intent( this, CalculatorAC.class);
        i.putExtra("type","octal");
        this.startActivity(i);
    }

    public void binaryCalc( View v){
        Intent i= new Intent( this, CalculatorAC.class);
        i.putExtra("type","binary");
        this.startActivity(i);
    }

    public void hexCalc( View v){
        Intent i= new Intent( this, CalculatorAC.class);
        i.putExtra("type","hex");
        this.startActivity(i);
    }









}//Class END
