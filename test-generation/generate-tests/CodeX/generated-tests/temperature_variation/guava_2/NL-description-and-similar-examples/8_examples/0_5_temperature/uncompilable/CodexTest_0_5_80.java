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


public class CodexTest_0_5_80 { 
  @Test
  public void testWriteBytesTo_maxLengthTooSmall() {
    byte[] dest = new byte[5];
    int maxLength = 3;
    int offset = 1;
    BitArray bitArray = BitArray.fromBytes(new byte[] {(byte) 0xFF, (byte) 0xFF});
    int written = bitArray.writeBytesTo(dest, offset, maxLength);
    byte[] expected = new byte[] {0, (byte) 0xFF, (byte) 0xFF, 0, 0};
    assertThat(written).isEqualTo(maxLength);
    assertThat(dest).isEqualTo(expected);
  }
}