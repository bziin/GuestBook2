package org.zerock.b03.service;

import org.zerock.b03.dto.PageRequestDTO;
import org.zerock.b03.dto.PageResponseDTO;
import org.zerock.b03.dto.ReplyDTO;

public interface ReplyService {
    Long register(ReplyDTO replyDto);

    ReplyDTO read(Long rno);

    void modify(ReplyDTO replyDTO);

    void remove(Long rno);

    PageResponseDTO<ReplyDTO> getListOfBoard(Long bno, PageRequestDTO pageRequestDTO);
}
