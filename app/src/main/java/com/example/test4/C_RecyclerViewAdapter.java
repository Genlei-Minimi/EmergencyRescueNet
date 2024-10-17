package com.example.test4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
//adapter for contact info

public class C_RecyclerViewAdapter extends RecyclerView.Adapter<C_RecyclerViewAdapter.MyViewHolder> {

    private final ContactInterface contactInterface;

    Context context;
    ArrayList<ContactModel> contactModels;

    public C_RecyclerViewAdapter(Context context, ArrayList<ContactModel> contactModels, ContactInterface contactInterface){

        this.context = context;
        this.contactModels = contactModels;
        this.contactInterface = contactInterface;
    }
    @NonNull
    @Override
    public C_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recyler_vier_row, parent, false);
        return new C_RecyclerViewAdapter.MyViewHolder(view, contactInterface);}


    @Override
    public void onBindViewHolder(@NonNull C_RecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.tvList.setText(contactModels.get(position).getContactList());
        holder.tvNum.setText(contactModels.get(position).getContactNum());
        holder.imageView.setImageResource(contactModels.get(position).getImage());


    }
// to get the e=amount of the item
    @Override
    public int getItemCount() {
        return contactModels.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView tvList, tvNum;

// date holder for contact infos
        public MyViewHolder(@NonNull View itemView, ContactInterface contactInterface) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            tvList = itemView.findViewById(R.id.textView);
            tvNum = itemView.findViewById(R.id.textView2);

            //data storage for onclick

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (contactInterface != null){
                        int pos = getAdapterPosition();

                        if (pos != RecyclerView.NO_POSITION){
                            contactInterface.onItemClick(pos);
                        }

                    }
                }
            });
        }
    }
}
