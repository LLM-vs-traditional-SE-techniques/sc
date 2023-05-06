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


public class CodexTest_0_6_5 { 
  @Test
    public void testWriteBytesTo() {
      byte[] dest = new byte[4];
      BitArray bits = new BitArray(ByteOrder.BIG_ENDIAN, new byte[] {(byte) 0xF0, (byte) 0x0F}, 0, 12);
      bits.writeBytesTo(dest, 0, 4);
      assertEquals(0xF0, dest[0]);
      assertEquals(0x0F, dest[1]);
      assertEquals(0x00, dest[2]);
      assertEquals(0x00, dest[3]);
    }
}