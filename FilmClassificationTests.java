import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

        public class FilmClassificationTests {

            @ParameterizedTest
            @CsvSource(delimiter = ';', value = {
                    "U & PG films are available.; 0",

                    "U & PG films are available.; 11",

                    "U, PG & 12 films are available.; 12",

                    "U, PG & 12 films are available.; 14",

                    "U, PG, 12 & 15 films are available.; 15",

                    "U, PG, 12 & 15 films are available.; 17",

                    "All films are available.; 18",

                    "All films are available.; 30",

            })
            @DisplayName("getClassificationsByAge, when age is selected, returns correct film classification")
            public void getClassificationsByAge_givenAnyAge_returnsCorrectClassification(String expected, int age) {
                assertEquals(expected, FilmClassification.getClassificationsByAge(age));

            }
            }
