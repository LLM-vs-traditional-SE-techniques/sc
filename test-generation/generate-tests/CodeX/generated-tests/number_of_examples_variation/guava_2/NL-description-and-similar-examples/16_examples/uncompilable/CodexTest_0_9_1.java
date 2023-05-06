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


public class CodexTest_0_9_1 { 
  @Test
  public void testWriteBytesTo_Offset() {
    byte[] dest = new byte[bits() / 8];
    int offset = 3;
    Arrays.fill(dest, (byte) 0x00);
    bitArray.writeBytesTo(dest, offset, bits() / 8);
    assertThat(dest[0]).isEqualTo((byte) 0);
    assertThat(dest[1]).isEqualTo((byte) 0);
    assertThat(dest[2]).isEqualTo((byte) 0);
    assertThat(dest[3]).isEqualTo((byte) bits());
    assertThat(
            bitArray.readBytesFrom(dest, offset, bits() / 8))
        .isEqualTo(
            bitArray);
  }
}