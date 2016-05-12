package sasha.khyzhun.com.photogallery;

/**
 * Created by Sasha on 07-Sep-15.
 */
public class GalleryItem {

    private String mCaption;
    private String mId;
    private String mUrl;
    private String mOwner;

    @Override
    public String toString() {
        return mCaption;
    }

    /** Getters **/
    public String getCaption() {
        return mCaption;
    }

    public String getId() {
        return mId;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getPhotoPageUrl(){
        return "http://www.flickr.com/photos/" + mOwner + "/" + mId;
    }

    public String getOwner() {
        return mOwner;
    }

    /** Setters **/

    public void setCaption(String caption) {
        mCaption = caption;
    }

    public void setId(String id) {
        mId = id;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public void setOwner(String owner) {
        mOwner = owner;
    }





}
