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


public class CodexTest_0_5_2 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int offset = 5;
    int maxLength = 5;
    int bytesWritten = hashCode.writeBytesTo(dest, offset, maxLength);
    assertThat(bytesWritten, equalTo(2));
    assertThat(dest[offset], equalTo((byte) 0xbc));
    assertThat(dest[offset + 1], equalTo((byte) 0x9a));
    assertThat(dest[offset + 2], equalTo((byte) 0));
    assertThat(dest[offset + 3], equalTo((byte) 0));
    assertThat(dest[offset + 4], equalTo((byte) 0));
    assertThat(dest[offset + 5], equalTo((byte) 0));
  }
}