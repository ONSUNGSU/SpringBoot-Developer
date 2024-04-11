package com.codehows.springbootdeveloper.controller;

import com.codehows.springbootdeveloper.DAO.Member;
import com.codehows.springbootdeveloper.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
public class TestController {

    // /test Get 요청이 오면 test() 메서드 실행
//    @GetMapping("/test")
//    public String test() {
//        return "Hello World";
//    }

    @Autowired // TestService 빈 주입
    TestService testService;

    @GetMapping("/test")
    public List<Member> getAllMembers(){
        List<Member> members = testService.getAllMembers();
        return members;
    }
}
