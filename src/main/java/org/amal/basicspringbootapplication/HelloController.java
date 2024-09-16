package org.amal.basicspringbootapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

@RestController
public class HelloController {

  @GetMapping
  public String getHello() throws IOException {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://fakestoreapi.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build();

    ProductService service = retrofit.create(ProductService.class);

    Product product = service.getProductById("1").execute().body();
    return product.toString();

  }

}
