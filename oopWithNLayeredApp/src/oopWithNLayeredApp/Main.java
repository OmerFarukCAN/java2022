package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Iphone XR");
        product1.setUnitPrice(15000);

        Logger[] loggers = {new DatabaseLogger(), new MailLogger()};

        ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
        productManager.add(product1);

        ProductManager productManager1 = new ProductManager(new HibernateProductDao(), loggers);
        productManager1.add(product1);
    }
}
