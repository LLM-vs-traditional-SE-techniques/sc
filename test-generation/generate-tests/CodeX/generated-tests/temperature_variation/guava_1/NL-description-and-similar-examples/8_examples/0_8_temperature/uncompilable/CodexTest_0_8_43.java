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


public class CodexTest_0_8_43 { 
  @Test
    public void testHashFunction() {
		// use static factory
		HashFunction md5 = Hashing.md5(); // produce MD5
		HashCode hash = md5.newHasher()
			.putString("testString", Charset.defaultCharset())
			.hash();
		assertEquals("C47FCD29F1AFD941F4E4CDE4B4F72C43", hash.toString());
		assertEquals(32, hash.asBytes().length);
		assertEquals(2, hash.bits());
}