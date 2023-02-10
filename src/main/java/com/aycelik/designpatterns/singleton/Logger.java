package com.aycelik.designpatterns.singleton;

public class Logger {
    private static Logger _logger;
    private String _value;

    private Logger(String value) {
        _value = value;
    }
    public static Logger getInstance(String value) {
        if (_logger == null) {
            _logger = new Logger(value);
        }
        return _logger;
    }
    public String getValue(){
        return _value;
    }
}
