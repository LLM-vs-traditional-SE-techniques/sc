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


public class CodexTest_0_7_80 { 
  @Test
  public void testGetPredictionMatrix() {
    double[][] predictions = new double[][]{
	{0.1, 0.9},
	{0.7, 0.3},
	{0.2, 0.8},
	{0.5, 0.5},
	{0.4, 0.6}
    };
    int[] classes = new int[]{0, 0, 0, 1, 1};
    double[][] expected = new double[][]{
	{0.1, 0.9, 0},
	{0.7, 0.3, 0},
	{0.2, 0.8, 0},
	{0.5, 0.5, 1},
	{0.4, 0.6, 1}
    };
}