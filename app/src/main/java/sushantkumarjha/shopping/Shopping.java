package sushantkumarjha.shopping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Shopping extends AppCompatActivity implements View.OnClickListener {
 LinearLayout layout1,layout2,layout3,layout4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
        layout1=(LinearLayout)findViewById(R.id.Layout1);
        layout2=(LinearLayout)findViewById(R.id.Layout2);
        layout3=(LinearLayout)findViewById(R.id.Layout3);
        layout4=(LinearLayout)findViewById(R.id.Layout4);
        layout1.setOnClickListener(this);
        layout2.setOnClickListener(this);
        layout3.setOnClickListener(this);
        layout4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Layout1:
                startActivity(new Intent(Shopping.this,Product.class));
                break;
            case R.id.Layout2:
                startActivity(new Intent(Shopping.this,Product.class));
                break;
            case R.id.Layout3:
                startActivity(new Intent(Shopping.this,Product.class));
                break;
            case R.id.Layout4:
                startActivity(new Intent(Shopping.this,Product.class));
                break;
            default: break;
        }

    }
}
