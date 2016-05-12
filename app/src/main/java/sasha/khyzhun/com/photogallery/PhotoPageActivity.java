package sasha.khyzhun.com.photogallery;

import android.support.v4.app.Fragment;

/**
 * Created by Sasha on 25.09.2015
 */
public class PhotoPageActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new PhotoPageFragment();
    }
}