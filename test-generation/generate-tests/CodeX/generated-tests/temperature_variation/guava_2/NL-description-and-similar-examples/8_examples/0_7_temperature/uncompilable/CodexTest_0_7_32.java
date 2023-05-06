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


public class CodexTest_0_7_32 { 
  @Test
    public void testWriteBytesTo() {
    byte[] dest = new byte[100];
    assertEquals(0, bitArray.writeBytesTo(dest, 0, 0));
    assertEquals(0, bitArray.writeBytesTo(dest, 0, 1));
    assertEquals(0, bitArray.writeBytesTo(dest, 1, 0));
    assertEquals(0, bitArray.writeBytesTo(dest, 1, 1));
    assertEquals(0, bitArray.writeBytesTo(dest, 99, 0));
    assertEquals(0, bitArray.writeBytesTo(dest, 99, 1));
    assertEquals(0, bitArray.writeBytesTo(dest, 1, 99));
    try {
      bitArray.writeBytesTo(dest, 0, 101);
      fail();
    } catch (IndexOutOfBoundsException e) {
    }
    try {
      bitArray.writeBytesTo(dest, 1, 100);
      fail();
    } catch (IndexOutOfBoundsException e) {
    }
    try {
      bitArray.writeBytesTo(dest, 100, 1);
      fail();
    } catch (IndexOutOfBoundsException e) {
    }
    bitArray = bitArray.copy();
    assertEquals(8, bitArray.writeBytesTo(dest, 0, 8));
    assertEquals(0, dest[0]);
    assertEquals(8, bitArray.writeBytesTo(dest, 1, 8));
    assertEquals(0, dest[0]);
    assertEquals(0, dest[1]);
    assertEquals(0, bitArray.writeBytesTo(dest, 0, 9));
    assertEquals(0, dest[0]);
    assertEquals(0, dest[1]);
    assertEquals(9, bitArray.writeBytesTo(dest, 0, 9));
    assertEquals(0, dest[0]);
    assertEquals(0, dest[8]);
    assertEquals(1, dest[9]);
    assertEquals(1, bitArray.writeBytesTo(dest, 0, 10));
   
}