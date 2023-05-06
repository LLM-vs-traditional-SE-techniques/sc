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
  public void testWriteBytesToFiveBytes() {
    byte[] actual = new byte[7];
    HashCode hash = Hashing.sha1().hashInt(12);
    int written = hash.writeBytesTo(actual, 2, 5);
    assertEquals(5, written);
    byte[] expected = {0, 0, (byte) 0x6d, (byte) 0x6c, (byte) 0xe6, 
        (byte) 0x1c, (byte) 0xba};
    assertThat(actual).isEqualTo(expected);
  }
}