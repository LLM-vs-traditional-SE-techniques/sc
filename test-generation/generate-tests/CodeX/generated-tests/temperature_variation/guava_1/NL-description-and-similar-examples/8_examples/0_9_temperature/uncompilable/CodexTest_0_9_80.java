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


public class CodexTest_0_9_80 { 
  @Test
   public void testSha1() {
    hashTest("foo", HashCodes.fromString("0beec7b5ea3f0fdbc95d0dd47f3c5bc275da8a33"));
    hashTest("bar", HashCodes.fromString("62cdb7020ff920e5aa642c3d4066950dd1f01f4d"));
    hashTest("baz", HashCodes.fromString("7ddf2a9573c2ab2ee1ba238498a59b55ade809c3"));
    hashTest("bazbarfoo", HashCodes.fromString("8c52d016696ae7876c5cf383408ec5c5edbb2511"));
  }
}