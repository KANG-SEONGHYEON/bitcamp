package java100.app;
import java.util.Scanner;

// ## 캡슐화 적용
// - 모든 필드에 대해 외부 접근을 차단한다.

public class Score {
    protected String name;
    protected int[] subjects;
    protected int sum;
    protected float aver;
    
    // 생성자를 다른 패키지에서도 호출할 수 있도록 public으로 공개한다.
    public Score() { 

    	this.subjects = new int[3];
    }
    
    // 객체를 만들 떄 초기화 시키는 경우
    public Score(String name, int kor, int eng, int math) {
    	this.name = name;
    	this.subjects[0] = kor;
    	this.subjects[1] = eng;
    	this.subjects[2] = math;
    	this.compute();
    	// this는 각각의 메서드마다 내장되어있다.
    }
    

    
    // 인스턴스 메서드
    // 인스턴스 데이터를 다루는 메서드는 스태틱보다 인스턴스 메서드로 선언해야 한다.
    private void compute() {
        for (int sub : this.subjects) {
            this.sum += sub;
        }
        this.aver = (float)this.sum / this.subjects.length;
        // 당장은 3을 넣어도 되지만 나중에 과목을 추가하더라도 문제가 없도록 length를 사용한다.
    }
    
    public void print() {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                this.name, 
                this.subjects[0], 
                this.subjects[1], 
                this.subjects[2], 
                this.sum, 
                this.aver);
    }
    
    public void input() {
		Scanner keyScan = new Scanner(System.in);
		
		System.out.print("이름? ");
		this.name = keyScan.nextLine();
		
		System.out.print("국어 점수? ");
		this.subjects[0] = keyScan.nextInt();
		
		System.out.print("영어 점수? ");
		this.subjects[1] = keyScan.nextInt();
		
		System.out.print("수학 점수? ");
		this.subjects[2] = keyScan.nextInt();
		
		this.compute();
		
	}
	
	static Score[] scores = new Score[10000];
	static int cursor = 0;
	
	void add(Score score) {
		if (cursor == scores.length) {
			System.err.println("최대 저장 개수를 초과하였습니다.");
			return;
		}
		scores[cursor++] = score;
	}
	
	int size() {
		return cursor;
	}
	
	Score get(int index) {
		if (index < 0 || index >= cursor) {
			return null;
		}
		return scores[index];
	}
}
