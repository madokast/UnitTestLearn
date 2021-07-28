package sice.learn.zrx.unit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sice.learn.zrx.unit.service.ILocalUseRemoteService;
import sice.learn.zrx.unit.service.IRemoteService;

/**
 * @Description TODO
 * @Date 2021/7/28 16:42
 * @Created by ZhaoRX
 */
@Service
public class LocalUseRemoteService implements ILocalUseRemoteService {
    @Autowired
    IRemoteService remoteService;

    @Override
    public int addRemote(int a, int b) {
        return remoteService.add(a, b);
    }
}
