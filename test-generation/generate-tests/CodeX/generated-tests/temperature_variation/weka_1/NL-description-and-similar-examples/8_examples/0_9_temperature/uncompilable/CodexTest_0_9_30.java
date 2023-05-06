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


public class CodexTest_0_9_30 { 
  @Test
    public final void testDifficulty() {
        JTree tree = new JTree();
        int numrows = getRowCount();  
           for (int i = 0; i < numrows; i++) 
             expandRow(i); 
        TreePath path = tree.getPathForRow(2);
      }
}