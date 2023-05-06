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


public class CodexTest_0_8_5 { 
  @Test
    public void testAdd() {
		
		double[] a_data = {1.0, 2.0, 3.0};
		double[] b_data = {4.0, 5.0, 6.0};
		double[] c_data = {1.0, 3.0, 5.0};
		double[] d_data = {8.0,10.0,12.0};
		double[] e_data = {1.0, 1.0, 3.0, 5.0};
		double[] f_data = {8.0, 4.0,10.0,12.0};
		double[] g_data = {5.0, 7.0};
		double[] h_data = {12.0,14.0};
		double[] k_data = {0.0, 0.0, 0.0, 0.0};
		double[] l_data = {1.0, 2.0};
		double[] m_data = {4.0, 5.0};
		double[] n_data = {5.0, 7.0, 0.0, 0.0};
		
		AlgVector a = new AlgVector(a_data);
		AlgVector b = new AlgVector(b_data);
		AlgVector c = new AlgVector(c_data);
		AlgVector d = new AlgVector(d_data);
		AlgVector e = new AlgVector(e_data);
		AlgVector f = new AlgVector(f_data);
		AlgVector g = new AlgVector(g_data);
		AlgVector h = new AlgVector(h_data);
		AlgVector k = new AlgVector(k_data);
		AlgVector l = new AlgVector(l_data);
		AlgVector m = new AlgVector(m_data);
		AlgVector n = new AlgVector(n_data);
		
		AlgVector sum1 = a.add(b);

}