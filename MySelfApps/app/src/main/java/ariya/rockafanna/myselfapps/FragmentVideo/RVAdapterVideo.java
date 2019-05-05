package ariya.rockafanna.myselfapps.FragmentVideo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import ariya.rockafanna.myselfapps.R;

/**
 * Created by Herdi_WORK on 15.09.16.
 */
public class RVAdapterVideo extends RecyclerView.Adapter<RVAdapterVideo.MahasiswaViewHolder> {

    private ArrayList<ListDataVideo> dataList;


    public RVAdapterVideo(ArrayList<ListDataVideo> dataList) {
        this.dataList = dataList;
    }

    @Override
    public MahasiswaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.view_rv_video, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MahasiswaViewHolder holder, int position) {
        holder.imgGambar.loadData(dataList.get(position).getGmbr(),
                "text/html" , "utf-8");
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder{

        private WebView imgGambar;

        public MahasiswaViewHolder(View itemView) {
            super(itemView);
            imgGambar = (WebView) itemView.findViewById(R.id.videoUrl);

            imgGambar.getSettings().setJavaScriptEnabled(true);
            imgGambar.setWebChromeClient(new WebChromeClient() {
            } );

        }
    }
}