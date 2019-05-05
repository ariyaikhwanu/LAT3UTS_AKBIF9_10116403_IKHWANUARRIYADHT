package ariya.rockafanna.myselfapps.FragmentProfile;
/*
 * nama : Ikhwanu Arriyadh T
 * kelas : IF9
 * nim ; 10116403
 * Tanggal Pengerjaan : 5 Mei 2019
 *
 * */
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import ariya.rockafanna.myselfapps.BuildConfig;
import ariya.rockafanna.myselfapps.R;

public class CustomDialog extends DialogFragment {



    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.customdg, container, false);

        String versionName = BuildConfig.VERSION_NAME;
        TextView txtversion = (TextView)view.findViewById(R.id.txtVersi1);
        txtversion.setText(versionName);


        Button OkButton = (Button)view.findViewById(R.id.button2);
        OkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }

        });
        return view;

    }

}
