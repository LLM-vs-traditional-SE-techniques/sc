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


public class CodexTest_0_3_2 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[2];
    assertEquals(2, hashCode.writeBytesTo(dest, 0, 2));
    assertEquals(0, dest[0]);
    assertEquals(0, dest[1]);
    dest = new byte[4];
    assertEquals(4, hashCode.writeBytesTo(dest, 0, 4));
    assertEquals(0, dest[0]);
    assertEquals(0, dest[1]);
    assertEquals(0, dest[2]);
    assertEquals(0, dest[3]);
    dest = new byte[4];
    assertEquals(4, hashCode.writeBytesTo(dest, 1, 4));
    assertEquals(0, dest[0]);
    assertEquals(0, dest[1]);
    assertEquals(0, dest[2]);
    assertEquals(0, dest[3]);
    dest = new byte[4];
    assertEquals(3, hashCode.writeBytesTo(dest, 1, 3));
    assertEquals(0, dest[0]);
    assertEquals(0, dest[1]);
    assertEquals(0, dest[2]);
    assertEquals(0, dest[3]);
    dest = new byte[4];
    assertEquals(2, hashCode.writeBytesTo(dest, 2, 2));
    assertEquals(0, dest[0]);
    assertEquals(0, dest[1]);
    assertEquals(0, dest[2]);
    assertEquals(0, dest[3]);
    dest = new byte[4];
    assertEquals(1, hashCode.writeBytesTo(dest, 3, 1));
    assertEquals(0, dest[0]);
    assertEquals(0, dest[1]);
    assertEquals(0, dest[2]);
    assertEquals(0, dest[3]);
    dest = new byte[4];
    assertEquals(0, hashCode.writeBytesTo(dest, 4, 0));
    assertEquals(0, dest[0]);
    assert
}