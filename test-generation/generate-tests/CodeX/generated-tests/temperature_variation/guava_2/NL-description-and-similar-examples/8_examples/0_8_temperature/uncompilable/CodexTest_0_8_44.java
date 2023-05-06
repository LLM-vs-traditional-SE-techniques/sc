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


public class CodexTest_0_8_44 { 
  @Test
  public void testReadPrecisely_tooManyBytes() throws Exception {
    byte[] bytes = new byte[] {(byte) 0x1B, (byte) 0xAD, (byte) 0xF0, (byte) 0x0D};
    ByteArrayDataInput in = ByteStreams.newDataInput(bytes);
    byte[] result = new byte[2];
    ByteStreams.readFully(in, result);
    assertEquals(0x1B, result[0]);
    assertEquals((byte) 0xAD, result[1]);
    byte[] remainder = new byte[2];
    ByteStreams.readFully(in, remainder);
    assertEquals((byte) 0xF0, remainder[0]);
    assertEquals((byte) 0x0D, remainder[1]);
  }
}