package org.farm.controller.dto;

import lombok.Data;

import java.util.List;

@Data
public class LandResponse {

    private SizeResponse size;
    private List<BancalResponse> bancals;

}
