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


public class CodexTest_0_5_46 { 
  @Test
  public void testWriteBytesToImpl() {
    byte[] dest = new byte[8];
    byte[] bytes = new byte[] {(byte) 0xab, (byte) 0xcd, (byte) 0xef, (byte) 0x01, (byte) 0x23, (byte) 0x45, (byte) 0x67, (byte) 0x89};
    LongHashCode hashCode = LongHashCode.fromBytesNoCopy(bytes);
    int maxLength = 4;
    hashCode.writeBytesToImpl(dest, 0, maxLength);
    assertEquals(0x01, dest[0]);
    assertEquals(0x23, dest[1]);
    assertEquals(0x45, dest[2]);
    assertEquals(0x67, dest[3]);
  }
}