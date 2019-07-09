package com.coffee.dao.impl;

import com.coffee.dao.AccountDao;
import com.coffee.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: SSM_01
 * @description:
 * @author: Mr.Lian
 * @create: 2019-07-09 15:55
 **/
@Repository
public class AccountDaoImpl implements AccountDao {
    @Override

    public List<Account> findAll() {

        return null;
    }

    @Override
    public Account findById() {
        return null;
    }

    @Override

    public void saveAccount(Account account) {

    }
}
