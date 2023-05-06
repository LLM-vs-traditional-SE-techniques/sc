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


public class CodexTest_0_6_4 { 
  @Test
  public void testWriteBytesTo_minLength() {
    byte[] dest = new byte[20];
    int maxLength = 10;
    int written = bitArray.writeBytesTo(dest, 2, maxLength);
    byte[] expected = new byte[20];
    expected[2] = (byte) 0xFF;
    expected[3] = (byte) 0xFF;
    expected[4] = (byte) 0xFF;
    expected[5] = (byte) 0xFF;
    expected[6] = (byte) 0xFF;
    expected[7] = (byte) 0xFF;
    expected[8] = (byte) 0xFF;
    expected[9] = (byte) 0xFF;
    assertThat(written).isEqualTo(maxLength);
    assertThat(dest).isEqualTo(expected);
  }
}