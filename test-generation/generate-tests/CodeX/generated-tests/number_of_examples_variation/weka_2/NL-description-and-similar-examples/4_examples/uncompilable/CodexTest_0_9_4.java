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


public class CodexTest_0_9_4 { 
  @Test
  public void testGetAsInstanceShouldSetTypePredictorDataset() {
    // given
    AlgVector algVector = new AlgVector(new double[] {});
    Instances instances = Instances.attributeBuilder().build();
    // when
    Instance instance = algVector.getAsInstance(instances, new Random());
    // then
    assertEquals(instances, instance.dataset());
  }
  
  public void testGetAsInstanceShouldSetTypePredictorDatasetForNominal() {
    // given
    AlgVector algVector = new AlgVector(new double[] {});
    Attribute attribute = Attribute.attributeBuilder().setName("weight").setContinuous(true).build();
    Instances instances = Instances.attributeBuilder().addAttributes(attribute).setClassName("weight").build();
    // when
    Instance instance = algVector.getAsInstance(instances, new Random());
    // then
    assertEquals(instances, instance.dataset());
  }
  
  public void testGetAsInstanceClassIndexShouldNotEqual0() {
    // given
    AlgVector algVector = new AlgVector(new double[] {});
    // when
    Instance instance = algVector.getAsInstance(instances, new Random());
    // then
    assertThat(instance.classIndex(), is(not(0)));
  }
}