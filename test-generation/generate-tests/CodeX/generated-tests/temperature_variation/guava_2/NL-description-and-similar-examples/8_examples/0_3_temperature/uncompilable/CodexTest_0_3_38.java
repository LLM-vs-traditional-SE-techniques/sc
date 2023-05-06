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


public class CodexTest_0_3_38 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int numBytes = bits() / 8;
    int written = writeBytesTo(dest, 0, numBytes);
    assertEquals(numBytes, written);
    assertEquals(0, writeBytesTo(dest, 0, 0));
    assertEquals(0, writeBytesTo(dest, 0, -1));
    assertEquals(0, writeBytesTo(dest, -1, numBytes));
    assertEquals(0, writeBytesTo(dest, 10, numBytes));
    assertEquals(0, writeBytesTo(dest, 11, numBytes));
    assertEquals(0, writeBytesTo(dest, 10, 1));
  }
}