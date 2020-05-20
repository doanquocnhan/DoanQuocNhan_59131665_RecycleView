package vn.edu.ntu.doanquocnhan_59131665_recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
        ArrayList<product> products;
        Context context;

    public Adapter(ArrayList<product> products, Context context) {
        this.products = products;
        this.context = context;
    }


        @Override
        public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.iteam,parent,false);
            return new ViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder( ViewHolder holder, int position) {
            holder.text_name.setText(products.get(position).getName());
            holder.text_date.setText(products.get(position).getDate());
            holder.text_sdt.setText(products.get(position).getPhone());
        }

        @Override
        public int getItemCount() {
            return products.size ();
        }

        public  class ViewHolder extends RecyclerView.ViewHolder
   {
        TextView text_name,text_date,text_sdt;
           public ViewHolder( View itemView) {
           super(itemView);
           text_name = (TextView) itemView.findViewById(R.id.text_name);
           text_date = (TextView) itemView.findViewById(R.id.text_date);
           text_sdt = (TextView) itemView.findViewById(R.id.text_sdt);

       }
   }
    }

