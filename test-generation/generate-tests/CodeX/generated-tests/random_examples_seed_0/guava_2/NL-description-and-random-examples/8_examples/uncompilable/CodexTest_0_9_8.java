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


public class CodexTest_0_9_8 { 
  @Test
  public void testWriteBytesToImpl_excess_bits() {
    byte[] expecteds = new byte[] {(byte) 0x80, (byte) 0x84};
    byte[] actuals = new byte[] {(byte) 0x00, (byte) 0x00};
    MutableBitSet bset = new MutableBitSet(17);
    bset.set(1);
    bset.set(15);
    bset.writeBytesTo(actuals, 0, 21);
    assertArrayEquals(expecteds, actuals);
  }
}