import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class es1 {
    public static Logger logger = LoggerFactory.getLogger(es1.class);

    public static void main(String[] args) {


        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            Random randomN = new Random();
            array[i] = randomN.nextInt(1, 10);

        }
        logger.info("{}", array);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            logger.info("Inserisci la posizione dell'array che vuoi modificare (1, 2, 3, 4, 5) o inserisci 0 per uscire");

            int res = Integer.parseInt(scanner.nextLine());

            if (res > array.length || res < 0) {
                logger.info("Posizione non valida");
                continue;
            }

            if (res == 0) {
                break;
            }

            logger.info("Inserisci il nuovo valore");
            int value = Integer.parseInt(scanner.nextLine());
            array[res - 1] = value;
            logger.info("{}", array);


        }

    }
}