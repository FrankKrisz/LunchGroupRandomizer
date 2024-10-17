package com.lunchapp.lunchgrouprandomizer.repository;

import com.lunchapp.lunchgrouprandomizer.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
