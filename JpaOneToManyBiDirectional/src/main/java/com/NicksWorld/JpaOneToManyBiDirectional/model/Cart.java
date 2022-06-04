package com.NicksWorld.JpaOneToManyBiDirectional.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "Cart")
public class Cart {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany (
            mappedBy = "cart",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Item> items = new ArrayList<>();

    public Cart() {
    }
}
