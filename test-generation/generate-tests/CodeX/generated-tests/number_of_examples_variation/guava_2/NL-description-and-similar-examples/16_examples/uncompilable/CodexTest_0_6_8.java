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


public class CodexTest_0_6_8 { 
  @Test
  // Test that we can write a large number of bits and that we use the correct number of bytes.
  public void testWriteBytesTo() {
    MutableBitArray array = new MutableBitArray(1000);
    for (int i = 0; i < 100; i++) {
      array.setBit(i, true);
    }
    int numBytes = (100 + 7) / 8;
    assertEquals(numBytes, array.writeBytesTo(new byte[numBytes], 0, numBytes));
    // Test that we can write to offset 0.
    assertEquals(numBytes, array.writeBytesTo(new byte[numBytes + 2], 2, numBytes));
    // Test that we can write to offset 1.
    assertEquals(numBytes, array.writeBytesTo(new byte[numBytes + 2], 1, numBytes));
    // Test that we can write to offset 2.
    assertEquals(numBytes, array.writeBytesTo(new byte[numBytes + 2], 0, numBytes));
    // Test that we can write to offset 3.
    assertEquals(numBytes, array.writeBytesTo(new byte[numBytes + 2], 3, numBytes));
    // Test that we can write to offset 4.
    assertEquals(numBytes, array.writeBytesTo(new byte[numBytes + 2], 4, numBytes));
    // Test that we can write to offset 7.
    assertEquals(numBytes, array.writeBytesTo(new byte[numBytes + 2], 7, numBytes));
    // Test that we can write to offset 8.
    assertEquals(numBytes, array.writeBytesTo(new byte[numBytes + 2], 8, numBytes));
    // Test that we can write to offset 9.
    assertEquals(numBytes, array.writeBytesTo(new byte[numBytes + 2], 9, numBytes));
}