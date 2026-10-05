package ru.lkodos.proginservice.util;

import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.lkodos.proginservice.model.Group;
import ru.lkodos.proginservice.service.GroupService;

@Component
@RequiredArgsConstructor
public class GroupValidator implements Validator {

    private final GroupService groupService;

    @Override
    public boolean supports(@NonNull Class<?> clazz) {
        return Group.class.equals(clazz);
    }

    @Override
    public void validate(@NonNull Object target, @NonNull Errors errors) {
        Group group = (Group) target;
        if (groupService.findByGroupName(group.getName()).isPresent()) {
            errors.rejectValue("name", "error code", "Такая группа уже существует");
        }
    }
}
