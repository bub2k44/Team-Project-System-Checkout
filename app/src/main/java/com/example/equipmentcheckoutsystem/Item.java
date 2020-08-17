package com.example.equipmentcheckoutsystem;

public class Item
{
    private String name;
    private String price;
    private String quantity;

    public Item(String _name, String _price, String _quantity)
    {
        name = _name;
        price = _price;
        quantity = _quantity;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getQuantity() {
        return quantity;
    }
}
