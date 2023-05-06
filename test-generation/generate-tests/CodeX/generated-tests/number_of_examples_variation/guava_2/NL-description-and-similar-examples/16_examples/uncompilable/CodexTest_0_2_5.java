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


public class CodexTest_0_2_5 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    BitArray array = new BitArray(10);
    array.set(0);
    array.set(1);
    array.set(2);
    array.set(3);
    array.set(4);
    array.set(5);
    array.set(6);
    array.set(7);
    array.set(8);
    array.set(9);
    array.writeBytesTo(dest, 0, 10);
    assertEquals(dest[0], (byte) 0xFF);
    assertEquals(dest[1], (byte) 0x03);
  }
}