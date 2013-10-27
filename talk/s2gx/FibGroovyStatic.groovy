package s2gx

import groovy.transform.CompileStatic

@CompileStatic
int fib(int n) {
    n<2?1:fib(n-2)+fib(n-1)
}
