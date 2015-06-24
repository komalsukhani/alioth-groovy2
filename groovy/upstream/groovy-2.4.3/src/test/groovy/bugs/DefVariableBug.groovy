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

/**
 * @version $Revision: 1.3 $
 */
class DefVariableBug extends GroovyTestCase {
    
    void testBug() {

     /* cpoirier - "def" can be refered to as a variable name,
        but cannot be declared as one (due to ambiguities)

        def = 123
        
        assert def == 123
     */
        
        def foo = new Expando(a:123, def:456)
        assert foo.def == 456
    }
}