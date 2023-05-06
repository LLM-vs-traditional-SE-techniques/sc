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


public class CodexTest_0_3_1 { 
  @Test
    public void testGetAsInstance() {
			Instances model = new Instances(new DenseInstance(2), 0);
			model.setClassIndex(1);
			model.add(new DenseInstance(1.0, new double[]{1.0, 0.0}));
			model.add(new DenseInstance(1.0, new double[]{2.0, 1.0}));
			model.add(new DenseInstance(1.0, new double[]{3.0, 2.0}));
			model.add(new DenseInstance(1.0, new double[]{4.0, 3.0}));
			model.add(new DenseInstance(1.0, new double[]{5.0, 4.0}));
			model.add(new DenseInstance(1.0, new double[]{6.0, 5.0}));
			model.add(new DenseInstance(1.0, new double[]{7.0, 6.0}));
			model.add(new DenseInstance(1.0, new double[]{8.0, 7.0}));
			model.add(new DenseInstance(1.0, new double[]{9.0, 8.0}));
			model.add(new DenseInstance(1.0, new double[]{10.0, 9.0}));
			model.add(new DenseInstance(1.0, new double[]{11.0, 10.0}));
			model.add(new DenseInstance(1.0, new double[]{12.0, 11.0}));
			model.add(new DenseInstance(1.0, new double[]{13.0, 12.0}));
			model.add(new DenseInstance(1.0, new double[]{14.0, 13.0}));
			model.add(new DenseInstance(1.0, new double[]{15.0, 14.0}));
			model.add(
}