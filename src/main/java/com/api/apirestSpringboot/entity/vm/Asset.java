package com.api.apirestSpringboot.entity.vm;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Asset {

    private byte[] content;
    private String contentType;


}
