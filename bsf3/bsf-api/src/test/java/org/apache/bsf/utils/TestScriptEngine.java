/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package org.apache.bsf.utils;

import java.io.Reader;
import java.io.StringReader;

import javax.script.AbstractScriptEngine;
import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptException;

public class TestScriptEngine extends AbstractScriptEngine {

    public Bindings createBindings() {
        // TODO Auto-generated method stub
        return null;
    }

    public Object eval(Reader reader, ScriptContext context)
            throws ScriptException {
        // TODO Auto-generated method stub
        return null;
    }


    public Object eval(String script, ScriptContext context)
            throws ScriptException {
        return eval(new StringReader(script), context);
    }

    public ScriptEngineFactory getFactory() {
        return new TestScriptEngineFactory();
    }

}
