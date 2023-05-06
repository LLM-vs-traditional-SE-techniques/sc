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


public class CodexTest_0_7_2 { 
  @Test
  
Input: public int andNot(LongIterator iterator) {
		int cardinality = 0;
		while ( iterator.hasNext() )
			cardinality += andNot(iterator.next());
		return cardinality;
	}
Output: public void testOperations() {
			int[] ints = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
			IntSet set = new IntOpenHashSet(ints);
			IntSet set2 = new IntOpenHashSet();
			set2.add(2);
			set2.add(4);
			set2.add(6);
			set2.add(8);
			set2.add(10);
			IntSet set3 = new IntOpenHashSet();
			set3.add(1);
			set3.add(3);
			set3.add(5);
			set3.add(7);
			set3.add(9);
}