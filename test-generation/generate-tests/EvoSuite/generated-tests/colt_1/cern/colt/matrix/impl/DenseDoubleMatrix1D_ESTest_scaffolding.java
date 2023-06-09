/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 06 13:03:13 GMT 2023
 */

package cern.colt.matrix.impl;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DenseDoubleMatrix1D_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "cern.colt.matrix.impl.DenseDoubleMatrix1D"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/home/beatriz/paper-codex-study/test-generation/generate-tests/EvoSuite"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DenseDoubleMatrix1D_ESTest_scaffolding.class.getClassLoader() ,
      "cern.colt.matrix.impl.WrapperDoubleMatrix1D$3",
      "cern.colt.function.IntProcedure",
      "cern.colt.matrix.impl.SelectedSparseDoubleMatrix1D",
      "cern.colt.matrix.impl.WrapperDoubleMatrix1D$4",
      "cern.colt.matrix.DoubleMatrix1D",
      "cern.colt.matrix.impl.AbstractMatrix2D",
      "cern.colt.list.AbstractList",
      "cern.colt.matrix.impl.WrapperDoubleMatrix1D$1",
      "cern.colt.matrix.impl.WrapperDoubleMatrix1D$2",
      "cern.colt.matrix.impl.FormerFactory",
      "cern.colt.list.DoubleArrayList",
      "cern.colt.matrix.impl.SparseDoubleMatrix1D",
      "cern.colt.matrix.DoubleMatrix3D",
      "cern.colt.buffer.DoubleBufferConsumer",
      "cern.colt.function.DoubleFunction",
      "cern.colt.map.AbstractIntDoubleMap",
      "cern.colt.matrix.linalg.Property",
      "cern.colt.PersistentObject",
      "cern.colt.matrix.impl.DenseDoubleMatrix1D",
      "cern.colt.map.OpenIntDoubleHashMap",
      "cern.colt.list.IntArrayList",
      "cern.colt.matrix.impl.AbstractFormatter",
      "cern.colt.matrix.impl.SelectedDenseDoubleMatrix2D",
      "cern.colt.list.AbstractCollection",
      "cern.colt.map.AbstractMap",
      "cern.colt.matrix.impl.AbstractMatrix3D",
      "cern.colt.matrix.impl.Former",
      "corejava.Format",
      "cern.colt.list.AbstractIntList",
      "cern.colt.matrix.impl.AbstractMatrix1D",
      "cern.colt.matrix.doublealgo.Formatter",
      "cern.colt.matrix.impl.AbstractMatrix",
      "cern.colt.matrix.impl.WrapperDoubleMatrix1D",
      "cern.colt.matrix.impl.FormerFactory$1",
      "cern.colt.matrix.DoubleMatrix2D",
      "cern.colt.function.DoubleProcedure",
      "cern.colt.map.PrimeFinder",
      "cern.colt.matrix.impl.SparseDoubleMatrix2D",
      "cern.colt.buffer.IntBufferConsumer",
      "cern.colt.function.IntComparator",
      "cern.colt.matrix.impl.DenseDoubleMatrix2D",
      "cern.colt.map.HashFunctions",
      "cern.colt.function.IntDoubleProcedure",
      "cern.colt.function.DoubleDoubleFunction",
      "cern.colt.matrix.impl.SelectedDenseDoubleMatrix1D",
      "cern.colt.list.AbstractDoubleList",
      "cern.colt.Swapper"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DenseDoubleMatrix1D_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "cern.colt.PersistentObject",
      "cern.colt.matrix.impl.AbstractMatrix",
      "cern.colt.matrix.impl.AbstractMatrix1D",
      "cern.colt.matrix.DoubleMatrix1D",
      "cern.colt.matrix.impl.DenseDoubleMatrix1D",
      "cern.jet.math.Functions$8",
      "cern.jet.math.Functions$10",
      "cern.jet.math.Functions$11",
      "cern.jet.math.Functions$12",
      "cern.jet.math.Functions$13",
      "cern.jet.math.Functions$14",
      "cern.jet.math.Functions$15",
      "cern.jet.math.Functions$16",
      "cern.jet.math.Functions$5",
      "cern.jet.math.Functions$17",
      "cern.jet.math.Functions$3",
      "cern.jet.math.Functions$18",
      "cern.jet.math.Functions$6",
      "cern.jet.math.Functions$19",
      "cern.jet.math.Functions$20",
      "cern.jet.math.Functions$1",
      "cern.jet.math.Functions$21",
      "cern.jet.math.Functions$7",
      "cern.jet.math.Functions$22",
      "cern.jet.math.Functions$23",
      "cern.jet.math.Functions$24",
      "cern.jet.math.Functions$25",
      "cern.jet.math.Functions$26",
      "cern.jet.math.Functions$27",
      "cern.jet.math.Functions$28",
      "cern.jet.math.Functions$29",
      "cern.jet.math.Functions$30",
      "cern.jet.math.Functions$31",
      "cern.jet.math.Functions$32",
      "cern.jet.math.Functions$33",
      "cern.jet.math.Functions$9",
      "cern.jet.math.Functions$34",
      "cern.jet.math.PlusMult",
      "cern.jet.math.Functions$35",
      "cern.jet.math.Functions$4",
      "cern.jet.math.Functions$36",
      "cern.jet.math.Functions$2",
      "cern.jet.math.Functions",
      "cern.colt.matrix.impl.SparseDoubleMatrix1D",
      "cern.colt.map.AbstractMap",
      "cern.colt.map.AbstractIntDoubleMap",
      "cern.colt.map.OpenIntDoubleHashMap",
      "cern.colt.matrix.impl.FormerFactory",
      "cern.colt.matrix.impl.AbstractFormatter",
      "cern.colt.matrix.doublealgo.Formatter",
      "cern.colt.matrix.impl.AbstractMatrix2D",
      "cern.colt.matrix.DoubleMatrix2D",
      "cern.colt.matrix.impl.DenseDoubleMatrix2D",
      "cern.colt.matrix.impl.FormerFactory$1",
      "corejava.Format",
      "cern.colt.map.PrimeFinder",
      "cern.colt.map.HashFunctions",
      "cern.colt.matrix.impl.SelectedDenseDoubleMatrix1D",
      "cern.colt.matrix.impl.SelectedDenseDoubleMatrix2D",
      "cern.colt.matrix.impl.WrapperDoubleMatrix1D",
      "cern.colt.matrix.impl.DelegateDoubleMatrix1D",
      "cern.colt.matrix.impl.SelectedSparseDoubleMatrix1D",
      "cern.colt.matrix.impl.WrapperDoubleMatrix2D",
      "cern.colt.matrix.impl.TridiagonalDoubleMatrix2D",
      "cern.colt.matrix.impl.RCDoubleMatrix2D",
      "cern.colt.list.AbstractCollection",
      "cern.colt.list.AbstractList",
      "cern.colt.list.AbstractIntList",
      "cern.colt.list.IntArrayList",
      "cern.colt.list.AbstractDoubleList",
      "cern.colt.list.DoubleArrayList",
      "cern.colt.matrix.impl.SparseDoubleMatrix2D",
      "cern.colt.matrix.impl.SelectedSparseDoubleMatrix2D",
      "cern.colt.matrix.impl.RCMDoubleMatrix2D",
      "cern.colt.matrix.linalg.Property"
    );
  }
}
