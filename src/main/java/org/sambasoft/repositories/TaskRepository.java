package org.sambasoft.repositories;

import org.sambasoft.domain.Task;
import org.sambasoft.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByUser(User user);

}
