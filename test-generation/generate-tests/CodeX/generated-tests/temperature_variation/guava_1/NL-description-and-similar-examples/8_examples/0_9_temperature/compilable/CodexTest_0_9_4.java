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


public class CodexTest_0_9_4 { 
  @Test
    	public static void testHashCode() {
		    byte[] bytes = new byte[] { 0x16, (byte) 0xe3, 0x14, 0x7b, (byte) 0xd8, (byte) 0x9e, (byte) 0xea, 0x2b };
		    HashCode hashCode = HashCode.fromBytes(bytes);
		    HashCode hashCode1 = HashCode.fromLong(0x167bd89eea2bL);
		    assertEquals(hashCode, hashCode1);
		  }
    
}