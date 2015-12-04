/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.superbiz.cdi.produces.field;

import javax.inject.Inject;
import javax.inject.Named;

@Named("logger")
public class LoggerImpl implements Logger {

    @Inject
    private LogHandler handler;

    @Override
    public void log(String s) {
        getHandler().writeLog(s);
    }

    public LogHandler getHandler() {
        return handler;
    }

}
