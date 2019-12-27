package com.demo.beanutils;

import org.apache.commons.beanutils.ConversionException;
import org.apache.commons.beanutils.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;

class MyConverter implements Converter {
    private static SimpleDateFormat format;

    public MyConverter(String pattern) {
        format = new SimpleDateFormat(pattern);
    }

    @Override
    public Object convert(Class type, Object value) {
        if (value == null) {
            return null;
        }

        if (value instanceof String) {
            String tmp = (String) value;
            if (tmp.trim().length() == 0) {
                return null;
            } else {
                try {
                    return format.parse(tmp);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        } else {
            throw new ConversionException("not String");
        }
        return value;
    }
}
