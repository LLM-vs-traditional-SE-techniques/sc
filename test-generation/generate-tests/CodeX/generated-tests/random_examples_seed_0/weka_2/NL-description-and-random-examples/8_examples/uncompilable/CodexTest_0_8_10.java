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


public class CodexTest_0_8_10 { 
  @Test
  public void getAsInstance() throws Exception {
    
    Instances m_Instances, model;
    Instance newInst;
    double [] m_Elements = {1, 2, 3, 4};
    int numAttributes;
    boolean m_IsNumeric;
    boolean m_IsNominal;
    
    try {
      //Create the dataset train
      m_Instances = new Instances("train", new ArrayList<Attribute>(), 0);
      m_Instances.add(new DenseInstance(4));
      m_Instances.add(new DenseInstance(4));
      m_Instances.add(new DenseInstance(4));
      m_Instances.add(new DenseInstance(4));
      m_IsNumeric = true;
      m_IsNominal = false;
      
      //add one numeric attribute
      if(m_IsNumeric) {
        m_Instances.insertAttributeAt(new Attribute("att1"), 0);
      }
      //add one nominal attribute
      else {
        m_Instances.insertAttributeAt(new Attribute("att1", m_Instances), 0);
      }
      
      //add three numeric attributes
      for(int i=0; i<3; i++) {
        m_Instances.insertAttributeAt(new Attribute("att" + (i+2)), i+1);
      }
      m_Instances.setClassIndex(3);
      model = new Instances(m_Instances, 0);
      m_Instances.setClassIndex(3);
      model.setClassIndex(3);
      
      //Test the method
      numAttributes = model.numAttributes();
      newInst = new DenseInstance(model.numAttributes());
      newInst.setDataset(model);
      for (int i = 0, j = 0; i < model.numAttributes(); i++) {
	if (model.attribute(i).isNumeric()) {
	  if (j >= m_Elements.length)
	    throw new Exception("Datatypes are not compatible."); 
	  new
}