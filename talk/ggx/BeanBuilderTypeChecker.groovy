import org.codehaus.groovy.ast.MethodNode
import org.objectweb.asm.Opcodes
import org.codehaus.groovy.ast.Parameter
import org.codehaus.groovy.ast.ClassHelper
import org.codehaus.groovy.ast.ClassNode
import org.codehaus.groovy.ast.stmt.EmptyStatement

/*
* Copyright 2003-2012 the original author or authors.
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

onMethodCallError(
        argTypes(Class,Closure) || argTypes(Class)
) {
    if (beans.containsKey(name)) {
        addStaticTypeError "Duplicate bean definition (" + name + ")", call
    }
}