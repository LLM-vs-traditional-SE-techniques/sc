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


public class CodexTest_0_9_28 { 
  @Test
  public void testToByteArray_badOutputLength() {
    byte[] byteArray = new byte[5];
    int b = 0x10001; // gives byte-array {1,1,1,1}
    
    try {
      FixedBitSet bitSet = new FixedBitSet(new int[]{b}, b + 1);
      bitSet.toByteArray(byteArray, 0, 4);
      fail("Output length of 4 should be too small");
    } catch (IllegalArgumentException e) {
      // expected
    }        
  }
}