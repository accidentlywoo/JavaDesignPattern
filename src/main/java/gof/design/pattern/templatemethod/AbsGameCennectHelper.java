package gof.design.pattern.templatemethod;

public abstract class AbsGameCennectHelper {
    protected abstract String doSecurity(String string);

    protected abstract boolean authentication(String id, String password);

    protected abstract int authorization(String userName);

    protected abstract String connection(String info);
    //위 4가지 method는 노출이 되면 안된다.

    //템플릿 메소드
    public String requestConnection(String encodedInfo){
        //보안 과정 -> 암호화 된 문자열을 디코드(복호화)
        String decodedInfo = doSecurity(encodedInfo);
        // 반환된 것을 가지고 아이디, 암호를 할당한다.
        String id = "aaa";
        String password = "bbb";

        if(!authentication(id, password)){
            throw new Error("아이디 암호 불일치");
        }

        String userName = "userName";
        int i = authorization(userName);

        switch (i){
            case 0: //게임 매니저

                break;
            case 1://유료 회원

                break;
            case 2://무료 회원

                break;
            case 3://권한 없음

                break;
            default://기타 상황
                break;
        }
        return connection(decodedInfo);
    }
}
