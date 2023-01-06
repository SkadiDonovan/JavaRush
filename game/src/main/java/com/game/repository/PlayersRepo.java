package com.game.repository;

import com.game.entity.PlayerParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PlayersRepo extends JpaRepository<PlayerParam, Long>, JpaSpecificationExecutor<PlayerParam> {
}