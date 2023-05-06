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


public class CodexTest_0_8_5 { 
  @Test
  public void testReadWriteBytesConvertion() {
			int size = 8;
			boolean[] array = new boolean[size];
			BitArray ba = new BitArray(size);
			
			Random random = new Random();
			for (int i = 0; i < size; i++){
				array[i] = random.nextBoolean();
				ba.set(i, array[i]);
			}
			
			byte[] b = ba.getBytes();
			
			BitArray ba2 = new BitArray(size,b);
			boolean[] array2 = ba2.getBits();
			
			assertArrayEquals(array, array2);
		}
}