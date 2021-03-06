/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.dromara.hmily.common.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * NetUtils .
 *
 * @author sixh chenbin
 */
public class NetUtils {

    private static volatile String localAddress;

    /**
     * Gets local ip.
     *
     * @return the local ip
     */
    public static String getLocalIp() {
        if (localAddress == null) {
            synchronized (NetUtils.class) {
                if (localAddress == null) {
                    try {
                        localAddress = InetAddress.getLocalHost().getHostAddress();
                    } catch (UnknownHostException e) {
                        localAddress = "0.0.0.0";
                    }
                }
            }
        }
        return localAddress;
    }
}
