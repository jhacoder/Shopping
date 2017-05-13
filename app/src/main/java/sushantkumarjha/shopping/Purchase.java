package sushantkumarjha.shopping;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Sushant kumar jha on 13-05-2017.
 */

public class Purchase extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.purchase,container,false);
        final Button MyCard=(Button)view.findViewById(R.id.mycard);
        MyCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Purchase.this,MyCart.class));
            }
        });
        return view;
    }
}
