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


public class CodexTest_0_3_3 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    assertEquals(1, Ints.fromByteArray(new byte[] {(byte) 0x80}).writeBytesTo(dest, 0, 1));
    assertEquals(1, Ints.fromByteArray(new byte[] {(byte) 0x80}).writeBytesTo(dest, 1, 1));
    assertEquals(1, Ints.fromByteArray(new byte[] {(byte) 0x80}).writeBytesTo(dest, 2, 1));
    assertEquals(1, Ints.fromByteArray(new byte[] {(byte) 0x80}).writeBytesTo(dest, 3, 1));
    assertEquals(1, Ints.fromByteArray(new byte[] {(byte) 0x80}).writeBytesTo(dest, 4, 1));
    assertEquals(1, Ints.fromByteArray(new byte[] {(byte) 0x80}).writeBytesTo(dest, 5, 1));
    assertEquals(1, Ints.fromByteArray(new byte[] {(byte) 0x80}).writeBytesTo(dest, 6, 1));
    assertEquals(1, Ints.fromByteArray(new byte[] {(byte) 0x80}).writeBytesTo(dest, 7, 1));
    assertEquals(1, Ints.fromByteArray(new byte[] {(byte) 0x80}).writeBytesTo(dest, 8, 1));
    assertEquals(1, Ints.fromByteArray(new byte[] {(byte) 0x80}).writeBytesTo(dest, 9, 1));
    assertEquals(0x80, dest[0]);
    assertEquals(0x80, dest[1]);
    assertEquals(0x80, dest[2]);
    assertEquals(0x80, dest[3]);
    assertEquals(0x80, dest[4]);
    assertEquals(0x80, dest[5]);
    assertEquals(0x80, dest[6]);
    assertEquals(0x80, dest[
}