/*
 * Copyright 2003-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package groovy.operator

class UnaryMinusOperatorTest extends GroovyTestCase {

    void testUnaryMinus() {
        def value = -1
        
        assert value == -1
        
        def x = value + 2
        assert x == 1
        
        def y = -value
        assert y == 1
    }   
    
    void testBug() {
        def a = 1
        def b = -a
        
        assert b == -1
    }
    
    void testShellBug() {
        assertScript("""
def a = 1
def b = -a
assert b == -1            
""")
    }
}