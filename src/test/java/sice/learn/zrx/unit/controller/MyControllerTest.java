package sice.learn.zrx.unit.controller;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import sice.learn.zrx.unit.entity.Info;

import java.util.Objects;

/**
 * @Description test my controller
 * @Date 2021/7/28 16:13
 * @Created by ZhaoRX
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MyControllerTest {

    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    public void repeat() {
        Info info = testRestTemplate.getForEntity("/repeat/origin/a/times/3", Info.class).getBody();
        String data = Objects.requireNonNull(info).data;
        Assert.assertEquals("aaa", data);
    }
}