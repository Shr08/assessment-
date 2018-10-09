package com.ttn2;

import org.apache.commons.lang3.StringUtils;

class StringutilsExample {

        static void test(){
        System.out.println("Join Strings using separator >>>" +
                StringUtils.join(new String[] { "RO", "TG", "DR" }, "YES"));
    }
}
