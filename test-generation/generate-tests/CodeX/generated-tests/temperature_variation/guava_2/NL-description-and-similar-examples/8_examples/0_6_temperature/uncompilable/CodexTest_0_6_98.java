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


public class CodexTest_0_6_98 { 
  @Test
  public void testWriteBytesTo_allBytes_success() {
    BitArray array = BitArray.fromHexString("abcd1234");
    byte[] dest = new byte[array.length() / 8];
    assertEquals(dest.length, array.writeBytesTo(dest, 0, dest.length));
    assertEquals(
        ByteBuffer.wrap(dest).getInt(),
        ByteBuffer.wrap(new byte[] {(byte) 0xab, (byte) 0xcd, 0x12, 0x34}).getInt());
  }
}