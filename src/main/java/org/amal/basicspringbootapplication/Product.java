package org.amal.basicspringbootapplication;

public class Product {
  String id;
  String title;
  Double price;
  String description;
  String category;
  String image;

  @Override
  public String toString() {
    return "Product Id" + this.id + " " + "Product Description " + this.description + " " + "Product title " + this.title;
  }
}

