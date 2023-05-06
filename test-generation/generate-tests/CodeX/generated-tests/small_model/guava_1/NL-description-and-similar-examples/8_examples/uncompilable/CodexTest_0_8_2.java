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


public class CodexTest_0_8_2 { 
  @Test
  public static void main(String[] args) {
	  int[] data = {1, 2, 3, 4, 5, 6};
	  DoubleMatrix2D matrix = DoubleFactory2D.dense.make(data, data.length, (data.length / 2));
	  for (int i = 0; i < matrix.rows(); ++i) {
		  for (int j = 0; j < matrix.columns(); ++j) {
			  System.out.print(matrix.getQuick(i, j) + " ");
		  }
		  System.out.println();
	  }
	  data = new int[] {1, 2, 3, 4, 5, 6};
	  DoubleMatrix2D matrix2 = DoubleFactory2D.dense.make(data, data.length, (data.length / 2));
	  for (int i = 0; i < matrix2.rows(); ++i) {
		  for (int j = 0; j < matrix2.columns(); ++j) {
			  System.out.print(matrix2.getQuick(i, j) + " ");
		  }
		  System.out.println();
	  }
}
}