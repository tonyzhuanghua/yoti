package com.yoti.service;

import com.yoti.entity.Hoover;
import com.yoti.entity.Pojo;
import com.yoti.entity.Room;
import com.yoti.service.move.Direction;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by zhuanghua on 2018/1/5.
 */
public class TestCleanOperation {

    private Pojo pojo = new Pojo();

    @Before
    public void setUp() throws Exception {
        Room room = new Room(5, 5);
        Hoover hoover = new Hoover(1, 2);
        pojo.setRoom(room);
        pojo.setHoover(hoover);

    }

    @Test
    public void move_a_step() throws Exception {

        CleanOperation cleanOperation = CleanOperation.init(pojo).move(Direction.EAST);

        int hooverX = pojo.getHoover().getHooverX();
        assertEquals(2, hooverX);


    }

    @Test
    public void move_three_steps() throws Exception {

        CleanOperation cleanOperation = CleanOperation.init(pojo)
                .move(Direction.EAST)
                .move(Direction.EAST)
                .move(Direction.EAST);

        int hooverX = pojo.getHoover().getHooverX();
        assertEquals(4, hooverX);


    }
    @Test
    public void move_five_steps() throws Exception {

        CleanOperation cleanOperation = CleanOperation.init(pojo)
                .move(Direction.EAST)
                .move(Direction.EAST)
                .move(Direction.EAST)
                .move(Direction.EAST)
                .move(Direction.EAST);

        int hooverX = pojo.getHoover().getHooverX();
        assertEquals(5, hooverX);

    }

    @Test
    public void move_N_steps() throws Exception { //NNESEESWNWW

        CleanOperation cleanOperation = CleanOperation.init(pojo)
                .move(Direction.NORTH)
                .move(Direction.NORTH)
                .move(Direction.EAST)
                .move(Direction.SOUTH)
                .move(Direction.EAST)
                .move(Direction.EAST)
                .move(Direction.SOUTH)
                .move(Direction.WEST)
                .move(Direction.NORTH)
                .move(Direction.WEST)
                .move(Direction.WEST);

        int hooverX = pojo.getHoover().getHooverX();
        int hooverY = pojo.getHoover().getHooverY();
        assertEquals(1, hooverX);
        assertEquals(3, hooverY);
    }
}
