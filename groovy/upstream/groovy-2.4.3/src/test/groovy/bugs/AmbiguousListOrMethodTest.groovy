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
package groovy.bugs

class AmbiguousListOrMethodTest extends GroovyTestCase {

    void testLocalVariableVersion() {
        def foo = [3, 2, 3]

        def val = foo [0]
        println val
        assert val == 3
    }

    void testUndefinedPropertyVersion() {
        try {
            def val = this.foo [0]
            println val
        }
        catch (MissingPropertyException e) {
            println "Worked! Caught missing property $e"
        }
    }

    void testMethodCallVersion() {
        def val = foo([0])
        println val
        assert val == 1
    }


    def foo(int val) {
        println "Calling foo method with a int param of val"
        println val
        return null
    }

    def foo(List myList) {
        println "Calling foo method with a list param of $myList"
        return myList.size()
    }

    void testCanFindCorrectMethod() {
        def e = new Example()
        assert e["", ""] == 2
        assert e[""] == 1
    }

}

class Example {
    def getAt(String a, String b) {return 2}
    def getAt(String a) {return 1}
}