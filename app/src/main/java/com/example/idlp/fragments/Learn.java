package com.example.idlp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.idlp.R;
import com.example.idlp.adapter.AssignmentsAdapter;
import com.example.idlp.adapter.LiveClassesAdapter;
import com.example.idlp.adapter.SubjectsAdapter;
import com.example.idlp.model.AssignmentsModel;
import com.example.idlp.model.liveClassesModel;
import com.example.idlp.model.subjectsModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Learn#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Learn extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Learn() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Learn.
     */
    // TODO: Rename and change types and number of parameters
    public static Learn newInstance(String param1, String param2) {
        Learn fragment = new Learn();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_learn, container, false);


        //////--------------------Live Classes--------------////////
        ArrayList<liveClassesModel> liveClassesModelArrayList=new ArrayList<>();
        LiveClassesAdapter liveClassesAdapter =new LiveClassesAdapter(getContext(),liveClassesModelArrayList);
        RecyclerView liveClassesRecyclerView=view.findViewById(R.id.liveClassesRecyclerView);
        liveClassesRecyclerView.setNestedScrollingEnabled(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        liveClassesRecyclerView.setLayoutManager(linearLayoutManager);

        liveClassesModelArrayList.add(new liveClassesModel("Mathematics"));
        liveClassesModelArrayList.add(new liveClassesModel("English"));
        liveClassesModelArrayList.add(new liveClassesModel("C.R.E"));
        liveClassesRecyclerView.setAdapter(liveClassesAdapter);

        //////--------------------End of Live Classes--------------////////


        //////--------------------Assignments--------------////////
        ArrayList<AssignmentsModel> assignmentsModelArrayList=new ArrayList<>();
        AssignmentsAdapter assignmentsAdapter =new AssignmentsAdapter(getContext(),assignmentsModelArrayList);
        RecyclerView assignmentRecyclerView=view.findViewById(R.id.assignmentsRecyclerView);
        assignmentRecyclerView.setNestedScrollingEnabled(false);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        assignmentRecyclerView.setLayoutManager(linearLayoutManager1);

        assignmentsModelArrayList.add(new AssignmentsModel("English","#89db70"));
        assignmentsModelArrayList.add(new AssignmentsModel("Maths","#7099db"));
        assignmentsModelArrayList.add(new AssignmentsModel("C.R.E","#b470db"));
        assignmentRecyclerView.setAdapter(assignmentsAdapter);

        //////--------------------End of Assignments--------------////////

         //////--------------------Subjects--------------////////
        ArrayList<subjectsModel> subjectsModelArrayList=new ArrayList<>();
        SubjectsAdapter subjectsAdapter =new SubjectsAdapter(getContext(),subjectsModelArrayList);
        RecyclerView subjectsRecyclerView=view.findViewById(R.id.subjectsRecyclerView);
        subjectsRecyclerView.setNestedScrollingEnabled(false);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getContext());
        subjectsRecyclerView.setLayoutManager(linearLayoutManager2);

        subjectsModelArrayList.add(new subjectsModel("English",true));
        subjectsModelArrayList.add(new subjectsModel("Maths",false));
        subjectsModelArrayList.add(new subjectsModel("C.R.E",true));
        subjectsModelArrayList.add(new subjectsModel("Science",false));
        subjectsRecyclerView.setAdapter(subjectsAdapter);

        //////--------------------End of subjects--------------////////




        return view;
    }
}