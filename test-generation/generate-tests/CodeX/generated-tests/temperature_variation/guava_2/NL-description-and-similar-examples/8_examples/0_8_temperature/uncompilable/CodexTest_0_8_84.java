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


public class CodexTest_0_8_84 { 
  @Test
  public void testReadFromPartialByteArray() {
    byte[] bytes = {(byte) 0xFF, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
    BitArray bits = BitArray.fromByteArray(bytes);
    byte[] data = new byte[4];
    bits.readBytesTo(data, 1, 2);
    assertEquals((byte) 0xFF, data[1]);
    assertEquals((byte) 0x00, data[2]);
    assertEquals((byte) 0x00, data[3]);
  }
}