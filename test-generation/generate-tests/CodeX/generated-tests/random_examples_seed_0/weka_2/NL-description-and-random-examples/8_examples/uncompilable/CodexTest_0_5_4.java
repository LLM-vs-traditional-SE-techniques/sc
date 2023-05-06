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


public class CodexTest_0_5_4 { 
  @Test
    public void testGetAsInstance() {
			Instances model = new Instances(new DenseInstance(0));
			model.add(new DenseInstance(1));
			model.add(new DenseInstance(2));
}