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

class Groovy5137Bug extends GroovyTestCase {
    void testShouldNotThrowGroovyBugError() {
        assertScript '''
        import groovy.mock.interceptor.MockFor

        MockFor.getInstance(URLConnection, new URL('http://foo'))

        '''
    }

    void testStaticMethodInCallToSuper() {
        assertScript '''
            class Top { Top(int x) { } }
            class Bottom extends Top {
                Bottom(args) {
                    super(value(*args))
                }
                static int value(x,y) { x+y }
            }
            new Bottom([1,2])
        '''
    }
}