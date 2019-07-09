package com.coffee.dao;

import com.coffee.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao {
     @Select("select * from account")
     public List<Account> findAll();
     public Account findById();
     @Insert("insert into account (name,money) values(#{name},#{money})")
     public void saveAccount(Account account);

}
