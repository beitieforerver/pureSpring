package com.beitie.service.impl;

import com.beitie.dao.AccountDao;
import com.beitie.pojo.Account;
import com.beitie.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl extends  BaseServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }
    @Override
    public Account findOne(String name) {
        return  accountDao.findByName(name);
    }
    @Override
    public void save(Account account) {
        log.info("数据保存");
    }
    @Override
    public void update(Account account) {
        log.info("数据修改");
    }
    @Override
    public void delete(int id) {
        log.info("删除了数据");
    }
    @Override
    public void transfer(String sourceName, String destName, float money) {
        Account sourceAcc = accountDao.findByName(sourceName);
        Account destAcc = accountDao.findByName(destName);

        log.info(sourceAcc);
        log.info(destAcc);
        sourceAcc.setMoney(sourceAcc.getMoney()-money);
        destAcc.setMoney(destAcc.getMoney()+money);
        accountDao.update(sourceAcc);
        accountDao.update(destAcc);
        log.info(accountDao.findAllAccount());
    }

}
