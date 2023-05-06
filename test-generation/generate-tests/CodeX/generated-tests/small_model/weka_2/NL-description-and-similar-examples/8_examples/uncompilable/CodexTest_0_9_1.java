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


public class CodexTest_0_9_1 { 
  @Test
  Input: public Instance getAsInstance(Instances model, Random random) {
      Instance newInst = null;
      if (m_Elements != null && m_Elements.length != 0) {
        newInst = new DenseInstance(model.numAttributes());
        for (int i = 0, j = 0; i < model.numAttributes(); i++) {
          if (model.attribute(i).isNumeric())
            newInst.setValue(i, m
}