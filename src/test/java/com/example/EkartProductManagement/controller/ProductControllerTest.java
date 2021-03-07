package com.example.EkartProductManagement.controller;


import com.example.EkartProductManagement.model.Product;
import com.example.EkartProductManagement.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import java.util.ArrayList;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


public class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private ProductService mockProductService;

    @InjectMocks
    ProductController controllerUnderTest;

    @BeforeEach
    public void setup() {

        MockitoAnnotations.initMocks(this);

        this.mockMvc = MockMvcBuilders.standaloneSetup(controllerUnderTest).build();
    }

    @Test
    public void findAllProducts_returnsListOfProducts() throws Exception {

        ArrayList<Product> listOfProducts = new ArrayList<>();

        Product product1 = new Product();

        product1.setProdId(1L);
        product1.setDisplayName("Samsung");
        product1.setPrice(50);

        Product product2 = new Product();

        product2.setProdId(1L);
        product2.setDisplayName("Xiomi");
        product2.setPrice(70);

        listOfProducts.add(product1);
        listOfProducts.add(product2);


        when(mockProductService.findAllProducts()).thenReturn(listOfProducts);

        mockMvc.perform(get("/getProducts"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].displayName", is("Samsung")));

        verify(mockProductService, times(1)).findAllProducts();
        verifyNoMoreInteractions(mockProductService);

    }
}
