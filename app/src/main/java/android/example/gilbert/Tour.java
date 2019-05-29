package android.example.gilbert;


/**
 * {@link Tour} represents a vocabulary word that the user wants to learn.
 * It contains a default translation, a Miwok translation, and an image for that word.
 */
public class Tour {

    /** Default translation for the word */
    private int mDefaultLocation;

    /** Miwok translation for the word */
    private int mPlaceLocal;


    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     //* @param defaultPlace is the word in a language that the user is already familiar with
     *                           (such as English)
     //* @param miwokTranslation is the word in the Miwok language
    /
     */
    public Tour(int mDefaultLocation, int mPlaceLocal) {
        mDefaultLocation = mDefaultLocation;
        mPlaceLocal = mPlaceLocal;

    }

    /**
     * Create a new Word object.
     *
     //* @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     //* @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     //* @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Tour(int defaultLocation, int placeLocal, int imageResourceId)
               {
        mDefaultLocation = defaultLocation;
        mPlaceLocal = placeLocal;
        mImageResourceId = imageResourceId;

    }

    /**
     * Get the default translation of the word.
     */
    public int getmDefaultLocation() {
        return mDefaultLocation;
    }

    /**
     * Get the Miwok translation of the word.
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

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}