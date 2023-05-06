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


public class CodexTest_0_9_9 { 
  @Test
  public void testGetAsInstance() throws Exception {
    PowerEvaluation evaluation = new PowerEvaluation();
    PowerPKFoldEvaluator evaluator = new PowerPKFoldEvaluator();
    GraphBuilder gb = new DefaultGraphBuilder();
    gb.setGenerateDummyNodes(false);
    gb.setRandom(new Random());
    gb.setSeed(42L);
}