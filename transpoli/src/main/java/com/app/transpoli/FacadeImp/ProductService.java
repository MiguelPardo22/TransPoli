package com.app.transpoli.FacadeImp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.transpoli.Facade.IProducts;
import com.app.transpoli.Models.Product;

@Service
public class ProductService implements IProducts{

    @Override
    public List<Product> productList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'productList'");
    }

    @Override
    public void saveProduct(Product product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveProduct'");
    }

    @Override
    public void deleteProduct(Product product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteProduct'");
    }

    @Override
    public Product findByProduct(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByProduct'");
    }
    
}
