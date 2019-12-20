package com.kinghonor.daji;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class DajiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DajiApplication.class, args);
    }

    @RequestMapping("ddd")
    @ResponseBody
    public String test(String telephone){
        System.out.println("....ddd...");
        return "ddd。。。";
    }

}
