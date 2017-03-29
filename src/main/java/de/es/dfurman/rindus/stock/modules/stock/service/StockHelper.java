package de.es.dfurman.rindus.stock.modules.stock.service;

import de.es.dfurman.rindus.stock.modules.stock.model.Product;
import de.es.dfurman.rindus.stock.modules.stock.model.ProductType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by furmans on 29.03.17
 * FurmanS dfurmans@gmail.com for Rindus
 *
 * @dfurmans
 */
class StockHelper {

    protected final static List<Product> createNewProductListByQuantityAndProductType(final int quantity, final ProductType productType) {
        List<Product> newProducts = new ArrayList<>(quantity);
        for (int i = 1; i <= quantity; i++) {
            newProducts.add(new Product(Product.MOCK_NAME + i, productType));
        }
        return newProducts;
    }

    protected final static List<Product> createListOfProductToRemove(int quantity, ProductType productType, Stream<Product> listOfProdcut) {
        return listOfProdcut
                .filter(prodcut -> prodcut.getProductType().equals(productType))
                .limit(quantity)
                .collect(Collectors.toList());
    }

}
