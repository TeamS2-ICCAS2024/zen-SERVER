package com.zen.ZenServer.global.response.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum SuccessCode {

    // 200 OK
    TEST_SUCCESS(20000, HttpStatus.CREATED, "test 성공"),

    AUTH_REGISTER_SUCCESS(200, HttpStatus.OK, "회원가입 성공"),
    AUTH_AUTHENTICATE_SUCCESS(200, HttpStatus.OK, "로그인(사용자 인증) 성공"),
    HEART_SAVE_BASE_SUCCESS(200, HttpStatus.OK, "base 심박 저장 성공"),
    TETRIS_SAVE_GAME_RESULT_SUCCESS(200, HttpStatus.OK, "테트리스 게임 결과 저장 성공"),
    TETRIS_GET_RESULT_SUCCESS(200, HttpStatus.OK, "테트리스 게임 결과 조회 성공"),
    TETRIS_GET_RESULT_LIST_SUCCESS(200, HttpStatus.OK, "테트리스 게임 결과 리스트 조회 성공"),
    EMOTIONDIARY_POST_SUCCESS(200,HttpStatus.OK,"사용자 답변 저장 성공"),
    EMOTIONDIARY_LIST_GET_SUCCESS(200,HttpStatus.OK,"유저에 해당하는 일기 전체 조회 성공"),
    EMOTIONDIARY_DETAIL_GET_SUCCESS(200, HttpStatus.OK,"일기 상세 조회 성공"),
    EMOTIONDIARY_GET_BY_EMOTION_SUCCESS(200, HttpStatus.OK,"감정에 따른 일기 조회 성공");

    private final int code;
    private final HttpStatus httpStatus;
    private final String message;
}
