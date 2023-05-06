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


public class CodexTest_0_9_38 { 
  @Test
   public void testGetAsInstance() {
       AlgVector v = new AlgVector(new double[]{22, 6, 7});
       Instances emptyIntances = new Instances(v.asWekaInstances(), 0);
       Instance instance2 = v.getAsInstance(emptyIntances, new Random(11));
       assertEquals(3, instance2.numAttributes());
       assertEquals(0, instance2.classIndex());
       assertEquals(22, instance2.value(0), EPSILON);
       assertEquals(6, instance2.value(1), EPSILON);
       assertEquals(7, instance2.value(2), EPSILON);
   }
   public void testGetAsInstance2() {
       AlgVector v = new AlgVector(new double[]{22, 6, 7});
       Instances emptyIntances = new Instances(v.asWekaInstances(), 0);
       emptyIntances.insertAttributeAt(new Attribute("new", (FastVector) null), 0);
       Instance instance2 = v.getAsInstance(emptyIntances, new Random(11));
       assertEquals(4, instance2.numAttributes());
       assertEquals(2, instance2.classIndex());
       assertEquals("new", instance2.attribute(0).name());
       assertEquals("x", instance2.attribute(1).name());
       assertEquals("y", instance2.attribute(2).name());
       assertEquals("z", instance2.attribute(3).name());
   }
   public void testGetAsInstance3() {
       AlgVector v = new AlgVector(new double[]{22, 6, 7});
       Instances instances = v.asWekaInstances();
       Instance instance2 = v.getAsInstance(instances, new Random(11));
       assertEquals(3, instance2.numAttributes());
       assertEquals(instances.instance(0), instance2);
   }
}