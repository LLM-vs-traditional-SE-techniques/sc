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


public class CodexTest_0_8_4 { 
  @Test
  public void testToByteArray() {
    assertTrue(Arrays.equals(
        new byte[] {-1, -1, -1, -1, 15, 0, 0, 0, (byte) 255, (byte) 255, (byte) 255, (byte) 255, 0, 0,
            0, 0},
        new IntHashCode(new int[] {0x0f, 0xf0, 0xf00f, 0x0f0f0f0f, 0}).asBytes()));
  }
}