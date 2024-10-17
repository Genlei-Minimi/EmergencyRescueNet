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
import java.util.List;


public class M_RecyclerViewAdapter extends RecyclerView.Adapter<M_RecyclerViewAdapter.MyViewHolder>{

    private final MapInterface mapInterface;

    Context context;
    ArrayList<MapModel> mapModels;

    public M_RecyclerViewAdapter(Context context, ArrayList<MapModel> mapModels , MapInterface mapInterface){

        this.context = context;
        this.mapModels = mapModels;
        this.mapInterface = mapInterface;
    }
    @NonNull
    @Override
    public M_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.map_row, parent, false);
        return new M_RecyclerViewAdapter.MyViewHolder(view, mapInterface);}



    @Override
    public void onBindViewHolder(@NonNull M_RecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.mapList.setText(mapModels.get(position).getMapList());
        holder.mapView.setImageResource(mapModels.get(position).getMapImage());


    }

    @Override
    public int getItemCount() {
        return mapModels.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView mapView;
        TextView mapList;

        public MyViewHolder(@NonNull View itemView, MapInterface mapInterface) {
            super(itemView);

            mapView = itemView.findViewById(R.id.buildingView);
            mapList = itemView.findViewById(R.id.buildingName);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mapInterface != null){
                        int pos = getAdapterPosition();

                        if (pos != RecyclerView.NO_POSITION){
                            mapInterface.onItemClick(pos);
                        }

                    }
                }
            });
        }
    }
}