package com.example.webservice;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@Path("/api")
@Singleton
public class HelloController {

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public Double convertKmToMiles(@FormParam("km") Double km) {
        //form-encoded
        Double miles = km * 0.621371;
        return miles;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Double convertNauticalMileToKm(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        Map<String, String> map = jsonb.fromJson(json, HashMap.class);
        Double mile=0.0;
      
        for (final Map.Entry<String, String> entry : map.entrySet()) {
            mile = Double.parseDouble(entry.getValue());
        }
        
        Double km = mile * 1.852;
        return km;
    }
}
