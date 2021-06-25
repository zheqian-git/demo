package com.example.demo.controller;

import com.example.demo.domain.CharitySchool;
import com.example.demo.request.DemoReq;
import com.example.demo.response.MessageResp;
import com.example.demo.service.ICharitySchoolService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DemoController {

    @Resource
    private ICharitySchoolService iCharitySchoolService;

    @PostMapping("/test")
    MessageResp test(@RequestBody @Validated DemoReq req) {
        List<CharitySchool> list = iCharitySchoolService.queryCharitySchoolList(req);
        return new MessageResp(list);
    }
}
