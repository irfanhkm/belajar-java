package oop;

import oop.annotation.NotBlank;

import java.lang.reflect.Field;

public class ValidationApp {

    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null, null);
        loginRequest.setUsername("Username");
        try {
            validate(loginRequest);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
        validateRuntime(loginRequest);
        validationReflection(loginRequest);
    }

    public static void validate(LoginRequest loginRequest) throws ValidationException {
        if (loginRequest.username == null) {
            throw new ValidationException("Username is null");
        } else if (loginRequest.username.isBlank()) {
            throw new ValidationException("Username is blank");
        } else if (loginRequest.password == null) {
            throw new ValidationException("Password is null");
        } else if (loginRequest.password.isBlank()) {
            throw new ValidationException("Password is blank");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username == null) {
            throw new BlankException("Username is null");
        } else if (loginRequest.username.isBlank()) {
            throw new BlankException("Username is blank");
        } else if (loginRequest.password == null) {
            throw new BlankException("Password is null");
        } else if (loginRequest.password.isBlank()) {
            throw new BlankException("Password is blank");
        }
    }

    public static void validationReflection(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();
        for(var field: fields) {
            field.setAccessible(true);
            if (field.getAnnotation(NotBlank.class) != null) {
                try {
                    // validated
                    String value = (String) field.get(object);
                    if (value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is balnk");
                    }
                } catch (IllegalAccessException e) {
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }
            }
        }
    }
}

class BlankException extends RuntimeException {
    public BlankException(String message) {
        super(message);
    }
}

class ValidationException extends Throwable{
    public ValidationException(String message) {
        super(message);
    }
}
