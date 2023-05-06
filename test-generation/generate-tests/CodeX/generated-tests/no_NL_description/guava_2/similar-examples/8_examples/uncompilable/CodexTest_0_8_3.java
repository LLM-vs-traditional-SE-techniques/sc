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


public class CodexTest_0_8_3 { 
  @Test
  /**
   * Attempts to write the given long value to the given
   * <code>byte[]</code> value starting from the given index (inclusive).
   *
   * @param dest the destination <code>byte[]</code>
   * @param offset the first index to write to
   * @param value the long value to write to the <code>byte[]</code>
   * @throws IndexOutOfBoundsException if
   *         {@code offset < 0 || (offset + 8) > dest.length}
   * @since 19.0
   */
  public static void writeLongLittleEndian(byte[] dest, int offset, long value) {
    checkPositionIndexes(offset, offset + 8, dest.length);
    writeLong(dest, offset, value);
  }
}