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


public class CodexTest_0_1_24 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int numBytes = bits() / 8;
    assertEquals(numBytes, writeBytesTo(dest, 0, dest.length));
    assertEquals(numBytes, writeBytesTo(dest, 0, numBytes));
    assertEquals(numBytes, writeBytesTo(dest, 0, numBytes + 1));
    assertEquals(numBytes, writeBytesTo(dest, 1, numBytes));
    assertEquals(numBytes, writeBytesTo(dest, 1, numBytes + 1));
    assertEquals(numBytes, writeBytesTo(dest, 2, numBytes));
    assertEquals(numBytes, writeBytesTo(dest, 2, numBytes + 1));
    assertEquals(numBytes, writeBytesTo(dest, 3, numBytes));
    assertEquals(numBytes, writeBytesTo(dest, 3, numBytes + 1));
    assertEquals(numBytes, writeBytesTo(dest, 4, numBytes));
    assertEquals(numBytes, writeBytesTo(dest, 4, numBytes + 1));
    assertEquals(numBytes, writeBytesTo(dest, 5, numBytes));
    assertEquals(numBytes, writeBytesTo(dest, 5, numBytes + 1));
    assertEquals(numBytes, writeBytesTo(dest, 6, numBytes));
    assertEquals(numBytes, writeBytesTo(dest, 6, numBytes + 1));
    assertEquals(numBytes, writeBytesTo(dest, 7, numBytes));
    assertEquals(numBytes, writeBytesTo(dest, 7, numBytes + 1));
    assertEquals(numBytes, writeBytesTo(dest, 8, numBytes));
    assertEquals(numBytes, writeBytesTo(dest, 8, numBytes + 1));
    assertEquals(numBytes, writeBytesTo(dest, 9, numBytes));
    assertEquals(numBytes, writeBytesTo(dest, 9, numBytes + 1));
  }
}