import weka.core.*;
import java.io.Serializable;
import java.util.Random;

import weka.core.*;
import java.util.Random;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_92 { 
  @Test
    public void getAsInstance()
        throws Exception {
    
        Instances model = new Instances(getDataSet().getDataSet());
        Random random = getRandom();
        for (int i = 0; i < getNumTrain(); i++) {
            assertNotNull("Instance " + (i + 1) + " is null", 
                getInputFormat().instance(i));
            assertNotNull("Instance " + (i + 1) + " is null", 
                getInputFormat().instance(i).getAttributes().getMetadata().getValue("key"));
            assertNotNull("Instance " + (i + 1) + " is null", 
                getInputFormat().instance(i).getAttributes().getMetadata().getValue("fullPath"));
            Instance newInst = getInputFormat().instance(i).getAsInstance(model, random);
            assertNotNull("Instance " + (i + 1) + " is null", 
                newInst.getAttributes().getMetadata().getValue("key"));
            assertNotNull("Instance " + (i + 1) + " is null", 
                newInst.getAttributes().getMetadata().getValue("fullPath"));
        }
    
        for (int i = 0; i < getNumTest(); i++) {
            assertNotNull("Instance " + (i + 1) + " is null", 
                getInputFormat().instance(i));
            assertNotNull("Instance " + (i + 1) + " is null", 
                getInputFormat().instance(i).getAttributes().getMetadata().getValue("key"));
            assertNotNull("Instance " + (i + 1) + " is null", 
                getInputFormat().instance(i).getAttributes().getMetadata().getValue("fullPath"));
            Instance newInst = getInputFormat().instance(i).getAsInstance(model, random);
            assertNotNull("Instance " + (i + 1) + " is null", 
                newInst.getAttributes().getMetadata().getValue("key"));
            assertNotNull("Instance " + (i + 1) + " is null", 
                newInst
}