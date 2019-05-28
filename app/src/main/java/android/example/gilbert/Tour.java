package android.example.gilbert;


/**
 * {@link Tour} represents a place and an image for that place.
 */
public class Tour {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Default title for the word
     */
    private String mDefaultPlace;
    /**
     * address for the word
     */
    private String mPlaceLocal;

   // private String mAddress;
    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    public Tour(String defaultPlace, String placeLocal, String address) {
        mDefaultPlace = defaultPlace;
        mPlaceLocal = placeLocal;
       // mAddress = address;
    }


    public Tour(String defaultPlace, String placeLocal, int imageResourceId) {
        mDefaultPlace = defaultPlace;
        mPlaceLocal = placeLocal;
        mImageResourceId = imageResourceId;
       // mAddress = getAddress();
    }

    public Tour(int number_one, int ic_action_achievement) {
    }

    /**
     * Get the default place
     */
    public String getmDefaultPlace() {
        return mDefaultPlace;
    }

    /**
     * Get the local.
     */
    public String getmPlaceLocal() {
        return mPlaceLocal;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //public String getAddress() {
        //return mAddress;
    //}

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}