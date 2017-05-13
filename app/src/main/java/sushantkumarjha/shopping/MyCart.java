package sushantkumarjha.shopping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class MyCart extends AppCompatActivity {
    private DatabaseReference mrf;
    LinearLayoutManager linearLayoutManager;
    FirebaseRecyclerAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_cart);
        linearLayoutManager=new LinearLayoutManager(this);
        final RecyclerView recycler = (RecyclerView) findViewById(R.id.list_of_item);
        recycler.setHasFixedSize(false);
        recycler.setLayoutManager(linearLayoutManager);
        mAdapter=new FirebaseRecyclerAdapter<Cart_Item,MyAdapter>(Cart_Item.class,R.layout.single_row,MyAdapter.class,mrf) {
            @Override
            protected void populateViewHolder(MyAdapter viewHolder, Cart_Item model, int position) {
                viewHolder.setModel(model.getModel_Name());
                viewHolder.setCompany(model.getCompany_Name());
                viewHolder.setColor(model.getColour());
                viewHolder.setCost(model.getCost());
            }

        };
        mAdapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {
            @Override
            public void onItemRangeInserted(int positionStart, int itemCount) {
                super.onItemRangeInserted(positionStart, itemCount);
                int friendlyMessageCount = mAdapter.getItemCount();
                int lastVisiblePosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                if (lastVisiblePosition == -1 ||
                        (positionStart >= (friendlyMessageCount - 1) &&
                                lastVisiblePosition == (positionStart - 1))) {
                    recycler.scrollToPosition(positionStart);
                }
                else{
                    recycler.scrollToPosition(lastVisiblePosition);
                    Toast.makeText(MyCart.this,"nothing",Toast.LENGTH_LONG).show();
                }
            }
        });
        recycler.setAdapter(mAdapter);
    }
}
