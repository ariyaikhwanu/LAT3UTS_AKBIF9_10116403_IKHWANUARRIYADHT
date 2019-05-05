package ariya.rockafanna.myselfapps.FragmentHome;
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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import ariya.rockafanna.myselfapps.R;

public class InterestHomeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View interest = inflater.inflate(R.layout.tab_interest, container, false);

        return interest;
    }
}
