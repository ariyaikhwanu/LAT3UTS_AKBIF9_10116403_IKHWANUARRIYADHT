package ariya.rockafanna.myselfapps.Fragment;

/*
 * nama : Ikhwanu Arriyadh T
 * kelas : IF9
 * nim ; 10116403
 * Tanggal Pengerjaan : 5 Mei 2019
 *
 * */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ariya.rockafanna.myselfapps.FragmentProfile.ProfileFragmentTab;
import ariya.rockafanna.myselfapps.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    public ProfileFragment() {
        // Required empty public constructor
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragment_profile = inflater.inflate(R.layout.fragment_profile, container, false);
        loadPage(new ProfileFragmentTab());
        return fragment_profile;
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
