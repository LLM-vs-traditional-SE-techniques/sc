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


public class CodexTest_0_8_7 { 
  @Test
    public void testGetAsInstance() {
        double[] data = {2.3, 1.2, 5.0};
        AlgVector v = new AlgVector(data);
        // create a mock instance Model
        Instances mockModel = mock(Instances.class);
        // make sure that model.numAttributes returns 3
        when(mockModel.numAttributes()).thenReturn(3);
        // make sure that model.attribute(0) returns an Attribute
        // a mock attribute is created to return the type of the attribute
        Attribute mockAttribute0 = mock(Attribute.class);
        when(mockAttribute0.isNumeric()).thenReturn(true);
        when(mockModel.attribute(0)).thenReturn(mockAttribute0);
        // make sure that model.attribute(0) returns an Attribute
        // a mock attribute is created to return the type of the attribute
        Attribute mockAttribute1 = mock(Attribute.class);
        when(mockAttribute1.isNumeric()).thenReturn(true);
        when(mockModel.attribute(1)).thenReturn(mockAttribute1);
        // make sure that model.attribute(0) returns an Attribute
        // a mock attribute is created to return the type of the attribute
        Attribute mockAttribute2 = mock(Attribute.class);
        when(mockAttribute2.isNumeric()).thenReturn(true);
        when(mockModel.attribute(2)).thenReturn(mockAttribute2);
        // create a random mock object, to be used in the tested method
        // to avoid the calls to random numbers generation, we use the
        //  PartialMockRandom class extending Random class
        PartialMockRandom mockRandom = new PartialMockRandom();
        // now we can call the tested method
        // the method under test returns a dense instance
        DenseInstance result = (DenseInstance) v.getAsInstance(mockModel, mockRandom);
        // the result of the method should be a dense instance
        assertNotNull(result);
		  // check values
        for (int i = 0; i < data.length; i++)
            assertEquals((
}