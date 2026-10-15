package ru.lkodos.proginservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.lkodos.proginservice.model.Group;

@Repository
public interface GroupRepository extends JpaRepository<Group, Integer> {

}
