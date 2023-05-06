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


public class CodexTest_0_9_6 { 
  @Test
  public void testSha224() {
    Hash Codes sha224HashCodes = HashCodes.sha224();
    assertHashCode(sha224HashCodes.getExpectedRandomHash(), sha224HashCodes.getRandom());
    assertHashCode(sha224HashCodes.getExpectedShortTextHash(), sha224HashCodes.getShortText());
    assertHashCode(sha224HashCodes.getExpectedMediumTextHash(), sha224HashCodes.getMediumText());
    assertHashCode(sha224HashCodes.getExpectedLongTextHash(), sha224HashCodes.getLongText());
    assertHashCode(sha224HashCodes.getExpectedShortBinaryHash(), sha224HashCodes.getShortBinary());
    assertHashCode(sha224HashCodes.getExpectedMediumBinaryHash(), sha224HashCodes.getMediumBinary());
    assertHashCode(sha224HashCodes.getExpectedLongBinaryHash(), sha224HashCodes.getLongBinary());
  }
 */
package edu.columbia.cs.ref.model.re.impl.tests;
}