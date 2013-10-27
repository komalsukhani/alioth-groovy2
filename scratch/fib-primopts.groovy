

  public fib(I)I
   L0
    INVOKESTATIC script1339060140068.$getCallSiteArray ()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
    ASTORE 2
    INVOKESTATIC org/codehaus/groovy/runtime/BytecodeInterface8.isOrigInt ()Z
    IFEQ L1
    INVOKESTATIC org/codehaus/groovy/runtime/BytecodeInterface8.isOrigZ ()Z
    IFEQ L1
    GETSTATIC script1339060140068.__$stMC : Z
    IFNE L1
    INVOKESTATIC org/codehaus/groovy/runtime/BytecodeInterface8.disabledStandardMetaClass ()Z
    IFNE L1
    GOTO L2
   L1
    ILOAD 1
    ICONST_2
    IF_ICMPGE L3
    ICONST_1
    GOTO L4
   L3
    ICONST_0
   L4
    IFEQ L5
    ILOAD 1
    GOTO L6
   L5
    ALOAD 2
    LDC 1
    AALOAD
    ALOAD 2
    LDC 2
    AALOAD
    ALOAD 0
    ALOAD 2
    LDC 3
    AALOAD
    ILOAD 1
    INVOKESTATIC java/lang/Integer.valueOf (I)Ljava/lang/Integer;
    ICONST_1
    INVOKESTATIC java/lang/Integer.valueOf (I)Ljava/lang/Integer;
    INVOKEINTERFACE org/codehaus/groovy/runtime/callsite/CallSite.call (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    INVOKEINTERFACE org/codehaus/groovy/runtime/callsite/CallSite.callCurrent (Lgroovy/lang/GroovyObject;Ljava/lang/Object;)Ljava/lang/Object;
    ALOAD 2
    LDC 4
    AALOAD
    ALOAD 0
    ALOAD 2
    LDC 5
    AALOAD
    ILOAD 1
    INVOKESTATIC java/lang/Integer.valueOf (I)Ljava/lang/Integer;
    ICONST_2
    INVOKESTATIC java/lang/Integer.valueOf (I)Ljava/lang/Integer;
    INVOKEINTERFACE org/codehaus/groovy/runtime/callsite/CallSite.call (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    INVOKEINTERFACE org/codehaus/groovy/runtime/callsite/CallSite.callCurrent (Lgroovy/lang/GroovyObject;Ljava/lang/Object;)Ljava/lang/Object;
    INVOKEINTERFACE org/codehaus/groovy/runtime/callsite/CallSite.call (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    INVOKESTATIC org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.intUnbox (Ljava/lang/Object;)I
   L6
    IRETURN
    GOTO L7
   L2
    ILOAD 1
    ICONST_2
    IF_ICMPGE L8
    ICONST_1
    GOTO L9
   L8
    ICONST_0
   L9
    IFEQ L10
    ILOAD 1
    GOTO L11
   L10
    ALOAD 0
    ILOAD 1
    ICONST_1
    ISUB
    INVOKEVIRTUAL script1339060140068.fib (I)I
    ALOAD 0
    ILOAD 1
    ICONST_2
    ISUB
    INVOKEVIRTUAL script1339060140068.fib (I)I
    IADD
   L11
    IRETURN
