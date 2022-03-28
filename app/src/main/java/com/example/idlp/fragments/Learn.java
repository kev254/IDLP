package com.example.idlp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.idlp.R;
import com.example.idlp.adapter.LiveClassesAdapter;
import com.example.idlp.model.liveClassesModel;

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



        return view;
    }
}