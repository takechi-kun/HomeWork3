package th.ac.su.cp.homework3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import th.ac.su.cp.homework3.model.Item;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAdapter adapter = new MyAdapter();
        LinearLayoutManager lm = new LinearLayoutManager(MainActivity.this);

        RecyclerView rv = findViewById(R.id.item_recycler_view);
        rv.setLayoutManager(lm); //config layout manager ให้กับ RecyclerView
        rv.setAdapter(adapter);//config adapter ให้กับ RecyclerView
    }
}
class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Item[]items = {
            new Item(R.drawable.thailand, "THAILAND", "ประเทศไทย"),
            new Item(R.drawable.south_korea, "SOUTH KOREA","ประเทศเกาหลีใต้"),
            new Item(R.drawable.united_states, "UNITED STATES","สหรัฐอเมริกา"),
            new Item(R.drawable.united_kingdom, "UNITED KINGDOM","สหราชอาณาจักร"),
            new Item(R.drawable.italy, "ITALY","ประเทศอิตาลี"),
            new Item(R.drawable.japan, "JAPAN","ประเทศญี่ปุ่น"),
            new Item(R.drawable.mexico, "MEXICO","ประเทศเม็กซิโก"),
            new Item(R.drawable.spain, "SPAIN","ประเทศสเปน"),
            new Item(R.drawable.taiwan, "TAIWAN","ประเทศไต้หวัน"),
            new Item(R.drawable.finland, "FINLAND","ประเทศฟินแลนด์"),
    };

    public MyAdapter() {
    }

    //ctrl+o
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.imageView.setImageResource(items[position].imageResId);
        holder.wordTextView.setText(items[position].word);
        holder.translateTextView.setText(items[position].translate);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView wordTextView;
        TextView translateTextView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            wordTextView = itemView.findViewById(R.id.item_text_view);
            translateTextView = itemView.findViewById(R.id.translate_text_view);
        }
    }

}