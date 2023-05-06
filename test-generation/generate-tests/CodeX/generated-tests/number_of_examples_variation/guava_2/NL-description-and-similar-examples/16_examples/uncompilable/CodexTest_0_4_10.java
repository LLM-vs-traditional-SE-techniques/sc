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


public class CodexTest_0_4_10 { 
  @Test
    public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    BitArray bits = new BitArray(new byte[] {0x12, 0x34, 0x56, 0x78, (byte) 0x9A, (byte) 0xBC, (byte) 0xDE, (byte) 0xF0});
    bits.writeBytesTo(dest, 2, 4);
    assertThat(dest[0], equalTo((byte) 0x00));
    assertThat(dest[1], equalTo((byte) 0x00));
    assertThat(dest[2], equalTo((byte) 0x12));
    assertThat(dest[3], equalTo((byte) 0x34));
    assertThat(dest[4], equalTo((byte) 0x56));
    assertThat(dest[5], equalTo((byte) 0x78));
    assertThat(dest[6], equalTo((byte) 0x00));
    assertThat(dest[7], equalTo((byte) 0x00));
    assertThat(dest[8], equalTo((byte) 0x00));
    assertThat(dest[9], equalTo((byte) 0x00));
  }
}