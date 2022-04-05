package com.javacore.builderPattern;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Child {
    private Long id;
    private String fname;
    private String lname;

}
