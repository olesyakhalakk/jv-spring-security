package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;
import mate.academy.spring.validation.lib.RepeatPassword;

public class RepeatPasswordValidator implements
        ConstraintValidator<RepeatPassword,UserRequestDto> {

    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        return userRequestDto.getPassword().equals(userRequestDto.getRepeatPassword());
    }
}