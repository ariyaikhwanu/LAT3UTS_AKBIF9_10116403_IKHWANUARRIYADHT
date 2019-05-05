package ariya.rockafanna.myselfapps.Fragment;
/*
 * nama : Ikhwanu Arriyadh T
 * kelas : IF9
 * nim ; 10116403
 * Tanggal Pengerjaan : 4 Mei 2019
 *
 * */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import ariya.rockafanna.myselfapps.FragmentGallery.GalleryFragmentRv;

import ariya.rockafanna.myselfapps.R;


public class GalleryFragment extends Fragment {


    public GalleryFragment() {
        // Required empty public constructor
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragment_daily = inflater.inflate(R.layout.fragment_gallery, container, false);




        loadPage(new GalleryFragmentRv());

        return fragment_daily;
    }


    private boolean loadPage(Fragment fragment) {
        if (fragment != null) {
            getActivity().getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.containerpage, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}