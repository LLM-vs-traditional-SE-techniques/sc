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


public class CodexTest_0_4_6 { 
  @Test
  public void testWriteBytesTo() {
    BitArray array = new BitArray(new boolean[] {true, false, true, false, true, false});
    byte[] expected = new byte[] {(byte) 0b101010, (byte) 0b000000};
    byte[] dest = new byte[2];
    assertThat(array.writeBytesTo(dest, 0, 2)).isEqualTo(2);
    assertThat(dest).isEqualTo(expected);
  }
}