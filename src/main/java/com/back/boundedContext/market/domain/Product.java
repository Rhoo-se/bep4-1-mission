package com.back.boundedContext.market.domain;

import com.back.global.jpa.entity.BaseEntity;
import com.back.global.jpa.entity.BaseIdAndTime;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MARKET_PRODUCT")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Product extends BaseIdAndTime {
    @ManyToOne
    private MarketMember seller;
    private String sourceTypeCode;
    private int sourceId;
    private String name;
    private String description;
    private long price;
    private long salePrice;
}
