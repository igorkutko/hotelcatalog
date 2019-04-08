package org.gk.response;

import org.gk.model.HotelModel;

public class Response extends GeneralResponse{
    private HotelModel entity;
    private String message;

    public Response() {
    }

    public HotelModel getEntity() {
        return entity;
    }

    public void setEntity(HotelModel entity) {
        this.entity = entity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
