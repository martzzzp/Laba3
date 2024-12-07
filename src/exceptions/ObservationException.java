package exceptions;

public class ObservationException extends RuntimeException { // Поле для хранения сообщения об ошибке
  private final String message; // Конструктор класса, принимающий сообщение
  public ObservationException(String message) { // Конструктор класса, принимающий сообщение
    super(message); // Передаем сообщение в базовый класс Exception
    this.message = message;
  }
  @Override
  public String getMessage() { // Метод для получения сообщения об ошибке
    return message; // Возвращаем сообщение
  }
}