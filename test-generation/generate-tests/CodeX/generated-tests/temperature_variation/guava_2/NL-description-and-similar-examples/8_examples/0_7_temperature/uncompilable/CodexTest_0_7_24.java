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


public class CodexTest_0_7_24 { 
  @Test
  public void testToByteArray() {
    byte[] array = new byte[2];
    HashCode hashCode = new TestHashCode(new byte[] { (byte) 0xab, (byte) 0xcd, (byte) 0xef, (byte) 0x01 });
    assertThat(hashCode.writeBytesTo(array, 0, 2)).isEqualTo(2);
    assertThat(array).isEqualTo(new byte[] { (byte) 0xab, (byte) 0xcd });
  }
}