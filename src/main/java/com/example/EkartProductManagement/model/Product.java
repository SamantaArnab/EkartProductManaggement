package com.example.EkartProductManagement.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long prodId;
    private String displayName;
//    private String shortDesc;
//    private String desc;
//    private String category;
    private Integer price;
//    private Integer discount;
//    private Integer deliveryCharge;
//    private Integer offerPrice;
//    private String seller;
//    private Integer sellerCount;
//    private Integer avgRating;

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

//    public String getShortDesc() {
//        return shortDesc;
//    }
//
//    public void setShortDesc(String shortDesc) {
//        this.shortDesc = shortDesc;
//    }
//
//    public String getDesc() {
//        return desc;
//    }
//
//    public void setDesc(String desc) {
//        this.desc = desc;
//    }

//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

//    public Integer getDiscount() {
//        return discount;
//    }
//
//    public void setDiscount(Integer discount) {
//        this.discount = discount;
//    }
//
//    public Integer getDeliveryCharge() {
//        return deliveryCharge;
//    }
//
//    public void setDeliveryCharge(Integer deliveryCharge) {
//        this.deliveryCharge = deliveryCharge;
//    }
//
//    public Integer getOfferPrice() {
//        return offerPrice;
//    }
//
//    public void setOfferPrice(Integer offerPrice) {
//        this.offerPrice = offerPrice;
//    }
//
//    public String getSeller() {
//        return seller;
//    }
//
//    public void setSeller(String seller) {
//        this.seller = seller;
//    }
//
//    public Integer getSellerCount() {
//        return sellerCount;
//    }
//
//    public void setSellerCount(Integer sellerCount) {
//        this.sellerCount = sellerCount;
//    }
//
//    public Integer getAvgRating() {
//        return avgRating;
//    }
//
//    public void setAvgRating(Integer avgRating) {
//        this.avgRating = avgRating;
//    }

//    public List<Review> getReviews() {
//        return reviews;
//    }
//
//    public void setReviews(List<Review> reviews) {
//        this.reviews = reviews;
//    }
//
//    private List<Review> reviews;

}
