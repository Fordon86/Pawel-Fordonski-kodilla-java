package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave (){

        //Given

        Product productApple = new Product("Apple");
        Product productOrange = new Product("Orange");
        Product productWaterMelon = new Product("WaterMelon");

        Item itemApple = new Item(productApple, new BigDecimal("12"), 5, new BigDecimal("60"));
        Item itemOrange = new Item(productOrange, new BigDecimal("20"), 3, new BigDecimal("60"));
        Item itemWaterMelon = new Item(productWaterMelon, new BigDecimal("120"), 1, new BigDecimal("120"));

        List<Item> itemList1 = new ArrayList<>();

        itemList1.add(itemApple);
        itemList1.add(itemOrange);
        itemList1.add(itemWaterMelon);

        Invoice invoice = new Invoice("1", itemList1);

        //When

        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then

        Assert.assertNotEquals(0, invoice.getId());

        //CleanUp
        itemDao.deleteAll();
        productDao.deleteAll();
        invoiceDao.deleteById(id);
    }

}
