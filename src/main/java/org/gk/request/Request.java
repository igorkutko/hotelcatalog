package org.gk.request;

import org.gk.model.HotelModel;

public class Request extends GeneralRequest{

    private HotelModel params;

    public Request() {

    }

    public Request(HotelModel params) {
        this.params = params;
    }

    public HotelModel getParams() {
        return params;
    }

    public void setParams(HotelModel params) {
        this.params = params;
    }
}
