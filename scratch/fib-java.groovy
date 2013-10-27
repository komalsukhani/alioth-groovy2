

    public fib(I)I
       L0
        ILOAD 1
        ICONST_2
        IF_ICMPGE L1
        ILOAD 1
        GOTO L2
       L1
        ALOAD 0
        ILOAD 1
        ICONST_1
        ISUB
        INVOKEVIRTUAL Fib.fib (I)I
        ALOAD 0
        ILOAD 1
        ICONST_2
        ISUB
        INVOKEVIRTUAL Fib.fib (I)I
        IADD
       L2
        IRETURN

