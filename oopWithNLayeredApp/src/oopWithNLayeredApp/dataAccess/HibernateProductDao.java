package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
    @Override
    public void add(Product product) {
        // only access db codes write here ... SQL
        System.out.println("Added database with Hibernate");
    }
}
