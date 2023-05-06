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


public class CodexTest_0_6_24 { 
  @Test
  public void testWriteBytesTo_SingleByte() {
    byte[] dest = new byte[1];
    ImmutableBitArray bitArray = ImmutableBitArray.create(new byte[] {(byte) 0x3f}, 8);
    int bytesWritten = bitArray.writeBytesTo(dest, 0, 1);
    assertEquals(1, bytesWritten);
    assertEquals((byte) 0x3f, dest[0]);
  }
}