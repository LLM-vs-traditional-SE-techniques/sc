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
  private int writeBytesToImpl(byte[] dest, int offset, int maxLength) {
    int nBits = maxLength << 3;
    int numBytesRequired = (nBits + 7) >>> 3;
    if (numBytesRequired > dest.length - offset) {
      throw new IllegalArgumentException(
          String.format(
              "Destination array too small (requested %d bytes, but array has %d bytes "
              + "starting at offset %d)",
              numBytesRequired,
              dest.length - offset,
              offset));
    }
}