

      public fib(I)I
       L0
        ILOAD 1
        ICONST_2
        IF_ICMPGE L1
        ICONST_1
        GOTO L2
       L1
        ICONST_0
       L2
        IFEQ L3
        ILOAD 1
        GOTO L4
       L3
        ALOAD 0
        ILOAD 1
        ICONST_1
        ISUB
        INVOKEVIRTUAL script1339060545440.fib (I)I
        ALOAD 0
        ILOAD 1
        ICONST_2
        ISUB
        INVOKEVIRTUAL script1339060545440.fib (I)I
        IADD
       L4
        IRETURN
