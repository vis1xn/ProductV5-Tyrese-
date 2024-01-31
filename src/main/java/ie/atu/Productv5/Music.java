package ie.atu.Productv5;

import ie.atu.Productv5.Product;

public class Music extends Product {
    private String Artist;
    private String Label;
    public Music() {
        super();
        Artist = "";
        Label = "";
        count++;
    }

    public void setLabel(String label) { Label = label;}

    public String getLabel() {return Label;}

    public void setArtist(String artist) {
        this.Artist = artist;
    }

    public String getArtist() {
        return Artist;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + Artist;
    }
}
