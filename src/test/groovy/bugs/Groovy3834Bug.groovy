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

class Groovy3834Bug extends GroovyTestCase {
    void testDuplicateCallsToMissingMethod() {
        def instance = new AClassWithMethodMissingMethod()
        shouldFail MissingMethodException, { instance.someMissingMethod() }
        assertEquals 1, instance.count
    }
}

class AClassWithMethodMissingMethod {
    int count = 0
    def methodMissing(String name, args) {
        count++
        throw new MissingMethodException(name, AClassWithMethodMissingMethod, args)        
    }
    
}
