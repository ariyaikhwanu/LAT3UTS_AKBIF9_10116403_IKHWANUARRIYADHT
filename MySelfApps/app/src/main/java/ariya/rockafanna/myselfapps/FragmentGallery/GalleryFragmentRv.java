package ariya.rockafanna.myselfapps.FragmentGallery;
/*
 * nama : Ikhwanu Arriyadh T
 * kelas : IF9
 * nim ; 10116403
 * Tanggal Pengerjaan : 5 Mei 2019
 *
 * */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import ariya.rockafanna.myselfapps.R;

public class GalleryFragmentRv extends Fragment {

    private RecyclerView recyclerView;
    private RVAdapterGallery adapter;
    private ArrayList<ListDataGallery> mahasiswaArrayList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View daily = inflater.inflate(R.layout.tab_gallery, container, false);

        addData();

        recyclerView = daily.findViewById(R.id.rv_main_gallery);

        adapter = new RVAdapterGallery(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this.getActivity(),2);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
        return daily;

    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new ListDataGallery("Dimas Maulana", "1414370309", "123456789",R.drawable.daily_logo));
        mahasiswaArrayList.add(new ListDataGallery("Fadly Yonk", "1214234560", "987654321",R.drawable.daily_logo));
        mahasiswaArrayList.add(new ListDataGallery("Ariyandi Nugraha", "1214230345", "987648765",R.drawable.daily_logo));
        mahasiswaArrayList.add(new ListDataGallery("Aham Siswana", "1214378098", "098758124",R.drawable.daily_logo));
        mahasiswaArrayList.add(new ListDataGallery("Dimas Maulana", "1414370309", "123456789",R.drawable.daily_logo));
        mahasiswaArrayList.add(new ListDataGallery("Fadly Yonk", "1214234560", "987654321",R.drawable.daily_logo));
        mahasiswaArrayList.add(new ListDataGallery("Ariyandi Nugraha", "1214230345", "987648765",R.drawable.daily_logo));
        mahasiswaArrayList.add(new ListDataGallery("Aham Siswana", "1214378098", "098758124",R.drawable.daily_logo));
        mahasiswaArrayList.add(new ListDataGallery("Dimas Maulana", "1414370309", "123456789",R.drawable.daily_logo));
        mahasiswaArrayList.add(new ListDataGallery("Fadly Yonk", "1214234560", "987654321",R.drawable.daily_logo));
        mahasiswaArrayList.add(new ListDataGallery("Ariyandi Nugraha", "1214230345", "987648765",R.drawable.daily_logo));
        mahasiswaArrayList.add(new ListDataGallery("Aham Siswana", "1214378098", "098758124",R.drawable.daily_logo));
        mahasiswaArrayList.add(new ListDataGallery("Dimas Maulana", "1414370309", "123456789",R.drawable.daily_logo));
        mahasiswaArrayList.add(new ListDataGallery("Fadly Yonk", "1214234560", "987654321",R.drawable.daily_logo));
        mahasiswaArrayList.add(new ListDataGallery("Ariyandi Nugraha", "1214230345", "987648765",R.drawable.daily_logo));
        mahasiswaArrayList.add(new ListDataGallery("Aham Siswana", "1214378098", "098758124",R.drawable.daily_logo));

    }

}

