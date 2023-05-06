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


public class CodexTest_0_4_7 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[20];
    assertEquals(20, new BitArray(200).writeBytesTo(dest, 0, 20));
    assertEquals(10, new BitArray(100).writeBytesTo(dest, 0, 20));
    assertEquals(10, new BitArray(100).writeBytesTo(dest, 5, 20));
    assertEquals(5, new BitArray(100).writeBytesTo(dest, 5, 5));
    assertEquals(0, new BitArray(0).writeBytesTo(dest, 0, 20));
    assertEquals(0, new BitArray(0).writeBytesTo(dest, 5, 5));
  }
}