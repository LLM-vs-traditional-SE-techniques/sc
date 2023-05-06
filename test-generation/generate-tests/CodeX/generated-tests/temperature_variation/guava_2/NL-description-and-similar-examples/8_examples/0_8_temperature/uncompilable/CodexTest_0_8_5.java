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


public class CodexTest_0_8_5 { 
  @Test
  public void testWriteBytesTo() {
    BitArray ba = new BitArray();
    // 0x0f = 00001111
    for (int i = 0; i < 4; i++) {
      ba.appendBit(i % 2 == 0);
    }
    byte[] b = new byte[3];
    assertEquals(4, ba.writeBytesTo(b, 1, 3));
    assertEquals(0, b[0]);
    assertEquals(0xf, b[1]);
    assertEquals(0x0, b[2]);
  }
}