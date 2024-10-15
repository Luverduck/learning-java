package part_01.chapter_10.s10_08.t08_01;

import java.io.*;

public class CustomException extends Exception {

    // 예외의 설명
    private String detail;
    
    // 사용자 정의 예외 생성자
    public CustomException() {
        this.detail = "사용자 정의 예외";
    }
    public CustomException(String detail) {
        this.detail = detail;
    }

    // 현재 예외와 연결된 억제된 예외 목록에 exc를 추가한다. (final이므로 오버라이딩 ❌)
    // final void addSuppressed(Throwable exc) { ... };

    // 현재 예외에 대한 전체 스택 트레이스를 포함하는 Throwable 객체를 반환한다.
    @Override
    public synchronized Throwable fillInStackTrace() {
        return super.fillInStackTrace();
    }

    // 현재 예외가 발생한 원인 예외를 반환한다. 만약 원인 예외가 없으면 null을 반환한다.
    @Override
    public synchronized Throwable getCause() {
        return super.getCause();
    }

    // 예외에 대한 지역화된(언어에 맞춘) 설명을 반환한다
    @Override
    public String getLocalizedMessage() {
        return super.getLocalizedMessage();
    }

    // 예외의 기본 설명을 반환한다.
    @Override
    public String getMessage() {
        return super.getMessage();
    }

    // 예외가 발생한 지점의 스택 트레이스를 배열 형태로 반환한다.
    @Override
    public StackTraceElement[] getStackTrace() {
        return super.getStackTrace();
    }

    // 현재 예외에 연결된 억제된 예외들을 배열로 반환한다. (final이므로 오버라이딩 ❌)
    // final Throwable[] getSuppressed() { ... };

    // 현재 예외에 연결된 억제된 예외들을 배열로 반환한다.
    @Override
    public synchronized Throwable initCause(Throwable cause) {
        return super.initCause(cause);
    }

    // 스택 트레이스를 콘솔에 출력한다.
    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

    // 스택 트레이스를 지정한 PrintStream에 출력한다.
    @Override
    public void printStackTrace(PrintStream s) {
        super.printStackTrace(s);
    }

    // 스택 트레이스를 지정한 PrintWriter에 출력한다.
    @Override
    public void printStackTrace(PrintWriter s) {
        super.printStackTrace(s);
    }

    // 스택 트레이스를 매개변수로 전달된 요소로 설정한다.
    @Override
    public void setStackTrace(StackTraceElement[] stackTrace) {
        super.setStackTrace(stackTrace);
    }

    // 예외에 대한 설명을 포함하는 String 객체를 반환한다.
    @Override
    public String toString() {
        return detail;
    }

}
