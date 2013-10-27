/*
 * Copyright 2008-2012 the original author or authors.
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
package groovy.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLog {
    public static void log(Object o, String file) {
        try {
            PrintWriter prn = new PrintWriter(new FileWriter(file));
            prn.println(o);
            prn.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
