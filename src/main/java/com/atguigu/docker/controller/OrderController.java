package com.atguigu.docker.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;

/**
 * ClassName: OrderController
 * Package: com.atuigu.docker.controller
 * Description:
 *
 * @Author: 管成豪
 * @Create: 2024/6/8 - 0:52
 * @Version: v1.0
 */
@RestController
public class OrderController{
    @Value("${server.port}")
    private String port;
    @RequestMapping("/order/docker")
    public String helloDocker()
    {
        return "hello docker"+"\t"+port+"\t"+ UUID.randomUUID().toString();
    }
    @RequestMapping(value ="/order/index",method = RequestMethod.GET)
    public String index()
    {
        return "服务端口号dockerfile: "+"\t"+port+"\t"+UUID.randomUUID().toString();
    }}
