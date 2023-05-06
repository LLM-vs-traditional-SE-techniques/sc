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


public class CodexTest_0_7_41 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[100];
    assertEquals(100, b.writeBytesTo(dest, 0, 100));
    assertEquals(0, b.writeBytesTo(dest, 0, 0));
    assertEquals(0, b.writeBytesTo(dest, 0, -1));
    assertEquals(0, b.writeBytesTo(dest, 0, Integer.MIN_VALUE));
    assertEquals(0, b.writeBytesTo(dest, 100, 0));
    assertEquals(0, b.writeBytesTo(dest, -1, 0));
    try {
      b.writeBytesTo(dest, -1, 1);
      fail();
    } catch (IndexOutOfBoundsException expected) {
    }
    try {
      b.writeBytesTo(dest, 0, 101);
      fail();
    } catch (IndexOutOfBoundsException expected) {
    }
    try {
      b.writeBytesTo(dest, 101, 1);
      fail();
    } catch (IndexOutOfBoundsException expected) {
    }
  }
}