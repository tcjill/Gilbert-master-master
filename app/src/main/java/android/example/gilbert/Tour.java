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
    private int mDefaultPlace;
    /**
     * address for the word
     */
    private int mPlaceLocal;

    // private String mAddress;
    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    public Tour(int defaultPlace, int placeLocal, int imageResourceId) {
        mDefaultPlace = defaultPlace;
        mPlaceLocal = placeLocal;
        // mAddress = address;
    }



        // mAddress = getAddress();




    /**
     * Get the default place
     */
    public int getmDefaultPlace() {
        return mDefaultPlace;
    }

    /**
     * Get the local.
     */
    public int getmPlaceLocal() {
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