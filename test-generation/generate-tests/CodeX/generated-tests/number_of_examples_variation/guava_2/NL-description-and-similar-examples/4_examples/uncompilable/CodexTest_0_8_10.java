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


public class CodexTest_0_8_10 { 
  @Test
    public void testToByteArray_maxlen_shorter() {
    BitArray ba = BitArrays.from(new byte[]{0b00000010, 0b00000100, 0b00001000});
    assertEquals(ba.toString(), "001010010001000");
    assertEquals(ba.toByteArray(), new byte[]{0b00000010, 0b00000100, 0b00001000});
    assertEquals(Arrays.toString(ba.toByteArray(1)), "[0B00000010]");
    assertEquals(Arrays.toString(ba.toByteArray(2)), "[0B00000010, 0B00000100]");
    assertEquals(Arrays.toString(ba.toByteArray(3)), "[0B00000010, 0B00000100, 0B00001000]");
  }
}