package com.yoti.service.move;

import com.yoti.entity.Hoover;

/**
 * Created by zhuanghua on 2018/1/5.
 */
public class MoveImpl implements Move<Hoover,Direction> {
    public void moveStep(Hoover hoover, Direction direction) {

 if(direction.getDirection().equals("E")){
     int x = hoover.getHooverX()+1;
 }


    }
}
