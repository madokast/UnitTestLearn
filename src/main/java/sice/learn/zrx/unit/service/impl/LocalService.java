package sice.learn.zrx.unit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sice.learn.zrx.unit.service.ILocalService;
import sice.learn.zrx.unit.service.IRemoteService;

/**
 * @Description local service
 * @Date 2021/7/28 16:03
 * @Created by ZhaoRX
 */
@Service
public class LocalService implements ILocalService {
    public String repeat(String origin, int time) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < time; i++) {
            sb.append(origin);
        }
        return sb.toString();
    }
}
