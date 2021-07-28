package sice.learn.zrx.unit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sice.learn.zrx.unit.entity.Info;
import sice.learn.zrx.unit.service.ILocalService;

/**
 * @Description TODO
 * @Date 2021/7/28 16:06
 * @Created by ZhaoRX
 */
@RestController
public class MyController {
    @Autowired
    ILocalService localService;

    @RequestMapping("/repeat/origin/{origin}/times/{times}")
    public Info repeat(@PathVariable String origin, @PathVariable int times) {
        return new Info(localService.repeat(origin, times));
    }
}
