package ariya.rockafanna.myselfapps.Fragment;

/*
 * nama : Ikhwanu Arriyadh T
 * kelas : IF9
 * nim ; 10116403
 * Tanggal Pengerjaan : 2 Mei 2019
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
import ariya.rockafanna.myselfapps.FragmentHome.InterestHomeFragment;
import ariya.rockafanna.myselfapps.FragmentHome.AboutHomeFragment;
import ariya.rockafanna.myselfapps.R;


public class HomeFragment extends Fragment {
    FrameLayout mProfile, mInterest;
    View mviewProf, mviewInter;
    TextView mtvProf, mtvInterr;

    public HomeFragment() {
        // Required empty public constructor
    }
    @Nullable
    @Override


    public View onCreateView(LayoutInflater inflater,  ViewGroup container,
            Bundle savedInstanceState) {
        View fragment_home = inflater.inflate(R.layout.fragment_home, container, false);

        init(fragment_home);

        mProfile.setOnClickListener(clik);
        mInterest.setOnClickListener(clik);

        loadPage(new AboutHomeFragment());
        mtvProf.setTextColor(getActivity().getResources().getColor(R.color.colororange));
        return fragment_home;
    }
    public void init(View v){
        mProfile = v.findViewById(R.id.tabprof);
        mInterest = v.findViewById(R.id.tabinterest);
        mviewProf = v.findViewById(R.id.viewprof);
        mviewInter = v.findViewById(R.id.viewinterest);
        mtvProf = v.findViewById(R.id.tvprof);
        mtvInterr = v.findViewById(R.id.tvinter);
    }

    public View.OnClickListener clik = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.tabprof:

                    loadPage(new AboutHomeFragment());

                    mtvProf.setTextColor(getActivity().getResources().getColor(R.color.colororange));
                    mtvInterr.setTextColor(getActivity().getResources().getColor(R.color.colorWhite));

                    mviewProf.setVisibility(View.VISIBLE);
                    mviewInter.setVisibility(View.INVISIBLE);
                    break;
                case R.id.tabinterest:

                    loadPage(new InterestHomeFragment());

                    mtvProf.setTextColor(getActivity().getResources().getColor(R.color.colorWhite));
                    mtvInterr.setTextColor(getActivity().getResources().getColor(R.color.colororange));

                    mviewProf.setVisibility(View.INVISIBLE);
                    mviewInter.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };

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