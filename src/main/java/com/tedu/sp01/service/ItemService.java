package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Item;

import java.util.List;

public interface ItemService {
    /**
     *通过订单id来获取商品列表
     */
    List<Item> getItems(String orderId);

    /**
     * 在保存商品时修改商品数量
     */
    void decreaseNumbers(List<Item> list);
}
