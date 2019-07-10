package com.coffee.dao;

import com.coffee.domain.Items;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ItemDao")
public interface ItemDao {
    public List<Items> findAll();
    public Items findById(int id);
}
