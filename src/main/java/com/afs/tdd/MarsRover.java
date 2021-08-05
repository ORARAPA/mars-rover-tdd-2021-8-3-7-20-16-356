package com.afs.tdd;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MarsRover {
    private RoverStatus roverStatus;
    private String commands = "";

    public MarsRover() {

    }

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public String executeInstructions(String instructions){
        parseInstructions(instructions);
        executeCommands(roverStatus,commands);
        return buildReport(roverStatus);
    }

    public String buildReport(RoverStatus roverStatus){
        return String.format("%d %d %s",roverStatus.getLocationX(),roverStatus.getLocationY(),roverStatus.getDirection());
    }

    public void parseInstructions(String instructions){
        String[] instruction = instructions.split("  ");
        commands = instruction[1];

        String[] initialValues = instruction[0].split(" ");
        roverStatus = new RoverStatus(Integer.parseInt(initialValues[0]),Integer.parseInt(initialValues[1]),initialValues[2]);
    }


    public RoverStatus executeCommands(RoverStatus roverStatus, String command){
        this.roverStatus = roverStatus;
        executeCommand(command);

        return this.roverStatus;
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

    public String getCommands() {
        return this.commands;
    }


}
