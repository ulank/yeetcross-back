package kz.market.yeetcross.model;

/**
 * @author Ulan
 * @date 11/17/2022
 */

public class Offers {

    private Double price;
    private String priceCurrency;
    private Integer offerCount;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPriceCurrency() {
        return priceCurrency;
    }

    public void setPriceCurrency(String priceCurrency) {
        this.priceCurrency = priceCurrency;
    }

    public Integer getOfferCount() {
        return offerCount;
    }

    public void setOfferCount(Integer offerCount) {
        this.offerCount = offerCount;
    }
}
