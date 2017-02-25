/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synbiotools.simulation;

import java.util.ArrayList;

/**
 *
 * @author tiffanywu
 */
public class Rule {
    public ArrayList<Participant> parentStates;
    public ArrayList<Participant> offspringStates;

    /**
     * @return the parentStates
     */
    public ArrayList<Participant> getParentStates() {
        return parentStates;
    }

    /**
     * @param parentStates the parentStates to set
     */
    public void setParentStates(ArrayList<Participant> parentStates) {
        this.parentStates = parentStates;
    }

    /**
     * @return the offspringStates
     */
    public ArrayList<Participant> getOffspringStates() {
        return offspringStates;
    }

    /**
     * @param offspringStates the offspringStates to set
     */
    public void setOffspringStates(ArrayList<Participant> offspringStates) {
        this.offspringStates = offspringStates;
    }
}
