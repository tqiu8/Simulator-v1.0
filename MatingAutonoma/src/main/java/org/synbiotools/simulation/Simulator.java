/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synbiotools.simulation;
import sim.engine.*;
import sim.util.*;
import sim.field.continuous.*;

/**
 *
 * @author tiffanywu
 */
public class Simulator extends SimState
{
    //population is a way to represent space (a field)
    public Continuous2D population = new Continuous2D(1.0,100,100);
    public int numAgents1 = 75;
    public int numAgents2 = 25;
    public Simulator(long seed)
    {
        super(seed);
    }  
    
    public void start(JSONFileReader file)
    {
        super.start();
        population.clear(); 
        for(int i = 0; i < numAgents1; i++)
        {
            Agent agent = new Agent();
            population.setObjectLocation(agent,
                new Double2D(population.getWidth() * 0.5 + random.nextDouble() - 0.5,
                population.getHeight() * 0.5 + random.nextDouble() - 0.5)); 
            agent.setState(file.states.get(0));
            schedule.scheduleRepeating(agent);
        }
        for(int i = 0; i < numAgents2; i++)
        {
            Agent agent = new Agent();
            population.setObjectLocation(agent,
                new Double2D(population.getWidth() * 0.5 + random.nextDouble() - 0.5,
                population.getHeight() * 0.5 + random.nextDouble() - 0.5)); 
            agent.setState(file.states.get(1));
            schedule.scheduleRepeating(agent);
        }
        
        
    }
    public static void main(String[] args)
    {
        doLoop(Simulator.class, args);
        System.exit(0);
    }
}
