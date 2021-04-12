package se.lexicon.shipping_cost.entity;

import java.time.LocalDateTime;

public class Box {
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
