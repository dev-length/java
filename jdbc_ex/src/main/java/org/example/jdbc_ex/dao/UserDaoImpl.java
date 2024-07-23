package org.example.jdbc_ex.dao;

import org.example.jdbc_ex.common.JDBCUtil;
import org.example.jdbc_ex.domain.UserVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// UserDao 인터페이스를 구현하여 사용자 정보에 대한 실제 CRUD 작업 수행
public class UserDaoImpl implements UserDao{
    // JDBC 연결 객체를 생성해서 초기화

    // USERS 테이블 관련 SQL 명령어


    // 회원 등록

    // ResultSet을 UserVO 객체로 매핑(변환)하는 메소드

    // 회원 전체 목록 조회

    // 특정 아이디를 가진 회원 조회
        // 해당 아이디를 가진 회원이 없을 때 도달하는 코드

    // 회원 수정

    // 회원 삭제
            // 특정 아이디를 가진 회원 삭제
}
