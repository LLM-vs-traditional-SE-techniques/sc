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
    byte[] dest = new byte[10];
    assertEquals(0, bitArray.writeBytesTo(dest, 0, 0));
    assertEquals(0, bitArray.writeBytesTo(dest, 0, 10));
    assertEquals(0, bitArray.writeBytesTo(dest, 5, 0));
    assertEquals(0, bitArray.writeBytesTo(dest, 5, 5));
    assertEquals(0, bitArray.writeBytesTo(dest, 10, 0));
    assertEquals(0, bitArray.writeBytesTo(dest, 10, 10));
    assertEquals(0, bitArray.writeBytesTo(dest, 11, 0));
    assertEquals(0, bitArray.writeBytesTo(dest, 11, 1));
    assertEquals(0, bitArray.writeBytesTo(dest, 12, 0));
    try {
      bitArray.writeBytesTo(dest, 0, -1);
      fail();
    } catch (IndexOutOfBoundsException expected) {
    }
    try {
      bitArray.writeBytesTo(dest, -1, 0);
      fail();
    } catch (IndexOutOfBoundsException expected) {
    }
    try {
      bitArray.writeBytesTo(dest, -1, -1);
      fail();
    } catch (IndexOutOfBoundsException expected) {
    }
    try {
      bitArray.writeBytesTo(dest, 0, 11);
      fail();
    } catch (IndexOutOfBoundsException expected) {
    }
    try {
      bitArray.writeBytesTo(dest, 5, 6);
      fail();
    } catch (IndexOutOfBoundsException expected) {
    }
    try {
      bitArray.writeBytesTo(dest, 11, 1);
      fail();
    } catch (IndexOutOfBoundsException expected) {
    }
    try {
      bitArray.writeBytesTo(dest, 12, 0);
      fail();
    } catch (IndexOutOfBoundsException expected) {
    }
  }
}