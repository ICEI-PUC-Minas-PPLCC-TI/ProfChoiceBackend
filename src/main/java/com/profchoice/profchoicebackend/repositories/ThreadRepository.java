package com.profchoice.profchoicebackend.repositories;

import org.springframework.data.repository.CrudRepository;
import com.profchoice.profchoicebackend.models.Thread;

public interface ThreadRepository extends CrudRepository<Thread, Integer> {

}
