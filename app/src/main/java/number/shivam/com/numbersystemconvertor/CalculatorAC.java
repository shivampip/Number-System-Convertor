package number.shivam.com.numbersystemconvertor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorAC extends AppCompatActivity {

    EditText et1,et2;
    TextView title,result;
    String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_ly);

        Intent i= this.getIntent();
        type= i.getStringExtra("type");

        title= (TextView) findViewById(R.id.title1);
        et1= (EditText) findViewById(R.id.input1);
        et2= (EditText) findViewById(R.id.input2);
        result= (TextView) findViewById(R.id.result);

        title.setText(type+" Calculator");

    }




    public void add( View v){try {

        String aa = et1.getText().toString();
        String bb = et2.getText().toString();

        if (type.equals("decimal")) {
            int a = Integer.parseInt(aa);
            int b = Integer.parseInt(bb);
            int c = a + b;
            String ans = Integer.toString(c);
            result.setText(ans);
        } else if (type.equals("binary")) {
            int a = Integer.parseInt(aa, 2);
            int b = Integer.parseInt(bb, 2);
            int c = a + b;
            String ans = Integer.toBinaryString(c);
            result.setText(ans);
        } else if (type.equals("octal")) {
            int a = Integer.parseInt(aa, 8);
            int b = Integer.parseInt(bb, 8);
            int c = a + b;
            String ans = Integer.toOctalString(c);
            result.setText(ans);
        } else if (type.equals("hex")) {
            int a = Integer.parseInt(aa, 16);
            int b = Integer.parseInt(bb, 16);
            int c = a + b;
            String ans = Integer.toHexString(c);
            result.setText(ans);
        }
    }catch (Exception e){result.setText("Incorrect Data");}}

    public void sub( View v){try{

        String aa= et1.getText().toString();
        String bb= et2.getText().toString();

        if(type.equals("decimal")){
            int a= Integer.parseInt(aa);
            int b= Integer.parseInt(bb);
            int c= a-b;
            String ans= Integer.toString(c);
            result.setText(ans);
        }
        else if(type.equals("binary")){
            int a= Integer.parseInt(aa,2);
            int b= Integer.parseInt(bb,2);
            int c= a-b;
            String ans= Integer.toBinaryString(c);
            result.setText(ans);
        }
        else if(type.equals("octal")){
            int a= Integer.parseInt(aa,8);
            int b= Integer.parseInt(bb,8);
            int c= a-b;
            String ans= Integer.toOctalString(c);
            result.setText(ans);
        }
        else if(type.equals("hex")){
            int a= Integer.parseInt(aa,16);
            int b= Integer.parseInt(bb,16);
            int c= a-b;
            String ans= Integer.toHexString(c);
            result.setText(ans);
        }
    }catch (Exception e){result.setText("Incorrect Data");}}

    public void mul( View v){try{

        String aa= et1.getText().toString();
        String bb= et2.getText().toString();

        if(type.equals("decimal")){
            int a= Integer.parseInt(aa);
            int b= Integer.parseInt(bb);
            int c= a*b;
            String ans= Integer.toString(c);
            result.setText(ans);
        }
        else if(type.equals("binary")){
            int a= Integer.parseInt(aa,2);
            int b= Integer.parseInt(bb,2);
            int c= a*b;
            String ans= Integer.toBinaryString(c);
            result.setText(ans);
        }
        else if(type.equals("octal")){
            int a= Integer.parseInt(aa,8);
            int b= Integer.parseInt(bb,8);
            int c= a*b;
            String ans= Integer.toOctalString(c);
            result.setText(ans);
        }
        else if(type.equals("hex")){
            int a= Integer.parseInt(aa,16);
            int b= Integer.parseInt(bb,16);
            int c= a*b;
            String ans= Integer.toHexString(c);
            result.setText(ans);
        }
    }catch (Exception e){result.setText("Incorrect Data");}}

    public void div( View v){try{

        String aa= et1.getText().toString();
        String bb= et2.getText().toString();

        if(type.equals("decimal")){
            int a= Integer.parseInt(aa);
            int b= Integer.parseInt(bb);
            int c= a/b;
            String ans= Integer.toString(c);
            result.setText(ans);
        }
        else if(type.equals("binary")){
            int a= Integer.parseInt(aa,2);
            int b= Integer.parseInt(bb,2);
            int c= a/b;
            String ans= Integer.toBinaryString(c);
            result.setText(ans);
        }
        else if(type.equals("octal")){
            int a= Integer.parseInt(aa,8);
            int b= Integer.parseInt(bb,8);
            int c= a/b;
            String ans= Integer.toOctalString(c);
            result.setText(ans);
        }
        else if(type.equals("hex")){
            int a= Integer.parseInt(aa,16);
            int b= Integer.parseInt(bb,16);
            int c= a/b;
            String ans= Integer.toHexString(c);
            result.setText(ans);
        }
    }catch (Exception e){result.setText("Incorrect Data");}}


}
