/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synbiotools.simulation;
import sim.engine.*;
import sim.field.continuous.*;
import sim.util.*;

/**
 *
 * @author tiffanywu
 */
public class Agent implements Steppable {
    private String state;
    
    public void step(SimState simState) {
        Simulator simulation = (Simulator) simState;
        Continuous2D population = simulation.population;
        Event event = new Event();
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }
}
