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


public class CodexTest_0_6_19 { 
  @Test
  
Input: public static HashCode fromInt(int hash) {
    return new IntHashCode(hash);
  }
Output:
  
Input: public static HashCode fromBytes(byte[] bytes) {
    checkArgument(bytes.length >= 1, "A HashCode must contain at least 1 byte.");
    return fromBytesNoCopy(bytes.clone());
  }
Output:
  
Input: public static HashCode fromBytesNoCopy(byte[] bytes) {
    return new BytesHashCode(bytes);
  }
Output:
  
Input: public static HashCode fromString(CharSequence chars) {
    byte[] bytes = new byte[chars.length()];
    for (int i = 0; i < chars.length(); i++) {
      bytes[i] = (byte) chars.charAt(i);
    }
    return fromBytesNoCopy(bytes);
  }
Output:
  
Input: public static HashCode fromString(CharSequence chars, Charset charset) {
    return fromBytesNoCopy(chars.toString().getBytes(charset));
  }
Output:
  
Input: public HashFunction hmacSha256(Key key) {
    return new MacHashFunction("HmacSHA256", key, hmacToString("hmacSha256"));
  }
Output:
  
Input: public HashFunction hmacSha512(Key key) {
    return new MacHashFunction("HmacSHA512", key, hmacToString("hmacSha512"));
  }
Output:
  
Input: public HashFunction hmacMd5(Key key) {
    return new MacHashFunction("HmacMD5", key, hmacToString("hmacMd5"));
  }
Output:
  
Input: public HashFunction sha1() {
    return new MessageDigestHashFunction("SHA-1", "Hashing.sha1()");
  }
Output:
  
Input: public HashFunction sha256() {
    return new MessageDigestHashFunction("SHA-256", "Hashing.sha256()");
  }
Output:

}