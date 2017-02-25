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

public class JSONFileReader {
    String version;
    ArrayList<Input> inputs;
    ArrayList<Output> outputs;
    ArrayList<InputMap> inputMap;
    ArrayList<OutputMap> outputMap;
    ArrayList<Rule> rules; 
    ArrayList<String> states;

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return the inputs
     */
    public ArrayList<Input> getInputs() {
        return inputs;
    }

    /**
     * @param inputs the inputs to set
     */
    public void setInputs(ArrayList<Input> inputs) {
        this.inputs = inputs;
    }

    /**
     * @return the outputs
     */
    public ArrayList<Output> getOutputs() {
        return outputs;
    }

    /**
     * @param outputs the outputs to set
     */
    public void setOutputs(ArrayList<Output> outputs) {
        this.outputs = outputs;
    }

    /**
     * @return the inputMap
     */
    public ArrayList<InputMap> getInputMap() {
        return inputMap;
    }

    /**
     * @param inputMap the inputMap to set
     */
    public void setInputMap(ArrayList<InputMap> inputMap) {
        this.inputMap = inputMap;
    }

    /**
     * @return the outputMap
     */
    public ArrayList<OutputMap> getOutputMap() {
        return outputMap;
    }

    /**
     * @param outputMap the outputMap to set
     */
    public void setOutputMapping(ArrayList<OutputMap> outputMap) {
        this.outputMap = outputMap;
    }

    /**
     * @return the rules
     */
    public ArrayList<Rule> getRules() {
        return rules;
    }

    /**
     * @param rules the rules to set
     */
    public void setRules(ArrayList<Rule> rules) {
        this.rules = rules;
    }

    /**
     * @return the states
     */
    public ArrayList<String> getStates() {
        return states;
    }

    /**
     * @param states the states to set
     */
    public void setStates(ArrayList<String> states) {
        this.states = states;
    }

}
