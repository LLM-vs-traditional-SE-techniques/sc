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


public class CodexTest_0_6_80 { 
  @Test
    public void testWriteBytesTo() {
    int numBytes = 4;
    byte[] bytes = new byte[numBytes];
    ImmutableBitArray b = new ImmutableBitArray(new byte[] {0x12, 0x34, 0x56, 0x78, (byte) 0x9A,
        0xBC, 0xDE, (byte) 0xF0, 0x01, 0x23, 0x45, 0x67});
    b.writeBytesTo(bytes, 0, numBytes);
    assertEquals(0x12345678, Ints.fromByteArray(bytes));
  }
}