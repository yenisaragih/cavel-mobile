package nwlnbl.laravel;

/**
 * Created by nabil on 5/16/17.
 */

public class Product {
    private int imageId;
    private String title;
    private String harga;

    public Product(int imageId, String title, String harga) {
        this.imageId = imageId;
        this.title = title;
        this.harga = harga;
    }

    public int getImageId() {

        return imageId;
    }

    public void setImageId(int imageId) {

        this.imageId = imageId;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getHarga() {

        return harga;
    }

    public void setHarga(String harga) {

        this.harga = harga;
    }
}
