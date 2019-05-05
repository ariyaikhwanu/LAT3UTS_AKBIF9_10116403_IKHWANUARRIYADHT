package ariya.rockafanna.myselfapps;
/*
 * nama : Ikhwanu Arriyadh T
 * kelas : IF9
 * nim ; 10116403
 * Tanggal Pengerjaan : 1 Mei 2019
 *
 * */
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflanter;


    public SliderAdapter(Context context){
        this.context = context;
    }

    //Array
    public int[] slide_images = {
            R.drawable.home_logo,
            R.drawable.daily_logo,
            R.drawable.music_logo
    };

    public String[] slide_heading = {
            "HOME",
            "DAILY",
            "MUSIC"
    };

    public String[] slide_desc = {
            "ajhsdfoijhnfiapjsndfgpijnb  piashdjfijasndbfij pijAHFBIJASNDBFIJ UHbfijdbsfpi",
            "ajhsdfoijhnfiapjsndfgpijnb  piashdjfijasndbfij pijAHFBIJASNDBFIJ UHbfijdbsfp",
            "ajhsdfoijhnfiapjsndfgpijnb  piashdjfijasndbfij pijAHFBIJASNDBFIJ UHbfijdbsfp"
    };



    @Override
    public int getCount() {
        return slide_heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        layoutInflanter=(LayoutInflater) context.getSystemService((context.LAYOUT_INFLATER_SERVICE));
        View view = layoutInflanter.inflate(R.layout.slide_layout, container, false);

        ImageView slideimageView = (ImageView) view.findViewById(R.id.slide_images);
        TextView slidetextHeading = (TextView) view.findViewById(R.id.slide_heading);
        TextView slidetextDesc = (TextView) view.findViewById(R.id.slide_desc);

        slideimageView.setImageResource(slide_images[position]);
        slidetextHeading.setText(slide_heading[position]);
        slidetextDesc.setText(slide_desc[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((RelativeLayout)object);
    }
}
