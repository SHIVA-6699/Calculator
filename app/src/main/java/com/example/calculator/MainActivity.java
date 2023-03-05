package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17,button18;

    static String str,str2,str1;
    static int num1,num2,value;
    static String result;
    static int i;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.btn1);
        button2=(Button)findViewById(R.id.btn2);
        button3=(Button)findViewById(R.id.btn3);
        button4=(Button) findViewById(R.id.btn4);
        button5=(Button) findViewById(R.id.btn5);
        button6=(Button) findViewById(R.id.btn6);
        button7=(Button)findViewById(R.id.btn7);
        button8=(Button) findViewById(R.id.btn8);
        button9=(Button) findViewById(R.id.btn9);
        button10=(Button) findViewById(R.id.btn10);
        button11=(Button) findViewById(R.id.btn11);
        button12=(Button)findViewById(R.id.btn12);
        button13=(Button)findViewById(R.id.btn13);
        button14=(Button) findViewById(R.id.btn14);
        button15=(Button) findViewById(R.id.btn15);
        button16=(Button)findViewById(R.id.btn16);
        button17=(Button)findViewById(R.id.btn17);
        button18=(Button) findViewById(R.id.btn18);

        editText=(EditText)findViewById(R.id.edit_text);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        editText.setOnClickListener(this);

















    }
public void onClick(View view)
{



  if(view.getId()==R.id.btn1)
  {

      str=editText.getText().toString();

    editText.setText(str.concat("9"));

  }
    if(view.getId()==R.id.btn2)
    {
        str=editText.getText().toString();

        editText.setText(str.concat("8"));

    }
    if(view.getId()==R.id.btn3) {
        str = editText.getText().toString();

        editText.setText(str.concat("7"));

    }
        if(view.getId()==R.id.btn4)
        {
            str=editText.getText().toString();

            editText.setText(str.concat("6"));

        }
        if(view.getId()==R.id.btn5)
        {
            str=editText.getText().toString();

            editText.setText(str.concat("5"));

        }
        if(view.getId()==R.id.btn6)
        {
            str=editText.getText().toString();

            editText.setText(str.concat("4"));

        }

        if(view.getId()==R.id.btn7)
        {
            str=editText.getText().toString();

            editText.setText(str.concat("3"));

        }
        if(view.getId()==R.id.btn8)
        {
            str=editText.getText().toString();

            editText.setText(str.concat("2"));

        }
        if(view.getId()==R.id.btn9)
        {
            str=editText.getText().toString();

            editText.setText(str.concat("1"));

        }


        if(view.getId()==R.id.btn10)
        {
            str=editText.getText().toString();

            editText.setText(str.concat("0"));

        }
        if(view.getId()==R.id.btn18)
        {
            clear();
        }

      if(view.getId()==R.id.btn16)
      {
          str1=editText.getText().toString();
          i=1;
          clear();
      }
      if(view.getId()==R.id.btn13)
      {
          str1=editText.getText().toString();
          i=2;
          clear();

      }
      if(view.getId()==R.id.btn12)
      {
          str1=editText.getText().toString();
          i=3;
          clear();

      }
      if(view.getId()==R.id.btn11)
      {
          str1=editText.getText().toString();
          i=4;
          clear();

      }
      if(view.getId()==R.id.btn14)
      {
          str1= editText.getText().toString();
          i=5;

          clear();

      }
      if(view.getId()==R.id.btn17)
      {
          str2=editText.getText().toString();
          switch (i)
          {
              case 1:
                  num1=Integer.parseInt(str1);
                  num2=Integer.parseInt(str2);
                  value=num1+num2;
                  result=Integer.toString(value);
                  editText.setText(result);
                  break;
              case 2:
                  num1=Integer.parseInt(str1);
                  num2=Integer.parseInt(str2);
                  value=num1-num2;
                  result=Integer.toString(value);
                  editText.setText(result);
                  break;
              case 3:
                  num1=Integer.parseInt(str1);
                  num2=Integer.parseInt(str2);
                  value=num1*num2;
                  result=Integer.toString(value);
                  editText.setText(result);
                  break;
              case 4:
                  num1=Integer.parseInt(str1);
                  num2=Integer.parseInt(str2);
                  value=num1/num2;
                  result=Integer.toString(value);
                  editText.setText(result);
                  break;
              case 5:
                  num1=Integer.parseInt(str1);
                  num2=Integer.parseInt(str2);
                  value=num1%num2;
                  result=Integer.toString(value);
                  editText.setText(result);
                  break;


          }
      }
      if(view.getId()==R.id.btn15)
      {
          editText.setText("Coming soon");
      }
    }




    public void clear()
    {
        editText.setText("");
    }
}