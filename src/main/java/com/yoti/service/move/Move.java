package com.yoti.service.move;

import com.yoti.entity.Hoover;

/**
 * Created by zhuanghua on 2018/1/5.
 */
public interface Move<T,D> {

    void moveStep(Hoover T, Direction D);
}
