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


public class CodexTest_0_9_78 { 
  @Test
  public void testRandomHashCode() {
    HashFunction hf = Hashing.murmur3_128(20);
    for (int i = 0; i < 300; i++) {
      byte[] bytes = new byte[5];
      new Random().nextBytes(bytes);
      HashCode hash1 = hf.hashBytes(bytes);
      HashCode hash2 = HashCode.fromLong(hash1.asLong());
      HashCode hash3 = hf.hashBytes(ByteBuffer.allocate(8).putLong(hash1.asLong()).array());
      assertEquals(hash1, hash2);
      assertEquals(hash2, hash3);
    }
  }
  
Input: public void update(char[] val, int off, int len) {        
			int end = off + len;
			while (off < end) {
				crc = update(crc, val[off++]);
			}
		}
Output:
		public void testUpdateEachByteOneAtATime() {
			Crc32c crc1 = new Crc32c();
			Crc32c crc2 = new Crc32c();
			byte[] bytes = "foobar".getBytes(UTF_8);
			byte[] pieces = new byte[1];
			for (byte b : bytes) {
				pieces[0] = b;
				crc1.update(pieces, 0, 1);
				crc2.update(b);
			}
			assertEquals("Should match", crc1.getValue(), crc2.getValue());
		}

}