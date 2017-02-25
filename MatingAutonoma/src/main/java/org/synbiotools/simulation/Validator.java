/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synbiotools.simulation;


/**
 *
 * @author tiffanywu
 */
public class Validator {

    boolean validity = false;
    
    public Validator(JSONFileReader simulation) {
        if (inputMapMatch(simulation) && outputMapMatch(simulation) 
                && checkRuleStates(simulation) && checkInputOutputStates(simulation)) {
            System.out.println("File is valid.");
            validity = true;
        } else {
            System.out.println("File is not valid.");
        }
        
    }
    
    //Checks if each input has a corresponding inputMap match
    public static boolean inputMapMatch(JSONFileReader simulation) {
        boolean check = false;
        for (Input eachInput: simulation.inputs) {
            for (InputMap eachInputMap: simulation.inputMap) {
                if (eachInput.input.equals(eachInputMap.input)) {
                    check = true;
                }
            }
            if (check != true) {
                System.out.println(eachInput.input + " does not have a corresponding inputMap match.");
                return false;
            }
            check = false;
        }
        return true;
    }
    
    //Checks if each output has a corresponding outputMap match
    public static boolean outputMapMatch(JSONFileReader simulation) {
        boolean check = false;
        for (Output eachOutput: simulation.outputs) {
            for (OutputMap eachOutputMap: simulation.outputMap) {
                if (eachOutput.output.equals(eachOutputMap.output)) {
                    check = true;
                }
            }
            if (check != true) {
                System.out.println(eachOutput.output + " does not have a corresponding outputMap match.");
                return false;
            }
            check = false;
        }
        return true;
    }
    
    //Checks if all the parents and offspring for the rules have valid states 
    public static boolean checkRuleStates(JSONFileReader simulation) {
        boolean check = true;
        for (Rule eachRule: simulation.rules) {
            for (Participant eachRole: eachRule.parentStates) {
                if (!(simulation.states.contains(eachRole.state))) {
                    System.out.println(eachRole.state + " is an invalid state.");
                    return false;
                }  
            }
            for (Participant eachRole: eachRule.offspringStates) {
                if (!(simulation.states.contains(eachRole.state))) {
                    System.out.println(eachRole.state + " is an invalid state.");
                    return false;
                }  
            }
            
        }
        return check;
    }
    
    //Checks if inputMap and outputMap maps to valid states 
    public static boolean checkInputOutputStates(JSONFileReader simulation) {
        boolean check = true;
        for (InputMap eachInputMap: simulation.inputMap) {
            if (!(simulation.states.contains(eachInputMap.state))) {
                System.out.println(eachInputMap.state + " is an invalid state.");
                return false;
            }       
        }
        for (OutputMap eachOutputMap: simulation.outputMap) {
            if (!(simulation.states.contains(eachOutputMap.state))) {
                System.out.println(eachOutputMap.state + " is an invalid state.");
                return false;
            }       
        }
        return check;
    }
}
