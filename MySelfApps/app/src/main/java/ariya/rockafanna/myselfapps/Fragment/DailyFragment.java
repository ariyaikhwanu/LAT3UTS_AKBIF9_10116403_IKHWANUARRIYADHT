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

import ariya.rockafanna.myselfapps.FragmentDaily.DailyFragmentRv;
import ariya.rockafanna.myselfapps.FragmentDaily.FriendsFragmentRv;
import ariya.rockafanna.myselfapps.R;


public class DailyFragment extends Fragment {
    FrameLayout mDaily, mFriends;
    View mviewDaily, mviewFriends;
    TextView mtvDaily, mtvFrineds;

    public DailyFragment() {
        // Required empty public constructor
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragment_daily = inflater.inflate(R.layout.fragment_daily, container, false);

        init(fragment_daily);

        mDaily.setOnClickListener(clik);
        mFriends.setOnClickListener(clik);

        loadPage(new DailyFragmentRv());
        mtvDaily.setTextColor(getActivity().getResources().getColor(R.color.colororange));
        return fragment_daily;
    }
    public void init(View v){
        mDaily = v.findViewById(R.id.tabdaily);
        mFriends = v.findViewById(R.id.tabfriends);
        mviewDaily = v.findViewById(R.id.viewdaily);
        mviewFriends = v.findViewById(R.id.viewfriends);
        mtvDaily = v.findViewById(R.id.tvdaily);
        mtvFrineds = v.findViewById(R.id.tvfriends);
    }

    public View.OnClickListener clik = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.tabdaily:

                    loadPage(new DailyFragmentRv());

                    mtvDaily.setTextColor(getActivity().getResources().getColor(R.color.colororange));
                    mtvFrineds.setTextColor(getActivity().getResources().getColor(R.color.colorWhite));

                    mviewDaily.setVisibility(View.VISIBLE);
                    mviewFriends.setVisibility(View.INVISIBLE);
                    break;
                case R.id.tabfriends:

                    loadPage(new FriendsFragmentRv());

                    mtvDaily.setTextColor(getActivity().getResources().getColor(R.color.colorWhite));
                    mtvFrineds.setTextColor(getActivity().getResources().getColor(R.color.colororange));

                    mviewDaily.setVisibility(View.INVISIBLE);
                    mviewFriends.setVisibility(View.VISIBLE);
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