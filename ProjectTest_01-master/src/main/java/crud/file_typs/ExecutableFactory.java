package crud.file_typs;

import crud.file_typs.binary.BinaryExecutor;
import crud.file_typs.csv.StringFormatExecutorCSV;
import crud.file_typs.json.StringFormatExecutorJSON;
import crud.file_typs.yaml.StringFormatExecutorYAML;
import crud.file_utils.Constants;
import crud.string.impl.JsonStringConverter;
import crud.string.impl.YamlStringConverter;

public class ExecutableFactory {

    public Executable getInstance(String format) {
        Executable executor;
        switch (format) {
            case Constants.BINARY:
                executor = new BinaryExecutor();
                break;
            case Constants.JSON:
                executor = new StringFormatExecutorJSON(new JsonStringConverter());
                break;
            case Constants.CSV:
                executor = new StringFormatExecutorCSV();
                break;
            case Constants.YAML:
                executor = new StringFormatExecutorYAML(new YamlStringConverter());
                break;
//            case Constants.XML:
//            executor = new XmlExecutor();
//            break;
            default:
                executor = null;
                break;
        }
        return executor;
    }
}
