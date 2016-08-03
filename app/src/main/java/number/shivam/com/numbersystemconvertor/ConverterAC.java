package number.shivam.com.numbersystemconvertor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ConverterAC extends AppCompatActivity {

    EditText input;
    TextView title,t1,t2,t3,v1,v2,v3,warn;
    String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.converter_ly);

        title= (TextView) findViewById(R.id.title);
        input= (EditText) findViewById(R.id.input);
        t1= (TextView) findViewById(R.id.t1);
        t2= (TextView) findViewById(R.id.t2);
        t3= (TextView) findViewById(R.id.t3);
        v1= (TextView) findViewById(R.id.v1);
        v2= (TextView) findViewById(R.id.v2);
        v3= (TextView) findViewById(R.id.v3);
        warn= (TextView) findViewById(R.id.warn);

        Intent i= this.getIntent();
        type= i.getStringExtra("type");

        switch (type){
            case "decimal":
                title.setText("Decimal to Others");
                input.setHint("Enter a decimal value");
                break;
            case "octal":
                title.setText("Octal to Others");
                input.setHint("Enter an octal value");
                break;
            case "binary":
                title.setText("Binary to Others");
                input.setHint("Enter a binary value");
                break;
            case "hex":
                title.setText("Hexadecimal to Others");
                input.setHint("Enter a hexadecimal value");
                break;
        }

    }

    String d,b,o,h;

    public void convert(View v){

        String temp="";
        try {temp = input.getText().toString();}catch (Exception e){}
        warn.setText("\n");

        try {
            if (type.equals("decimal")) {
                int value = Integer.parseInt(temp);
                b = Integer.toBinaryString(value);
                o = Integer.toOctalString(value);
                h = Integer.toHexString(value);

                t1.setText("Binary");
                t2.setText("Octal");
                t3.setText("Hexadecimal");

                v1.setText(b);
                v2.setText(o);
                v3.setText(h);
            } else if (type.equals("binary")) {
                int value = Integer.parseInt(temp, 2);
                d = value + "";
                o = Integer.toOctalString(value);
                h = Integer.toHexString(value);

                t1.setText("Decimal");
                t2.setText("Octal");
                t3.setText("Hexadecimal");

                v1.setText(d);
                v2.setText(o);
                v3.setText(h);
            } else if (type.equals("octal")) {
                int value = Integer.parseInt(temp, 8);
                d = value + "";
                b = Integer.toBinaryString(value);
                h = Integer.toHexString(value);

                t1.setText("Decimal");
                t2.setText("Binary");
                t3.setText("Hexadecimal");

                v1.setText(d);
                v2.setText(b);
                v3.setText(h);
            } else if (type.equals("hex")) {
                int value = Integer.parseInt(temp, 16);
                d = value + "";
                o = Integer.toOctalString(value);
                b = Integer.toBinaryString(value);

                t1.setText("Decimal");
                t2.setText("Octal");
                t3.setText("Binary");

                v1.setText(d);
                v2.setText(o);
                v3.setText(b);
            }
        }catch (Exception e){
            warn.setText("Incorrect Input. Please try again");
            t1.setText("");
            t2.setText("");
            t3.setText("");
            v1.setText("");
            v2.setText("");
            v3.setText("");
        }
    }






}//class END
