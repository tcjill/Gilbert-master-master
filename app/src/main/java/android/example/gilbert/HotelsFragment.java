package android.example.gilbert;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) { View rootView = inflater.inflate(R.layout.tour_list, container, false);
        // Create a list of entertainment places
        final ArrayList<Tour> tour = new ArrayList<Tour>();
        tour.add(new Tour("Title", "Home2 Suites by Hilton", R.drawable.baseline_hotel_black_24dp));;
        tour.add(new Tour("Title", "Hampton Inn & Suites", R.drawable.baseline_hotel_black_24dp));
        tour.add(new Tour("Title", "Hyatt Place", R.drawable.baseline_hotel_black_24dp));
        tour.add(new Tour("Title", "DoubleTree", R.drawable.baseline_hotel_black_24dp));


        // Create an {@link TourAdapter}, whose data source is a list of {@link Tour}s. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter adapter = new TourAdapter(getActivity(), tour, R.color.category_attractions);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // tour_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link TourAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Tour} in the list.
        listView.setAdapter(adapter);
        return rootView;
    }
}