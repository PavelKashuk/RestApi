package com.example.restApi.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "stock_overview")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StockOverviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "active")
    @JsonProperty("Active")
    private boolean active;
    @Column(name = "attribute_combination")
    @JsonProperty("AttributeCombination")
    private String attributeCombination;
    @Column(name = "available_stock")
    @JsonProperty("AvailableStock")
    private double availableStock;
    @Column(name = "code")
    @JsonProperty("Code")
    private String code;
    @Column(name = "current_purchased")
    @JsonProperty("CurrentPurchased")
    private double currentPurchased;
    @Column(name = "current_reservations")
    @JsonProperty("CurrentReservations")
    private double currentReservations;
    @Column(name = "current_stock")
    @JsonProperty("CurrentStock")
    private double currentStock;
    @Column(name = "name")
    @JsonProperty("Name")
    private String name;
    @Column(name = "product_id")
    @JsonProperty("ProductId")
    private int productId;

}
