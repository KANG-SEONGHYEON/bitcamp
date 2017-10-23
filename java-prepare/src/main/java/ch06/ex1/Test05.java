package ch06.ex1;

public class Test05 {
    public static void main(String[] args) {
    	Score04 score;
    	
    	score = new Score04("임꺽정", 100, 80, 70);
    	
    	System.out.printf("이름 =  %s\n", score.name);
    	System.out.printf("총점 =  %d\n", score.sum);
    	System.out.printf("평규 =  %f\n", score.aver);
    	
    }
}
