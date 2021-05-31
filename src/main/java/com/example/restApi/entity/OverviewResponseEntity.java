package com.example.restApi.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OverviewResponseEntity implements Serializable {
//    @Id
//    private long id;
    @JsonProperty("GetStockActualOverviewResult")
//    @OneToMany
    private List<StockOverviewEntity> getStockActualOverviewEntity;
}
