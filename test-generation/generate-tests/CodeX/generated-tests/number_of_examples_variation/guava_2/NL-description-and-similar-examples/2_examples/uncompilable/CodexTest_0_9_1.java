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
  public void testReadPastEndOfBitArrayFails() {
    BitArray a = new BitArray(42);
    byte[] data = new byte[6];
    IllegalArgumentException expected =
        assertThrows(IllegalArgumentException.class, () -> a.writeBytesTo(data, 2, 4));
    assertThat(expected)
        .hasMessageThat()
        .isEqualTo(
            String.format(
                "offset (%s) + maxLength (%s) is beyond the array size (%s)", 2, 4, 42));
  }
}