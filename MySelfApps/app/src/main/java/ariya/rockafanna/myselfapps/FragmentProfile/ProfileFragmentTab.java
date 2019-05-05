package ariya.rockafanna.myselfapps.FragmentProfile;
/*
 * nama : Ikhwanu Arriyadh T
 * kelas : IF9
 * nim ; 10116403
 * Tanggal Pengerjaan : 5 Mei 2019
 *
 * */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import ariya.rockafanna.myselfapps.Fragment.ProfileFragment;
import ariya.rockafanna.myselfapps.R;
import ariya.rockafanna.myselfapps.FragmentProfile.CustomDialog;
public class ProfileFragmentTab extends Fragment implements OnMapReadyCallback{


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View profile = inflater.inflate(R.layout.tab_profile, container, false);

        TextView twitter= (TextView) profile.findViewById(R.id.twitter);
        twitter.setMovementMethod(LinkMovementMethod.getInstance());

        TextView wa= (TextView) profile.findViewById(R.id.wa);
        wa.setMovementMethod(LinkMovementMethod.getInstance());

        TextView email= (TextView) profile.findViewById(R.id.email);
        email.setMovementMethod(LinkMovementMethod.getInstance());


        SupportMapFragment mMapFragment = SupportMapFragment.newInstance();
        FragmentTransaction fragmentTransaction =
                getChildFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.map, mMapFragment);
        fragmentTransaction.commit();
        mMapFragment.getMapAsync(this);

        Button button = (Button)profile.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Fragment prev = getFragmentManager().findFragmentByTag("dialog");
                if (prev != null) {
                    ft.remove(prev);
                }
                ft.addToBackStack(null);
                DialogFragment dialogFragment = new CustomDialog();
                dialogFragment.show(ft, "dialog");
            }
        });


        return profile;
    }

    public void onMapReady(GoogleMap googleMap) {
        LatLng kosanku = new LatLng(-6.927070, 107.560222);
        googleMap.addMarker(new MarkerOptions().position(kosanku)
                .title("Rumah"));
        googleMap.setMinZoomPreference(6.0f);
        googleMap.setMaxZoomPreference(14.0f);
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(kosanku));
    }
}
