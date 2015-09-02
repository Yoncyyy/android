package com.example.administrator.jisuanqi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    private Button bt_1,bt_2,bt_3,bt_4,bt_5,bt_6,bt_7,bt_8,bt_9,bt_0,bt_deng,
                    bt_jia,bt_jian,bt_cheng,bt_chu,bt_pt,bt_bk,bt_c;
    private TextView result;
    private double num1,num2;
    private String option = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_1 = (Button)findViewById(R.id.bt_1);
        bt_2 = (Button)findViewById(R.id.bt_2);
        bt_3 = (Button)findViewById(R.id.bt_3);
        bt_4 = (Button)findViewById(R.id.bt_4);
        bt_5 = (Button)findViewById(R.id.bt_5);
        bt_6 = (Button)findViewById(R.id.bt_6);
        bt_7 = (Button)findViewById(R.id.bt_7);
        bt_8 = (Button)findViewById(R.id.bt_8);
        bt_9 = (Button)findViewById(R.id.bt_9);
        bt_0 = (Button)findViewById(R.id.bt_0);
        bt_jia   = (Button)findViewById(R.id.bt_jia);
        bt_jian  = (Button)findViewById(R.id.bt_jian);
        bt_cheng = (Button)findViewById(R.id.bt_cheng);
        bt_chu   = (Button)findViewById(R.id.bt_chu);
        bt_pt    = (Button)findViewById(R.id.bt_pt);
        bt_c     = (Button)findViewById(R.id.bt_c);

        bt_bk    = (Button)findViewById(R.id.bt_bk);
        bt_deng  = (Button)findViewById(R.id.bt_deng);
        result   = (TextView)findViewById(R.id.result);

        bt_0.setOnClickListener(this);
        bt_1.setOnClickListener(this);
        bt_2.setOnClickListener(this);
        bt_3.setOnClickListener(this);
        bt_4.setOnClickListener(this);
        bt_5.setOnClickListener(this);
        bt_6.setOnClickListener(this);
        bt_7.setOnClickListener(this);
        bt_8.setOnClickListener(this);
        bt_9.setOnClickListener(this);
        bt_c.setOnClickListener(this);
        bt_bk.setOnClickListener(this);
        bt_pt.setOnClickListener(this);
        bt_jia.setOnClickListener(this);
        bt_jian.setOnClickListener(this);
        bt_cheng.setOnClickListener(this);
        bt_chu.setOnClickListener(this);
        bt_deng.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(result.getText().toString().trim().equals("0.0")||result.getText().toString().trim().equals("0")){
            result.setText("");
        }
        switch (v.getId()){
            case R.id.bt_0:
                result.setText(result.getText()+"0");
                break;
            case R.id.bt_1:
                result.setText(result.getText()+"1");
                break;
            case R.id.bt_2:
                result.setText(result.getText()+"2");
                break;
            case R.id.bt_3:
                result.setText(result.getText()+"3");
                break;
            case R.id.bt_4:
                result.setText(result.getText()+"4");
                break;
            case R.id.bt_5:
                result.setText(result.getText()+"5");
                break;
            case R.id.bt_6:
                result.setText(result.getText()+"6");
                break;
            case R.id.bt_7:
                result.setText(result.getText()+"7");
                break;
            case R.id.bt_8:
                result.setText(result.getText()+"8");
                break;
            case R.id.bt_9:
                result.setText(result.getText()+"9");
                break;
            case R.id.bt_pt:
                if(result.getText().equals("")){
                    result.setText("0.");
                }else{
                    result.setText(result.getText()+".");
                }
                break;
            case R.id.bt_c:
                result.setText("0");
                num1 = 0;
                num2 = 0;
                break;
            case R.id.bt_bk:
                if(result.getText().length()>0){
                    result.setText(result.getText().subSequence(0,result.length()-1));
                }
                break;
            case R.id.bt_jia:
                if( num1==0 && num2==0 ){
                    String temp = result.getText().toString();
                    num1 = Double.parseDouble(temp);
                    result.setText("0");
                }else if(num1>0 && num2==0){
                    num2 = Double.parseDouble(result.getText().toString());
                    num1 = num1 + num2 ;
                    num2 = 0;
                    result.setText("0");
                }else{
                    num1 = num1 + num2 ;
                    num2 = 0;
                    result.setText("0");
                }
                option = "+";
                break;
            case R.id.bt_jian:
                if( num1==0 && num2==0 ){
                    String temp = result.getText().toString();
                    num1 = Double.parseDouble(temp);
                    result.setText("0");
                }else if(num1>0 && num2==0){
                    num2 = Double.parseDouble(result.getText().toString());
                    num1 = num1 - num2 ;
                    num2 = 0;
                    result.setText("0");
                }else{
                    num1 = num1 - num2 ;
                    num2 = 0;
                    result.setText("0");
                }
                option = "-";
                break;
            case R.id.bt_cheng:
                if( num1==0 && num2==0 ){
                    String temp = result.getText().toString();
                    num1 = Double.parseDouble(temp);
                    result.setText("0");
                }else if(num1>0 && num2==0){
                    num2 = Double.parseDouble(result.getText().toString());
                    num1 = num1 * num2 ;
                    num2 = 0;
                    result.setText("0");
                }else{
                    num1 = num1 * num2 ;
                    num2 = 0;
                    result.setText("0");
                }
                option = "*";
                break;
            case R.id.bt_chu:
                if( num1==0 && num2==0 ){
                    String temp = result.getText().toString();
                    num1 = Double.parseDouble(temp);
                    result.setText("0");
                }else if(num1>0 && num2==0){
                    num2 = Double.parseDouble(result.getText().toString());
                    num1 = num1 / num2 ;
                    num2 = 0;
                    result.setText("0");
                }else{
                    num1 = num1 / num2 ;
                    num2 = 0;
                    result.setText("0");
                }
                option = "/";
                break;
            case R.id.bt_deng:
                if(option.equals("+")){
                    num2 = Double.parseDouble(result.getText().toString());
                    result.setText(num1+num2+"");
                }else if(option.equals("-")){
                    num2 = Double.parseDouble(result.getText().toString());
                    result.setText(num1-num2+"");
                }else if(option.equals("*")){
                    num2 = Double.parseDouble(result.getText().toString());
                    result.setText(num1*num2+"");
                }else if(option.equals("/")){
                    num2 = Double.parseDouble(result.getText().toString());
                    result.setText(num1/num2+"");
                }
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
