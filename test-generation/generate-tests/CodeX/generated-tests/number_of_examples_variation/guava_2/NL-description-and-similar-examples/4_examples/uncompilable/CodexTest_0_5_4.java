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


public class CodexTest_0_5_4 { 
  @Test
  public void testWriteBytesTo() {
    byte[] bytes = new byte[3];
    int numBytesWritten = bits().writeBytesTo(bytes, 0, bytes.length);
    assertEquals(3, numBytesWritten);
    assertEquals(0, bytes[0]);
    assertEquals(0, bytes[1]);
    assertEquals(0, bytes[2]);
    assertEquals(0, bits().writeBytesTo(bytes, 0, 0));
    assertEquals(0, bits().writeBytesTo(bytes, 0, -1));
    assertEquals(0, bits().writeBytesTo(bytes, 1, bytes.length));
    try {
      // offset out of bounds
      bits().writeBytesTo(bytes, -1, bytes.length);
      fail();
    } catch (IndexOutOfBoundsException expected) {}
    try {
      // offset out of bounds
      bits().writeBytesTo(bytes, 4, bytes.length);
      fail();
    } catch (IndexOutOfBoundsException expected) {}
    try {
      // maxLength out of bounds
      bits().writeBytesTo(bytes, 0, 4);
      fail();
    } catch (IndexOutOfBoundsException expected) {}
    try {
      // maxLength out of bounds
      bits().writeBytesTo(bytes, 2, 2);
      fail();
    } catch (IndexOutOfBoundsException expected) {}
    try {
      // maxLength out of bounds
      bits().writeBytesTo(bytes, 1, 3);
      fail();
    } catch (IndexOutOfBoundsException expected) {}
  }
}