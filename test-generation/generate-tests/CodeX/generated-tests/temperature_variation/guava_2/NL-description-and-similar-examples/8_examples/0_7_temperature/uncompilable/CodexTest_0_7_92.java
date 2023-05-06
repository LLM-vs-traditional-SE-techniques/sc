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


public class CodexTest_0_7_92 { 
  @Test
    public void testWriteBytesTo() {
    byte[] dest = new byte[3];
    int actual = hashCode.writeBytesTo(dest, 0, 3);
    assertEquals("Expected 3 bytes written", 3, actual);
    assertEquals("0th byte written", dest[0], hashCode.asBytes()[0]);
    assertEquals("1st byte written", dest[1], hashCode.asBytes()[1]);
    assertEquals("2nd byte written", dest[2], hashCode.asBytes()[2]);
  }
}