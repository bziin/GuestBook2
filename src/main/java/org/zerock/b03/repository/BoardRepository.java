package org.zerock.b03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.zerock.b03.domain.Board;
import org.zerock.b03.repository.search.BoardSearch;

public interface BoardRepository extends JpaRepository<Board,Long>, BoardSearch {
    @Query(value = "select now()",nativeQuery= true)
    String getTime();
}
