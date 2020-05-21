package com.mt.redis.user.controller;

import com.mt.redis.RedisUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {

    @Autowired
    RedisUtils redisUtils;

    @RequestMapping("/login/{user}/{pass}")
    public  void login(@PathVariable("user") String user ,@PathVariable("pass") String pass){
        //通过shiro的token登录
        Subject subject = SecurityUtils.getSubject();
//        System.out.println(subject.isAuthenticated());
        UsernamePasswordToken token = new UsernamePasswordToken(user, pass);
        subject.login(token);
        /*将token 存入reids实现服务共享*/
        redisUtils.set(user,token);
        Session session = SecurityUtils.getSubject().getSession();
        session.setAttribute("Token", token);




//        check();
//        System.out.println("login结束");
//        User u =(User) subject.getPrincipal();
//       return u;

    }
    @RequestMapping("/check")
    public  boolean check(){
        Session session = SecurityUtils.getSubject().getSession();
        boolean s= session.getAttribute("Token")!=null;
        System.out.println(session.getAttribute("Token"));
        return s;
    }
}