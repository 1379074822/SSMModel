package com.coffee.service;

import com.coffee.domain.Account;

import java.util.List;

public interface AccountService {
    public List<Account> findAll();
    public Account findById();
    public void saveAccount(Account account);
}
