package com.jamescho.game.state;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 * Created by cortman on 3/21/17.
 */
public class ExampleState extends State {

    private int y = 200;

    @Override
    public void init() {

    }

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        y = 300;
        g.drawRect(400, y, 10, 15);
    }

    @Override
    public void onClick(MouseEvent e) {
        y = y + 4;


    }

    @Override
    public void onKeyPress(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_KP_DOWN) {
            y = y + 4;

        }else if (e.getKeyCode() == KeyEvent.VK_UP) {
            y = y - 10;
        }


    }

    @Override
    public void onKeyRelease(KeyEvent e) {

    }
}
