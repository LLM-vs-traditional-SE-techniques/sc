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


public class CodexTest_0_9_59 { 
  @Test
       NEW
      SECTION
      FORMA
      CODE
      INSTANCE result = new INSTANCE(inst.attribute(index).numValues()");
     result.setDataset(inst.dataset());
     if (inst.isMissing(index)) {
       result.setMissing(0);
     } else if (inst.attribute(index).isNominal()||inst.attribute(index).isString()) {
       result.setValue(0, inst.value(index));
     } else {
       throw new IllegalArgumentException(\"Can only handle nominal or string attributes!");
     }
     return result;
     ENDCODE
     ENDFORMA
    ENDSECTION
}