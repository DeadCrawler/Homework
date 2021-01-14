import com.fasterxml.jackson.core.JsonProcessingException;
import crud.file_typs.Executable;
import crud.file_typs.ExecutableFactory;
import crud.file_utils.Constants;
import crud.file_utils.FileUtils;
import person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static crud.file_utils.Constants.*;

public class AppController {
    private final Scanner scanner;
    private List<Person> arrayList;
    private List<Person> tempList;
    private final FileUtils fileUtils;
    private final ExecutableFactory executableFactory;

    public AppController() {
        scanner = new Scanner(System.in);
        executableFactory = new ExecutableFactory();
        arrayList = new ArrayList<>();
        fileUtils = new FileUtils();
    }

    public void run()  {
        String fileName = createFile();
        Executable executor = getExecutable();

        while (true) {

            String command = scanner.nextLine();

            if (command.equalsIgnoreCase(CREATE)) {
                creator(fileName, executor);

            } else if (command.equalsIgnoreCase(EXIT)) {
                System.exit(0);

            } else if (command.equalsIgnoreCase(READ)) {

                if (fileName.equalsIgnoreCase(SWITCH)) {
                    createFile();
                } else if (!fileUtils.isFileEmpty(fileName)) {

                    try {
                        tempList = executor.read(fileName);
                    } catch (JsonProcessingException e) {
                        e.printStackTrace();
                    }

                    for (Person p : tempList) {
                        System.out.println(p);
                    }
                } else {
                    System.out.println(FILE_IS_EMPTY);
                }
                System.out.println(ENTER_COMMAND);

            } else if (command.equalsIgnoreCase(SWITCH)) {
                createFile();

            } else if (command.equalsIgnoreCase(SAVE)) {
                save(arrayList, fileName, executor);

            } else if (command.equalsIgnoreCase(UPDATE)) {

                if (!fileUtils.isFileEmpty(fileName)) {
                    try {
                        arrayList = executor.read(fileName);
                    } catch (JsonProcessingException e) {
                        e.printStackTrace();
                    }

                } else {
                    System.out.println(FILE_IS_EMPTY);

                }

                System.out.println(Constants.ENTER_ID);
                int id = scanner.nextInt();

                executor.update(arrayList, id);

                System.out.println(ENTER_COMMAND);

            } else if (command.equalsIgnoreCase(DELETE)) {

                if (!fileUtils.isFileEmpty(fileName)) {
                    try {
                        arrayList = executor.read(fileName);
                    } catch (JsonProcessingException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Constants.ENTER_ID);
                    int id = scanner.nextInt();
                    executor.delete(id, arrayList);

                } else {
                    System.out.println(FILE_IS_EMPTY);

                }

                System.out.println(ENTER_COMMAND);
            }
        }
    }

    public String createFile() {

        System.out.println(Constants.ENTER_FILE_NAME);
        String fileName = scanner.nextLine();

        fileUtils.createFile(fileName);

        System.out.println(ENTER_COMMAND);
        return fileName;
    }

    private Executable getExecutable() {
        Executable executor = null;
        while (executor == null) {
            System.out.println(Constants.CHOOSE_FORMAT);
            String newFormat = scanner.nextLine();
            executor = executableFactory.getInstance(newFormat);
            if (executor == null) {
                System.out.println(Constants.INCORRECT_FORMAT);
            }
        }
        return executor;
    }

    private void creator(String fileName, Executable executor) {
        System.out.println(Constants.ENTER_PERSON_DATA);
        String personData = scanner.nextLine();

        String[] array = personData.split(" ");

        Person person = new Person(
                Integer.parseInt(array[0]),
                array[1],
                array[2],
                array[3],
                array[4]);

        if (!fileUtils.isFileEmpty(fileName)) {

            try {
                arrayList = executor.read(fileName);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }

            if (fileUtils.isIdLegal(arrayList, person)) {
                arrayList.add(person);

                System.out.println(PERSON_WAS_CREATE);
                save(arrayList, fileName, executor);
            }
        } else {

            arrayList.add(person);
            save(arrayList, fileName, executor);
            System.out.println(PERSON_WAS_CREATE);
        }
    }

    private void save(List<Person> arrayList, String fileName, Executable executor)  {
        if (!arrayList.isEmpty()) {
            try {
                executor.write(fileName, arrayList);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            System.out.println(FILE_WAS_SAVE);
        } else {
            System.out.println(FILE_UNCHANGED);
        }
        System.out.println(ENTER_COMMAND);
    }
}
