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


public class CodexTest_0_9_42 { 
  @Test
  
/**
 * A simple test case that shows the usage of {@link ProbablePrimeFinder} to
 * find a probable prime number which is not greater than a given bound.
 */
public void testUsage() {
  final Random random = new Random();
  final int bitLengthBound = 15;
  // find a probable prime number which is no greater than 2^bitLengthBound
  BigInteger probablePrime = ProbablePrimeFinder.find(bitLengthBound, random);
  assertTrue(probablePrime.bitLength() <= bitLengthBound);
  // check if it is a prime number
  assertTrue(probablePrime.isProbablePrime(Integer.MAX_VALUE));
  // ensure that it is great than 1
  assertTrue(probablePrime.signum() > 0);
}
}