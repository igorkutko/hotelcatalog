package org.gk.controller;

import com.google.common.collect.ImmutableList;
import org.gk.model.HotelModel;
import org.gk.service.HotelService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class HotelControllerTest {
    @Mock
    private HotelService hotelService;

    @InjectMocks
    HotelController sut;

//    @Before
//    public void setUp() throws Exception {
//        sut = new HotelController();
//    }

    @Test
    public void getAll() throws Exception {
        //prepare
        when(hotelService.getAll()).thenReturn(ImmutableList.of());

        //testing
        List<HotelModel> hotelModels = sut.getAll();

        //validate
        verify(hotelService).getAll();
    }
}