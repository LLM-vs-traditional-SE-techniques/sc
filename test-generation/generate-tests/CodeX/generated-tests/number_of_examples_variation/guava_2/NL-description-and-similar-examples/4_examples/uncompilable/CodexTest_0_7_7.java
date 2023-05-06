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


public class CodexTest_0_7_7 { 
  @Test
  public void testWriteBytesToSink() throws IOException {
    byte[] testArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
    ByteArrayDataOutput output = ByteStreams.newDataOutput();
    HashCode hash = HashCode.fromInt(42);
    hash.writeBytesTo(output);
    assertEquals(hash.bits(), output.toByteArray().length * 8);
    assertEquals(hash, HashCode.fromBytes(output.toByteArray()));
  }
  
  public void testWriteBytesToSinkShortLength() throws IOException {
    byte[] testArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
    ByteArrayDataOutput output = ByteStreams.newDataOutput();
    HashCode hash = HashCode.fromInt(42);
    hash.writeBytesTo(output, 7);
    assertEquals(ByteStreams.newDataInput(output.toByteArray()).readLong(), 42);
  }
}