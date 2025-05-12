package org.farm.controller;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.farm.controller.dto.BancalResponse;
import org.farm.controller.dto.LandResponse;
import org.farm.controller.dto.SizeResponse;

import java.util.List;


@Path("v1/lands")
public class LandManagerController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public LandResponse getLands(){
        LandResponse landResponse = new LandResponse();
        BancalResponse bancal  =new BancalResponse();
        List<BancalResponse> bancals = List.of(bancal);
        landResponse.setBancals(bancals);
        SizeResponse size = new SizeResponse();
        size.setLarge(1000);
        size.setWidth(1500);
        landResponse.setSize(size);
        return landResponse;
    }
}
