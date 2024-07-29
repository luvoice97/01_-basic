package homework;

import java.io.IOException;

public class Game {

	public static void main(String[] args) throws IOException{
		
		// 기본금액과 배팅금액 설정
        int base = 1000;
        int bet = 600;
       

        System.out.println("가위바위보 게임을 시작합니다.");
        System.out.println("기본금액: " + base + "원, 배팅금액: " + bet + "원");
        System.out.println("가위(1), 바위(2), 보(3) 중 하나를 선택하세요.");

        int Input = System.in.read();
        int Choice = (int) Input;
        int userChoice = Character.getNumericValue(Choice);

        // 사용자가 선택한 값에 따라서 가위(1), 바위(2), 보(3)
        String userChoice2 = "";
        switch (userChoice) {
            case 1:
            	userChoice2 = "가위";
                break;
            case 2:
            	userChoice2 = "바위";
                break;
            case 3:
            	userChoice2 = "보";
                break;
            default:
                System.out.println("오류");
                return;
        }

        // 컴퓨터의 선택을 랜덤으로 생성 (1: 가위, 2: 바위, 3: 보)
        int ChoiceCom = (int) (Math.random() * 3) + 1;

        // 컴퓨터가 선택한 값에 따라 가위, 바위, 보로 매핑
        String ChoiceCom2 = "";
        switch (ChoiceCom) {
            case 1:
            	ChoiceCom2 = "가위";
                break;
            case 2:
            	ChoiceCom2 = "바위";
                break;
            case 3:
            	ChoiceCom2 = "보";
                break;
        }

        System.out.println("준수의 선택: " + userChoice2);
        System.out.println("컴퓨터의 선택: " + ChoiceCom2);

        // 승부 결정
        if (userChoice == ChoiceCom) {
            System.out.println("제법이군 비겼다.");
            
        } 
        
        else if ((userChoice == 1 && ChoiceCom == 3) ||
                (userChoice == 2 && ChoiceCom == 1) ||
                (userChoice == 3 && ChoiceCom == 2)) 
        {
            System.out.println("준수가 이겼다!");
            base += bet;
            } 
        
        else 
        {
            System.out.println("ㅠㅠ 졌다.");
            base -= bet;
        }

        // 결과 출력
        System.out.println("현재 기본금액: " + base + "원");
		
		
	}

	
}
