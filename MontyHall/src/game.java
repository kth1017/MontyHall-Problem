public class game {
    public static void main(String[] args) {
        int nswap_win_case = 0; // 미변경 후 승리
        int nswap_lose_case = 0; // 미변경 후 패배
        int swap_win_case = 0; // 변경 후 승리
        int swap_lose_case = 0; // 변경 후 패배

        for (int i = 0; i < 100000; i++) { // 총 10만 번 반복한다.
            int reward = (int) (Math.random()*3+1); // 주최자가 정답을 고름
            int choice = (int) (Math.random()*3+1); // 참가자가 정답을 고름

            // 사회자가 오답을 하나 공개함
            int other = (int) (Math.random()*3+1);
            while(reward==other || choice == other){ // 변수 other은 정답도 참가자가 선택한 것도 아니어야 함
                other = (int) (Math.random()*3+1);
            }

            // 이후 선택을 변경하지 않는 경우
            if(reward == choice) nswap_win_case++;
            else nswap_lose_case++;

            // 변경하는 경우
            int swap = (int)(Math.random()*3+1);
            while(other==swap || choice==swap){ // swap이랑 다른 변수가 중복되는 경우 다시 난수 부여
                swap = (int)(Math.random()*3+1);
            }
            if(reward==swap) swap_win_case++;
            else swap_lose_case++;
        }
        System.out.println("미변경 후 승리: "+nswap_win_case);
        System.out.println("미변경 후 패배: "+nswap_lose_case);
        System.out.println("미변경시 승리 확률: "+nswap_win_case*100/(nswap_lose_case+nswap_win_case)+"\n");
        System.out.println("변경 후 승리: "+swap_win_case);
        System.out.println("변경 후 패배: "+swap_lose_case);
        System.out.println("변경시 승리 확률: "+swap_win_case*100/(swap_lose_case+swap_win_case)+"\n");

    }
}