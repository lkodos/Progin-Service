package ru.lkodos.proginservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.lkodos.proginservice.model.Group;
import ru.lkodos.proginservice.repository.GroupRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class GroupService {

    private final GroupRepository groupRepository;

    public List<Group> findAll() {
        return groupRepository.findAll();
    }

    public Optional<Group> findById(Integer id) {
        return groupRepository.findById(id);
    }

    public Optional<Group> findByGroupName(String groupName) {
        return groupRepository.findGroupByName(groupName);
    }

    @Transactional
    public void update(Integer id, Group group) {
        group.setId(id);
        groupRepository.save(group);
    }

    @Transactional
    public void delete(Integer id) {
        groupRepository.deleteById(id);
    }

    @Transactional
    public void save(Group newGroup) {
        groupRepository.save(newGroup);
    }
}
