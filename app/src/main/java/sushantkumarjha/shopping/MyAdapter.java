package sushantkumarjha.shopping;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Sushant kumar jha on 13-05-2017.
 */

public class MyAdapter extends RecyclerView.ViewHolder {
    TextView company,model,color,cost;
    public MyAdapter(View itemView) {
        super(itemView);
        company=(TextView)itemView.findViewById(R.id.company);
        model=(TextView)itemView.findViewById(R.id.model);
        color=(TextView)itemView.findViewById(R.id.color);
        cost=(TextView)itemView.findViewById(R.id.money);
    }

    public void setCompany(String comp) {
        company.setText(comp);
    }

    public void setModel(String mod) {
        model.setText(mod);
    }

    public void setColor(String col) {
        color.setText(col);
    }

    public void setCost(String cos) {
        cost.setText(cos);
    }
}
