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


public class CodexTest_0_7_64 { 
  @Test
  public void testWriteBytesTo() {
    byte[] buf = new byte[LittleEndianByteArrayOutputStream.MAX_BYTES_PER_LONG];
    int numBytes = new LittleEndianByteArrayOutputStream(buf).writeLong(0x1234);
    assertEquals((byte) 0x12, buf[0]);
    assertEquals((byte) 0x34, buf[1]);
    assertEquals(2, numBytes);
  }
}