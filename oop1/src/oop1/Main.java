package oop1;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("xyz.jpg");

        System.out.println(product1.getName());

        Product product2 = new Product();
        product2.setName("Tost Makinesi");
        product2.setUnitPrice(1000);
        product2.setDiscount(5);
        product2.setUnitsInStock(10);
        product2.setImageUrl("xyzj.jpg");

        Product product3 = new Product();
        product3.setName("Camasir Makinesi");
        product3.setUnitPrice(15000);
        product3.setDiscount(12);
        product3.setUnitsInStock(7);
        product3.setImageUrl("xyzj.jpg");

        Product[] products = {product1, product2, product3};

        for (var product : products) {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("141");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Omer Faruk");
        individualCustomer.setLastName("CAN");

        System.out.println(individualCustomer.getFirstName() + " " + individualCustomer.getLastName());

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setPhone("14124");
        corporateCustomer.setCustomerNumber("54321");
        corporateCustomer.setCompanyName("gfg.io");
        corporateCustomer.setTaxNumber("238523858");

        Customer[] customers = {individualCustomer, corporateCustomer};

        for (var customer : customers) {
            System.out.println(customer.getId());
        }
    }
}