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

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OverviewResponse implements Serializable {
    @JsonProperty("GetStockActualOverviewResult")
    private List<StockOverviewEntity> getStockActualOverviewEntity;
}
