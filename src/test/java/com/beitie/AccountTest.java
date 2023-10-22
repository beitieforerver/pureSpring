package com.beitie;

import com.beitie.pojo.Account;
import com.beitie.service.AccountService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.util.List;
@ComponentScan
public class AccountTest {
    @Before
    public void sldfjlskjflksj(){
        ClassPathXmlApplicationContext xml =new ClassPathXmlApplicationContext("spring-lifecycle-test.xml");
    }
    @Autowired
    @Qualifier("proxyAccountService")
    private AccountService accountService;
    @Test
    public void transferTest(){
        accountService.transfer("aaa","bbb",100f);
    }
    @Test
    public void findByNameTest(){
        Account account=accountService.findOne("aaa");
        System.out.println(account);
    }

    @Test
    public void findAllAccountTest(){
        List<Account> allAccount = accountService.findAllAccount();
        System.out.println(allAccount);
    }
    @Test
    public void deleteAccountTest(){
        accountService.delete(1);
    }

    @Test
    public void dealList(){
        deleteFilesByParentPath(new File("D:\\package\\202208081241_"));
    }

    @Test
    public void returnTest(){
        System.out.println(slfjls());
    }
    public int slfjls(){
        int a =0;
        try {
            a = 2/0;
            return a;
        } catch (Exception e) {
            a = 3;
            return a;
        } finally {
            a=1;
            return a;
        }
//        return a;
    }
    public void deleteFilesByParentPath(File file ){
        if(file.exists()){
            if(file.isDirectory()){
                File[] files = file.listFiles();
                for (File fileTemp : files) {
                    deleteFilesByParentPath(fileTemp);
                }
            }
            file.delete();
        }
    }
}
