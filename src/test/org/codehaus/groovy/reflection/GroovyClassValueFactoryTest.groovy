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
package org.codehaus.groovy.reflection

import java.util.concurrent.atomic.AtomicInteger;

import groovy.util.GroovyTestCase;

import org.codehaus.groovy.reflection.GroovyClassValue.ComputeValue

class GroovyClassValueFactoryTest extends GroovyTestCase {
	public void testCreateGroovyClassValue(){
		final AtomicInteger counter = new AtomicInteger();
		GroovyClassValue<String> classValue = GroovyClassValueFactory.createGroovyClassValue(new ComputeValue<String>(){
			String computeValue(Class<?> type){
				counter.incrementAndGet()
				return type.name;
			}
		});
		assertEquals("retrieved String class value", String.class.getName(), classValue.get(String.class))
		assertEquals("computeValue correctly invoked 1 time", 1, counter.value)
		assertEquals("retrieved String class value", String.class.getName(), classValue.get(String.class))
		assertEquals("computeValue correctly invoked 1 time", 1, counter.value)
		assertEquals("retrieved Integer class value", Integer.class.getName(), classValue.get(Integer.class))
		assertEquals("computeValue correctly invoked 2 times", 2, counter.value)
		classValue.remove(String.class)
		assertEquals("retrieved String class value", String.class.getName(), classValue.get(String.class))
		assertEquals("computeValue correctly invoked 3 times", 3, counter.value)
	}
}
