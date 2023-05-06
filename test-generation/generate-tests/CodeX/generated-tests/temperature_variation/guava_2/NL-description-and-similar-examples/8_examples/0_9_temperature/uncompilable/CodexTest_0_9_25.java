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


public class CodexTest_0_9_25 { 
  @Test
    public void testWriteBytesToGood() {
    // Write up to six bytes to a destination with 7 bytes free.
    byte[] dest = new byte[7];
    int numBytesWritten = bitArray.writeBytesTo(dest, 1, 6);
    assertThat(numBytesWritten).isEqualTo(6);
    assertThat(dest[0]).isEqualTo((byte) 0);  // untouched
    assertThat(dest[1]).isEqualTo((byte) 0);  // untouched
    assertThat(dest[2]).isEqualTo((byte) 0xA0);
    assertThat(dest[3]).isEqualTo((byte) 0x02);
    assertThat(dest[4]).isEqualTo((byte) 0xE0);
    assertThat(dest[5]).isEqualTo((byte) 0x01);
    assertThat(dest[6]).isEqualTo((byte) 0);  // untouched
  }
}