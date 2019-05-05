package ariya.rockafanna.myselfapps.FragmentVideo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import ariya.rockafanna.myselfapps.R;

public class VideoFragmentRv extends Fragment {

    private RecyclerView recyclerView;
    private RVAdapterVideo adapter;
    private ArrayList<ListDataVideo> mahasiswaArrayList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View daily = inflater.inflate(R.layout.tab_video, container, false);

        addData();

        recyclerView = daily.findViewById(R.id.rv_main_video);

        adapter = new RVAdapterVideo(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this.getActivity());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
        return daily;

    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();

        mahasiswaArrayList.add(new ListDataVideo("<head></head><body><iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/hefh9dFnChY\" frameborder=\"0\" allowfullscreen></iframe></body>"));
        mahasiswaArrayList.add(new ListDataVideo("<head></head><body><iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/zuuObGsB0No\" frameborder=\"0\" allowfullscreen></iframe></body>"));
        mahasiswaArrayList.add(new ListDataVideo("<head></head><body><iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/9GkVhgIeGJQ\" frameborder=\"0\" allowfullscreen></iframe></body>"));
        mahasiswaArrayList.add(new ListDataVideo("<head></head><body><iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/hefh9dFnChY\" frameborder=\"0\" allowfullscreen></iframe></body>"));
        mahasiswaArrayList.add(new ListDataVideo("<head></head><body><iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/hefh9dFnChY\" frameborder=\"0\" allowfullscreen></iframe></body>"));
        mahasiswaArrayList.add(new ListDataVideo("<head></head><body><iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/hefh9dFnChY\" frameborder=\"0\" allowfullscreen></iframe></body>"));
        mahasiswaArrayList.add(new ListDataVideo("<head></head><body><iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/hefh9dFnChY\" frameborder=\"0\" allowfullscreen></iframe></body>"));
        mahasiswaArrayList.add(new ListDataVideo("<head></head><body><iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/hefh9dFnChY\" frameborder=\"0\" allowfullscreen></iframe></body>"));
        mahasiswaArrayList.add(new ListDataVideo("<head></head><body><iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/hefh9dFnChY\" frameborder=\"0\" allowfullscreen></iframe></body>"));

    }

}

