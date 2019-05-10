package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import com.kodilla.hibernate.manytomany.dao.InvoiceDao;
import com.kodilla.hibernate.manytomany.dao.ItemDao;
import com.kodilla.hibernate.manytomany.dao.ProductDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product(1,"banana");
        Product product2 = new Product(2,"apple");
        Product product3 = new Product(3,"watermelon");
        Product product4 = new Product(4,"cucamber");
        Product product5 = new Product(5,"tomatoe");
        Product product6 = new Product(6,"cookies");
        Product product7 = new Product(7,"milk");
        Product product8 = new Product(8,"yougurt");
        Product product9 = new Product(9,"soap");
        Product product10 = new Product(10,"toothpaste");



        Item item1 = new Item(1,product1, BigDecimal.valueOf(0.80),240,BigDecimal.valueOf(192.00));
        Item item2 = new Item(2,product2, BigDecimal.valueOf(0.80),120,BigDecimal.valueOf(96.00));
        Item item3 = new Item(3,product3, BigDecimal.valueOf(3.60),20,BigDecimal.valueOf(72.00));
        Item item4 = new Item(4,product4, BigDecimal.valueOf(2.50),60,BigDecimal.valueOf(150.00));
        Item item5 = new Item(5,product5, BigDecimal.valueOf(2.70),100,BigDecimal.valueOf(270.00));
        Item item6 = new Item(6,product6, BigDecimal.valueOf(4.80),40,BigDecimal.valueOf(192.00));
        Item item7 = new Item(7,product7, BigDecimal.valueOf(2.80),50,BigDecimal.valueOf(140.00));
        Item item8 = new Item(8,product8, BigDecimal.valueOf(2.20),100,BigDecimal.valueOf(220.00));
        Item item9 = new Item(9,product9, BigDecimal.valueOf(9.80),50,BigDecimal.valueOf(490.00));
        Item item10 = new Item(10,product10, BigDecimal.valueOf(18.00),100,BigDecimal.valueOf(1800.00));
        Item item11 = new Item(11,product1, BigDecimal.valueOf(0.80),120,BigDecimal.valueOf(96.00));
        Item item12 = new Item(12,product2, BigDecimal.valueOf(0.80),60,BigDecimal.valueOf(48.00));
        Item item13 = new Item(13,product3, BigDecimal.valueOf(3.60),10,BigDecimal.valueOf(36.00));
        Item item14 = new Item(14,product4, BigDecimal.valueOf(2.50),30,BigDecimal.valueOf(75.00));
        Item item15 = new Item(15,product5, BigDecimal.valueOf(2.70),50,BigDecimal.valueOf(135.00));
        Item item16 = new Item(16,product6, BigDecimal.valueOf(4.80),20,BigDecimal.valueOf(96.00));
        Item item17 = new Item(17,product7, BigDecimal.valueOf(2.80),25,BigDecimal.valueOf(70.00));
        Item item18 = new Item(18,product8, BigDecimal.valueOf(2.20),50,BigDecimal.valueOf(110.00));
        Item item19 = new Item(19,product9, BigDecimal.valueOf(9.80),25,BigDecimal.valueOf(245.00));
        Item item20 = new Item(20,product10, BigDecimal.valueOf(18.00),50,BigDecimal.valueOf(900.00));

        Invoice invoice1 = new Invoice(1,"2019/04 - 01");
        Invoice invoice2 = new Invoice(2,"2019/04 - 02");
        Invoice invoice3 = new Invoice(3,"2019/04 - 03");
        Invoice invoice4 = new Invoice(4,"2019/04 - 04");
        Invoice invoice5 = new Invoice(5,"2019/04 - 05");
        Invoice invoice6 = new Invoice(6,"2019/05 - 06");
        Invoice invoice7 = new Invoice(7,"2019/05 - 07");
        Invoice invoice8 = new Invoice(8,"2019/05 - 08");
        Invoice invoice9 = new Invoice(9,"2019/05 - 09");
        Invoice invoice10 = new Invoice(10,"2019/05 - 10");


        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        invoice2.getItems().add(item4);
        invoice2.getItems().add(item5);
        invoice3.getItems().add(item6);
        invoice4.getItems().add(item7);
        invoice4.getItems().add(item8);
        invoice5.getItems().add(item9);
        invoice5.getItems().add(item10);
        invoice6.getItems().add(item11);
        invoice6.getItems().add(item12);
        invoice7.getItems().add(item13);
        invoice7.getItems().add(item14);
        invoice8.getItems().add(item15);
        invoice8.getItems().add(item16);
        invoice9.getItems().add(item17);
        invoice9.getItems().add(item18);
        invoice10.getItems().add(item19);
        invoice10.getItems().add(item20);


        product1.getItemList().add(item1);
        product1.getItemList().add(item11);
        product2.getItemList().add(item2);
        product2.getItemList().add(item12);
        product3.getItemList().add(item3);
        product3.getItemList().add(item13);
        product4.getItemList().add(item4);
        product4.getItemList().add(item14);
        product5.getItemList().add(item5);
        product5.getItemList().add(item15);
        product6.getItemList().add(item6);
        product6.getItemList().add(item16);
        product7.getItemList().add(item7);
        product7.getItemList().add(item17);
        product8.getItemList().add(item8);
        product8.getItemList().add(item18);
        product9.getItemList().add(item9);
        product9.getItemList().add(item19);
        product10.getItemList().add(item10);
        product10.getItemList().add(item20);


        //When
        productDao.save(product1);
        int product1_ID = product1.getId();
        productDao.save(product2);
        int product2_ID = product2.getId();
        productDao.save(product3);
        int product3_ID = product3.getId();
        productDao.save(product4);
        int product4_ID = product4.getId();
        productDao.save(product5);
        int product5_ID = product5.getId();
        productDao.save(product6);
        int product6_ID = product6.getId();
        productDao.save(product7);
        int product7_ID = product7.getId();
        productDao.save(product8);
        int product8_ID = product8.getId();
        productDao.save(product9);
        int product9_ID = product9.getId();
        productDao.save(product10);
        int product10_ID = product10.getId();

        itemDao.save(item1);
        int item1_ID= item1.getId();
        itemDao.save(item2);
        int item2_ID= item2.getId();
        itemDao.save(item3);
        int item3_ID= item3.getId();
        itemDao.save(item4);
        int item4_ID= item4.getId();
        itemDao.save(item5);
        int item5_ID= item5.getId();
        itemDao.save(item6);
        int item6_ID= item6.getId();
        itemDao.save(item7);
        int item7_ID= item7.getId();
        itemDao.save(item8);
        int item8_ID= item8.getId();
        itemDao.save(item9);
        int item9_ID= item9.getId();
        itemDao.save(item10);
        int item11_ID= item11.getId();
        itemDao.save(item12);
        int item12_ID= item12.getId();
        itemDao.save(item13);
        int item13_ID= item13.getId();
        itemDao.save(item14);
        int item14_ID= item14.getId();
        itemDao.save(item15);
        int item15_ID= item15.getId();
        itemDao.save(item16);
        int item16_ID= item16.getId();
        itemDao.save(item17);
        int item17_ID= item17.getId();
        itemDao.save(item18);
        int item18_ID= item18.getId();
        itemDao.save(item19);
        int item19_ID= item19.getId();
        itemDao.save(item20);
        int item20_ID= item20.getId();

        invoiceDao.save(invoice1);
        int invoice1_ID = invoice1.getId();
        invoiceDao.save(invoice2);
        int invoice2_ID = invoice2.getId();
        invoiceDao.save(invoice3);
        int invoice3_ID = invoice3.getId();
        invoiceDao.save(invoice4);
        int invoice4_ID = invoice4.getId();
        invoiceDao.save(invoice5);
        int invoice5_ID = invoice5.getId();
        invoiceDao.save(invoice6);
        int invoice6_ID = invoice6.getId();
        invoiceDao.save(invoice7);
        int invoice7_ID = invoice7.getId();
        invoiceDao.save(invoice8);
        int invoice8_ID = invoice8.getId();
        invoiceDao.save(invoice9);
        int invoice9_ID = invoice9.getId();
        invoiceDao.save(invoice10);
        int invoice10_ID = invoice10.getId();


        //Then
        Assert.assertEquals(1, invoice1_ID);
        Assert.assertEquals(2, invoice2_ID);
        Assert.assertEquals(3, invoice3_ID);
        Assert.assertEquals(4, invoice4_ID);
        Assert.assertEquals(5, invoice5_ID);
        Assert.assertEquals(6, invoice6_ID);
        Assert.assertEquals(7, invoice7_ID);
        Assert.assertEquals(8, invoice8_ID);
        Assert.assertEquals(9, invoice9_ID);
        Assert.assertEquals(11, invoice10_ID);



        //CleanUp
        try {
            productDao.delete(product1);
            productDao.delete(product2);
            productDao.delete(product3);
            productDao.delete(product4);
            productDao.delete(product5);
            productDao.delete(product6);
            productDao.delete(product7);
            productDao.delete(product8);
            productDao.delete(product9);
            productDao.delete(product10);

            itemDao.delete(item1);
            itemDao.delete(item2);
            itemDao.delete(item3);
            itemDao.delete(item4);
            itemDao.delete(item5);
            itemDao.delete(item6);
            itemDao.delete(item7);
            itemDao.delete(item8);
            itemDao.delete(item9);
            itemDao.delete(item10);
            itemDao.delete(item11);
            itemDao.delete(item12);
            itemDao.delete(item13);
            itemDao.delete(item14);
            itemDao.delete(item15);
            itemDao.delete(item16);
            itemDao.delete(item17);
            itemDao.delete(item18);
            itemDao.delete(item19);
            itemDao.delete(item20);

            invoiceDao.delete(invoice1);
            invoiceDao.delete(invoice2);
            invoiceDao.delete(invoice3);
            invoiceDao.delete(invoice4);
            invoiceDao.delete(invoice5);
            invoiceDao.delete(invoice6);
            invoiceDao.delete(invoice7);
            invoiceDao.delete(invoice8);
            invoiceDao.delete(invoice9);
            invoiceDao.delete(invoice10);

        } catch (Exception e) {
            //do nothing
            }
        }
    }



