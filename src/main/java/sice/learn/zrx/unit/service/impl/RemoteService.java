package sice.learn.zrx.unit.service.impl;

import org.springframework.stereotype.Service;
import sice.learn.zrx.unit.service.IRemoteService;

/**
 * @Description RemoteService
 * @Date 2021/7/28 16:58
 * @Created by ZhaoRX
 */
@Service
public class RemoteService implements IRemoteService {
    @Override
    public int add(int a, int b) {
        throw new RuntimeException("not implement");
    }
}
