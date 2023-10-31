package org.zerock.b03.service;


import org.zerock.b03.dto.MemberJoinDTO;

public interface MemberService {
    static class MidExistException extends Exception {

    }
    void join(MemberJoinDTO memberJoinDTO) throws MidExistException ;
}
