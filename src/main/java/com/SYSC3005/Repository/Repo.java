package com.SYSC3005.Repository;

import com.SYSC3005.Entities.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Students, Long> {
}
