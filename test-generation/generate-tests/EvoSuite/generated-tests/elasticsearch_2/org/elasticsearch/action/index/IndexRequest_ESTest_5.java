/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 11 13:41:45 GMT 2022
 */

package org.elasticsearch.action.index;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.Requests;
import org.elasticsearch.common.xcontent.XContentType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class IndexRequest_ESTest_5 extends IndexRequest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HashMap<XContentType, XContentType> hashMap0 = new HashMap<XContentType, XContentType>();
      IndexRequest indexRequest0 = new IndexRequest("+5%'MEu!rx");
      // Undeclared exception!
      try { 
        indexRequest0.source((Map) hashMap0, (XContentType) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No matching content type for null
         //
         verifyException("org.elasticsearch.common.xcontent.XContentFactory", e);
      }
  }
}
