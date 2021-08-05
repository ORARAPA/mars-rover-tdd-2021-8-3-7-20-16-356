package com.afs.tdd;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MarsRover {
    private RoverStatus roverStatus;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public void executeCommand(String command) {
        String commands[] = command.split("");

        for (int i = 0; i < commands.length ; i++) {
            if(commands[i].equals("M")){
                move();
            }
            if(commands[i].equals("L")){
                turnLeft();
            }
            if(commands[i].equals("R")){
                turnRight();
            }
        }

    }

    private void turnRight() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        String newDirection="";

        if(direction.equals("N")){
            newDirection = "E";
        }
        if(direction.equals("S")){
            newDirection = "W";
        }
        if(direction.equals("E")){
            newDirection = "S";
        }
        if(direction.equals("W")){
            newDirection = "N";
        }
        roverStatus = new RoverStatus(locationX,locationY,newDirection);
    }

    private void turnLeft() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        String newDirection="";

        if(direction.equals("N")){
            newDirection = "W";
        }
        if(direction.equals("S")){
            newDirection = "E";
        }
        if(direction.equals("E")){
            newDirection = "N";
        }
        if(direction.equals("W")){
            newDirection = "S";
        }

        roverStatus = new RoverStatus(locationX,locationY,newDirection);
    }

    private void move() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        if(direction.equals("N")){
            roverStatus = new RoverStatus(locationX,locationY+1,direction);
        }

        if(direction.equals("S")){
            roverStatus = new RoverStatus(locationX,locationY-1,direction);
        }

        if(direction.equals("E")){
            roverStatus = new RoverStatus(locationX+1,locationY,direction);
        }

        if(direction.equals("W")){
            roverStatus = new RoverStatus(locationX-1,locationY,direction);
        }
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }
}
