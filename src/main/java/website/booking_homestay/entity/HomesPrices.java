package website.booking_homestay.entity;

import jakarta.persistence.*;
import lombok.Data;
import website.booking_homestay.DTO.details.HomesPricesDetails;
import website.booking_homestay.entity.enumreration.EPrice;

import java.util.Date;


@Entity
@Table(name = "homestays_prices")
@IdClass(HomePriceId.class)
@Data
public class HomesPrices {
    @Id
    @ManyToOne
    @JoinColumn(name = "homestay_id")
    private Homestay homestay;

    @Id
    @ManyToOne
    @JoinColumn(name = "pricelist_id")
    private PriceList priceList;

    @Column(name = "price")
    private Double price;

    @Enumerated(EnumType.STRING)
    private EPrice status;

    public HomesPrices(Homestay homestay, PriceList priceList) {
        this.homestay = homestay;
        this.priceList = priceList;
    }

    public HomesPrices() {
    }
}


