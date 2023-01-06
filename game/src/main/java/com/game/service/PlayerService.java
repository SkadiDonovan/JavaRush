package com.game.service;

import com.game.entity.PlayerParam;
import com.game.entity.Profession;
import com.game.entity.Race;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface PlayerService {

    List<PlayerParam> getPlayersList(Specification<PlayerParam> specification);

    Page<PlayerParam> getPlayersList(Specification<PlayerParam> specification, Pageable sortedByName);

    PlayerParam createPlayer(PlayerParam playerRequired);

    PlayerParam getPlayer(Long id);

    PlayerParam updatePlayer(Long id, PlayerParam playerRequired);

    boolean deletePlayer(Long id);

    Specification<PlayerParam> nameFilter(String name);

    Specification<PlayerParam> titleFilter(String title);

    Specification<PlayerParam> raceFilter(Race race);

    Specification<PlayerParam> professionFilter(Profession profession);

    Specification<PlayerParam> experienceFilter(Integer min, Integer max);

    Specification<PlayerParam> levelFilter(Integer min, Integer max);

    Specification<PlayerParam> birthdayFilter(Long after, Long before);

    Specification<PlayerParam> bannedFilter(Boolean isBanned);

}