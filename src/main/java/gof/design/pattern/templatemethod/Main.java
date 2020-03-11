package gof.design.pattern.templatemethod;

class Main {
    public static void main(String[] args) {
        AbsGameCennectHelper helper = new DefaultGameConnectHelper();
        helper.requestConnection("아이디 암호");
    }
}
