package com.example.restApi.controller;

import com.example.restApi.entity.OverviewResponse;
import com.example.restApi.exception.ResponseException;
import com.example.restApi.service.StockOverviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StockActualOverviewController {

    @Autowired
    StockOverviewService service;

    @PostMapping("/getStockActualOverview")
    public ResponseEntity getAndSaveData() {
        try {
            OverviewResponse response = service.getAndSaveData();
            return ResponseEntity.ok().body(response);
        } catch (ResponseException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
