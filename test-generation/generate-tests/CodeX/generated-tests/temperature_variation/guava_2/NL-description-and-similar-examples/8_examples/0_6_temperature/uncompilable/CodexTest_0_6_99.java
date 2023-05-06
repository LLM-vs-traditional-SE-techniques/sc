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


public class CodexTest_0_6_99 { 
  @Test
        public void testWriteBytes() {
    byte[] dest = new byte[2];
    dest[0] = 0x01;
    dest[1] = 0x02;
    BitArray ba = new BitArray(1, new byte[] {0x1});
    ba.writeBytesTo(dest, 0, 2);
    assertEquals(0x03, dest[0]);
    assertEquals(0x02, dest[1]);
  }
}