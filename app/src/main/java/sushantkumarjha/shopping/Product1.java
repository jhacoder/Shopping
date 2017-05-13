package sushantkumarjha.shopping;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

/**
 * Created by Sushant kumar jha on 13-05-2017.
 */

public class Product1 extends Fragment {
    Button Add,Remove,Buy;

    private DatabaseReference mrf;
    private FirebaseStorage mfile;
    private StorageReference storageReference;
    LinearLayoutManager linearLayoutManager;
    String username="";
    FirebaseRecyclerAdapter mAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.product1, container, false);

        mrf = FirebaseDatabase.getInstance().getReference();
        mfile=FirebaseStorage.getInstance();
        storageReference=mfile.getReference().child("message_photo");
        Add=(Button)view.findViewById(R.id.addcart);
        Remove=(Button)view.findViewById(R.id.remove);
        Buy=(Button)view.findViewById(R.id.Payment);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String key=  mrf.push().getKey();
                mrf.child(key).setValue("Model_Name").equals("B1234");
                mrf.child(key).setValue("Company_Name").equals("B1234");
                mrf.child(key).setValue("Colour").equals("Red");
                mrf.child(key).setValue("Cost").equals("5000");

            }
        });
        Buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Product1.this,Purchase.class));
            }
        });
        return view;
    }

}
