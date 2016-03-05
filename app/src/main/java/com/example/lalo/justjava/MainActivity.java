package com.example.lalo.justjava;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int numberCoffe=0;
    int price=25;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    /**
     * este metodo manda llamar al metodo display cada que es llamado por el onclick del boton
     * @param view
     */
    public void submitOrder(View view){

       // display(numberCoffe);
        total=numberCoffe*price;
        displayPrice(total);

    }

    /**
     * aquí hace la logica del metodo que es multiplicar un numero por la cantidad
     * @param number
     */
    private void display(int number){

        TextView Cant= (TextView) findViewById(R.id.lblCant);
        Cant.setText("" + number);

    }

    private void displayPrice(int number){
        TextView price=(TextView) findViewById(R.id.lblPrecio);
        price.setText(NumberFormat.getCurrencyInstance().format(number));

    }

    public void increment(View view){
        numberCoffe++;
        display(numberCoffe);


    }
    public void decrement(View view){
        if(numberCoffe>0) {
            numberCoffe--;
            display(numberCoffe);
        }
        if(numberCoffe==0){
            display(0);
        }
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
