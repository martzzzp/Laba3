package exceptions;

public class InvalidDataCharacterDataException extends RuntimeException {
    private final String customMessage;
    public InvalidDataCharacterDataException(String message) {
        super(message);
        this.customMessage = message;
    }
    @Override
    public String getMessage (){
        return "CharacterDataException: " + customMessage;
    }
}
