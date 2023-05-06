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


public class CodexTest_0_9_37 { 
  @Test
   public void testHashBytes() {
    assertEquals(HashCodes.fromLong(0), HashCodes.fromBytes(new byte[0], 0, 0));
    assertEquals(HashCodes.fromLong(0), HashCodes.fromBytes(new byte[1], 0, 1));
    assertEquals(HashCodes.fromLong(0xdeadbeefL), HashCodes.fromBytes(new byte[] { (byte) 0xde, (byte) 0xad, (byte) 0xbe, (byte) 0xef }, 0, 4));
    // Broken code
    assertEquals(HashCodes.fromLong(0xdeadbeefL), HashCodes.fromBytes(new byte[] { (byte) 0xde, (byte) 0xad, (byte) 0xbe }, 0, 3));
  }
}