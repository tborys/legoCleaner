package com.lego;

import lejos.hardware.Button;
import lejos.hardware.ev3.EV3;
import lejos.hardware.lcd.LCD;
import lejos.remote.ev3.RemoteEV3;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * To execute this program follow the steps in order:
 * 1. Clean Maven
 * 2. Build -> Make Module
 * 3. Install Maven
 * 4. Maven-antrun to copy to the device, if doesn't work, check the IP address.
 * Demonstrate various leJOS graphics techniques.
 */

public class Motor extends Thread {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {

        EV3 ev3 = new RemoteEV3("HOST");
        System.out.println("Hi I am Thread: " + Thread.activeCount());
        LCD.clear();
        LCD.drawString("Tomus first EV3 program", 0, 5);
        Button.waitForAnyPress();
        LCD.clear();
        LCD.refresh();
    }

}
