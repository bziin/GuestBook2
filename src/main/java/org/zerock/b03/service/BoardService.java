package org.zerock.b03.service;

import org.zerock.b03.dto.BoardDTO;
import org.zerock.b03.dto.BoardListReplyCountDTO;
import org.zerock.b03.dto.PageRequestDTO;
import org.zerock.b03.dto.PageResponseDTO;

public interface BoardService {
    Long register(BoardDTO boardDTO);

    BoardDTO readOne(Long bno);

    void modify(BoardDTO boardDTO);

    void remove(Long bno);

    PageResponseDTO<BoardDTO> list(PageRequestDTO pageRequestDTO);

    // 댓글의 숫자까지 처리
    PageResponseDTO<BoardListReplyCountDTO> listWithReplyCount(PageRequestDTO pageRequestDTO);

}
