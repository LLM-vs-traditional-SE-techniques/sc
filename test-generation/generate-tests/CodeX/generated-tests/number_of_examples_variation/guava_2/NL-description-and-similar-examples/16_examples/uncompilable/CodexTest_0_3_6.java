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
    byte[] dest = new byte[10];
    assertEquals(0, BitArray.fromBytes(new byte[0]).writeBytesTo(dest, 0, 0));
    assertEquals(0, BitArray.fromBytes(new byte[0]).writeBytesTo(dest, 0, 1));
    assertEquals(0, BitArray.fromBytes(new byte[0]).writeBytesTo(dest, 0, 10));
    assertEquals(0, BitArray.fromBytes(new byte[0]).writeBytesTo(dest, 1, 0));
    assertEquals(0, BitArray.fromBytes(new byte[0]).writeBytesTo(dest, 1, 1));
    assertEquals(0, BitArray.fromBytes(new byte[0]).writeBytesTo(dest, 1, 10));
    assertEquals(0, BitArray.fromBytes(new byte[0]).writeBytesTo(dest, 10, 0));
    assertEquals(0, BitArray.fromBytes(new byte[0]).writeBytesTo(dest, 10, 1));
    assertEquals(0, BitArray.fromBytes(new byte[0]).writeBytesTo(dest, 10, 10));
    assertEquals(0, BitArray.fromBytes(new byte[0]).writeBytesTo(dest, 11, 0));
    assertEquals(0, BitArray.fromBytes(new byte[0]).writeBytesTo(dest, 11, 1));
    assertEquals(0, BitArray.fromBytes(new byte[0]).writeBytesTo(dest, 11, 10));
    assertEquals(0, BitArray.fromBytes(new byte[0]).writeBytesTo(dest, 12, 0));
    assertEquals(0, BitArray.fromBytes(new byte[0]).writeBytesTo(dest, 12, 1));
    assertEquals(0, BitArray.fromBytes(new byte[0]).writeBytesTo(dest, 12, 10));
    assertEquals(0, BitArray.fromBytes(new byte[0]).writeBytesTo(dest, 13, 0));
    assertEquals(0, BitArray.fromBytes(new byte
}