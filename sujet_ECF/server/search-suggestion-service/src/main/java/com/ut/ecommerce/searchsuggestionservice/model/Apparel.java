package com.ut.ecommerce.searchsuggestionservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Apparel {

    private int id;

    private String title;

    private String imageLocalPath;

    private String imageURL;

    private String apparelInfo;

    private String genderInfo;
}
