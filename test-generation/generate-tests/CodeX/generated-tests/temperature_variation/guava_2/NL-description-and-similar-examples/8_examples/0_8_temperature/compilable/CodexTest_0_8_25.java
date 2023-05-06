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


public class CodexTest_0_8_25 { 
  @Test
    public void testIntsToByteArray() {
    byte[] array = Ints.toByteArray(0x12131415);
    assertTrue(Arrays.equals(new byte[] {0x12, 0x13, 0x14, 0x15}, array));
    array = Ints.toByteArray(0x1234567);
    assertTrue(Arrays.equals(new byte[] {0x00, 0x12, 0x34, 0x56, 0x07}, array));
  }
}