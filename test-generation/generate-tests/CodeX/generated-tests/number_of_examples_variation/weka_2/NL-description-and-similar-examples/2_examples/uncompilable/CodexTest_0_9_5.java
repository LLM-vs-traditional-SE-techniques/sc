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


public class CodexTest_0_9_5 { 
  @Test
  public void testPlotForR() {
    int len = 22;
    AlgVector v = new AlgVector(len);
    PlotData2D pd = new PlotData2D(v.getAsInstance(inst, rand));
    pd.m_plotName = "AlgVector";
    pd.addInstanceNumberAttribute();
    plot.addPlot(pd);		
    plot.setXindex(0);
		
  }
}