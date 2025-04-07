import java.util.Arrays;
import java.util.Scanner;
public class Main {
    //이차원 배열의 0번 인덱스에는 회의 시작 시간
    //배열의 1번 인덱스에는 회의 끝나는 시간
    //sort함수에서 compare함수를 통해 끝나는 시간이 같을 경우에는
    //시작 시간이 빠른 순으로 정렬
    //result++
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        int count = sc.nextInt(); sc.nextLine();
        int meeting[][] = new int[count][2];

        for(int i = 0; i < count; i++){
            meeting[i][0] = sc.nextInt();
            meeting[i][1] = sc.nextInt();
        }

        //끝나는 시간 순으로 정렬 (오름차순)
        Arrays.sort(meeting, (o1, o2) -> {
            if(o1[1] == o2[1]){
                return Integer.compare(o1[0],o2[0]);
            }
            else{
                return  Integer.compare(o1[1],o2[1]);
            }
        });

        int endTime = meeting[0][1];
        result++;

        for(int i=1; i<count; i++){
            if(meeting[i][0] >= endTime){
                endTime = meeting[i][1];
                result++;
            }
            else{
                continue;
            }
        }

        System.out.println(result);
    }
}
