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


public class CodexTest_0_4_5 { 
  @Test
  public void testWriteBytesTo() {
    int maxLength = 3;
    byte[] bytes = new byte[maxLength];
    AlgVector v = new AlgVector(new double[] {1, 2, 3});
    int numBytesWritten = v.writeBytesTo(bytes, 0, maxLength);
    assertEquals("numBytesWritten", maxLength, numBytesWritten);
    assertEquals("bytes[0]", 1, bytes[0]);
    assertEquals("bytes[1]", 2, bytes[1]);
    assertEquals("bytes[2]", 3, bytes[2]);
  }
}