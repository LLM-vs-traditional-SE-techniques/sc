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


public class CodexTest_0_4_2 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[8];
    BitArray bits = new BitArray(new byte[] {0x12, 0x34, 0x56, 0x78}, 32);
    bits.writeBytesTo(dest, 0, 8);
    assertEquals(new byte[] {0x12, 0x34, 0x56, 0x78, 0, 0, 0, 0}, dest);
  }
}