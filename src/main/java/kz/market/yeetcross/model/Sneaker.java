package kz.market.yeetcross.model;

import jdk.jfr.BooleanFlag;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author Ulan
 * @date 11/17/2022
 */

@Document(collection = "_sneakers")
public class Sneaker {

    @Id
    private String id;

    @Field
    @NotBlank
    @Size(max = 100)
    @Indexed(unique = true)
    private String name;

    @Field
    private String description;

    @Field
    private String image;

    @Field
    private Brand brand;

    @Field
    private Offers offers;

    @Field
    private boolean isHit;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Offers getOffers() {
        return offers;
    }

    public void setOffers(Offers offers) {
        this.offers = offers;
    }

    public boolean isHit() {
        return isHit;
    }

    public void setHit(boolean hit) {
        isHit = hit;
    }
}
