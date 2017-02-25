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
import com.fasterxml.jackson.core.*;
//import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import java.io.File;
import java.io.IOException;
import static sim.engine.SimState.doLoop;

public class MatingAutonoma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        
        try {
                    JSONFileReader JSONFile = mapper.readValue(new File("/Users/tammyqiu/Desktop/Gene Drive/Simulator-v1.0/MatingAutonoma/exampleJSON.txt"), JSONFileReader.class);
                    
                    /*System.out.println(JSONFile.inputs.get(0).description);
                    System.out.println(JSONFile.rules.get(1).parentStates.get(0).state);
                    String json = mapper.writeValueAsString(JSONFile);
                    System.out.println(json);*/
                    
                    Validator valid = new Validator (JSONFile);
                    doLoop(Simulator.class, args);
                    System.exit(0);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    
    }
    
}
