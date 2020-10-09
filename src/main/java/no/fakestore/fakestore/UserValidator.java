package no.fakestore.fakestore;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

public class UserValidator implements org.springframework.validation.Validator{
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "firstName", "firstName.empty", "Firstname missing");
        ValidationUtils.rejectIfEmpty(errors, "lastName", "lastName.empty", "Lastname missing");
        ValidationUtils.rejectIfEmpty(errors, "eMail", "eMail.empty", "Email is not valid");
        ValidationUtils.rejectIfEmpty(errors, "dayOfBirth", "dayOfBirth.empty", "Please enter a day of birth");
        ValidationUtils.rejectIfEmpty(errors, "userName", "userName.empty", "Username must be over 3 characters long");
        ValidationUtils.rejectIfEmpty(errors, "passWord", "passWord.empty", "Password must be over 6 characters long");
        ValidationUtils.rejectIfEmpty(errors, "confirmPassWord", "confirmPassWord.empty", "Password must match!");
    }
}
