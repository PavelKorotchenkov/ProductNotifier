package javaguru.ws.productmicroservice.service;

import javaguru.ws.productmicroservice.dto.CreateProductDto;

import java.util.concurrent.ExecutionException;

public interface ProductService {

    String create(CreateProductDto createProductDto) throws ExecutionException, InterruptedException;

}
