package com.afs.tdd;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MarsRover {
    private RoverStatus roverStatus;

    public MarsRover() {

    }

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public void executeCommands(RoverStatus roverStatus, String command){
        this.roverStatus = roverStatus;
        executeCommand(command);

    }

    public void executeCommand(String command) {
        String[] commands = command.split("");

        for (int i = 0; i < commands.length ; i++) {
            switch (commands[i]){
                case "M":   move(); break;
                case "L":   turnLeft(); break;
                case "R":   turnRight(); break;
            }
        }

    }

    private void turnRight() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        String newDirection="";

        switch (direction){
            case "N": newDirection = "E"; break;
            case "S": newDirection = "W"; break;
            case "E": newDirection = "S"; break;
            case "W": newDirection = "N"; break;
        }

        roverStatus = new RoverStatus(locationX,locationY,newDirection);
    }

    private void turnLeft() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        String newDirection="";

        switch (direction){
            case "N": newDirection = "W"; break;
            case "S": newDirection = "E"; break;
            case "E": newDirection = "N"; break;
            case "W": newDirection = "S"; break;
        }

        roverStatus = new RoverStatus(locationX,locationY,newDirection);
    }

    private void move() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();

        switch (direction){
            case "N": roverStatus = new RoverStatus(locationX,locationY+1,direction); break;
            case "S": roverStatus = new RoverStatus(locationX,locationY-1,direction); break;
            case "E": roverStatus = new RoverStatus(locationX+1,locationY,direction); break;
            case "W": roverStatus = new RoverStatus(locationX-1,locationY,direction); break;
        }
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }
}
