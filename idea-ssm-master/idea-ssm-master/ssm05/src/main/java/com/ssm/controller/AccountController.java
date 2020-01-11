package com.ssm.controller;
import com.ssm.entity.Account;
import com.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping(value = "/findAll")
    public String findAll(Model model){
        System.out.println("表现层查询所有用户成功");
        //调用业务层的方法表明整合成功
        /*调用service方法*/
        List<Account> list = accountService.findAll();
        for (Account ac : list){
            System.out.println(ac);
        }
        model.addAttribute("list", list);
        return "list";
    }

    @RequestMapping(value = "/save")
    public String save(Account account){
        accountService.saveAccount(account);
        return "list";
    }
}
