package com.example.springbootdeveloper;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.springbootdeveloper.Test.Member;
import com.example.springbootdeveloper.Test.TestService;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/test")
   public List<Member> getAllMembers(){
    List<Member> members = testService.getAllMembers();
    return members;
   }
}
