/*
 * Copyright 2003-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.codehaus.groovy.tools.groovydoc.testfiles

import groovy.transform.PackageScope

class ExampleVisibilityG {
    public void a1() {}
    void a2() {}
    protected void b() {}
    @groovy.transform.PackageScope void c1() {}
    @PackageScope void c2() {}
    private void d() {}

    public _a
    protected _b
    @PackageScope _c
    private _d

    public class A1 {}
    class A2 {}
    protected class B {}
    @PackageScope class C {}
    private class D {}
}