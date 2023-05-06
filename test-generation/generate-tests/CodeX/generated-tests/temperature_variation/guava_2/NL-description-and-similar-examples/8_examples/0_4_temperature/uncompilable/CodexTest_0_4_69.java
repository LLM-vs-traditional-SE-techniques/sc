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


public class CodexTest_0_4_69 { 
  @Test
  public void testWriteBytesTo() {
    assertEquals(0, HashCode.fromInt(0).writeBytesTo(new byte[0], 0, 0));
    assertEquals(0, HashCode.fromInt(0).writeBytesTo(new byte[0], 0, 1));
    assertEquals(0, HashCode.fromInt(0).writeBytesTo(new byte[1], 0, 0));
    assertEquals(1, HashCode.fromInt(0).writeBytesTo(new byte[1], 0, 1));
    assertEquals(0, HashCode.fromInt(0).writeBytesTo(new byte[1], 1, 0));
    assertEquals(0, HashCode.fromInt(0).writeBytesTo(new byte[1], 1, 1));
    assertEquals(0, HashCode.fromInt(0).writeBytesTo(new byte[2], 1, 1));
    assertEquals(1, HashCode.fromInt(0).writeBytesTo(new byte[2], 1, 2));
    assertEquals(0, HashCode.fromInt(0).writeBytesTo(new byte[3], 1, 2));
    assertEquals(1, HashCode.fromInt(0).writeBytesTo(new byte[3], 1, 3));
    assertEquals(0, HashCode.fromInt(0).writeBytesTo(new byte[3], 2, 2));
    assertEquals(1, HashCode.fromInt(0).writeBytesTo(new byte[3], 2, 3));
    assertEquals(2, HashCode.fromInt(0x01234567).writeBytesTo(new byte[4], 1, 3));
    assertEquals(4, HashCode.fromInt(0x01234567).writeBytesTo(new byte[4], 0, 4));
    assertEquals(4, HashCode.fromInt(0x01234567).writeBytesTo(new byte[5], 0, 5));
    assertEquals(4, HashCode.fromInt(0x01234567).writeBytesTo(new byte[5], 1, 5));
    assertEquals(4
}