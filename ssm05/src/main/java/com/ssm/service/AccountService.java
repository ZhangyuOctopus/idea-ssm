package com.ssm.service;
import com.ssm.entity.Account;
import java.util.List;
public interface AccountService {
    /*查询所有用户*/
    public List<Account> findAll();
    /*保存账户信息*/
    public void saveAccount(Account account);
}
