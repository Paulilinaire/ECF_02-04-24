package com.ut.ecommerce.searchsuggestionservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchSuggestionController {

    @GetMapping(value = "/search-suggestion", params = "q")
    public ResponseEntity<?> getProducts(@RequestParam("q") String queryParams) {

        String[] suggestions = {"dress", "top", "jeans"};

        return ResponseEntity.ok(suggestions);
    }

}
