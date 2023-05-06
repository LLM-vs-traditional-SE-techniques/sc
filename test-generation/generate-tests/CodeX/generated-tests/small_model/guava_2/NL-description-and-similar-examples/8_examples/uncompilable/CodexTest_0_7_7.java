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


public class CodexTest_0_7_7 { 
  @Test
  public void testWriteBytesTo() {
    byte[] buf = new byte[2];
    int numBytesWritten = m_Elements.writeBytesTo(buf, 0, buf.length);
    assertEquals("Number of bytes written differs", m_Elements.length, numBytesWritten);
    for (int i = 0; i < numBytesWritten; i++) {
      int value = buf[i];
      assertEquals("Value differs at position " + i, (int) (m_Elements[i]), value);
    }
  }
}