package com.company.executors;

import com.company.executors.impl.BasicFormatExecutor;
import com.company.maper.impl.*;
import com.company.utils.Constants;

public class Factory {

    private final BasicFormatExecutor jsonExecutable = new BasicFormatExecutor(new JsonModelToStringConverter());
    private final BasicFormatExecutor xmlExecutable;
    private final BasicFormatExecutor yamlExecutable;
    private final BasicFormatExecutor csvExecutable;
    private final BasicFormatExecutor binaryExecutable;

    public Factory(){

        xmlExecutable = new BasicFormatExecutor(new XmlModelToStringConverter());
        yamlExecutable = new BasicFormatExecutor(new YamlModelToStringConverter());
        csvExecutable = new BasicFormatExecutor(new CsvModelToStringConverter());
        binaryExecutable = new BasicFormatExecutor(new BinaryModelToStringConverter());
    }


    public BasicFormatExecutor getInstanceByFormat(String format) {
        BasicFormatExecutor result = null;
        switch (format) {
            case Constants.JSON:
                result = jsonExecutable;
                break;
            case Constants.XML:
                result = xmlExecutable;
                break;
            case Constants.YAML:
                result = yamlExecutable;
                break;
            case Constants.CSV:
                result = csvExecutable;
                break;
            case Constants.BINARY:
                result = binaryExecutable;
                break;
            default:
                System.out.println("Sorry, but input incorrect format.");
        }
        return result;
    }
}
