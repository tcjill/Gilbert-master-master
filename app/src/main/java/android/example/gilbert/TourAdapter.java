package android.example.gilbert;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link TourAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Tour} objects.
 */
public class TourAdapter extends ArrayAdapter<Tour> {

    /**
     * Create a new {@link TourAdapter} object.
     *
     * @param context              is the current context (i.e. Activity) that the adapter is being created in.
     * @param tours                is the list of {@link Tour}s to be displayed.
     * @param category_attractions is a list?
     */
    public TourAdapter(Context context, ArrayList<Tour> tours, int category_attractions) {
        super(context, 0, tours);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Tour currentWord = getItem(position);
        TextView tv1 = listItemView.findViewById(R.id.miwok_text_view);
        tv1.setText(currentWord.getmPlaceLocal());


        //ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        //imageView setImageResource(currentWord.getImageResourceId());
        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentWord.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        //int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        // textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.


        return listItemView;
    }
}