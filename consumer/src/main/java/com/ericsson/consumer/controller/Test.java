package com.ericsson.consumer.controller;

import org.apache.commons.lang.StringUtils;

public class Test {
    public static void main(String[] args) {
        String result = StringUtils.leftPad("890", 6, '0');
        String result2 = StringUtils.rightPad("999", 6, '0');
        System.out.println(result2);

    }
}
