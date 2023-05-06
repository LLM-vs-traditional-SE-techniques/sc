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


public class CodexTest_0_9_87 { 
  @Test
  public void testSerializeFourBytes() throws IOException {
    byte[] bytes = new byte[]{22, 19, 1, 112};
    LeafBlock leafBlock = LeafBlock.create(bytes, 0, forCrc32());
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    DataOutputStream dos = new DataOutputStream(baos);
    leafBlock.write(dos);
    byte[] result = baos.toByteArray();
    byte[] expected = Arrays.copyOf(bytes, bytes.length + 4);
    Bytes.putLong(expected, bytes.length, leafBlock.crc64());
    assertTrue(Bytes.equals(result, expected));
  }
}