package com.example.idlp.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.idlp.R;
import com.example.idlp.model.AssignmentsModel;
import com.example.idlp.model.liveClassesModel;

import java.util.ArrayList;

public class AssignmentsAdapter extends RecyclerView.Adapter<AssignmentsAdapter.viewHolder> {
    Context context;
    ArrayList<AssignmentsModel> arrayList=new ArrayList<>();

    public AssignmentsAdapter(Context context, ArrayList<AssignmentsModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.assignments_layout,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        holder.subjectName.setText(arrayList.get(position).getSubjectName()+"\nAssignments");
        holder.cardView.setCardBackgroundColor(Color.parseColor(arrayList.get(position).getBackgroundColor()));
        holder.doAssignmentsButton.setTextColor(Color.parseColor(arrayList.get(position).getBackgroundColor()));

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        TextView subjectName;
        CardView cardView;
        Button doAssignmentsButton;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            subjectName=itemView.findViewById(R.id.subjectName);
            cardView=itemView.findViewById(R.id.cardView);
            doAssignmentsButton=itemView.findViewById(R.id.doAssignmentsButton);

        }
    }
}
