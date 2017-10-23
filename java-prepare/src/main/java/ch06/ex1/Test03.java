package ch06.ex1;

public class Test03 {
    public static void main(String[] args) {
    	Score02 score;
    	
    	score = new Score02();
    	
        score.name = "홍길동";
        score.kor = 100;
        score.eng = 100;
        score.math = 100;
        
        score.compute();
    }
}
