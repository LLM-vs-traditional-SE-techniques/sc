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


public class CodexTest_0_7_4 { 
  @Test
  public void testWriteBytesTo() {
    byte[] output = new byte[8];
    int writtenBytes = BitArray.fromBytes(new byte[] {
        (byte) 0xAB, (byte) 0xCD, (byte) 0xEF, (byte) 0x01
    }).writeBytesTo(output, 1, 4);
    assertEquals(4, writtenBytes);
    assertEquals(new byte[] { 0, (byte) 0xAB, (byte) 0xCD, (byte) 0xEF,
        (byte) 0x01, 0, 0, 0 }, output);
  }
}