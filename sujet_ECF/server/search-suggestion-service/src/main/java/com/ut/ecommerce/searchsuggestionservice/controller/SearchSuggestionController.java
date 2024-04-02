package com.ut.ecommerce.searchsuggestionservice.controller;

import com.ut.ecommerce.searchsuggestionservice.service.SearchSuggestionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SearchSuggestionController {


     @Autowired
     private SearchSuggestionServiceImpl searchSuggestionService;

    @GetMapping(value = "/search-suggestion", params = "q")
    public ResponseEntity<?> getSearchSuggestions(@RequestParam("q") String query) {

        return new ResponseEntity<>(HttpStatus.OK);
    }


}

