package de.es.dfurman.rindus.stock.modules.stock.service;

import de.es.dfurman.rindus.stock.modules.stock.model.Product;
import de.es.dfurman.rindus.stock.modules.stock.model.ProductType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by furmans on 29.03.17
 * FurmanS dfurmans@gmail.com for Rindus
 *
 * @dfurmans
 */
@Transactional
@Service("StockService")
public interface StockService {

    /**
     * @param quantity
     * @param productType
     */
    void addProductToStockByStockIdAndByQuantityOfProductAndProductType(final Long stockId, final int quantity, final ProductType productType);

    /**
     * @param quantity
     * @param productType
     */
    List<Product> removeProductFromStockByIdAndByQuantityOfProductAndProductType(final Long stockId, final int quantity, final ProductType productType) throws NotEnoughProductInStock;
}
