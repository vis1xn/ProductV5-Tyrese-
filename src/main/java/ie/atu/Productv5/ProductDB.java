package ie.atu.Productv5;

public class ProductDB {
    public static Product getProduct(String ProductCode) {
        Product myProduct = null;
        if (ProductCode.equalsIgnoreCase("PINK")) {
            Music myMusic = new Music();
            myMusic.setCode(ProductCode);
            myMusic.setDescription("Wish you were her by Pink Floyd");
            myMusic.setPrice(8.00);
            myMusic.setArtist("Pink Floyd");
            myMusic.setLabel("Part of the Colombia Group");
            myProduct = myMusic;
        }
        if (ProductCode.equalsIgnoreCase("kdl43")) {
            TV myTV = new TV();
            myTV.setCode(ProductCode);
            myTV.setDescription("SONY BRAVIA TV KDL43WF663 by sony");
            myTV.setPrice(819.00);
            myTV.setManufacture("Sony");
            myTV.setScreensize("Screensize is 55");
            myProduct = myTV;
        }
        return myProduct;
    }

}
