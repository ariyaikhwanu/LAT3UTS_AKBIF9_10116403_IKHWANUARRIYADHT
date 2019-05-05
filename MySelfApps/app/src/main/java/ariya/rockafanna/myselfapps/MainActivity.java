package ariya.rockafanna.myselfapps;
/*
 * nama : Ikhwanu Arriyadh T
 * kelas : IF9
 * nim ; 10116403
 * Tanggal Pengerjaan : 1 Mei 2019
 *
 * */
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import ariya.rockafanna.myselfapps.Fragment.DailyFragment;
import ariya.rockafanna.myselfapps.Fragment.GalleryFragment;
import ariya.rockafanna.myselfapps.Fragment.HomeFragment;
import ariya.rockafanna.myselfapps.Fragment.MusicFragment;
import ariya.rockafanna.myselfapps.Fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menampilkan halaman Fragment yang pertama kali muncul
        getFragmentPage(new HomeFragment());

        /*Inisialisasi BottomNavigationView beserta listenernya untuk
         *menangkap setiap kejadian saat salah satu menu item diklik
         */
        BottomNavigationView bottomNavigation = findViewById(R.id.navigation_view);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;

                //Menantukan halaman Fragment yang akan tampil
                switch (item.getItemId()){
                    case R.id.action_home:
                        fragment = new HomeFragment();
                        break;

                    case R.id.action_daily:
                        fragment = new DailyFragment();
                        break;

                    case R.id.action_gallery:
                        fragment = new GalleryFragment();
                        break;

                    case R.id.action_music:
                        fragment = new MusicFragment();
                        break;

                    case R.id.action_profile:
                        fragment = new ProfileFragment();
                        break;
                }
                return getFragmentPage(fragment);
            }
        });
    }

    //Menampilkan halaman Fragment
    private boolean getFragmentPage(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.page_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    public void profile(View view) {
    }

    public void interest(View view) {
    }
}
