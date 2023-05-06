import com.google.common.hash.*;
import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;
import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedInts;
import java.io.Serializable;

import static com.google.common.io.BaseEncoding.base16;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.io.BaseEncoding;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_94 { 
  @Test
  public boolean testHash() {
    int size = 5;
    int numBuckets =3;
    double MAX_FILL_RATIO = 0.75;
    int numElements = ((int) (numBuckets * MAX_FILL_RATIO)) + 1;
    DoubleHashFactory factory= new DoubleHashFactory(numBuckets,MAX_FILL_RATIO);
    DoubleHashFunction h = factory.generate(size);
    
    double[] data = new double[numElements];
    Random r = new Random(); // careful, these all fall into the same bucket
    for (int i = 0; i < numElements; i++) {
      data[i] = r.nextDouble();
    }
    for (int i = 0; i < numElements; i++) {
      int g = (int)data[i];
      int index = h.hash(g);
      if (index == -1) {
        return false;
      }
    }
    return true;
  }
}