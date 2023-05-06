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


public class CodexTest_0_9_2 { 
  @Test
  public static void testLongToByteArray() {
    Random r = new Random();
    for (int times = 0; times < 2; times++) {
      assert (times == 0) ^ checkTooBigIsNotSupported;
      try {
        Long num = r.nextLong();
        byte[] arr2 = new byte[8];
        int len = Ints.BYTES_PER_ELEMENT;
        if (times == 1) {
          num = Long.MAX_VALUE;
          len = 8;
        }
        Ints.toByteArray(num, arr2, 0, len);
        // Check that the byte array is in big endian.
        for (int i = 1; i < len; i++) {
          if (arr2[i - 1] != (byte) 0) {
            break;
          }
          assertEquals(0, arr2[i]);
        }
        byte[] arr1 = Long.toString(num, 2).getBytes(Charset.forName("ISO-8859-1"));
        assertEquals(arr2.length, arr1.length);
        for (int i = 0; i < arr1.length; i++) {
          assertEquals(arr1[arr1.length - 1 - i], arr2[i]);
        }
      } catch (UnsupportedOperationException e) {
        assertTrue(checkTooBigIsNotSupported && times == 1);
      }
    }    }
}