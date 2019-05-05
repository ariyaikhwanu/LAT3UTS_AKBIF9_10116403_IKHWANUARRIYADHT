package ariya.rockafanna.myselfapps.FragmentDaily;
/*
 * nama : Ikhwanu Arriyadh T
 * kelas : IF9
 * nim ; 10116403
 * Tanggal Pengerjaan : 3 Mei 2019
 *
 * */
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

public class FriendsFragmentRv extends Fragment {

    private RecyclerView recyclerView;
    private RVAdapterFriends adapter;
    private ArrayList<ListDataFriends> mahasiswaArrayList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View friends = inflater.inflate(R.layout.tab_friends, container, false);

        addData();

        recyclerView = friends.findViewById(R.id.rv_main_friends);

        adapter = new RVAdapterFriends(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this.getActivity(), LinearLayoutManager.HORIZONTAL,false);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
        return friends;

    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new ListDataFriends("Dimas Maulana", "1414370309", "123456789",R.drawable.profile));
        mahasiswaArrayList.add(new ListDataFriends("Fadly Yonk", "1214234560", "987654321",R.drawable.daily_logo));
        mahasiswaArrayList.add(new ListDataFriends("Ariyandi Nugraha", "1214230345", "987648765",R.drawable.daily_logo));
        mahasiswaArrayList.add(new ListDataFriends("Aham Siswana", "1214378098", "098758124",R.drawable.daily_logo));
    }

}


