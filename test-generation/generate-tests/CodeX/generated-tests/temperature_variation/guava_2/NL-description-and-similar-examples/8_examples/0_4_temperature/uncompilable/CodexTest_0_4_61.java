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


public class CodexTest_0_4_61 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[5];
    byte[] expected = {1, 2, 3, 4, 5};
    assertEquals(5, bitArray.writeBytesTo(dest, 0, 5));
    assertEquals(expected, dest);
    dest = new byte[5];
    assertEquals(4, bitArray.writeBytesTo(dest, 0, 4));
    assertEquals(expected, dest);
    dest = new byte[4];
    assertEquals(4, bitArray.writeBytesTo(dest, 0, 5));
    assertEquals(expected, dest);
    dest = new byte[5];
    assertEquals(3, bitArray.writeBytesTo(dest, 1, 3));
    assertEquals(new byte[] {0, 1, 2, 3, 0}, dest);
  }
}