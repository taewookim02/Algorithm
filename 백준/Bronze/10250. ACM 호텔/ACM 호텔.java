import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

//		호텔 정문으로부터 걸어서 가장 짧은 거리에 있는 방을 선호
//		호텔 정문으로부터 걷는 거리가 가장 짧도록 방을 배정
//		
//		
//		
//		호텔은 직사각형 모양이라고 가정
//		
//		
//		각 층에 W 개의 방이 있는
//		H 층 건물이라고 가정
//		
//		다만 걷는 거리가 같을 때에는 아래층의 방을 더 선호
//		예시:
//			102 호 방보다는 301 호 방을 더 선호
//			102 호는 거리 2 만큼 걸어야 하지만 301 호는 거리 1 만큼만 걸으면 되기 때문
//			같은 이유로 102 호보다 2101 호를 더 선호
//		
//			
//		N 번째로 도착한 손님에게 배정될 방 번호를 계산
//		첫 번째 손님은 101 호, 두 번째 손님은 201 호 등과 같이 배정
//		
//		예로 들면, H = 6이므로 10 번째 손님은 402 호에 배정

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int testCase = 0; testCase < T; testCase++) {
			int height = sc.nextInt(), width = sc.nextInt(), N = sc.nextInt();

			int[][] hotel = new int[height][width];

			int guestCounter = 1;

			for (int w = 0; w < width && guestCounter <= N; w++) {
				for (int h = 0; h < height && guestCounter <= N; h++) {
					hotel[h][w] = guestCounter++;

					if (guestCounter > N) {
						System.out.println((h + 1) + String.format("%02d", w + 1));
					}
				}
			}

		}

	}
}
