package co.com.silaba.entities;

import java.util.ArrayList;
import java.util.List;

public class PlaceList {

    List<Place> places;

    public PlaceList() {
        this.places = new ArrayList<>();
    }

    public int getCount() {
        return ( this.places == null ? 0 : this.places.size() );
    }

}
