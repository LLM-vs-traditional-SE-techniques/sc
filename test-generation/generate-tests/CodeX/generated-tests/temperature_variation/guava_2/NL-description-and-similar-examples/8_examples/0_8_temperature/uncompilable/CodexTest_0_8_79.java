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


public class CodexTest_0_8_79 { 
  @Test
  public void testWriteBytesToImpl() {
			byte[] dest = new byte[3];
			HashFunction hf = Hashing.murmur3_32(0);
			HashCode h1 = hf.newHasher().putInt(1).putInt(2).putInt(3).hash();
			h1.writeBytesToImpl(dest, 0, 3);
			assertEquals(hf.newHasher().putInt(1).putInt(2).hash().asBytes()[0], dest[0]);
			assertEquals(hf.newHasher().putInt(1).putInt(2).hash().asBytes()[1], dest[1]);
			assertEquals(hf.newHasher().putInt(1).hash().asBytes()[2], dest[2]);
			Random rnd = new Random();
			rnd.nextBytes(dest);
			h1.writeBytesToImpl(dest, 2, 1);
			assertEquals(hf.newHasher().putInt(1).hash().asBytes()[2], dest[2]);
		}
}