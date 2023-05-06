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


public class CodexTest_0_6_67 { 
  @Test
    public void testWriteBytesToDestOffsetAndMaxLength() {
    byte[] dest = new byte[16];
    HashCode hashCode = Hashing.sha256().hashLong(42);
    int written = hashCode.writeBytesTo(dest, 4, 10);
    assertEquals("Wrong number of bytes written", 32, written);
    assertEquals("Wrong number of bytes written", 32, written);
    assertEquals("Wrong number of bytes written", 32, written);
    assertEquals("Wrong number of bytes written", 32, written);
  }
}