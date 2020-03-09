package com.atguigu.gmall.oms;

import com.atguigu.gmall.oms.entity.CartItem;
import com.atguigu.gmall.oms.service.CartItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallOmsApplicationTests {

    @Autowired
    CartItemService cartItemService;

    @Test
    public void testCartItemService(){
        CartItem cartItem = cartItemService.getById(12);
        System.out.println(cartItem.getProductName()+".........");
    }

}
