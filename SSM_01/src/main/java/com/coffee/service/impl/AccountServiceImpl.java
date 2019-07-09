package com.coffee.service.impl;

import com.coffee.dao.AccountDao;
import com.coffee.domain.Account;
import com.coffee.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: SSM_01
 * @description:
 * @author: Mr.Lian
 * @create: 2019-07-09 15:55
 **/
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public Account findById() {
        return accountDao.findById();
    }

    @Override
    public void saveAccount(Account account) {
//        System.out.println("saveAccount");
    accountDao.saveAccount(account);
    }
}
