package com.example.restApi.controller;

import com.example.restApi.entity.OverviewResponseEntity;
import com.example.restApi.repository.StockOverviewRepository;
import com.example.restApi.service.StockOverviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StockActualOverviewController {

    @Autowired
    StockOverviewService service;

    @GetMapping("/getStockActualOverview")
    public ResponseEntity getAllList() {
        try {
            OverviewResponseEntity response = service.getAllList();
            return ResponseEntity.ok().body(response);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
