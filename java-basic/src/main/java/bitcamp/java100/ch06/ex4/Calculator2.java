package bitcamp.java100.ch06.ex4;

public class Calculator2 {
	// 계산 결과를 여러 개 개별적으로 관리하기 위해
	// 인스턴스 변수로 전환한다.
	int result;
	
	static void plus(Calculator2 that, int value) {that.result += value;}
	static void minus(Calculator2 that,int value) {that.result -= value;}
	static void multiple(Calculator2 that,int value) {that.result *= value;}
	static void divide(Calculator2 that,int value) {that.result /= value;}
	
}
