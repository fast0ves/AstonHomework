import java.io.*;
import java.util.Scanner;

public class Handler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название файла: ");
        String fileName = scanner.nextLine();
        System.out.println("Введите текст для записи: ");
        String text = scanner.nextLine();

        try {
            writeToFile(fileName, text);

            System.out.println("Текст успешно записан в файл " + fileName);

            readFromFile(fileName);

        } catch (CustomException e) {
            System.err.println("Ошибка " + e.getMessage());
        }
    }

    public static void readFromFile(String fileName) throws CustomException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String s = bufferedReader.readLine();
            while (s != null) {
                System.out.println("\nСодержимое файла:\n " + s);
                s = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new CustomException("Файл не найден: " + fileName, e);
        } catch (IOException e) {
            throw new CustomException("Ошибка чтения файла:" + fileName, e);
        }
    }

    public static void writeToFile(String fileName, String text) throws CustomException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, true))) {
            bufferedWriter.write(text);
        } catch (IOException e) {
            throw new CustomException("Ошибка записи в файл: " + fileName, e);
        }
    }
}
