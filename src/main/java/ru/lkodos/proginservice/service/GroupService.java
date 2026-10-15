package ru.lkodos.proginservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.lkodos.proginservice.model.Group;
import ru.lkodos.proginservice.repository.GroupRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class GroupService {

    private final GroupRepository groupRepository;

    public List<Group> findAll() {
        return groupRepository.findAll();
    }
}
