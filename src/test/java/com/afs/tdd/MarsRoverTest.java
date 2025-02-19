package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_return_locationX_0_locationY_1_direction_N_when_execute_command_given_locationX_0_locationY_0_direction_N_and_M() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0,0,"N"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,1,"N");

        //when
        marsRover.executeCommand("M");

        //then
        assertEquals(expectedRoverStatus.getLocationX(),marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(),marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(),marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_W_when_execute_command_given_locationX_0_locationY_0_direction_N_and_L() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0,0,"N"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"W");

        //when
        marsRover.executeCommand("L");

        //then
        assertEquals(expectedRoverStatus.getLocationX(),marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(),marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(),marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_W_when_execute_command_given_locationX_0_locationY_0_direction_N_and_R() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0,0,"N"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"E");

        //when
        marsRover.executeCommand("R");

        //then
        assertEquals(expectedRoverStatus.getLocationX(),marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(),marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(),marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_n1_direction_S_when_execute_command_given_locationX_0_locationY_0_direction_S_and_M() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0,0,"S"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,-1,"S");

        //when
        marsRover.executeCommand("M");

        //then
        assertEquals(expectedRoverStatus.getLocationX(),marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(),marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(),marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_E_when_execute_command_given_locationX_0_locationY_0_direction_S_and_L() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0,0,"S"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"E");

        //when
        marsRover.executeCommand("L");

        //then
        assertEquals(expectedRoverStatus.getLocationX(),marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(),marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(),marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_W_when_execute_command_given_locationX_0_locationY_0_direction_S_and_R() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0,0,"S"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"W");

        //when
        marsRover.executeCommand("R");

        //then
        assertEquals(expectedRoverStatus.getLocationX(),marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(),marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(),marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_1_locationY_0_direction_E_when_execute_command_given_locationX_0_locationY_0_direction_E_and_M() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0,0,"E"));
        RoverStatus expectedRoverStatus = new RoverStatus(1,0,"E");

        //when
        marsRover.executeCommand("M");

        //then
        assertEquals(expectedRoverStatus.getLocationX(),marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(),marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(),marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_N_when_execute_command_given_locationX_0_locationY_0_direction_E_and_L() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0,0,"E"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"N");

        //when
        marsRover.executeCommand("L");

        //then
        assertEquals(expectedRoverStatus.getLocationX(),marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(),marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(),marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_S_when_execute_command_given_locationX_0_locationY_0_direction_E_and_R() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0,0,"E"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"S");

        //when
        marsRover.executeCommand("R");

        //then
        assertEquals(expectedRoverStatus.getLocationX(),marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(),marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(),marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_n1_locationY_0_direction_W_when_execute_command_given_locationX_0_locationY_0_direction_W_and_M() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0,0,"W"));
        RoverStatus expectedRoverStatus = new RoverStatus(-1,0,"W");

        //when
        marsRover.executeCommand("M");

        //then
        assertEquals(expectedRoverStatus.getLocationX(),marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(),marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(),marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_S_when_execute_command_given_locationX_0_locationY_0_direction_W_and_L() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0,0,"W"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"S");

        //when
        marsRover.executeCommand("L");

        //then
        assertEquals(expectedRoverStatus.getLocationX(),marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(),marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(),marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_N_when_execute_command_given_locationX_0_locationY_0_direction_W_and_R() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0,0,"W"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"N");

        //when
        marsRover.executeCommand("R");

        //then
        assertEquals(expectedRoverStatus.getLocationX(),marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(),marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(),marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_n1_locationY_1_direction_N_when_execute_command_given_locationX_0_locationY_0_direction_N_and_MLMR() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0,0,"N"));
        RoverStatus expectedRoverStatus = new RoverStatus(-1,1,"N");

        //when
        marsRover.executeCommand("MLMR");

        //then
        assertEquals(expectedRoverStatus.getLocationX(),marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(),marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(),marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_n1_locationY_1_direction_N_when_execute_commands_given_locationX_0_locationY_0_direction_N_and_MLMR() {
        //given
        MarsRover marsRover = new MarsRover();
        RoverStatus inputRoverStatus = new RoverStatus(0,0,"N");
        RoverStatus expectedRoverStatus = new RoverStatus(-1,1,"N");

        //when
        marsRover.executeCommands(inputRoverStatus,"MLMR");

        //then
        assertEquals(expectedRoverStatus.getLocationX(),marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(),marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(),marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_roverStatus_0_0_N_instructions_MMMM_when_parse_instuctions_given_0_0_N_MMMM() {
        //given
        MarsRover marsRover = new MarsRover();
        String inputInstructions = "0 0 N  MMMM";
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"N");
        String expectedInstructions = "MMMM";

        //when
        marsRover.parseInstructions(inputInstructions);

        //then
        assertEquals(expectedRoverStatus.getLocationX(),marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(),marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(),marsRover.getRoverStatus().getDirection());
        assertEquals(expectedInstructions,marsRover.getCommands());
    }

    @Test
    void should_return_string_n1_1_N_when_build_report_given_locationX_0_locationY_0_direction_N() {
        //given
        MarsRover marsRover = new MarsRover();
        RoverStatus inputRoverStatus = new RoverStatus(0,0,"N");
        String expected = "0 0 N";

        //when
        String result = marsRover.buildReport(inputRoverStatus);

        //then
        assertEquals(expected,result);
    }

    @Test
    void should_return_string_n1_1_N_when_execute_instructions_given_string_0_0_N_MLMR() {
        //given
        MarsRover marsRover = new MarsRover();
        String instructions = "0 0 N  MLMR";
        String expected = "-1 1 N";

        //when
        String result = marsRover.executeInstructions(instructions);

        //then
        assertEquals(expected,result);
    }
}
