package myapplicationishello.com.example.hsport.fragementconcept;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Surendra on 09/20/16.
 */
public class Contactusfragement extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.galleryfragement,container,false);
        return v;
    }
}
