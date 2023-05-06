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


public class CodexTest_0_7_10 { 
  @Test
  public void testWriteBytesToWithMoreThen1Byte() {
    AlgVector v = new AlgVector(3);
    // Fill it with random data
    for (int i=0; i<v.numElements(); ++i) {
      v.setElement(i, i);
    }
    byte[] data = new byte[4];
    v.writeBytesTo(data, 0, data.length);
    assertEquals((byte) 0, data[0]);
    assertEquals((byte) 0, data[1]);
    assertEquals((byte) 2, data[2]);
    assertEquals((byte) 3, data[3]);
  }
}