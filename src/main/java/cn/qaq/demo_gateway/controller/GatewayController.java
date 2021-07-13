package cn.qaq.demo_gateway.controller;

import cn.qaq.demo_gateway.service.DefaultRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gateway")
public class GatewayController {

    @Autowired
    private DefaultRouteService defaultRouteService;

    @GetMapping("/test")
    public String test() {
        return defaultRouteService.test();
    }

}
