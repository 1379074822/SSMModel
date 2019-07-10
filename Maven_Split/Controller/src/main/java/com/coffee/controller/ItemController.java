package com.coffee.controller;

import com.coffee.domain.Items;
import com.coffee.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: Maven_Super
 * @description:
 * @author: Mr.Lian
 * @create: 2019-07-10 15:22
 **/
@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/find")
    public String findDetail(Model model,Integer id){
        System.out.println("1111");
        Items items = itemService.findById(id);
        System.out.println(items);
        model.addAttribute("item", items);
        return "itemDetail";
    }
}
