package com.yunuspektas.dpatterns.builder;

import java.time.LocalDateTime;

public class BuilderRun {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setId(12L);
        product1.setDescription("Description");
        product1.setName("Name");

        Product product2 = new Product.ProductBuilder().description("sdasd").build();

        ProductLombok productLombok = ProductLombok.builder()
                .id(12L)
                .name("Yunus")
                .description("Description")
                .build();

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(productLombok);
    }
}
