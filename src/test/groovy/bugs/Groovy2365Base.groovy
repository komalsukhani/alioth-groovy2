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
/**
 * Created by IntelliJ IDEA.
 * User: applerestore
 * Date: Dec 11, 2007
 * Time: 3:29:40 PM
 * To change this template use File | Settings | File Templates.
 */
package groovy.bugs

abstract class Groovy2365Base extends GroovyTestCase {

    protected String createData () {

        File dir = File.createTempDir("groovy-src-", "-src")
        dir.deleteOnExit()
        assertNotNull dir

        def fileList =  [
          "Util.groovy" : """

          class Util {
            static String NAME = "Util accessed"
          }
    """,

         "Script1.groovy" : """
         import Util

         println "Script1 \${Util.NAME}"
    """,

    "Script2.groovy" : """
                import Util

                println "Script2 \${Util.NAME}"
           """
                ].collect {
            name, text ->
              File file = new File(dir, name)
              file.write text
              file
         }

         return dir.absolutePath
    }

}
