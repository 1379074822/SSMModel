package com.coffee.service.impl;

import com.coffee.dao.ItemDao;
import com.coffee.domain.Items;
import com.coffee.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: Maven_Super
 * @description:
 * @author: Mr.Lian
 * @create: 2019-07-10 14:40
 **/
@Service("itemService")
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;
    @Override
    public Items findById(int id) {
        return itemDao.findById(id);
    }
}
