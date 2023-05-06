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


public class CodexTest_0_3_6 { 
  @Test
  public void testWriteBytesTo() {
    byte[] bytes = new byte[20];
    int numBytes = bitArray.writeBytesTo(bytes, 0, bytes.length);
    assertEquals(20, numBytes);
    assertEquals(0xFF, bytes[0]);
    assertEquals(0xFF, bytes[1]);
    assertEquals(0xFF, bytes[2]);
    assertEquals(0xFF, bytes[3]);
    assertEquals(0xFF, bytes[4]);
    assertEquals(0xFF, bytes[5]);
    assertEquals(0xFF, bytes[6]);
    assertEquals(0xFF, bytes[7]);
    assertEquals(0xFF, bytes[8]);
    assertEquals(0xFF, bytes[9]);
    assertEquals(0xFF, bytes[10]);
    assertEquals(0xFF, bytes[11]);
    assertEquals(0xFF, bytes[12]);
    assertEquals(0xFF, bytes[13]);
    assertEquals(0xFF, bytes[14]);
    assertEquals(0xFF, bytes[15]);
    assertEquals(0xFF, bytes[16]);
    assertEquals(0xFF,
}