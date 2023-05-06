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


public class CodexTest_0_9_10 { 
  @Test
  public void testWritejustRight() throws IOException {
    TestByteStreamDestination destination = new TestByteStreamDestination(
        ByteStreams.nullOutputStream(), 3);
    int written = destination.writeBytesTo(new byte[3], 0, 3);
    assertEquals(3, written);
    byte[] output0 = destination.getOutput().toByteArray();
    assertEquals(-1, output0[0]);
    assertEquals(-1, output0[1]);
    assertEquals(-1, output0[2]);
    assertEquals(3, output0.length);
    assertNull(destination.getOutput());
}