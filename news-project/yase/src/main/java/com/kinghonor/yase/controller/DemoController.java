package com.kinghonor.yase.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Api(description = "用户操作接口")
@RequestMapping("/admin")
@Controller
public class DemoController {

    @ApiOperation(value = "获取otp", notes="通过手机号获取OTP验证码")
    @ApiImplicitParam(name = "telephone", value = "电话号码", paramType = "query", required = true, dataType = "Integer")
    @RequestMapping(value = "test", method= RequestMethod.GET)
    @ResponseBody
    public String test(String telephone){
        System.out.println("....test...");
        return "success";
    }
}
