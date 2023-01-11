package files.payments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class PeopleFileReader {
    private static final String COMMA_DELIMITER = ",";

    private static final int PEOPLE_ID_IDX = 0;
    private static final int PEOPLE_NAME_IDX = 1;
    private static final int PEOPLE_SURNAME_IDX = 2;

    Map<Integer, Person> persons = new HashMap<>();

    Map<Integer, Person> getPersons() {
        return persons;
    }

    void readPeople() {
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader("people.txt"))) {
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] ids = line.split(COMMA_DELIMITER);

                if (ids.length > 0) {
                    persons.put(Integer.parseInt(ids[PEOPLE_ID_IDX].trim()), new Person(Integer.parseInt(ids[PEOPLE_ID_IDX].trim()), ids[PEOPLE_NAME_IDX].trim(), ids[PEOPLE_SURNAME_IDX].trim()));
                }
            }
        } catch (IOException e) {
            System.out.println("Cannot read file..." + e.getMessage());
        }

    }

}
