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
    public void printSummary() {
       double maxMarginError = Double.NEGATIVE_INFINITY;
       double minMarginError = Double.POSITIVE_INFINITY;
       double avgMarginError = 0;
       double maxSquaredMarginError = Double.NEGATIVE_INFINITY;
       double minSquaredMarginError = Double.POSITIVE_INFINITY;
       double avgSquaredMarginError = 0;
       for(int i = 0; i < m_Actual.length; i++) {
	 double margin = m_Predicted[i] - m_Actual[i];
	 double squaredMargin = margin * margin;
	 if(margin > maxMarginError) {
	   maxMarginError = margin;
	 }
	 if(margin < minMarginError) {
	   minMarginError = margin;
	 }
	 if(squaredMargin > maxSquaredMarginError) {
	   maxSquaredMarginError = squaredMargin;
	 }
	 if(squaredMargin < minSquaredMarginError) {
	   minSquaredMarginError = squaredMargin;
	 }
	 avgMarginError += margin;
	 avgSquaredMarginError += squaredMargin;
       }
       avgMarginError /= (double)m_Actual.length;
       avgSquaredMarginError /= (double)m_Actual.length;
       System.out.println(Messages.getInstance().getString("MarginCurve_PrintSummary_Text_Fourth"));
       System.out.println(Messages.getInstance().getString("MarginCurve_PrintSummary_Text_Fifth") + Utils.doubleToString(maxMarginError,12,4));
       System.out.println(Messages.getInstance().getString("MarginCurve_PrintSummary_Text_Sixth") + Utils.doubleToString(minMarginError,12,4));
       System.out.println(Messages.getInstance().getString("MarginCurve_PrintSummary_Text_Seventh") + Utils.doubleToString(
}