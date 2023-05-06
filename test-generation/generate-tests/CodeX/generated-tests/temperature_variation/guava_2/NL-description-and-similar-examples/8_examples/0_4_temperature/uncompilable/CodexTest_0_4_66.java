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


public class CodexTest_0_4_66 { 
  @Test
  public void testWriteBytesTo() {
    byte[] buf = new byte[10];
    BitArray ba = new BitArray(new byte[] { (byte) 0xFF, (byte) 0xFF }, 16);
    int n = ba.writeBytesTo(buf, 0, 10);
    assertEquals(2, n);
    assertEquals((byte) 0xFF, buf[0]);
    assertEquals((byte) 0xFF, buf[1]);
  }
}