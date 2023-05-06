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


public class CodexTest_0_6_9 { 
  @Test
    public void testWriteBytesTo() {
    BitSet bitSet = new BitSet(200);
    for (int i = 0; i < 100; i++) {
      bitSet.set(i, true);
    }
    byte[] bytes = new byte[100];
    int bytesWritten = bitSet.writeBytesTo(bytes, 0, 100);
    assertEquals(100, bytesWritten);
    for (int i = 0; i < 100; i++) {
      assertEquals(-1, bytes[i]);
    }
    bytesWritten = bitSet.writeBytesTo(bytes, 0, 50);
    assertEquals(50, bytesWritten);
    for (int i = 0; i < 50; i++) {
      assertEquals(-1, bytes[i]);
    }
    for (int i = 50; i < 100; i++) {
      assertEquals(0, bytes[i]);
    }
    bytesWritten = bitSet.writeBytesTo(bytes, 0, 0);
    assertEquals(0, bytesWritten);
  }
}