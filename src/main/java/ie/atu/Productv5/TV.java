package ie.atu.Productv5;

import ie.atu.Productv5.Product;

public class TV extends Product {
    private String Screensize;
    private String Manufacture;
    public TV() {
        super();
        Screensize = "";
        Manufacture = "";
        count++;
    }

    public void setManufacture(String label) { Manufacture = Manufacture;}

    public String getManufacture() {return Manufacture;}

    public void setScreensize(String Screensize) {this.Screensize = Screensize;}

    public String getScreensize() {return Screensize;}

    @Override
    public String toString() {
        return super.toString() + " by " + Screensize;
    }
}
