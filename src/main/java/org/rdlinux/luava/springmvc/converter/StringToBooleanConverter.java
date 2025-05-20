package org.rdlinux.luava.springmvc.converter;

import org.springframework.core.convert.converter.Converter;

public class StringToBooleanConverter implements Converter<String, Boolean> {

    @Override
    public Boolean convert(String source) {
        if (source.equalsIgnoreCase("yes") || source.equalsIgnoreCase("true") ||
                source.equals("是") || source.equals("1")) {
            return true;
        } else if (source.equalsIgnoreCase("no") || source.equalsIgnoreCase("false") ||
                source.equals("否") || source.equals("0")) {
            return false;
        } else {
            throw new IllegalArgumentException(source + " cat not case to boolean");
        }
    }
}
