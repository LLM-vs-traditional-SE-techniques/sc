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


public class CodexTest_0_9_44 { 
  @Test
  public void testWriteBytesToTruncatesToLengthInsteadOfIdealLength() {
    byte[] dest = new byte[6];
    LongHashCode hashCode = LongHashCode.fromLong(0xcafebabecafebabeL);
    int writtenBytes = hashCode.writeBytesTo(dest, 0, 6);
    assertEquals(5, writtenBytes);
    assertEquals("Expected successful truncation",
        new byte[] {(byte) 0xbe, (byte) 0xba, (byte) 0xfe, (byte) 0xba, (byte) 0xbe},
        Arrays.copyOf(dest, writtenBytes));
  }
}