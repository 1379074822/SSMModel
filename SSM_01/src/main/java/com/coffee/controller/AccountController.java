package com.coffee.controller;

import com.coffee.domain.Account;
import com.coffee.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @program: SSM_01
 * @description:
 * @author: Mr.Lian
 * @create: 2019-07-09 15:59
 **/
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/test")
    public String accountTest(Model model){
        System.out.println("我的Controller找到啦");
        List<Account> list = accountService.findAll();
        System.out.println(list);
        model.addAttribute("list",list);
        return "success";
    }
    @RequestMapping("/save")
    public void accountSave(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {

        System.out.println("我的Controller找到啦");
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/test");
        return ;
    }
}
