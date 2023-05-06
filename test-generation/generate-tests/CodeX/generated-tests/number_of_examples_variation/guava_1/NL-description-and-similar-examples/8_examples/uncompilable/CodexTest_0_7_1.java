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


public class CodexTest_0_7_1 { 
  @Test
    public void testHashLong() {
      HashCode hc = HashCode.fromLong(0x1234567887654321L);
      assertEquals(0x1234567887654321L, hc.asLong());
      assertEquals(HashingTest.sha256(new byte[] {0x12, 0x34, 0x56, 0x78,
                     (byte) 0x87, 0x65, 0x43, 0x21}),
          Hashing.sha256().hashBytes(hc.asBytes()));
    }
}