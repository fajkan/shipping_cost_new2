package se.lexicon.shipping_cost.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Box {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String country;
    private String type;
    private double cost;
    private double weight;
    private String weightType;
    private LocalDateTime createDate;
    private boolean status;
}
