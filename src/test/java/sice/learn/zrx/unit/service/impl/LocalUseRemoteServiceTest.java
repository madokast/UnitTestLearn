package sice.learn.zrx.unit.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import sice.learn.zrx.unit.service.ILocalUseRemoteService;
import sice.learn.zrx.unit.service.IRemoteService;

import static org.junit.Assert.*;

/**
 * @Description LocalUseRemoteServiceTest
 * @Date 2021/7/28 16:44
 * @Created by ZhaoRX
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class LocalUseRemoteServiceTest {

    @Autowired
    ILocalUseRemoteService localUseRemoteService;

    @MockBean
    IRemoteService remoteService;

    @Test
    public void addRemote() {
        BDDMockito.given(remoteService.add(2,3)).willReturn(6);
        int ans = localUseRemoteService.addRemote(2, 3);
        assertEquals(6,ans);
    }
}