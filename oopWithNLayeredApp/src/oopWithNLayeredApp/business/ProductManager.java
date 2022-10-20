package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
    // When a layer is using another layer's class, it should only establish access from its interface.
    private final ProductDao productDao; // loosely couples
    private final Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        // business codes
        if (product.getUnitPrice() < 10) {
            throw new Exception("The product price cannot be less than 10.");
        }
        productDao.add(product);

        for (Logger logger : loggers) {
            logger.log(product.getName());
        }
    }
}
