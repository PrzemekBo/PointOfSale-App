package basic;

import java.math.BigDecimal;

public class Product {

    private Long id;
    private String name;
    private String barcode;
    private BigDecimal price;

    public Product(Long id, String name, String barcode, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.barcode = barcode;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBarcode() {
        return barcode;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
       // return "Product [id=" + id + ", name=" + name + ", barcode=" + barcode + ", price= %.2f %n" + decmaltostring(price) + "]";
        return "Product name: "+name+'\n'+"Price:"+ price;
    }







}